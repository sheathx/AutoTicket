import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int ticket;
        String description;
        String title;
        boolean issueOccurring;
        String answer;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nEnter the ticket number: ");
        ticket = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character


        System.out.print("\nEnter the title: ");
        title = scanner.nextLine();

        System.out.print("\nEnter the description: ");
        description = scanner.nextLine();
      
        System.out.print("\nIs the issue occurring? (yes/no): ");
        answer = scanner.nextLine();
        issueOccurring = answer.equalsIgnoreCase("yes");
        


        System.out.printf("\nTicket: %d%n", ticket);
        System.out.printf("\nTitle: %s%n", title);
        System.out.printf("\nDescription: %s%n", description);
        System.out.printf("\nIssue occurring: %s%n", issueOccurring ? "yes" : "no");


         scanner.close();
    }
}
