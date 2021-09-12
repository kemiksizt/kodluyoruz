
public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int classNote;
    Teacher courseTeacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.classNote = 0;
    }
    
    
 
    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("Teacher added..");
        } 
        else{
            System.out.println("This teacher cannot teach this lesson");
        }
    }
    
    
    public void printTeacher(){
        if(this.courseTeacher.name != null){
            System.out.println("Teacher : " + this.courseTeacher.name);
        }
        else{
            System.out.println("No teacher for this lesson ");
        }
    }
    
    
    
    
}


