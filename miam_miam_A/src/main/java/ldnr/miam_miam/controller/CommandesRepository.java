package ldnr.miam_miam.controller;

import org.springframework.data.repository.CrudRepository;

import ldnr.miam_miam.model.Commande;

public interface CommandesRepository extends CrudRepository<Commande,Integer> {

}
