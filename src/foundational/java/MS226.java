package foundational.java;

public abstract class MS226 extends MiddleSchool implements School {
    private int radius;

    private boolean isOpen;

    public MS226(String schoolName, String schoolCity, int numClassrooms, int radius) {
        super(schoolName, schoolCity, numClassrooms);
        this.radius = radius;
    }


    @Override
    public int districtRadius() {
        return this.radius;
    }


    @Override
    public boolean getIsOpen() {
        return this.isOpen;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public void setOpen(boolean open) {
        isOpen = open;
    }
}
