//connect k/many consecutive strings to receive longest possible string

public class Kata1 {
    public static String longestConsec(String[] strarr, int k) {
        String max="";
        String temp;

        for (int i=0;i<strarr.length;i++){
            temp="";
            for (int j=i;j<strarr.length&&j<i+k;j++)
                temp=temp+strarr[j];
            if (temp.length()>max.length()){
                max=temp;
            }
            if (k>strarr.length){
                max = "";
            }
            if (k==0){
                max = "";
            }
        }
        return max;
    }
}
