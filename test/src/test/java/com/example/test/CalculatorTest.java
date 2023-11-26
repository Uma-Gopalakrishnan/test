package com.example.test;

import org.junit.jupiter.api.*;

class CalculatorTest {
        Calculator c;


    @BeforeEach
    void initTests() {
         c = new Calculator();
    }

    @AfterEach
    public void afterTest() {
        System.out.println("Execution of a testcase completed");
        c = null;
    }

    @Test
    @DisplayName("Verify addition of two positive number")
    void checkAddMethod_addtwoPositiveNumbers(){
        int a =10;
        int b =20;
        int result =a+b;
        Assertions.assertEquals(result, c.add(a, b));
        //Assertions.assertTrue(false);

    }

    @Test
    @DisplayName("Verify addition of a positive and a negative number")
    void checkAddMethod_addPositiveAndNegativeNumbers() {
        int a = 10;
        int b = -20;
        int result = a + b;
       Assertions.assertEquals(result, c.add(a, b));
       // Assertions.assertFalse(true);
    }

    @Test
    @DisplayName("Verify addition of two negative number")
    void checkAddMethod_addNegativeNumbers() {
        int a = -10;
        int b = -20;
        int result = a + b;
        Assertions.assertEquals(result, c.add(a, b));
    }

    @Test
    @DisplayName("Verify subtraction of two positive number")
    void checkSubtractMethod_TwoPositiveNumbers() {
        int a = 10;
        int b = 8;
        int result = a - b;
        Assertions.assertEquals(result, c.subtract(a, b));

    }
    @Test
    @DisplayName("Verify subtraction of two negative number")
    void checkSubtractMethod_TwoNegativeNumbers() {
        int a = -10;
        int b = -18;
        int result = a - b;
        Assertions.assertEquals(result, c.subtract(a, b));
    }

    @Test
    @DisplayName("Verify subtraction of a positive and a negative number")
    void checkSubtractMethod_PositiveAndNegativeNumbers() {
        int a = 10;
        int b = -18;
        int result = a - b;
        Assertions.assertEquals(result, c.subtract(a, b));

    }

    @Test
    @DisplayName("Verify multiplication of two positive number")
    void checkMultiplication_TwoPositiveNumbers() {
        int a = 10;
        int b = 20;
        int result = a * b;
        Assertions.assertEquals(result, c.multiply(a, b));
    }

    @Test
    @DisplayName("Verify multiplication of two negative number")
    void checkMultiplication_TwoNegativeNumbers() {

        int a = -10;
        int b = -20;
        int result = a * b;
        Assertions.assertEquals(result, c.multiply(a, b));
    }

    @Test
    @DisplayName("Verify multiplication of a positive and a negative number")
    void checkMultiplication_PositiveAndNegativeNumbers() {

        int a = 10;
        int b = -20;
        int result = a * b;
        Assertions.assertEquals(result, c.multiply(a, b));
    }

    @Test
    @DisplayName("Verify division of a positive number")
    void checkDivision_PositiveNumber() {

       int a = 101;
       int b = 10;
       int d = -5;

       double result1 = (double) a / (double) b;
       double result2 = (double) a / (double) d;

        Assertions.assertEquals(result1,c.divide(a,b));
        Assertions.assertEquals(result2,c.divide(a,d));

    }

    @Test
    @DisplayName("Verify division of a negative number")
    void checkDivision_NegativeNumber() {
        int a = -101;
        int b = 10;
        int d = -5;

        double result1 = (double) a / (double) b;
        double result2 = (double) a / (double) d;

        Assertions.assertEquals(result1,c.divide(a,b));
        Assertions.assertEquals(result2,c.divide(a,d));

    }

    @Test
    @DisplayName("Verify Divide method-Divide_by_zero")
    void checkDivision_byzero() {
        int a = 100;
        int b = -5;
        int d = 0;

        double result1 = (double) a / (double) d;
        double result2 = (double) b / (double) d;

       Assertions.assertEquals(result1,c.divide(a,d));
       Assertions.assertEquals(result2,c.divide(b,d));

    }

    @Test
    @DisplayName("Verify SquareRoot of a perfect positive square number")
    void checkSquareRoot_PerfectPositiveSquarenumber() {
        int a = 144;
        double result = Math.pow(a,.5);
        Assertions.assertEquals(result,c.squareRootOf(a));
    }

    @Test
    @DisplayName("Verify SquareRoot of any positive square number")
    void checkSquareRoot_Positivenumber() {
        int a = 11;
        double result = Math.pow(a,.5);
        Assertions.assertEquals(result,c.squareRootOf(a));
    }

    @Test
    @DisplayName("Verify SquareRoot of any negative number")
    void checkSquareRoot_Negativenumber() {
        int a = -11;
        double result = Double.NaN;
        Assertions.assertEquals(result,c.squareRootOf(a));
    }

    @Test
    @DisplayName("Verify getArea when radius is a positive number")
    void checkAreaOfCircle_Positive() {
        int a = 7;
        double result = Math.PI * a * a;
        Assertions.assertEquals(result, c.getArea(a), 0.1);
    }

    @Test
    @DisplayName("Verify getArea when radius is a negative number")
    void checkAreaOfCircle_Negtaive() {
        int a = -7;
        double result = Double.NaN;
        Assertions.assertEquals(result, c.getArea(a), 0.1);
    }

    @Test
    @DisplayName("Verify getCircumference when radius is a positive number")
    void checkCircumference ()
    {
        int a = 8;
        double result=Math.PI * 2 * a;
        Assertions.assertEquals(result,c.getCircumference(a),0.1);
    }

    @Test
    @DisplayName("Verify getCircumference when radius is negative number")
    void checkCircumference_NegativeNumber ()
    {
        int a = -8;
        double result=Double.NaN;
        Assertions.assertEquals(result,c.getCircumference(a),0.1);
    }


}










