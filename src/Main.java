public class Main {
    public static void main(String[] args) {

        //Declare variables
        String patientName = "Stacey Manson";
        boolean hasInsurance = false;
        double temp = 102.2;
        int numVisits = 5;
        int coPay = 25;
        String nextAppointment = "6/20/20";
        String cellNum = "301 - 555 - 5555";

        //print message and call variables
        System.out.println("Patient Details:");
        System.out.println("Name: " + patientName);
        System.out.println("Patient has insurance: " + hasInsurance);
        System.out.println("Body temperature: " + temp );
        System.out.println("Number of visits: " + numVisits);
        System.out.println("Copay amount: $" + coPay);
        System.out.println("Next appointment: " + nextAppointment);
        System.out.println("Contact number: " + cellNum);

    }

}