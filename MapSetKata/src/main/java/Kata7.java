//You are given a list/array which contains only integers (positive and negative).
// Your job is to sum only the numbers that are the same and consecutive. The result should be one list.
//You can asume there is never an empty list/array and there will always be an integer.
//Same meaning: 1 == 1
//1 != -1

import java.util.*;

public class Kata7 {
    public static List<Integer> sumConsecutives(List<Integer> s) {
        List<Integer> finalList = new ArrayList<Integer>();
        for (int i=0;i<s.size();i++) {
            int sum=s.get(i);
            for (int j=i;j<s.size()-1;j++){
                if (s.get(j)==s.get(j+1)){
                    sum=sum+s.get(j+1);
                    i++;
                }
                else break;
            }
            finalList.add(sum);
        }
        return finalList;
    }
    public static int duplicateCount(String text) {

        char[] textInArray = text.toUpperCase().toCharArray();
        Set<Character> uniqueValueSet = new HashSet<Character>();
        for (Character arrayWithValues : textInArray){
            uniqueValueSet.add(arrayWithValues);
        }
        Character[] uniqueCharsInArray = uniqueValueSet.toArray(new Character[uniqueValueSet.size()]);

        int countFinalDuplicates=0;
        for (int j=0;j<uniqueCharsInArray.length;j++) {
            int countDuplicates = 0;

            for (int i=0; i < textInArray.length; i++) {
                if (textInArray[i]==uniqueCharsInArray[j]) {
                    countDuplicates++;
                }
            }
            if (countDuplicates>1){
                countFinalDuplicates ++;
            }
        }
        return countFinalDuplicates;
    }
}
