public class Kata6 {
    public static int countArgs(Object... args) {
        return args.length;
    }

    public static int[] doubleArray(int[] array) {
        int[] doubledArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            doubledArray[j] = array[i] * 2;
            j++;
        }
        return doubledArray;
    }

    public static int enough(int cap, int on, int wait) {
        int wontFit;
        wontFit = cap-on-wait;
        if (wontFit>0){
            return 0;
        }
    return (-wontFit);
    }
}
