package at.w0mb.BootstrapUI.client.navbar;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.LIElement;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.inject.Inject;

@Templated
public class Link extends Composite {
	public static final String activeClass = "active";
	
	@DataField
	private LIElement li = Document.get().createLIElement();
	
	public LIElement getLi() {
		return li;
	}

	@Inject
	@DataField
	private Anchor a;
	
	public void activate() {
		li.setClassName(activeClass);
	}
	
	public void deactivate() {
		li.removeClassName(activeClass);
	}
	
	public void setHref(String href) {
		a.setHref(href);
	}
	
	public void setText(String text) {
		a.setText(text);
	}
}