package com.javatechie.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Validated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Name is required")
    @Column(name = "full_name")
    private String name;

    @NotEmpty(message = "Missing Email")
    @Email(message = "Invalid email")
    @Column(name = "email_address")
    private String email;

    @NotEmpty(message = "Missing password")
    @Size(min = 8, message = "Password must be 8 characters or more")
    @Column(name = "user_password")
    private String password;

    @Column(name = "user_status")
    private String status = "active";

    @Column(name = "user_roles")
    private String roles = "ROLE_USER";

    @NotEmpty(message = "Phone number is required")
    @Pattern(regexp = "^[+]?[0-9]{10,13}$", message = "Invalid phone number format")
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "login_attempts")
    private int attempts;

    @Column(name = "block_expiration")
    private LocalDateTime blockExpiration;

    @Column(name = "login_attempts_count")
    private int loginAttempts = 0;

    @Column(name = "email_verified")
    private boolean emailVerified = false;

    @Column(name = "otp_verified")
    private boolean otpVerified;

    @Column(name = "verification_code")
    private String verificationCode;

    @Column(name = "password_reset")
    private boolean passwordReset = true;

    @Column(name = "change_pass")
    private boolean changePass = false;

    private String otp;

    @Column(name = "current_email")
    private String currentEmail;

    @Column(name = "new_otp")
    private String newOtp;

    @Column(name = "new_email")
    private String newEmail;

    @Column(name = "new_otp_time")
    private LocalDateTime newOtpTime;

    @Column(name = "new_phone_number")
    private String newPhoneNumber;

    @Column(name = "new_phone_otp")
    private String newPhoneOtp;

    @Column(name = "email_verification_method")
    private String emailVerificationMethod;

    @Column(name = "verification_expiration_time")
    private LocalDateTime verificationExpirationTime;

}

