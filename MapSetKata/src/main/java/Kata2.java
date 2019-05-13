//Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings
// of a1 which are substrings of strings of a2.

import java.util.ArrayList;
import java.util.Arrays;

public class Kata2 {
    public static String[] inArray(String[] array1, String[] array2) {

        ArrayList<String> result = new ArrayList<String>();

        for (int i=0;i<array1.length;i++){
            for (int j=0;j<array2.length;j++){
                if (array2[j].contains(array1[i])){
                    result.add(array1[i]);
                    break;
                }
            }
        }
        String[] resultArray = result.toArray(new String[result.size()]);
        Arrays.sort(resultArray);
        return resultArray;
    }
}
