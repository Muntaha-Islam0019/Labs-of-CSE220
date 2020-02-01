import java.util.Random;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Random rand = new Random();
        int generatedId = rand.nextInt(100);

        Scanner sc = new Scanner(System.in);

        waitingRoomManagement wrm = new waitingRoomManagement();

        while (true) {

            System.out.println("Do you want to register here?");
            String str = sc.nextLine();

            if (str.equals("No") || str.equals("no") || str.equals("n") || str.equals("N")) {
                break;
            } else {

                try {
                    System.out.println("Please enter your name: ");
                    String name = sc.nextLine();

                    System.out.println("Please enter your blood group: ");
                    String bloodGroup = sc.nextLine();

                    System.out.println("Please enter your age: ");
                    int age = Integer.parseInt(sc.nextLine());

                    int id = generatedId++;

                    Patient p = new Patient(name, bloodGroup, age, id);

                    wrm.RegisterPatient(p);

                    System.out.println("You have been registered.\n" +
                            "Your ID is: " + id + "\n" +
                            "Please wait for your call. Thank you.\n" +
                            "_______________________________________________");
                } catch (Exception e) {
                    System.out.println("Input mismatch. Please give valid inputs.");
                }
            }
        }

        while (!(wrm.CanDoctorGoHome())) {
            wrm.ServePatient();
            System.out.println(wrm.ShowAllPatient());
        }
    }
}
