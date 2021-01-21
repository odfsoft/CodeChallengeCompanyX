package com.odfsoft.companies.y;

public class NumberToOrdinal {

    /**
     * Take a number and return it as a string with the correct ordinal indicator suffix (in English)
     * Rules based on https://en.wikipedia.org/wiki/Ordinal_indicator
     *
     * @param number - 0 ≤ number ≤ 10000 - The number to be converted to a string ordinal
     * @return String - string ordinal based off of the number.
     */
    public static String numberToOrdinal(Integer number) {
        if (number == 0) {
            return number.toString();
        }

        int lastTwoDigits = number % 100;
        if(lastTwoDigits == 11 || lastTwoDigits == 12 || lastTwoDigits == 13) {
            return number + "th";
        } else {
            switch (number % 10) {
                case 1:
                    return number + "st";
                case 2:
                    return number + "nd";
                case 3:
                    return number +  "rd";
                default:
                    return number +  "th";
            }
        }
    }

}
