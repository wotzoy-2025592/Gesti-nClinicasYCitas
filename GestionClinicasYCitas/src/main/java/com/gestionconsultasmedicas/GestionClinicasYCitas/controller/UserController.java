package com.gestionconsultasmedicas.GestionClinicasYCitas.controller;

import com.gestionconsultasmedicas.GestionClinicasYCitas.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity listarTodos() {
        return new ResponseEntity.ok(User);
    }


    public ResponseEntity listar(@RequestParam){

    }

}
