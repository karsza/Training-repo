//lazy initialization method, singleton is not created before there is a need
public class Singleton {
//    private static Singleton SINGLE_INSTANCE = null;
//    private Singleton(){}
//    public static Singleton getSingleInstance(){
//        if (SINGLE_INSTANCE == null){
//            synchronized (Singleton.class){
//                SINGLE_INSTANCE = new Singleton();
//            }
//        }
//        return SINGLE_INSTANCE;
//    }
    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance(){
        if (instance ==null){

            instance = new Singleton();
        }
        return instance;
    }
}
