package at.w0mb.BootstrapUI.client.navbar;

import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.UListElement;
import com.google.gwt.user.client.ui.Composite;

@Templated
public class Navlist extends Composite {
	@DataField
	private UListElement list = Document.get().createULElement();
	
	public void add(Link link) {
		list.appendChild(link.getLi());
	}
}