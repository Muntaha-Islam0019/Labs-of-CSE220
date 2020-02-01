import java.util.ArrayList;

public class waitingRoomManagement {

    queueUsingCirArray q = new queueUsingCirArray(100);
    private int[] idOfPatients = new int[100];
    private ArrayList <String> arrayList = new ArrayList<String> ();
    private int index = 0;

    void RegisterPatient(Patient p) {

        q.enqueue(p.id);
        idOfPatients[index] = p.id;
        arrayList.add(p.name);

        System.out.println("_______________________________________________\n" +
                "Waiting room: Patient " + p.name + " has been registered as ID#" + p.id
                + "\n_______________________________________________");

        index++;
    }

    void ServePatient() {
        System.out.println("_______________________________________________\n" +
                "Patient #" + q.dequeue() + ", doctor is waiting for you.\n" +
                "_______________________________________________");

        arrayList.remove(0);
    }

    /* This portion was asked to be done, though I didn't implement it.

        void CancelAll() {

            int size = q.size();

            while (size >= 0) {
                q.dequeue();
            }
        }
    */

    boolean CanDoctorGoHome() {
        return (q.size() == 0);
    }

    String ShowAllPatient() {

        String str = "No patients left.";

        if (!(CanDoctorGoHome())) {
            arrayList.sort(String::compareToIgnoreCase);
            str = "Patients left: " + arrayList.toString();
        }

        return str;
    }
}
