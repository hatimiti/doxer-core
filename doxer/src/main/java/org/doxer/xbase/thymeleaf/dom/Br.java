package org.doxer.xbase.thymeleaf.dom;

import org.thymeleaf.dom.Text;

public class Br extends JNode {

	public Br() {
		super(new Text("<br />", false));
	}

}
