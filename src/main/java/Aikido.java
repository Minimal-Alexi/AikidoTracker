import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Aikido {
    private int totalTime;
    private HashMap<Date,Integer> logOfSessions;
    public Aikido() {
        totalTime = 0;
        logOfSessions = new HashMap<>();
    }
    public void addSession(Date date, int sessionTime) {
        logOfSessions.put(date,sessionTime);
        totalTime += sessionTime;
    }
    public boolean checkEligibility(){

    }

    public static void main(String[] args) {
        // Initialization
        Aikido aikido = new Aikido();
        boolean run = true;
        Scanner scanner = new Scanner(System.in);

        // Runtime
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
