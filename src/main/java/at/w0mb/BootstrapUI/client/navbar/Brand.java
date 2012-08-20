package at.w0mb.BootstrapUI.client.navbar;

import javax.annotation.PostConstruct;

import com.google.gwt.user.client.ui.Anchor;

public class Brand extends Anchor {
	@PostConstruct
	public void init() {
		setStyleName("brand");
		setHref("#");
	}
}