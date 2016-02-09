package ed.ru;

import static spark.Spark.get;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class HelloWorld {
	
	public static void main(String[] args) {
		get("/hello", (request, response) -> {
			Map<String, Object> model = new HashMap<>();
			model.put("type", "text");
			
			List<Attribute> attributes = new ArrayList<Attribute>();
			attributes.add(new Attribute("name","person_input"));
			attributes.add(new Attribute("value","Heisenberg"));
			attributes.add(new Attribute("onclick","alert('tada')"));
			
			model.put("attributes", attributes);
			
//			model.put("attr", "onclick");
//			model.put("attrValue", "alert('tada')");

				return new ModelAndView(model, "/input/input.vm");
			}, new VelocityTemplateEngine());
 
	}

	public static class Attribute {
		private String name;
		private String value;

		public Attribute(String name, String value) {
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}
}
