import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println(ThreadLocalRandom.current().nextInt(1,2));
    }
}