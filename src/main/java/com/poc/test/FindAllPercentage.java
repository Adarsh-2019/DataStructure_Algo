package com.poc.test;

import java.io.IOException;
import java.text.DecimalFormat;

public class FindAllPercentage {
    public static void main(String[] args) {
        //characterPercentage("My e-mail : eMail_Address321@anymail.com");

            Runtime runtime = Runtime.getRuntime();     //getting Runtime object

            try
            {
                runtime.exec("notepad I:\\sample.txt");        //opens "sample.txt" in notepad
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
    }

    private static void characterPercentage(String inputString) {
        int totalChars=inputString.length();
        int upperCaseLetter=0;
        int lowerCaseLetter=0;
        int digit=0;
        int specialChar=0;

        for (int i=0;i<inputString.length();i++){
            char ch=inputString.charAt(i);

            //count upper case letter
            if (Character.isUpperCase(ch)){
                upperCaseLetter++;
            }

            //count lower chars
            else if (Character.isLowerCase(ch)){
                lowerCaseLetter++;
            }

            //count digits
            else if (Character.isDigit(ch)){
                digit++;
            }

            //count special chars
            else {
                specialChar++;
            }
        }
        double upperCaseLetterPercentage  = (upperCaseLetter * 100.0) / totalChars;
        double lowerCaseLetterPercentage=(lowerCaseLetter*100.0)/totalChars;
        double digitCharacter=(digit*100.0)/totalChars;
        double specialChars=(specialChar*100.0)/totalChars;

        DecimalFormat formater=new DecimalFormat("##.##");
        System.out.println("Upper Case percentage: "+formater.format(upperCaseLetter)+"%");
        System.out.println("Lower case percentage: "+formater.format(lowerCaseLetter)+"%");
        System.out.println("Digit char percentage: "+formater.format(digit)+"%");
        System.out.println("Special case percentage: "+formater.format(specialChars)+"%");
    }
}
