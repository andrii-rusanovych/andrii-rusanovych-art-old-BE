package com.art_andrii.rusanovych.controller;

import org.springframework.http.ResponseEntity;

public interface PaintingController {
    ResponseEntity<String> getAllPaintings();

    ResponseEntity<String> getPaintingById(Integer id);

    ResponseEntity<Void> createPainting();

    ResponseEntity<Void> updatePainting(Integer id);

    ResponseEntity<Void> deletePainting(Integer id);
}