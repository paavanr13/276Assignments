package people;
import java.util.ArrayList;
import java.io.FileWriter;  
import java.io.IOException;



public class Student extends Person {
    private int studentID;
    private String major;
    
    public Student(String name, String email, int studentID, String major){
        super(name,email);
        this.studentID=studentID;
        this.major=major;
    }
    
    public String getName(){
        return super.getName();
    }
    
    public String getEmail(){
        return super.getEmail();
    }
    
    public String getMajor(){
        return this.major;
    }
    
    public int get_studentID(){
        return this.studentID;
    }
    
    
}
