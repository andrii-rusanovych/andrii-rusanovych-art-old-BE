package com.art_andrii.rusanovych.controller;

import org.springframework.security.core.Authentication;

public interface AuthController {
    String token(Authentication authentication);
}
