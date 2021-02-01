package lect09_regex;

import java.util.regex.Pattern;

public class RegEx {
    public boolean validatePhoneNo(String phoneNo){
        boolean res1 = Pattern.matches("^[+][0-9]{2,3}(-[0-9]{3}){3}$", phoneNo);
        boolean res2 = Pattern.matches("^[0-9]{3}(-[0-9]{3}){2}$", phoneNo);
        return res1 || res2;
    }
    public boolean validatePassword(String password){
        boolean size = Pattern.matches(".{8,}", password);
        boolean capitalLetter = Pattern.matches(".*[A-Z]{1,}.*", password);
        boolean lowLetter = Pattern.matches(".*[a-z]{1,}.*", password);
        boolean digit = Pattern.matches(".*[0-9]{1,}.*", password);
        boolean alfanum = Pattern.matches(".*[-+.,!#]{1,}.*", password);
        return size && capitalLetter && lowLetter && digit && alfanum;
    }

    public static void main(String[] args) {
        RegEx regEx = new RegEx();
        System.out.println("Phone no validator");
        System.out.println(regEx.validatePhoneNo("+48-500-500-543"));
        System.out.println(regEx.validatePhoneNo("+48-5A0-500-543"));
        System.out.println(regEx.validatePhoneNo("500-500-543"));
        System.out.println("Password validator");
        System.out.println(regEx.validatePassword("qwe123"));
        System.out.println(regEx.validatePassword("Qwe123!!!"));
    }
}
