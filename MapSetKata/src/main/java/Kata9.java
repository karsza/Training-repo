
//range extraction - a range when it consists at least 3 numbers incl.endpoints
public class Kata9 {
    public static String rangeExtraction(int[] arr) {
        String myString = "";
        String comma = ",";

        for (int i = 0; i < arr.length - 1; i++) {
            int start = arr[i];
            if ((arr[i] + 1 != arr[i + 1]) || (arr[i] + 2 != arr[i + 2])) {
                myString = myString + start + comma;
            }
            if ((arr[i] + 1 == arr[i + 1]) && ((arr[i + 1] + 1 == arr[i + 2]))) {
                String end = "";
                int no = 0;
                for (int j = i + 1; j < arr.length - 1; j++) {
                    no = j;

                    if (arr[j] + 1 == arr[j + 1]) {
                        end = String.valueOf(arr[j + 1]);
                    } else break;
                }
                myString = myString + start + "-" + end + comma;
                i = no;
            }
        }
        return myString.substring(0, (myString.length() - 1));
    }

    public static int[] monkeyCount(final int n) {
        int[] finalCount = new int[n];
        for (int monkey = 0; monkey < finalCount.length; monkey++) {
            finalCount[monkey] = monkey + 1;
        }
        return finalCount;
    }

    public static int[] sumParts1(int[] ls) {
        int[] arrayWithSum = new int[ls.length + 1];
        for (int i = 0; i < arrayWithSum.length; i++) {
            int sum = 0;
            for (int j = i; j < ls.length; j++) {
                sum = sum + ls[j];
            }
            arrayWithSum[i] = sum;
        }
        return arrayWithSum;
        //odjac ostatni a nie dodawaj wszystkie
    }

    public static int[] sumParts(int[] ls) {
        int[] arrayWithSum = new int[ls.length + 1];
        int sum = 0;
        for (int i = 0; i < ls.length; i++) {
            sum = sum + ls[i];
        }
        arrayWithSum[0] = sum;
        for (int j = 0; j < ls.length; j++) {
            sum = sum - ls[j];
            arrayWithSum[j + 1] = sum;
        }

        return arrayWithSum;
    }

    public static int sum(int[] arrayToSum) {
        int finalSum = 0;
        for (int i = 0; i < arrayToSum.length; i++) {
            finalSum = finalSum + arrayToSum[i];
        }
        return finalSum;
    }
}
