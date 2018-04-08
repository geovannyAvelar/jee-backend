package br.com.avelar.backend.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.avelar.backend.rest.model.Person;
import br.com.avelar.backend.service.PersonService;

@Stateless
public class PersonApiImpl implements PersonApi {

	@Inject
	private PersonService personService;
	
	@Override
	public List<Person> findAll() {
		return personService.findAll();
	}

}
