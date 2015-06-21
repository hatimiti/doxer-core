package org.doxer.xbase.report.birt;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.birt.core.exception.BirtException;
import org.eclipse.birt.core.framework.Platform;
import org.eclipse.birt.report.engine.api.EngineConfig;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportEngineFactory;
import org.eclipse.birt.report.engine.api.IReportRunnable;
import org.eclipse.birt.report.engine.api.IRunAndRenderTask;
import org.eclipse.birt.report.engine.api.PDFRenderOption;
import org.eclipse.birt.report.engine.api.RenderOption;
import org.springframework.core.io.ClassPathResource;

public class DoxBirt {

	private static final String BASE_DIR = "/reports";

	private String rptdesign;
	private String destination;
	private BIRT_OUTPUT_FORMAT format;

	public DoxBirt(String rptdesign, String destination, BIRT_OUTPUT_FORMAT format) {
		this.rptdesign = rptdesign;
		this.destination = destination;
		this.format = format;
	}

	public void output() {
		output(new HashMap<>());
	}

	public void output(String paramName, Object paramValue) {
		Map<String, Object> params = new HashMap<>();
		params.put(paramName, paramValue);
		output(params);
	}

	public void output(Map<String, Object> params) {

		EngineConfig config = setupConfig();

		try {
			Platform.startup();
		} catch (BirtException e) {
			throw new RuntimeException(e);
		}

		IReportEngine engine = createEngine(config);
		ClassPathResource classPathResource = new ClassPathResource(BASE_DIR + this.rptdesign);

		try {
			IReportRunnable design = engine.openReportDesign(classPathResource.getInputStream());
			IRunAndRenderTask task = engine.createRunAndRenderTask(design);
			task.setParameterValues(params);
			task.setRenderOption(getRenderOption());
			task.run();
			engine.destroy();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	private RenderOption getRenderOption() {
		switch (this.format) {
		case PDF:
			RenderOption options = new PDFRenderOption();
			options.setOutputFileName(this.destination);
			options.setOutputFormat(RenderOption.OUTPUT_FORMAT_PDF);
			return options;
		default:
			return null;
		}
	}

	private EngineConfig setupConfig() {
		EngineConfig config = new EngineConfig();
		config.setEngineHome("");
		return config;
	}

	private IReportEngine createEngine(EngineConfig config) {
		IReportEngineFactory factory = (IReportEngineFactory) Platform
				.createFactoryObject( IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY );
		IReportEngine engine = factory.createReportEngine( config );
		return engine;
	}


	public static enum BIRT_OUTPUT_FORMAT {
		PDF
	}

}
