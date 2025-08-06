/**
 * @Author Abderrahmann C.
 * @Date 2025-08-06
 */
public class Client {
    
 public static void main(String[] args) {
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();

    System.out.println(s1 == s2); // Should print: true

    s1.doSomething();
}


    
}
