package hospitalmanagement;

public class Patient extends Person {
    private String illnes;

    Patient(String name, int age, String illness) {
        super(name, age);
        this.illnes = illness;
    }

    public String getIllnes() {
        return illnes;
    }
}
