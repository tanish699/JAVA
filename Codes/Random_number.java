import java.util.Random;

public class Random_number {
    public static void main(String[] agrs) {
        Random random = new Random();

        int x = random.nextInt();
        System.out.println(+x);

        int dice = random.nextInt(6) +1;
        System.out.println(+dice);
    }
}
