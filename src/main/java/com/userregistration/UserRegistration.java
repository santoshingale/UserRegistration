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
        Pattern lastNamePattern = Pattern.compile("^[a-zA-Z0-9]{1,}[._+-]?[a-zA-Z0-9]{1,}@[a-zA-Z0-9]{1,}([.][a-zA-Z]{2,3}){1,2}$");
        Matcher m = lastNamePattern.matcher(email);
        boolean b = m.matches();
        return b;
    }

    public static boolean checkMobileNumber(String phoneNumber) {
        Pattern lastNamePattern = Pattern.compile("^[0-9]{1,3}[ ]{1}[0-9]{10}$");
        Matcher m = lastNamePattern.matcher(phoneNumber);
        boolean b = m.matches();
        return b;
    }
}
