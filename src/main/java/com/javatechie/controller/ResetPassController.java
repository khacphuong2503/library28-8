package com.javatechie.controller;

import com.javatechie.service.ResetPassService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/library")
public class ResetPassController {

    private final ResetPassService resetPassService;

    @GetMapping("/resetPassword")
    public ResponseEntity<String> resetPassword(@RequestParam("email") String email) {
        String result = resetPassService.resetPassword(email);
        if (result.equals("Password reset email sent.")) {
            return ResponseEntity.ok(result);
        } else if (result.equals("Invalid email.")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
        }
    }

    @PostMapping("/changePassword")
    public ResponseEntity<String> changePassword(@RequestParam("email") String email,
                                                 @RequestParam("password") String password,
                                                 @RequestParam("confirmPassword") String confirmPassword) {
        String result = resetPassService.changePassword(email, password, confirmPassword);
        if (result.equals("Password changed successfully.")) {
            return ResponseEntity.ok(result);
        } else if (result.equals("Invalid email.") || result.equals("Password must contain lowercase letters, uppercase letters, numbers, and special characters.") || result.equals("Password and confirm password do not match.")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result);
        }
    }
}
