package be.hho.first.openshfit.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	private static int count = 0;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping(value = "/getCount")
	public String happyMessage() {
		System.out.println("Inside count");
		count++;
		return "Hi, number of hits :-"  + count;
	}

	@GetMapping(value = "/resetCount")
	public String resetCOunt() {
		System.out.println("Inside reset count");
		count = 0;
		return "Count :-"  + count;
	}
}
