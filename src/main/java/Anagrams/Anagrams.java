package Anagrams;


public class Anagrams {

    public static String anagram(String phrase) {
        char[] sentence = phrase.toCharArray();
        char[] word = new char[sentence.length];
        String result = "";
        int wordIndex = 0; //index of word
        int sentIndex = 0; //index of sentence
        final int SPACE_SYMBOL = 32;
        int lastLetterIndex = sentence.length - 1;

        for (char letter : sentence) {
            if (letter == SPACE_SYMBOL || sentIndex == lastLetterIndex) {
                word[wordIndex] = letter;
                wordIndex = 0;
                result += String.valueOf(reverse(word)).trim() + " ";
                word = new char[sentence.length];
                sentIndex++;
            } else {
                word[wordIndex] = letter;
                wordIndex++;
                sentIndex++;
            }
        }
        return result.trim();
    }

    private static char[] reverse(char[] mas) {
        char[] newMas = new char[mas.length];
        int j = 0;
        for (int i = -1 + mas.length; i > -1; i--) {
            newMas[j] = mas[i];
            j++;
        }
        return newMas;
    }
}
