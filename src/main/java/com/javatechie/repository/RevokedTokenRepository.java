//package com.javatechie.repository;
//
//import org.springframework.stereotype.Repository;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Repository
//public class RevokedTokenRepository {
//    private Set<String> revokedTokens = new HashSet<>();
//
//    public void addRevokedToken(String token) {
//        revokedTokens.add(token);
//    }
//
//    public boolean isTokenRevoked(String token) {
//        return revokedTokens.contains(token);
//    }
//
//    public void removeRevokedToken(String token) {
//        revokedTokens.remove(token);
//    }
//}