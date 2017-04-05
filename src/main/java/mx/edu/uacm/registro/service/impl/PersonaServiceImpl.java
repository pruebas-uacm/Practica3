package mx.edu.uacm.registro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uacm.registro.domain.Persona;
import mx.edu.uacm.registro.domain.repository.PersonaRepository;
import mx.edu.uacm.registro.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	PersonaRepository personaRepository;
	
	public void agregarPersona(Persona persona) {
		
		System.out.println("Estoy entrando al metodo agregarPersona");
		
		personaRepository.save(persona);

	}

	public Persona buscarPersonaXNombre(String nombre) {
		
		System.out.println("Entrando al metodo buscarPersonaXNombre");
		
		Persona p = personaRepository.findByNombre(nombre);
		
		return p;
	}

}
