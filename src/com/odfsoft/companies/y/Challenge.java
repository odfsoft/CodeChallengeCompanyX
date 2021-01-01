package com.odfsoft.companies.y;

public class Challenge {

    /**
     * Take a number and return it as a string with the correct ordinal indicator suffix (in English)
     * Rules based on https://en.wikipedia.org/wiki/Ordinal_indicator
     *
     * @param number - 0 ≤ number ≤ 10000 - The number to be converted to a string ordinal
     * @return String - string ordinal based off of the number.
     */
    public static String numberToOrdinal(Integer number) {

        if (number.equals(0)) {
            return number.toString();
        }
        switch (number) {
            case 0:
                return "0";
            case 11:
            case 12:
            case 13:
                return toOrdinal(number, "th");
            default:
                switch (number % 10) {
                    case 1:
                        return toOrdinal(number, "st");
                    case 2:
                        return toOrdinal(number, "nd");
                    case 3:
                        return toOrdinal(number, "rd");
                    default:
                        return toOrdinal(number, "th");
                }
        }

    }



    private static String toOrdinal(Integer number, String suffix) {
        String result = String.format("%d%s", number, suffix);
        return result;
    }

}
