package mx.edu.uacm.registro.test.domain;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import mx.edu.uacm.registro.Application;
import mx.edu.uacm.registro.domain.Factura;
import mx.edu.uacm.registro.domain.Persona;
import mx.edu.uacm.registro.domain.repository.FacturaRepository;
import mx.edu.uacm.registro.domain.repository.PersonaRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Application.class)
public class PersonaTest {
	
	@Autowired
	PersonaRepository personaRepository;
	
	@Autowired
	FacturaRepository facturaRepository;
	
	@Test
	public void insertarPersonaTest(){
		
		
		
		
		
		

		Persona persona = new Persona();
		persona.setNombre("Francisco");
		persona.setRfc("MEZS");
		persona.setTotal(new Double("1000.0"));
		personaRepository.save(persona);
		
		Factura factura1 = new Factura(new Date(), new Double("300.00"));
		Factura factura2 = new Factura(new Date(), new Double("600.00"));
		
		factura1.setPersona(persona);
		factura2.setPersona(persona);
		
		facturaRepository.save(factura1);
		facturaRepository.save(factura2);
		
		Persona  personaAEncontrar = personaRepository.findByNombre("Francisco");
		
		Assert.assertNotNull(personaAEncontrar);
		
		
		
		/*
		List<Factura> facturas =  new ArrayList<Factura>();
		
		facturas.add(factura1);
		facturas.add(factura2);
		
		persona.setFacturas(facturas);
		
		personaRepository.save(persona);*/
		
		
		
		
	}

}
