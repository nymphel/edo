package ed.ru.element;

import java.util.Map;

import ed.ru.Statics;

public class Input extends Element {

	public Input(Map<String, String> attributes) {
		super(attributes);
	}

	@Override
	public String getTemplate() {
		return Statics.INPUT;
	}
}
