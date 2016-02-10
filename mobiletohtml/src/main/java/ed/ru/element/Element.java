package ed.ru.element;

import java.util.Map;

public abstract class Element {
	
	protected Map<String, String> attributes;

	
	public Element(Map<String, String> attributes) {
		super();
		this.attributes = attributes;
	}

	public abstract String getTemplate();

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	

}
