package cat.tiacademy.barcelonactiva.FrancoToda.Toda.s04.t02.n01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Error {
	
	@GetMapping("/Error")
	public String Error() {
		return "JODEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEER\ntonto";
	}
	
	
}
