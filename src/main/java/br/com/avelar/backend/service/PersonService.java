package br.com.avelar.backend.service;

import java.util.LinkedList;
import java.util.List;

import javax.ejb.Stateless;

import br.com.avelar.backend.rest.model.Person;

@Stateless
public class PersonService {
	
	public List<Person> findAll() {
		List<Person> pessoas = new LinkedList<>();
		pessoas.add(new Person("Geovanny", 21l));
		return pessoas;
	}
	
}
