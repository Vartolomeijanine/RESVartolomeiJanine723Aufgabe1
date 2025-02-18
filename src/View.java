import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class View {

    private TSVLogParser parser;
    private List<Log> logEntries;

    private final Controller controller;
    private final Scanner scanner = new Scanner(System.in);

    public View() throws IOException {
        this.parser = new TSVLogParser(); // Initialize parser
        this.logEntries = parser.parse("C:\\Users\\Janine\\IdeaProjects\\RESVartolomeiJanine723Aufgabe1\\src\\evenimente.tsv"); // Parse logs
        this.controller = new Controller(logEntries); // Initialize controller with logs
    }

    public void menu() {
        while (true) {
            System.out.println();
            System.out.println("Press:");
            System.out.println("1. Filter ninjas by min");
            System.out.println("2. Sort Jonin by date");


            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    filterKraftPunktenByMin();
                    break;
                case "2":
                    sortJoninbyDate();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }

    /**
     * Filters Ninjas by min kraftpunkte.
     */
    private void filterKraftPunktenByMin() {
        System.out.print("Enter the min: ");
        Double min = scanner.nextDouble();
        scanner.nextLine();
        controller.filterKraftPunktenByMin(min).forEach(System.out::println);
    }

    /**
     * Sort Stark events by date.
     */
    private void sortJoninbyDate() {
        controller.sortJoninbyDate().forEach(System.out::println);
    }




    





}
