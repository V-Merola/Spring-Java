package com.example.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(value = "/good-morning")
	public ResponseEntity<String> index() {
		return ResponseEntity.ok("Good morning!");
	}

	/*
	* Esercizio 1: creare un GetMapping che restituisca
	*  una "stringa" di base come risposta
	1 - Crea un nuovo endpoint "/hello" utilizzando l'annotazione @GetMapping.
	2 - Nel metodo, restituisce una stringa semplice come "Hello World!".
	* */
	@GetMapping(value = "/hello")
	public String hello() {
		return "Hello World!";
	}

	/*
	 *Esercizio 2: creare un GetMapping che restituisca una ResponseEntity come risposta

		1 - Crea un nuovo endpoint "/greeting" utilizzando l'annotazione @GetMapping.
		2 - Nel metodo, restituire un oggetto ResponseEntity con un messaggio stringa come "Buon pomeriggio!".
		3 - Puoi anche impostare il codice di stato HTTP in ResponseEntity, ad esempio "200 OK".
	*/

	@GetMapping(value = "/greeting")
	public ResponseEntity<String> first(){
		return ResponseEntity.status(200).body("Good Afternoon!");
	}

}
