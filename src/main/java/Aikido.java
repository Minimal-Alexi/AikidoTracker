import java.util.Scanner;

public class Aikido {
    public static void main(String[] args) {
        boolean run = true;
        Scanner scanner = new Scanner(System.in);
        while(run) {
            System.out.println("1 - Add Practice Session");
            System.out.println("2 - View Total Practice Time");
            System.out.println("3 - Check Graduation Eligibility");
            System.out.println("4 - Exit");
            System.out.println("Enter your choice: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                {

                }
                case 2:
                {

                }
                case 3:
                {

                }
                case 4:
                {

                }
                default:
                {
                    System.out.println("Wrong choice. Try again.");
                }
            }
        }
    }
}
