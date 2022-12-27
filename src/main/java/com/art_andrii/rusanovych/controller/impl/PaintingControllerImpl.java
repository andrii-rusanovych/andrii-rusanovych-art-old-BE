package com.art_andrii.rusanovych.controller.impl;

import com.art_andrii.rusanovych.controller.PaintingController;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
class PaintingControllerImpl implements PaintingController {

    @GetMapping("/painting/get")
    public String getAllPaintings() {
        return "hello";
    }
}