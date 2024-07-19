import java.util.*;

class NUMBERGUESSGAME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        Random rand = new Random();
        int NUMBER = rand.nextInt(101);
        while (guess != NUMBER) {
            System.out.println("Guess a number between 1 and 100");
            guess = sc.nextInt();
            if (guess == -1) {
                System.out.println("number is " + String.valueOf(NUMBER));
            }
            if (guess > NUMBER) {
                System.out.println("Too high");
            } else if (guess < NUMBER) {
                System.out.println("Too low");
            } else {
                System.out.println("That's right!");
                System.exit(0);
            }
        }
        sc.close();
    }
}