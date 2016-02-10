package ed.ru;

import static spark.Spark.get;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;



import ed.ru.element.Element;
import ed.ru.element.Input;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class HelloWorld {

	public static void main(String[] args) {
		
		spark.Spark.staticFileLocation("/public");
		
		get("/hello", (request, response) -> {
			
			Map<String, Object> model = new HashMap<>();


			Map<String, String> attributes = new LinkedHashMap<String, String>();

			attributes.put("type", "text");
			attributes.put("name", "person_input");
			attributes.put("value", "Heisenberg");
			attributes.put("onclick", "alert('tada')");
			
			Element input = new Input(attributes);

			
			List<Element> elements = new ArrayList<Element>();
			elements.add(input);
			
			model.put("elements", elements);

			return new ModelAndView(model, Statics.LAYOUT);
		}, new VelocityTemplateEngine());

	}

}
