package ed.ru;

import static spark.Spark.get;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

public class HelloWorld {
	public static void main(String[] args) {
		get("/hello", (request, response) -> {
			Map<String, Object> model = new HashMap<>();
			model.put("hello", "Velocity World");
			model.put("person", new Person("Foobar"));

				return new ModelAndView(model, "hello.vm");
			}, new VelocityTemplateEngine());

	}

	public static class Person {
		private String name;

		public Person(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
