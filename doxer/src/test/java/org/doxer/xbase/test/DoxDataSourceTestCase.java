package org.doxer.xbase.test;

import java.io.FileNotFoundException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.dbunit.DataSourceBasedDBTestCase;
import org.dbunit.IDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.excel.XlsDataSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.hatimiti.flutist.common.util._Obj;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/*.xml"})
public abstract class DoxDataSourceTestCase extends DataSourceBasedDBTestCase {

	protected static final Logger logger = _Obj.getLogger();

	@Resource
	protected DataSource dataSource;

	@Rule
	public TestName testName = new TestName();

	@Before
	public void setup() throws Exception {
		try {
			super.setUp();
			setUp4TestMethod();
		} catch (FileNotFoundException e) {
		}
	}

	@After
	public void tearDown() throws Exception {
		try {
			tearDown4TestMethod();
			super.tearDown();
		} catch (FileNotFoundException e) {
		}
	}

	@Override
	protected DataSource getDataSource() {
		return dataSource;
	}

	protected void setUp4TestMethod() throws Exception {
		logger.debug("setUp4TestMethod() - start");
		final IDataSet dataSet = getDataSet4TestMethod();
		if (dataSet == null) {
			return;
		}
		final IDatabaseTester databaseTester = getDatabaseTester();
		assertNotNull("DatabaseTester is not set", databaseTester);
		databaseTester.setSetUpOperation(getSetUpOperation());
		databaseTester.setDataSet(dataSet);
		databaseTester.setOperationListener(getOperationListener());
		databaseTester.onSetup();
	}

	protected void tearDown4TestMethod() throws Exception {
		logger.debug("tearDown4TestMethod() - start");
		final IDatabaseTester databaseTester = getDatabaseTester();
		assertNotNull("DatabaseTester is not set", databaseTester);
		databaseTester.setTearDownOperation(getTearDownOperation());
		databaseTester.setDataSet(getDataSet4TestMethod());
		databaseTester.setOperationListener(getOperationListener());
		databaseTester.onTearDown();
	}

	@Override
	protected IDataSet getDataSet() throws Exception {
		return getDataSet("init.xlsx");
	}

	protected IDataSet getDataSet4TestMethod() throws Exception {
		return getDataSet(testName.getMethodName() + ".xlsx");
	}

	protected IDataSet getDataSet(String xlsName) throws Exception {
		return new XlsDataSet(new ClassPathResource(getDataSetDirName() + "/" + xlsName).getFile());
	}

	protected String getDataSetDirName() {
		return "/dataset/" + this.getClass().getName().replaceAll("\\.", "/");
	}

}
