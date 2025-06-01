import java.util.Random;

public class RandomNumberHandler {
    public static void main(String[] args) {
        Random rand = new Random();

        int firstNumber = rand.nextInt(6);  // 0 to 5
        int secondNumber = rand.nextInt(101);  // 0 to 100

        try {
            if (firstNumber == 0) {
                System.out.println("-" + secondNumber);
            } else if (firstNumber == 1) {
                System.out.println("+" + secondNumber);
            } else {
                throw new Exception("exception found");
            }
        } catch (Exception e) {
            System.out.println("First number: " + firstNumber);
            System.out.println("Second number: " + secondNumber);
            System.out.println(e.getMessage());
        }
    }
}
