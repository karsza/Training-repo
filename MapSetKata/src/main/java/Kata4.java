public class Kata4 {

        public static int countBits(int n){
            String binary = Integer.toBinaryString(n);
            int bits=0;
            System.out.println(binary);
            char[] binaryArray = binary.toCharArray();
            for (int i=0; i<binaryArray.length;i++){
                if (binaryArray[i]=='1') {
                    bits++;
                }
            }
        return bits;
        }


}
