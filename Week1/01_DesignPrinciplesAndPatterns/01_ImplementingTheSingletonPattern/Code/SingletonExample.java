class Singleton {
    private static Singleton instance;
    private Singleton() {
        System.out.println("Singleton instance created!");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton class!");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.showMessage();
        Singleton s2 = Singleton.getInstance();
        s2.showMessage();
        if (s1 == s2) {
            System.out.println("Both instances are the same (singleton works!)");
        } else {
            System.out.println("Different instances (singleton failed)");
        }
    }
}
