package cat.tiacademy.barcelonactiva.FrancoToda.Toda.s04.t02.n01.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FruitaController {

	
	@GetMapping("/Fruita")
	public String fruitaIndex(@RequestParam (defaultValue = "Aixo no es una fruita es que no hi ha res de res de res") String fruitaNom) {
		String retorn = (fruitaNom.equals("Aixo no es una fruita es que no hi ha res de res de res"))?"Indica quian es la fruita que t'interesa": "a"/*TODO*/;
			
		return retorn;
	}
	
	
	@GetMapping("/Fruita/Add")
	public ResponseEntity<String> fruitaAdd (@RequestParam (defaultValue = "Aixo no es una fruita es que no hi ha res de res de res") String fruitaNom) {
		ResponseEntity<String> resultat;
		
		if (fruitaNom.equals("Aixo no es una fruita es que no hi ha res de res de res")) {
			resultat = new ResponseEntity<String>("Has d'especificar el tipus de fruita que vols afegir", HttpStatus.BAD_REQUEST);
		} else if (true/*TODO*/){
			resultat = new ResponseEntity<String>("Fruita registrada corectament", HttpStatus.BAD_REQUEST); //TODO potser millor aixo no gestionar-ho amb un error
		}	else {
			resultat = new ResponseEntity<String>("Aquesta fruita ja esta registrada", HttpStatus.OK);
		}

		return resultat;
	}
	
	@GetMapping("/Fruita/Update")//TODO potser poso requestParam per la id el pes i tal
	public ResponseEntity<String> fruitaUpdate (@RequestParam (defaultValue = "Aixo no es una fruita es que no hi ha res de res de res") String fruitaNom) {
		ResponseEntity<String> resultat;
		
		if (fruitaNom.equals("Aixo no es una fruita es que no hi ha res de res de res")) {
			resultat = new ResponseEntity<String>("Has d'especificar el tipus de fruita que vols afegir", HttpStatus.BAD_REQUEST);
		} else if (true/*TODO*/){
			resultat = new ResponseEntity<String>("Informacio actualitzada corectament", HttpStatus.BAD_REQUEST); //TODO potser millor aixo no gestionar-ho amb un error
		}	else {
			resultat = new ResponseEntity<String>("Aquesta fruita ja esta registrada", HttpStatus.OK);
		}

		return resultat;
	}
	
	@GetMapping("/Fruita/Delete/{id}")
	public ResponseEntity<String> fruitaDelete (@PathVariable("id")int id) {
		ResponseEntity<String> resultat;
		
		 if (true/*TODO*/){
			resultat = new ResponseEntity<String>("Fruita registrada corectament", HttpStatus.BAD_REQUEST); //TODO potser millor aixo no gestionar-ho amb un error
		}	else {
			resultat = new ResponseEntity<String>("Aquesta fruita ja esta registrada", HttpStatus.OK);
		}

		return resultat;
	}
	
	@GetMapping("/Fruita/GetOne/{id}")
	public ResponseEntity<String> fruitaGetOne (@PathVariable("id")int id) {
		ResponseEntity<String> resultat;
		
		
		
		return null;
	}
	
	
	@GetMapping("/Fruita/GetAll")
	public ResponseEntity<String> fuitaGetAll(){
		String fruites = "Aqui anira el metode";
		ResponseEntity<String> resposta;
		
		if (fruites.equals("buit")) {
			resposta = new ResponseEntity("No hi ha cap fruita", HttpStatus.BAD_REQUEST);
		} else {
			resposta = new ResponseEntity(fruites, HttpStatus.OK);
		}
		
		return resposta;
	}
	
	
	
	
}
