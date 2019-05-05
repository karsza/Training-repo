import java.util.*;

public class Katas {

    public static String speechCorrection(final Set<String> words, final String speech) {
        String[] wordsPool = new String[]{"are", "can","could","did", "do","has","have","is", "might","must", "should","was",
                "were","would"};
        Map<String, String> wordsMap;
        wordsMap = addtoMapLimitedPool(wordsPool,words);

        String[] arrayFromSpeech = speech.split(" ");
        String intendedSpeech = "";
        for (int i=0;i<arrayFromSpeech.length;i++){
            if (wordsMap.containsKey(arrayFromSpeech[i]))
                arrayFromSpeech[i]=wordsMap.get(arrayFromSpeech[i]);

//            intendedSpeech = intendedSpeech + arrayFromSpeech[i]+" ";
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
//            finalMap.put(array[i]+"n't",array[i]);
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
                    } else {
                        finalMap.put("can", "can't");
                        finalMap.put("can't", "can");
                        finalMap.put("CAN", "CAN'T");
                        finalMap.put("CAN'T", "CAN");
                    }
                }
            }
        }

        return finalMap;
    }
}