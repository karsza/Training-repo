public class Fibonacci {
    public static int fibonacci (int n){
        if (n<=2){
            return 1;
        }
        else return fibonacci(n-1)+fibonacci(n-2);
    }

    public static int fibonacci_iter (int n){
        if (n<=2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int sum=2;
        for (int i=3;i<=n;i++){
            sum = a+b;
            a = b;
            b = sum;
            }
        return sum;
    }
}
