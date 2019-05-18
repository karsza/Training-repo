
public class main {
    public static void main(String[] args) {
        Singleton mojSingleton = Singleton.getInstance();
        System.out.println(mojSingleton);

        Singleton mojDrugiSingleton = Singleton.getInstance();
        System.out.println(mojDrugiSingleton);
    }
}
