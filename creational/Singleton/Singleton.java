/**
 * @Author Abderrahmann C.
 * @Date 2025-08-06
 */
public class Singleton {
    // Static instance (initially null)
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Public method to get the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); 
        }
        return instance;
    }

    // Example method
    public void doSomething() {
        System.out.println("Ready..");
    }
}
