
public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course phys;
    Course chem;
    double average;
    boolean isPass;

    public Student(String name,int classes, String stuNo,  Course mat, Course phys, Course chem) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.phys = phys;
        this.chem = chem;
        calcAverage();
        this.isPass = isPass;
        }
    
    
    
        public void addExams(int mat1,int mat2, int phys1, int phys2, int chem1, int chem2){
            if(0 <= mat1 || mat1 <= 100){
                this.mat.note = mat1;
            }
            
            if(0 <= mat2 || mat2 <= 100){
                this.mat.classNote = mat2;
            }
            
            if(0 <= phys1 || phys1 <= 100){
                this.phys.note = phys1;
            }
            
            if(0 <= phys2 || phys2 <= 100){
                this.phys.classNote = phys2;
            }
            
            if(0 <= chem1 || chem1 <= 100){
                this.chem.note = chem1;
            }
            
            if(0 <= chem2 || chem2 <= 100){
                this.chem.classNote = chem2;
            }
        
     
        }
        
        public boolean isCheckPass(){
            calcAverage();
            
            return this.average >= 55;
        }
        
        public void isPass(){
            if(this.mat.note == 0 || this.phys.note == 0 || this.chem.note == 0){
                System.out.println("Not all grades entered..");
            }
            
            else{
                this.isPass = isCheckPass();
                printNote();
                System.out.println("Average : " + average);
                
                if(isPass){
                    System.out.println("Pass !");
                }
                else{
                    System.out.println("NOT pass !");
                }
            }
        }
        
        public void calcAverage(){
            this.average = (this.mat.note * 0.8 + this.mat.classNote * 0.2 +
                            this.phys.note * 0.8 + this.phys.classNote * 0.2 +
                            this.chem.note * 0.8 + this.chem.classNote * 0.2) / 3;     
        }
        
        public void printNote(){
            System.out.println("Student : " + this.name);
            System.out.println("Math : " + this.mat.note + " , " + this.mat.classNote);
            System.out.println("Physics : " + this.phys.note + " , " + this.phys.classNote);
            System.out.println("Chemistry : " + this.chem.note + " , " + this.chem.classNote);
        }
    
 
}
