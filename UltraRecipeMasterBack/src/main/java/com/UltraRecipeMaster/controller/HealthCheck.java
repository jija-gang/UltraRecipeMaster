package com.UltraRecipeMaster.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthCheck {

    @GetMapping("/Health")
    public ResponseEntity<Boolean> healthCheck() {
        return ResponseEntity.ok(true);
    }

}
