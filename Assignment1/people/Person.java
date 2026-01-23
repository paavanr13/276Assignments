package people;

import java.util.ArrayList;
import java.io.FileWriter;  
import java.io.IOException;

public abstract class Person {
    private String name;
    private String email;
    
    public Person(String name, String email){
        this.name=name;
        this.email=email;
    }
    public String getName(){
        return this.name;
    }
    
    public String getEmail(){
        return this.email;
    }
    
}
