package algorithms.alphabetSoup;

import java.util.HashMap;
import java.util.Map;

/**
 * Complexity :
 * <p>
 * best case  : O(n)
 * worst case : O(n + m)
 */

public class AlphabetSoup {


    public static void main(String[] args) {

        // all letters from the message are present in the soup, along with 3 extra q's
        System.out.println(isMessageValid("alphabetsouppuzzle", "qateelhlqpzouzpaubpsq"));

        // one "a" is missing from the soup in order for the message to be constructed
        System.out.println(isMessageValid("alphabetsouppuzzle", "qteelhlqpzouzpaubpsq"));

        // the message has spaces
        System.out.println(isMessageValid("alphabet soup puzzle", "   qateelhlqpzouzpaubpsq"));

        // the message has both uppercase and lowercase letters
        System.out.println(isMessageValid("AlphabetsouppuZZle", "aqteelhlqpzouzpaubpsq"));

        // japanese characters
        System.out.println(isMessageValid("トは最高でした", "たたたたたトは最高でしたた"));

        // japanese characters, one character is missing from the soup
        System.out.println(isMessageValid("トは最高でした", "トは最高でた"));

        System.out.println(isMessageValid("aabb", "aaaa"));

    }

    /**
     * @param message       the message to test
     * @param lettersInSoup the letters in the soup ( in lowercase )
     * @return boolean value representing whether the message can be written using the letters in the soup
     */

    private static boolean isMessageValid(String message, String lettersInSoup) {

        message = message.toLowerCase();

        Map<Integer, Integer> letterFrequencyInMessageMap = new HashMap<>();
        int messageLength = message.length();

        for (int i = 0; i < message.length(); i++) {
            int letter = message.charAt(i);
            Integer frequencyForCurrentLetter = letterFrequencyInMessageMap.get(letter);
            letterFrequencyInMessageMap
                    .put(letter, frequencyForCurrentLetter == null ? 1 : frequencyForCurrentLetter + 1);
        }

        for (int i = 0; i < lettersInSoup.length(); i++) {

            int soupLetter = lettersInSoup.charAt(i);
            Integer frequencyForCurrentSoupLetter = letterFrequencyInMessageMap.get(soupLetter);
            if (frequencyForCurrentSoupLetter != null && frequencyForCurrentSoupLetter > 0) {
                letterFrequencyInMessageMap.put(soupLetter, frequencyForCurrentSoupLetter - 1);
                if (--messageLength == 0) {
                    return true;
                }
            }
        }

        return false;
    }

}
