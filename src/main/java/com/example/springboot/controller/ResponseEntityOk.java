package com.example.springboot.controller;


/*Esercizio 3: creare una nuova classe con un GetMapping che restituisca un ResponseEntityOK

1 - Annota una nuova classe con l'annotazione @RestController.
2 - Crea un nuovo endpoint "/info" utilizzando l'annotazione @GetMapping.
3 - Nel metodo, restituire un ResponseEntity con 200 OK*/

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseEntityOk {

    @GetMapping(value = "/info")
    public ResponseEntity<String> info(){
        return ResponseEntity.ok("OK");
    }

}
