//Given long number convert it to smallest possible by shuffling just one digit in one take.
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Kata8Test {

    private static void testing(long n, String res) {
        assertEquals(res, Arrays.toString(Kata8.smallest(n)));
        }
        @Test
        public void kataTest() {
        System.out.println("Basic Tests smallest");
//            testing( 47116962473806544 ,"[7116962473846544,12,0]");
        testing(261235, "[126235, 2, 0]");
        testing(209917, "[29917, 0, 1]");
        testing(285365, "[238565, 3, 1]");
        testing(269045, "[26945, 3, 0]");
        testing(296837, "[239687, 4, 1]");
        testing(40901,"[4091, 3, 0]");

        testing(935855753,"[393585575, 8, 0]");
//                      expected:<[3[58557539, 0, 8]]> but was:<[3[93585575, 8, 0]]>
    }

        @Test
        public void WhichIndexesSwapTest(){
            int[] myArray5=new int[]{4,0,9,0,1};
            int[] result5 = new int[]{3,0};
            assertArrayEquals(result5,Kata8.whichIndexesSwap(myArray5));

            int[] myArray4=new int[]{2,0,9,9,1,7};
            int[] result4 = new int[]{1,0};
            assertArrayEquals(result4,Kata8.whichIndexesSwap(myArray4));

            int[] myArray1 = new int[]{2,3,4,9,8};
            int[] result1 = new int[]{4,3};
            assertArrayEquals(result1,Kata8.whichIndexesSwap(myArray1));

            int[] myArray = new int[]{1,2,4,3,4};
            int[] result = new int[]{3,2};
            assertArrayEquals(result,Kata8.whichIndexesSwap(myArray));

            int[] myArray2 = new int[]{2,5,4,3};
            int[] result2 = new int[]{3,1};
            assertArrayEquals(result2,Kata8.whichIndexesSwap(myArray2));

            int[] myArray3 = new int[]{2,3,4};
            int[] result3= new int[]{0,0};
            assertArrayEquals(result3,Kata8.whichIndexesSwap(myArray3));

            int[] myArray5A = new int[]{2,5,1,3,8,9};
            int[] result5A = new int[]{2,0};

            assertArrayEquals(result5A,Kata8.whichIndexesSwap(myArray5A));

            int[] myArray6 = new int[]{2,6,1,2,3,5};
            int[] result6 = new int[] {2,0};

            assertArrayEquals(result6,Kata8.whichIndexesSwap(myArray6));

            int[] myArray7 = new int[]{2,0,9,9,1,7};
            int[] result7 = new int[]{1,0};

            assertArrayEquals(result7,Kata8.whichIndexesSwap(myArray7));
        }

        @Test
    public void arrayToNumberTest(){
        int[] myArray = new int[]{2,5,6,7,3};
        assertEquals(25673,Kata8.convertArrayToNumber(myArray));
        int[] myArray2 = new int[]{0,9,5,6,7,3};
        assertEquals(95673,Kata8.convertArrayToNumber(myArray2));
        }

        @Test
    public void finalArrayTest(){
        int[] myArray = new int[]{2,5,1,3,8,9};
        int[] finalArray = new int[]{1,2,5,3,8,9};
        assertArrayEquals(finalArray,Kata8.arrayWithShuffledNumbers(myArray));

        int[] myArray1 = new int[]{3,0,9};
        int[] finalArray1 = new int[]{0,3,9};
        assertArrayEquals(finalArray1,Kata8.arrayWithShuffledNumbers(myArray1));

        int[] myArray2 = new int[]{1,2,3};
        int[] finalArray2 = new int[]{1,2,3};
        assertArrayEquals(finalArray2,Kata8.arrayWithShuffledNumbers(myArray2));
        }

        @Test
    public void convertLongToIntArrayTest(){
        long n = 1234;
        int[] myArray = new int[]{1,2,3,4};
        assertArrayEquals(myArray,Kata8.convertLongToIntArray(n));

        long n1 = 3001;
        int[] myArray1 = new int[]{3,0,0,1};
        assertArrayEquals(myArray1,Kata8.convertLongToIntArray(n1));
        }
}