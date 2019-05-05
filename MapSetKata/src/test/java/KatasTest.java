import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class KatasTest {
    @Test
    public void examples() {
        String[] words = new String[]{"can","do","have","was","would"};
        final Set<String> words1 = Katas.addToSet(words);
        assertEquals("I don't like pizza.", Katas.speechCorrection(words1, "I do like pizza."));
        assertEquals("I have seen you wearing that hat before.", Katas.speechCorrection(words1, "I haven't seen you wearing that hat before."));
        assertEquals("I could see why you wouldn't say that.", Katas.speechCorrection(words1, "I could see why you would say that."));
        assertEquals("I didn't say it! It was me!", Katas.speechCorrection(words1, "I didn't say it! It wasn't me!"));
        assertEquals("I must be more careful in future.", Katas.speechCorrection(words1, "I must be more careful in future."));
        assertEquals("YES, WE CAN'T", Katas.speechCorrection(words1, "YES, WE CAN"));
//        assertEquals("Would you believe it? I can!", Katas.speechCorrection(words1, "Wouldn't you believe it? I can't!"));
        assertEquals("I do see why it WOULDN'T be them", Katas.speechCorrection(words1, "I don't see why it WOULD be them"));
    }
    @Test
    public void addToSet(){
        String[] array1 = new String[]{"me","myself","I"};
        HashSet<String> set1 = new HashSet<String>();
        set1.add("me");
        set1.add("myself");
        set1.add("I");
        String[] array2 = new String[]{"he","himself"};
        HashSet<String> set2 = new HashSet<String>();
        set2.add("he");
        set2.add("himself");

        assertEquals(set1,Katas.addToSet(array1));
        assertEquals(set2,Katas.addToSet(array2));
    }
    @Test
    public void addToMap(){
        String[] array1 = new String[]{"a","b","c"};
        Map<String,String> map1 = new HashMap<String, String>();
        map1.put("a","an't");
        map1.put("b","bn't");
        map1.put("c","cn't");
        map1.put("cn't","c");
        map1.put("bn't","b");
        map1.put("an't","a");

        assertEquals(map1,Katas.addtoMap(array1));
    }
    @Test
    public void addToMapLimitedPool(){
        String[] array1 = new String[]{"a","c","d","g","w"};
        Set<String> limitedPoolOfWords = new HashSet<String>();
        limitedPoolOfWords.add("c");
        limitedPoolOfWords.add("g");
        limitedPoolOfWords.add("w");
        Map<String,String> map1 = new HashMap<String, String>();
        map1.put("c","cn't");
        map1.put("cn't","c");
        map1.put("C","CN'T");
        map1.put("CN'T","C");
        map1.put("g","gn't");
        map1.put("gn't","g");
        map1.put("G","GN'T");
        map1.put("GN'T","G");
        map1.put("w","wn't");
        map1.put("wn't","w");
        map1.put("W","WN'T");
        map1.put("WN'T","W");

        assertEquals(map1,Katas.addtoMapLimitedPool(array1,limitedPoolOfWords));
    }
    @Test
    public void addToMapLimitedPool1(){
        String[] pool = new String[]{"are", "can","could","did", "do","has","have","is", "might","must", "should","was",
                "were","would"};
        Set<String> limitedPoolOfWords = new HashSet<String>();
        limitedPoolOfWords.add("would");
        limitedPoolOfWords.add("can");

        Map<String,String> map1 = new HashMap<String, String>();
        map1.put("would","wouldn't");
        map1.put("wouldn't","would");
        map1.put("WOULD","WOULDN'T");
        map1.put("WOULDN'T","WOULD");
        map1.put("can","can't");
        map1.put("can't","can");
        map1.put("CAN","CAN'T");
        map1.put("CAN'T","CAN");

        assertEquals(map1,Katas.addtoMapLimitedPool(pool,limitedPoolOfWords));
    }

    @Test
    public void arrayWithWords(){
        String sentence = "Ala ma kota";
        String[] array = new String[]{"Ala","ma","kota"};
        assertArrayEquals(array,sentence.split(" "));
    }
}