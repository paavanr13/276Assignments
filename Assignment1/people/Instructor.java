package people;
import java.util.ArrayList;
import java.io.FileWriter;  
import java.io.IOException;


public class Instructor extends Person {
    private int instructorID;
    private String faculty;
    
    public Instructor(String name, String email, int instructorID, String faculty){
        super(name,email);
        this.instructorID=instructorID;
        this.faculty=faculty;
    }
    
    public String getName(){
        return super.getName();
    }
    
    public String getEmail(){
        return super.getEmail();
    }
    
    public String getFaculty(){
        return this.faculty;
    }
    
    public int get_instructorID(){
        return this.instructorID;
    }
}

