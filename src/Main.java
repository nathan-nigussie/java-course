
import java.util.Random;

//generating random numbers from negative 2 billion to plus 2 billion
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int x = random.nextInt();
        System.out.println(x);

    }
}