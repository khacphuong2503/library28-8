//package com.javatechie.service.Impl;
//
//import com.javatechie.service.ValidatorService;
//import org.mindrot.jbcrypt.BCrypt;
//import org.springframework.stereotype.Service;
//
//
//import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Size;
//
//@Service
//
//public class ValidatorServiceImpl implements ValidatorService {
//    private static final String PHONE_NUMBER_PATTERN = "^[+]?[0-9]{10,13}$";
//    private static final String EMAIL_PATTERN = "^\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*(\\.\\w{2,3})+$";
//
//    @Override
//    public boolean validatePassword(@Size(min = 8, message = "Độ dài mật khẩu phải ít nhất 8 kí tự") String password) {
//        // Kiểm tra độ dài mật khẩu đã được thực hiện trong lớp UserInfoDTO
//        return meetsCharacterRequirements(password);
//    }
//
//    private boolean meetsCharacterRequirements(String password) {
//        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$");
//    }
//
//    @Override
//    public boolean checkPassword(String password, String hashedPassword) {
//        return BCrypt.checkpw(password, hashedPassword);
//    }
//
//    @Override
//    public String hashPassword(String password) {
//        String salt = BCrypt.gensalt();
//        return BCrypt.hashpw(password, salt);
//    }
//
//    @Override
//    public boolean validatePhoneNumber(@Pattern(regexp = PHONE_NUMBER_PATTERN, message = "Định dạng số điện thoại không hợp lệ") String phoneNumber) {
//        // Kiểm tra định dạng số điện thoại đã được thực hiện trong lớp UserInfoDTO
//        return phoneNumber.length() >= 10 && phoneNumber.length() <= 12;
//    }
//
//    @Override
//    public boolean validateEmail(@Pattern(regexp = EMAIL_PATTERN, message = "Định dạng email không hợp lệ") String email) {
//        // Kiểm tra định dạng email đã được thực hiện trong lớp UserInfoDTO
//        return email.length() <= 100;
//    }
//}