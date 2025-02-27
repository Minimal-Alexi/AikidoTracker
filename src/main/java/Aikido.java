import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Aikido {
    private int totalTime;
    ArrayList<LocalDate> logOfSessions;
    public Aikido() {
        totalTime = 0;
        logOfSessions = new ArrayList<>();
    }
    public void addSession(String date, int sessionTime) {
        try
        {
            LocalDate localDate = LocalDate.parse(date);
            logOfSessions.add(localDate);
            totalTime += sessionTime;
        }catch (DateTimeParseException e)
        {
            throw new DateTimeParseException("Invalid date", date, 0);
        }
    }
    public boolean checkEligibility(){
        if(logOfSessions.size() >= 100)
        {
            return true;
        }
        if(logOfSessions.size() >= 2){
            return ChronoUnit.MONTHS.between(logOfSessions.get(0), logOfSessions.get(logOfSessions.size() - 1)) >= 6;
        }
        return false;
    }

    public int getTotalTime() {
        return totalTime;
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
                    System.out.println("Enter Practice Session: \nDate: ");
                    String date = scanner.next();
                    System.out.println("Enter Practice Session Time (Minutes): ");
                    int sessionTime = scanner.nextInt();
                    aikido.addSession(date, sessionTime);
                    break;
                }
                case 2:
                {
                    System.out.println("You have spent: " + aikido.getTotalTime() + " minutes");
                    break;
                }
                case 3:
                {
                    if (aikido.checkEligibility()) {
                        System.out.println("You have eligibility for Kyu graduation.");
                        break;
                    }
                    System.out.println("You are not eligible for Kyu graduation.");
                    break;
                }
                case 4:
                {
                    run = false;
                    break;
                }
                default:
                {
                    System.out.println("Wrong choice. Try again.");
                }
            }
        }
    }
}
