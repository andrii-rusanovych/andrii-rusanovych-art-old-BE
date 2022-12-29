package com.art_andrii.rusanovych.controller.impl;

import com.art_andrii.rusanovych.controller.AuthController;
import com.art_andrii.rusanovych.service.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthControllerImpl implements AuthController {
    private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);
    private final TokenService tokenService;

    public AuthControllerImpl(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    public String token(Authentication authentication) {
        LOG.debug("Token requested for user: '{}'", authentication.getName());
        String token = tokenService.generateToken(authentication);
        LOG.debug("Token granted: {}", token);
        return token;
    }
}
