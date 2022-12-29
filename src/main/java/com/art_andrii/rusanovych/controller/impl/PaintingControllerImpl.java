package com.art_andrii.rusanovych.controller.impl;

import com.art_andrii.rusanovych.controller.PaintingController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
class PaintingControllerImpl implements PaintingController {

    @GetMapping("/paintings")
    public ResponseEntity<String> getAllPaintings() {
        return ResponseEntity.ok("paintings list");
    }

    @Override
    @GetMapping("/paintings/{id}")
    public ResponseEntity<String> getPaintingById(@PathVariable Integer id) {
        return ResponseEntity.ok("painting " + id);
    }

    @Override
    @PostMapping("/paintings")
    public ResponseEntity<Void> createPainting() {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    @PutMapping("/paintings/{id}")
    public ResponseEntity<Void> updatePainting(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @Override
    @DeleteMapping("/paintings/{id}")
    public ResponseEntity<Void> deletePainting(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}