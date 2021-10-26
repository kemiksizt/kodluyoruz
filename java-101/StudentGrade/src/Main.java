
public class Main {
    public static void main(String[] args) {
        
        
        Course mat = new Course("Math", "MAT101", "MAT");
        Course phys = new Course("Physics", "PHY101", "PHY");
        Course chem = new Course("Chemistry", "CHE101", "CHE");

        Teacher t1 = new Teacher("Mary", "90550000000", "MAT");
        Teacher t2 = new Teacher("Peter", "90550000001", "PHY");
        Teacher t3 = new Teacher("Luis", "90550000002", "CHE");

        mat.addTeacher(t1);
        phys.addTeacher(t2);
        chem.addTeacher(t3);

        Student s1 = new Student("Bill", 4, "140144015", mat, phys, chem);
        s1.addExams(50,60,30,40,20,40);
        s1.isPass();

        Student s2 = new Student("James", 4, "2211133", mat, phys, chem);
        s2.addExams(100,60,35,65,50,40);
        s2.isPass();

        Student s3 = new Student("George", 4, "221121312", mat, phys, chem);
        s3.addExams(50,20,40,60,70,80);
        s3.isPass();
        
    }
    
}
