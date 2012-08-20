package at.w0mb.BootstrapUI.client.setup;

import com.google.gwt.user.client.ui.HTML;

public class Setup {
	public static final String stylesheet = "stylesheet";

	public static HTML enableCss() {
		return new HTML("<link href='http://twitter.github.com/bootstrap/assets/css/bootstrap.css' rel='stylesheet'>");
	}

	public static HTML enableResponsiveness() {
		return new HTML("<link href='http://twitter.github.com/bootstrap/assets/css/bootstrap-responsive.css' rel='stylesheet'>");
	}
}