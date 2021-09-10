  
public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;
    int classNote;
    

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
        this.classNote = classNote;
        
        
        
    }

    
    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.teacher = t;
            System.out.println("Teacher appointed ..");
        }
        else{
            System.out.println("Teacher NOT appointed ..");
        }
        
    
    }
    
    public void printTeacher(){
        if(this.teacher != null){
            System.out.println("Teacher : " + teacher);
        }
        else{
            System.out.println("No teacher has been appointed yet!");
        }
        
    }
    
    
    
   
}
