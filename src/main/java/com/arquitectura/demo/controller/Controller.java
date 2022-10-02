package com.arquitectura.demo.controller;

import com.arquitectura.demo.controller.request.FamiliaRequest;
import com.arquitectura.demo.model.Familiar;
import com.arquitectura.demo.service.FamiliaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class Controller {
    private final FamiliaService familiaService;

    @PostMapping("/familia")
    public ResponseEntity<Iterable<Familiar>> familia(@RequestBody FamiliaRequest rut){
        return ResponseEntity.status(200).body(familiaService.familia(rut.getRut()));
    }
}
