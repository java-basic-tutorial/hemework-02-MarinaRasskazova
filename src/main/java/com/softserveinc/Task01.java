package com.softserveinc;

/*
    Write a program that calculates the average annual temperature.
    Also, you need to find months with the lowest and highest temperature in a year.

    Month          |  I   | II   | III |  IV  |  V   |  VI  | VII  | VIII | IX   |  X   | XI  | XII
    ---------------|------|------|-----|------|------|------|------|------|------|------|-----|------
    Temperature    | -1.7 | -1,0 | 2,6 |  9,0 | 15,1 | 19,4 | 21,4 | 21,2 | 17,1 | 11,1 | 5,9 |  1,4

    The example below shows how your output might look:

    Average annual temperature: 10.125
    Month with the lowest temperature in a year: I
    The month with the highest temperatures in a year: VII
 */
public class Task01 {
    public static void main(String[] args) {
        //  I  | II | III | IV |  V  |  VI | VII | VIII | IX  |  X  | XI |  XII
        double[] temperature = {-1.7, -1.0, 2.6, 9.0, 15.1, 19.4, 21.4, 21.2, 17.1, 11.1, 5.9, 1.4};
        // TODO: Write your code here

        double minTemperature = temperature[0];
        int indexMin = 1;
        double maxTemperature = temperature[0];
        int indexMax = 1;
        double sumYearTemperature = 0;

        for (int i = 1; i < temperature.length; i++) {

            sumYearTemperature += temperature[i];
            if (minTemperature > temperature[i]) {
                minTemperature = temperature[i];
                indexMin = i + 1;
            }
            if (maxTemperature < temperature[i]) {
                maxTemperature = temperature[i];
                indexMax = i + 1;
            }
        }

        double avgTemperature = sumYearTemperature / 12;
        System.out.printf("Average annual temperature: %g\n", avgTemperature);

        System.out.printf("Month with the lowest temperature in a year: %s\n", monthRomeNumber(indexMin));
        System.out.printf("The month with the highest temperatures in a year: %s\n", monthRomeNumber(indexMax));
    }

    public static String monthRomeNumber(int number) {
        String monthNumber = "";

        switch (number) {
            case 1:
                monthNumber = "I";
                break;
            case 2:
                monthNumber = "II";
                break;
            case 3:
                monthNumber = "III";
                break;
            case 4:
                monthNumber = "IV";
                break;
            case 5:
                monthNumber = "V";
                break;
            case 6:
                monthNumber = "VI";
                break;
            case 7:
                monthNumber = "VII";
                break;
            case 8:
                monthNumber = "VIII";
                break;
            case 9:
                monthNumber = "IX";
                break;
            case 10:
                monthNumber = "X";
                break;
            case 11:
                monthNumber = "XI";
                break;
            case 12:
                monthNumber = "XII";
                break;
        }
        return monthNumber;
    }

}