import java.util.ArrayList;
import java.util.Arrays;

//Divisors of 42 are : 1, 2, 3, 6, 7, 14, 21, 42. These divisors squared are: 1, 4, 9, 36, 49, 196, 441,
// 1764. The sum of the squared divisors is 2500 which is 50 * 50, a square!
//Given two integers m, n (1 <= m <= n) we want to find all integers between m and n whose sum of squared
// divisors is itself a square. 42 is such a number.
//The result will be an array of arrays or of tuples (in C an array of Pair) or a string, each subarray having two elements, first the number whose squared divisors is a square and then the sum of the squared divisors.
public class Kata3 {
    public static String listSquared(long m, long n){
        ArrayList<String> arrayListWithAll = new ArrayList<String>();

        for (long i=m; i<=n;i++){
            if (i==1){
                String a1="1";
                arrayListWithAll.add("[" + i + ", " + a1 + "]");
            }
            if (squereRoot(sumOfNrsInArrayList(squareDividersOafNumberAndSquareThem(Long.valueOf(i))))>0) {
                String a1 = String.valueOf(sumOfNrsInArrayList(squareDividersOafNumberAndSquareThem(Long.valueOf(i))));
                arrayListWithAll.add("[" + i + ", " + a1 + "]");
            }
        }
        String[] arrayWithStrings = arrayListWithAll.toArray(new String[arrayListWithAll.size()]);

        for (String x:arrayWithStrings){
        }
        return Arrays.toString(arrayWithStrings);
    }
    public static int squereRoot(long  number){
        int result = 0;
        for (int i=1;i<number;i++){
            if ((i*i)==number){
                result=i;
            }
        }
        return result;
    }
    public static long sumOfNrsInArrayList (ArrayList<Long> list){
        long sum = 0;
        for (Long l : list){
            sum=sum+l;
        }
        return sum;
    }
    public static ArrayList<Long> squareDividersOafNumberAndSquareThem(long number){
        ArrayList<Long> squaresList = new ArrayList<Long>();
        for (long i=1; i<=number;i++){
            if (number%i==0){
                squaresList.add(i*i);
            }
        }
        return squaresList;
    }
}
