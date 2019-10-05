package foundational.java;

public class Math extends MS226 {

    private int numStudents;

    public Math(String schoolName, String schoolCity, int numClassrooms, int radius, int numStudents) {
        super(schoolName, schoolCity, numClassrooms, radius);
        this.numStudents = numStudents;
    }

    @Override
    public int getNumStudents() {
        return this.numStudents;
    }
    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }
}
