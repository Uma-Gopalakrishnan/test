package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidatorTest {

     Validator v;

     @BeforeEach
     void initTest(){
         Validator v = new Validator();
     }

    @Test
    @DisplayName("Verify isPhoneNumberValid method when phone number is Valid")
    void checkPhoneNumberIsValid_WhenConditionsAreTrue() {
         Assertions.assertTrue(v.isPhoneNumberValid("012345"));
         Assertions.assertTrue(v.isPhoneNumberValid("098765"));
    }

    @Test
    @DisplayName("Verify isPhoneNumberValid method when Phone number doesn't begin with 0")
    void checkPhoneNumberIsValid_WhenConditionsAreFalse_NotBeginWith_0() {

         Assertions.assertFalse(v.isPhoneNumberValid("123456"));
    }

    @Test
    @DisplayName("Verify isPhoneNumberValid method when Phone number is less than 6 digits")

    void checkPhoneNumberIsValid_WhenConditionsAreFalse_LessThan6Digits() {

        Assertions.assertFalse(v.isPhoneNumberValid("01234"));
    }

    @Test
    @DisplayName("Verify isPhoneNumberValid method when Phone number is greater than 10 digits")
    void checkPhoneNumberIsValid_WhenConditionsAreFalse_GreaterThan10Digits() {

        Assertions.assertFalse(v.isPhoneNumberValid("01234567891"));
    }

    @Test
    @DisplayName("Verify isPhoneNumberValid method when Phone number has SpecialCharacters")
    void checkPhoneNumberIsValid_WhenConditionsAreFalse_SpecialCharacters() {

        Assertions.assertFalse(v.isPhoneNumberValid("0123A5"));
        Assertions.assertFalse(v.isPhoneNumberValid("012!@3"));
    }

    @Test
    @DisplayName("Verify email when email address is valid")
    void checkEmailValid(){

         Assertions.assertTrue(v.isEmailValid("Student!123@gmail.com"));
    }

    @Test
    @DisplayName("Verify email when top level domain name is missing")
    void checkEmailValid_NoToplevelDomainname(){

        Assertions.assertFalse(v.isEmailValid("student@gmailcom"));
    }

    @Test
    @DisplayName("Verify email when domain name is missing")
    void checkEmailValid_Nodomainname(){

        Assertions.assertFalse(v.isEmailValid("student.com"));
    }
}




