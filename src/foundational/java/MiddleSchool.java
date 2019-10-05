package foundational.java;

public abstract class MiddleSchool implements School {
    private String schoolName;
    private String schoolCity;
    private int numClassrooms;

    public MiddleSchool(String schoolName, String schoolCity, int numClassrooms) {
        this.schoolName = schoolName;
        this.schoolCity = schoolCity;
        this.numClassrooms = numClassrooms;
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


    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setSchoolCity(String schoolCity) {
        this.schoolCity = schoolCity;
    }

    public void setNumClassrooms(int numClassrooms) {
        this.numClassrooms = numClassrooms;
    }
    public abstract int districtRadius();

    public void print() {
        System.out.println(this.schoolName +" is the best middle school in " + this.schoolCity);
    }
}
