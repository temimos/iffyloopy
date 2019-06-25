import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean redEyes = false;
        String loopy="y";
        while (!loopy.equals("n"))
        {
            System.out.println("Are your eyes red? (y/n) ");
            loopy = keyboard.nextLine();
            if (loopy.equals("y")) {
                redEyes = true;
            }

            if (redEyes != true) {
                System.out.println("You look great!");
            }
            else {
                System.out.println("get some sleep");
            }

            System.out.println("Do you want to try again?");
            loopy=keyboard.nextLine();
        }
        keyboard.close();
    }
}
