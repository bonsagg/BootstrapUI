package at.w0mb.BootstrapUI.client.navbar;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

@Templated
public class Navbar extends Composite {
	@DataField
	private HTMLPanel container = new HTMLPanel("");

	@Inject
	private CollapseButton collapseButton;
	
	@Inject
	private Navlist navlist;
	
	private boolean hasNavlist;

	@PostConstruct
	protected void init() {
		add(collapseButton);
	}

	public void add(Widget composite) {
		container.add(composite);
	}
	
	public void add(Link link) {
		if(!hasNavlist) {
			container.add(navlist);
			hasNavlist = true;
		}
		
		navlist.add(link);
	}
}