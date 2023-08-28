package com.javatechie.service;

public interface ValidatorService {
    boolean validatePassword(String password);
    boolean checkPassword(String password, String hashedPassword);
    String hashPassword(String password);
    boolean validatePhoneNumber(String phoneNumber);
    boolean validateEmail(String email);
}










