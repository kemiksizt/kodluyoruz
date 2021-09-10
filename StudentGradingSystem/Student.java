
public class Student {
    String name;
    int studentNo;
    int classes;
    Course math;
    Course phys;
    Course chem;
    double average;
    boolean isPass;

    public Student(String name, int classes, int studentNo, Course math, Course phys, Course chem) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.math = math;
        this.phys = phys;
        this.chem = chem;
        calcAverage();
        this.isPass = false;
    }
    
    
    public void addBulkExamNote(int math,int mathClass, int phys, int physClass, int chem, int chemClass){
        if(math >= 0 && math <= 100){
            this.math.note = math;
            this.math.classNote = mathClass;
        }
        
        if(phys >= 0 && phys <= 100){
            this.phys.note = phys;
            this.phys.classNote = physClass;
        }
        
        if(chem >= 0 && chem <= 100){
            this.chem.note = chem;
            this.chem.classNote = chemClass;
        }
    }
    
    
    public void isPass(){
        if((this.math.note == 0) || (this.phys.note == 0) || (this.chem.note == 0)){
               System.out.println("Not all notes entered.."); 
        }
        else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.average);
            
            if(this.isPass){
                System.out.println("Pass..");    
            }
            else{
                System.out.println("Not pass..");
            }
            
            
        }
    }
    
    public void calcAverage(){
        this.average = (this.math.note * 0.8 + this.math.classNote * 0.2 +
                        this.phys.note * 0.8 + this.phys.classNote * 0.2 +
                        this.chem.note * 0.8 + this.chem.classNote * 0.2) / 3;
        
        
    }
    
    public boolean isCheckPass(){
        calcAverage();
        return this.average >= 55;
        
    }
    
    public void printNote(){
        System.out.println("Student name : " + this.name);
        System.out.println("Math : " + this.math.note + " , " + this.math.classNote);
        System.out.println("Physics : " + this.phys.note + " , " + this.phys.classNote);
        System.out.println("Chemical : " + this.chem.note + " , " + this.chem.classNote);
    }
    
    
    
}
