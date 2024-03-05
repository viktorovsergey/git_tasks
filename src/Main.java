import java.util.Random;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("GIT_1");
        System.out.println("Git_1.1");

        String s = UUID.randomUUID().toString();
          System.out.println(s.replace("-",""));
        System.out.println(s.replace("9",""));
    }
}
