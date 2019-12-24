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
}
