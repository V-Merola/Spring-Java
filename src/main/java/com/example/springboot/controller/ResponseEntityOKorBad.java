package com.example.springboot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/*
* Esercizio 4: creare un GetMapping che restituisca 400 - Richiesta errata o 200 - OK
* in base a un valore booleano casuale

1 - Annota una nuova classe con l'annotazione @RestController.
2 - Crea un nuovo endpoint "/random" utilizzando l'annotazione @GetMapping.
3 - Nel metodo, restituire un ResponseEntity con 200 OK o 400 Bad Request
in base al risultato di new Random().nextBoolean()
*/
@RestController
public class ResponseEntityOKorBad {
    @GetMapping(value = "/random")
    public ResponseEntity<Boolean> resp(){
        Boolean b = new Random().nextBoolean();
        if(b) {
            return ResponseEntity.ok(true);
        }else {
            return ResponseEntity.badRequest().body(false);
        }
    }
}
