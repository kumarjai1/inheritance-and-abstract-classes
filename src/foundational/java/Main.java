package foundational.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Math mathClass = new Math("MS226", "NYC", 20, 10, 25);
        mathClass.setOpen(true);
        System.out.println("Math class in "+ mathClass.getSchoolName() + " has " + mathClass.getNumStudents() + " student.");

        MS226 englishClass = new English("Ardery Kell", "Charlotte", 25, 4,35);
        englishClass.setOpen(false);
        System.out.println("The English class in " + englishClass.getSchoolName() + " has " + englishClass.getNumStudents() + " students. It has reputation in the district of the " + englishClass.getSchoolCity() + " as the best writer preparation class");

        HighSchool scienceClass = new HighSchool("Mankato West", "Mankato", 35, 347, true);
        if (scienceClass.getIsOpen()) {
            scienceClass.print();
        }

    }
}
