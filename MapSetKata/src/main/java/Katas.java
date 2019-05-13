import java.util.*;

public class Katas {
    public static String speechCorrectionImproved(final Set<String> words, final String speech) {
        String[] wordsPool = new String[]{"are", "can","could","did", "do","has","have","is", "might","must", "should","was",
                "were","would"};
        Map<String, String> wordsMap;
        wordsMap = addtoMapLimitedPool(wordsPool,words);

        String intendedSpeech="";
        String word="";

        char[] arrayForSpeech = speech.toCharArray();

        for (int i=0;i<arrayForSpeech.length;i++){
            if ((Character.isLetter(arrayForSpeech[i])) || ((arrayForSpeech[i] == '\''))) {
                word = word + arrayForSpeech[i];
            }
            else if (word.length()==0) {
                intendedSpeech = intendedSpeech + arrayForSpeech[i];
            }
            else {
                intendedSpeech = intendedSpeech + replaceWord(word, wordsMap) + arrayForSpeech[i];
                word = "";
            }
        }
        if (word!="")
            intendedSpeech=intendedSpeech+replaceWord(word,wordsMap);

        return intendedSpeech;
    }

    public static String speechCorrection(final Set<String> words, final String speech) {
        String[] wordsPool = new String[]{"are", "can","could","did", "do","has","have","is", "might","must", "should","was",
                "were","would"};
        Map<String, String> wordsMap;
        wordsMap = addtoMapLimitedPool(wordsPool,words);

        String[] arrayFromSpeech = speech.split(" ");
        String intendedSpeech = "";
        for (int i=0;i<arrayFromSpeech.length;i++){
            arrayFromSpeech[i]=replaceWord(arrayFromSpeech[i],wordsMap);
        }
        StringBuilder builder = new StringBuilder();
        for (String word:arrayFromSpeech){
            builder.append(word);
            builder.append(" ");
            intendedSpeech = builder.toString();
        }
        return intendedSpeech.trim();

    }

    public static Set addToSet(String[] array) {
        Set<String> finalSet = new HashSet<String>();
        for (int i = 0; i < array.length; i++) {
            finalSet.add(array[i]);
        }
        return finalSet;
    }

    public static Map addtoMap(String[] array) {
        Map<String, String> finalMap = new HashMap<String, String>();
        for (int i = 0; i < array.length; i++) {
            finalMap.put(array[i], array[i]+ "n't");
            finalMap.put(finalMap.get(array[i]), array[i]);
        }
        return finalMap;
    }

    public static Map addtoMapLimitedPool(String[] array, Set<String> wordsSet) {
        Map<String, String> finalMap = new HashMap<String, String>();
        for (int i = 0; i < array.length; i++) {
            for (String wordSet : wordsSet) {
                if (wordSet == array[i]) {
                    if (wordSet != "can") {
                        finalMap.put(array[i], array[i] + "n't");
                        finalMap.put(array[i] + "n't", array[i]);
                        finalMap.put(array[i].toUpperCase(), array[i].toUpperCase() + "N'T");
                        finalMap.put(array[i].toUpperCase() + "N'T", array[i].toUpperCase());
                        finalMap.put((startWithCapitalLetter(array[i])+"n't"),(startWithCapitalLetter(array[i])));
                        finalMap.put((startWithCapitalLetter(array[i])),(startWithCapitalLetter(array[i])+"n't"));
                    } else {
                        finalMap.put("can", "can't");
                        finalMap.put("can't", "can");
                        finalMap.put("CAN", "CAN'T");
                        finalMap.put("CAN'T", "CAN");
                        finalMap.put("Can't","Can");
                        finalMap.put("Can","Can't");
                    }
                }
            }
        }

        return finalMap;
    }
    public static String startWithCapitalLetter (String word){
        char[] stringToArray = word.toCharArray();
        stringToArray[0] = Character.toUpperCase(stringToArray[0]);

        StringBuilder builder = new StringBuilder();
        for (char letter: stringToArray){
            builder.append(letter);
        }
        word = builder.toString();
    return word;
    }

    public static String replaceWord (String word, Map<String,String> correctWord){
        if (correctWord.containsKey(word)){
            return correctWord.get(word);
        }
        return word;
    }

}