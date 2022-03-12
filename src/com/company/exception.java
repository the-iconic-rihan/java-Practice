package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

class InvalidInputException extends Exception {
    InvalidInputException(String exceptionText) {
        super(exceptionText);
    }

}
//myexception extending an exception class.

class MyException extends Exception {
    int a;

    //   constructor of myexception class
    MyException(int b) {
        a = b;
    }

    public String toString() {
        return "Exception number=" + a;
    }

}

public class exception {
    //    THROWS method in exception handling
    static void avg() throws ArithmeticException {
        {
            System.out.println("inside Avg");
            throw new ArithmeticException("no number found");
        }
        /*catch (ArithmeticException e) {
            System.out.println("Exception Caught");
        }*/
        /*Final finally finalize*/
    }

    static void convertorDateFormat(String inputDate) {
        try {
//            declaring the format of input date
            SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
//            below line paese the String into Date object.
            Date date = sdf.parse(inputDate);
//            format of output date in declare
            SimpleDateFormat outPutsdf = new SimpleDateFormat("yyyy/mm/dd");
//            using the format method of simple date format it comnvert the entered date into required format.
            String outputDate = outPutsdf.format(date);
            System.out.println("After changing the date format to yyyy/mm/dd : " + outputDate);
        } catch (java.text.ParseException e) {
            System.out.println("Some error occurred while converting the date format. Exception");
        }
    }

    static void validateInput(int num) throws InvalidInputException {
        if (num > 100) {
            throw new InvalidInputException("Exception");
        } else {
            System.out.println("valid number");
        }
    }

    public static void main(String[] args) {
//        try catch block in exception handling.
        try {
            int num = Integer.parseInt("Rihan");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
        try {
            int[] arr = new int[5];
            arr[6] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

/*     Methods of exceptions
        1} Try 2] Catch 3] finally 4] Throws 5] throws
        */
        try {
            avg();

        } finally {
            System.out.println("invalid avg");
        }
        try {
            throw new MyException(5);
        } catch (Exception e) {
            System.out.println(e);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the date in dd/mm/yyyy format : ");
        String inputDate = in.nextLine();
        convertorDateFormat(inputDate);
        System.out.println("Enter the number less than 100 : ");
        int number = in.nextInt();
        try {
            validateInput(number);
        } catch (InvalidInputException e) {
            System.out.println("Caught exception -input is greater than 100.");
        }
    }
}
