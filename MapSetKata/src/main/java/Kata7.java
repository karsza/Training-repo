//You are given a list/array which contains only integers (positive and negative).
// Your job is to sum only the numbers that are the same and consecutive. The result should be one list.
//You can asume there is never an empty list/array and there will always be an integer.
//Same meaning: 1 == 1
//1 != -1

import java.util.ArrayList;
import java.util.List;

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
}
