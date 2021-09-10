
public class Main {
    public static void main(String[] args) {
        
        Course math = new Course("Math", "MAT101", "MAT");
        Course phys = new Course("Physics", "FZK101", "PHY");
        Course chem = new Course("Chemistry", "KMY101", "CHE");

        Teacher t1 = new Teacher("Bill", "90550000000", "MAT");
        Teacher t2 = new Teacher("George", "90550000001", "PHY");
        Teacher t3 = new Teacher("James", "90550000002", "CHE");

        math.addTeacher(t1);
        phys.addTeacher(t2);
        chem.addTeacher(t3);

        Student s1 = new Student("Marry", 4, 140144015, math, phys, chem);
        s1.addBulkExamNote(50,65,75,60,20,40);
        s1.isPass();

        Student s2 = new Student("Alex", 4, 2211133, math, phys, chem);
        s2.addBulkExamNote(100,50,40,70,50,40);
        s2.isPass();

        Student s3 = new Student("Frank", 4, 221121312, math, phys, chem);
        s3.addBulkExamNote(50,60,30,40,20,40);
        s3.isPass();
        
    }
    
}
