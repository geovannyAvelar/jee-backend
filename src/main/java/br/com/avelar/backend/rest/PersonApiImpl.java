package br.com.avelar.backend.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.avelar.backend.rest.model.Person;
import br.com.avelar.backend.service.PersonService;

@Stateless
public class PersonApiImpl implements PersonApi {

	private static final long serialVersionUID = -3359846047775847947L;
	
	@Inject
	private PersonService personService;
	
	@Override
	public void savePerson(Person person) {
		personService.savePerson(person);
	}
	
	@Override
	public List<Person> findAll() {
		return personService.findAll();
	}

	@Override
	public void deletePerson(Person person) {
		personService.deletePerson(person);
	}

}
