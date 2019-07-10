package ldnr.miam_miam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ldnr.miam_miam.model.Boisson;

@RestController
@RequestMapping("boisson")

public class BoissonController {

@Autowired
private BoissonRepository repo;

@GetMapping
public Iterable<Boisson> findAll(){
	return repo.findAll();
}

@PutMapping
public Boisson put(@RequestBody Boisson entity) {
	return repo.save(entity);
}

@DeleteMapping("{id}")
public void delete(@PathVariable ("id") Integer id) {
	
	repo.deleteById(id);
}

	
}
