package introexceptionthrow.patient;

public class PatientMain {

    public static void main(String[] args) {
        Patient patientOne = new Patient("John Doe", "123456788", 1995);
        System.out.println("Patient one:");
        System.out.println(patientOne.getName());
        System.out.println(patientOne.getSocialSecurityNumber());
        System.out.println(patientOne.getYearOfBirth());

        System.out.println("Patient two:");
        Patient patientTwo = new Patient("", "12345678", 1995);
        System.out.println(patientTwo.getName());
        System.out.println(patientTwo.getSocialSecurityNumber());
        System.out.println(patientTwo.getYearOfBirth());

        System.out.println("Patient three:");
        Patient patientThree = new Patient("John Doe", null, 1995);
        System.out.println(patientThree.getName());
        System.out.println(patientThree.getSocialSecurityNumber());
        System.out.println(patientThree.getYearOfBirth());

        System.out.println("Patient four:");
        Patient patientFour = new Patient("John Doe", "123456789", 1789);
        System.out.println(patientFour.getName());
        System.out.println(patientFour.getSocialSecurityNumber());
        System.out.println(patientFour.getYearOfBirth());
    }
}
