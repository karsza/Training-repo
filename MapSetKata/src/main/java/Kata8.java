public class Kata8 {
    public static long[] smallest(long n) {

        long finalN;

        int[] arrayOfLong = convertLongToIntArray(n);
        int[] whichIndexesSwap = whichIndexesSwap(arrayOfLong);
        int[] newArrayOfLong = arrayWithShuffledNumbers(arrayOfLong);

        finalN = convertArrayToNumber(newArrayOfLong);

        long[] finalArray = new long[3];

        finalArray[0]=finalN;
        finalArray[1] = whichIndexesSwap[0];
        finalArray[2] = whichIndexesSwap[1];

        return finalArray;
    }

    public static int[] convertLongToIntArray(long n) {
        String nString = String.valueOf(n);
        char[] charN = nString.toCharArray();
        String[] stringN = new String[charN.length];
        int j = 0;
        for (char c : charN) {
            stringN[j] = String.valueOf(String.valueOf(c));
            j++;
        }
        int[] intArrayFromChars = new int[stringN.length];
        for (int i = 0; i < intArrayFromChars.length; i++) {
            intArrayFromChars[i] = Integer.parseInt(stringN[i]);
        }
        return intArrayFromChars;
    }

    public static int[] whichIndexesSwap(int[] arrayWithNumbers) {
        int index = -1;
        int[] result = new int[2];
        for (int i = 0; i < arrayWithNumbers.length ; i++) {
            int smallestNo = arrayWithNumbers[i];
            for (int j = i + 1; j < arrayWithNumbers.length; j++) {

                if (smallestNo > arrayWithNumbers[j]) {
                    smallestNo = arrayWithNumbers[j];
                    index = j;
                }
                if (smallestNo == 0) {
                    index = j;
                    break;
                }
            }
            if ((i != index)&&(index!=-1)) {
                result[0] = index;
                result[1] = i;
                break;
            }
        }
        return result;
    }

    public static long convertArrayToNumber (int[] arrayToConvert){
        String myString = "";
        for (int no : arrayToConvert){
            myString=myString+no;
        }
        long finalNo=Long.parseLong(myString);
        return finalNo;
    }

    public static int[] arrayWithShuffledNumbers(int []arrayToBeShuffled){
        int last = whichIndexesSwap(arrayToBeShuffled)[0];
        int start =whichIndexesSwap(arrayToBeShuffled)[1];

        for (int i=last;i>start;i--){
            int temp = arrayToBeShuffled[i];
            arrayToBeShuffled[i]=arrayToBeShuffled[i-1];
            arrayToBeShuffled[i-1]=temp;
        }
        return arrayToBeShuffled;
    }
}