package cat.tiacademy.barcelonactiva.FrancoToda.Toda.s04.t02.n01.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.sql.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cat.tiacademy.barcelonactiva.FrancoToda.Toda.s04.t02.n01.model.Fruita;
import cat.tiacademy.barcelonactiva.FrancoToda.Toda.s04.t02.n01.repository.FruitaRepository;

@RestController
@RequestMapping("/Fruita")
public class FruitaController {	
	
	
	@Autowired
	FruitaRepository fruitaRepository;
	
	
	/*@GetMapping("/Fruita")
	public String fruitaIndex(@RequestParam (defaultValue = "Aixo no es una fruita es que no hi ha res de res de res") String fruitaNom) {
		String retorn = (fruitaNom.equals("Aixo no es una fruita es que no hi ha res de res de res"))?"Indica quian es la fruita que t'interesa": "a";
			
		return retorn;
	}*/
	@GetMapping("/")
	public String A () {
		return "Les patates estan molt bones i el server furula";
	}
	
	@PostMapping("/Add")//Hauria de ser @RequestBody crec pero...
	public ResponseEntity<String> fruitaAdd /*(@RequestBody Fruita fruita) {*/(@RequestParam String fruitaNom, @RequestParam int fruitaPreu, @RequestParam int fruitaPes) {
		ResponseEntity<String> resultat;
		
		Fruita fruita = new Fruita (fruitaNom, fruitaPreu, fruitaPes);
		
		//System.out.println(fruita.getNom() + fruita.getPreu() +fruita.getPes());
		
		
		//Fruita fruitaSalvada = fruitaRepository.save(new Fruita (fruita.getNom(), fruita.getPreu(), fruita.getPes()));
		
		Fruita fruitaSalvada = fruitaRepository.save(fruita);
		
		resultat = new ResponseEntity(fruitaSalvada, HttpStatus.CREATED);

		
		
		return resultat;
	}
	
	@PutMapping("/Update")
	public ResponseEntity<Fruita> fruitaUpdate (@RequestParam long id, @RequestParam String fruitaNom, @RequestParam int fruitaPreu, @RequestParam int fruitaPes) {
		ResponseEntity<Fruita> resposta = null;
		Fruita fruita;
		Optional<Fruita> fruitaVella = fruitaRepository.findById(id);
		
		if (fruitaVella.isPresent()) {
			fruita = fruitaVella.get();
			fruita.setNom(fruitaNom);
			fruita.setPes(fruitaPes);
			fruita.setPreu(fruitaPreu);
			resposta = new ResponseEntity<Fruita>(fruitaRepository.save(fruita), HttpStatus.OK);
		}
		
		
		return resposta;
	}
	
	@DeleteMapping("/Delete/{id}")
	public ResponseEntity<Object> fruitaDelete (@PathVariable("id")Long id) {
		ResponseEntity<Object> resultat = null;
		
		fruitaRepository.deleteById(id);
		
		resultat = new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
		
		return resultat;
	}
	
	@GetMapping("/GetOne/{id}")
	public ResponseEntity<Fruita> fruitaGetOne (@PathVariable("id")Long id) {
		ResponseEntity<Fruita> resultat;
		
		System.out.println("puta");
		System.out.println(id);
		
		
		Optional<Fruita> fruita = fruitaRepository.findById(id);
		
		
		System.out.println(id);
		System.out.println(fruita);
		
		if (fruita.isPresent()) {
			resultat = new ResponseEntity<Fruita>(fruita.get(), HttpStatus.OK);
		} else {
			resultat = new ResponseEntity<Fruita>(HttpStatus.NOT_FOUND);
		}
		
		return resultat;
	}
	
	
	@GetMapping("/GetAll")
	public ResponseEntity<List<Fruita>> fruitaGetAll(){
		//String fruites = "Aqui anira el metode";
		ResponseEntity<List<Fruita>> resposta;
		List<Fruita> fruites = new ArrayList<Fruita>();
		
		fruitaRepository.findAll().forEach(fruites::add);
		
		if (fruites.isEmpty()) {
			resposta = new ResponseEntity<List<Fruita>>(HttpStatus.NO_CONTENT);
		} else {
			resposta = new ResponseEntity<List<Fruita>>(fruites, HttpStatus.OK);
		}
		
		return resposta;
	}
	
	
	
	
}
