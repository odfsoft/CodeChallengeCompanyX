package com.odfsoft.companies.y;

class CreditCard {

    private static int MIN_MASKING_LENGTH = 7;

    private static int MASK_WINDOW_IGNORE_STARTING_CHARACTERS_COUNT = 1;

    private static int MASK_WINDOW_IGNORE_ENDING_CHARACTERS_COUNT = 4;

    private static char MASKING_CHARACTER = '#';

    /**
     * Masks the credit card number:
     * Mask all digits (0-9) with #, unless they are first or last four characters.
     * Never mask credit cards with less than 6 characters.
     * Never mask non-digit characters.
     *
     * @param creditCardNumber String not null
     * @return maskedCreditCardNumber String
     */
    public static String maskify(String creditCardNumber) {
        return maskString(creditCardNumber);
    }

    private static String maskString(String creditCardNumber) {
        if (creditCardNumber.length() < MIN_MASKING_LENGTH) {
            return creditCardNumber;
        } else {
            char[] numberCharArray = creditCardNumber.toCharArray();
            for (int i = MASK_WINDOW_IGNORE_STARTING_CHARACTERS_COUNT;
                 i < creditCardNumber.length() - MASK_WINDOW_IGNORE_ENDING_CHARACTERS_COUNT;
                 i++) {
                if (Character.isDigit(numberCharArray[i])) {
                    numberCharArray[i] = MASKING_CHARACTER;
                }
            }
            return new String(numberCharArray);
        }
    }
}

