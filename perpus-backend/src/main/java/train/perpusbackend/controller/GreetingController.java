package train.perpusbackend.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import train.perpusbackend.model.Greeting;

@RestController
public class GreetingController {

	
	//this is to run with greeting controller
		private static final String template = "Hello, %s!";
		private final AtomicLong counter = new AtomicLong();
		
		@GetMapping("/greeting")
		public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
			return new Greeting(counter.incrementAndGet(), String.format(template, name));
		}
}
