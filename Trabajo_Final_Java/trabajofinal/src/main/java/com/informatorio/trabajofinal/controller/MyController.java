package com.informatorio.trabajofinal.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/api/private-resource")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String privateResource() {
        return "This is a private resource";
    }
}
