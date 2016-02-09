package ed.ru;

import static spark.Spark.get;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class HelloWorld {

	public static void main(String[] args) {
		get("/hello", (request, response) -> {
			Map<String, Object> model = new HashMap<>();
			model.put("type", "text");

			Map<String, String> attributes = new LinkedHashMap<String, String>();

			attributes.put("name", "person_input");
			attributes.put("value", "Heisenberg");
			attributes.put("onclick", "alert('tada')");

			model.put("attributes", attributes);

			return new ModelAndView(model, "/input/input.vm");
		}, new VelocityTemplateEngine());

	}

}
