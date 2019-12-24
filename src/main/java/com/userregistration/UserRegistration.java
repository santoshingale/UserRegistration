package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean checkFirstName(String firstName) {
        Pattern firstNamePattern = Pattern.compile("[A-Z]{1}[a-z]{2,}");
        Matcher m = firstNamePattern.matcher(firstName);
        boolean b = m.matches();
        return b;
    }

    public static boolean checkLastName(String lastName) {
        Pattern lastNamePattern = Pattern.compile("[A-Z]{1}[a-z]{2,}");
        Matcher m = lastNamePattern.matcher(lastName);
        boolean b = m.matches();
        return b;
    }

    public static boolean checkEmailAddress(String email) {
        Pattern emailAddress = Pattern.compile("^[a-zA-Z0-9]{1,}[._+-]?[a-zA-Z0-9]{1,}@[a-zA-Z0-9]{1,}([.][a-zA-Z]{2,3}){1,2}$");
        Matcher m = emailAddress.matcher(email);
        boolean b = m.matches();
        return b;
    }

    public static boolean checkMobileNumber(String phoneNumber) {
        Pattern mobileNumber = Pattern.compile("^[0-9]{1,3}[ ]{1}[0-9]{10}$");
        Matcher m = mobileNumber.matcher(phoneNumber);
        boolean b = m.matches();
        return b;
    }

    public static boolean checkPassword(String password) {
        Pattern passwordRegex = Pattern.compile("^([a-zA-Z0-9][#$^+=!*()@%&]*).{8,}$");
        Matcher m = passwordRegex.matcher(password);
        boolean b = m.matches();
        return b;
    }
}
