package stringbasic;

public class Student {

    private Person person;

    private String neptunCode;

    private String educationalID;

    private String entranceCard;

    public Student(Person person, String neptunCode, String educationalID) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.educationalID = educationalID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public String getEducationalID() {
        return educationalID;
    }

    public void setEducationalID(String educationalID) {
        this.educationalID = educationalID;
    }

    public String getEntranceCard() {
        return entranceCard;
    }

    public void setEntranceCard(String entranceCard) {
        this.entranceCard = entranceCard;
    }
}
