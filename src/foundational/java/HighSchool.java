package foundational.java;

public class HighSchool implements School {
    private String schoolName;
    private String schoolCity;
    private int numClassrooms;
    private int numStudents;
    private boolean isOpen;


    public HighSchool (String schoolName, String schoolCity, int numClassrooms, int numStudents, boolean isOpen) {
        this.schoolName = schoolName;
        this.schoolCity = schoolCity;
        this.numClassrooms = numClassrooms;
        this.numStudents = numStudents;
        this.isOpen = isOpen;
    }

    @Override
    public String getSchoolName() {
        return this.schoolName;
    }

    @Override
    public String getSchoolCity() {
        return this.schoolCity;
    }

    @Override
    public int getNumClassrooms() {
        return this.numClassrooms;
    }

    @Override
    public int getNumStudents() {
        return this.numStudents;
    }

    @Override
    public boolean getIsOpen() {
        return isOpen;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setSchoolCity(String schoolCity) {
        this.schoolCity = schoolCity;
    }

    public void setNumClassrooms(int numClassrooms) {
        this.numClassrooms = numClassrooms;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void print() {
        System.out.println(this.schoolName +" is the best high school in " + this.schoolCity);
    }
}
