import java.util.ArrayList;

//range extraction - a range when it consists at least 3 numbers incl.endpoints
public class Kata9 {
    public static String rangeExtraction(int[] arr) {
        String myString = "";
        String comma = ",";

        for (int i=0;i<arr.length-1;i++) {
            int start = arr[i];
            if ((arr[i] + 1 != arr[i + 1])||(arr[i] + 2 != arr[i + 2])) {
                myString = myString + start + comma;
            }
            if ((arr[i] + 1 == arr[i + 1])&&((arr[i+1]+1==arr[i+2]))) {
                String end="";
                int no=0;
                for (int j = i+1; j < arr.length-1; j++) {
                    no=j;

                    if (arr[j] + 1 == arr[j + 1]) {
                        end = String.valueOf(arr[j+1]);
                    } else break;
                }
                myString = myString +start + "-"+end+comma;
                i=no;
            }
        }
        return myString.substring(0,(myString.length()-1));
    }
}
