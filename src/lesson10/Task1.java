package lesson10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Task1 {

    public static void main(String[] args) {
        String text = "The British Museum has one of the largest libraries in the world." +
                " It has a copy of every book that is printed in the English language," +
                " so that there are more than six million books there." +
                " They receive nearly two thousand books and papers daily." +
                " The British Museum Library has a very big collection of printed books and manuscripts," +
                " both old and new. You can see beautifully illustrated old manuscripts which they keep in glass cases." +
                " You can also find there some of the first English books printed by Caxton." +
                " Caxton was a printer who lived in the fifteenth century. He made the first printing-press in England." +
                " In the reading-room of the British Museum many famous men have read and studied." +
                " Charles Dickens, a very popular English writer and the author of 'David Copperfield'," +
                " 'Oliver Twist', 'Dombey and Son' and other books, spent a lot of time in the British Museum Library.";
        String textToWords = text.replaceAll("\\W", " ");
        System.out.println(differentWordsInText(textToWords));
        System.out.println(countSameWordsInText(textToWords));
    }

    public static Set<String> differentWordsInText(String textToWords) {
        Set<String> setWords = new HashSet<>();
        for (String word : textToWords.split(" ")
                ) {
            setWords.add(word);
        }
        return setWords;
    }


    public static Map<String, Integer> countSameWordsInText(String textToWords) {
        Map<String, Integer> mapWords = new HashMap<>();
        for (String word : textToWords.split(" ")) {
            if (mapWords.containsKey(word)) {
                mapWords.put(word, mapWords.get(word) + 1);
            } else {
                mapWords.put(word, 1);
            }
        }
        mapWords.remove("");
        return mapWords;
    }
}