package com.turinglabhacks.heimdallauth.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/v1")
public class HeimdallAuthController {


    @GetMapping("/helloword/{name}")
    public String getMethodName(@PathVariable String name) {
        return "hello word " + name;
    }
    
    
    @GetMapping("/helloword")
    public String gethelloworde() {
        return "hello word ";
    }

    @GetMapping("/perfil/{idUser}")
    public ResponseEntity<String> obtenerPerfil(@PathVariable String idUser) {
        return ResponseEntity.ok().body("hello " + idUser);
    }
    
}
