package people;
import java.io.FileWriter;  
import java.io.IOException;
import java.util.ArrayList;



class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        
        Student Bob = new Student("Bob", "bob@sfu.ca",12345678,"Statistics");
        Student Alice = new Student("Alice", "alice@sfu.ca",12345678,"Computing Science");
        Instructor Mary = new Instructor("Mary", "mary@sfu.ca",12345678,"Faculty of Science");
        Instructor Bill = new Instructor("Bill", "bill@sfu.ca",12345678,"Faculty of Applied Sciences");
        people.add(Bob);
        people.add(Alice);
        people.add(Mary);
        people.add(Bill);
        
        try {
            FileWriter print_info = new FileWriter("file.txt");
            for (int i=0;i<people.size();i++){
                int index=i+1;
                print_info.write(index+". ");
                print_info.write("\n");
                print_info.write("Name: " + people.get(i).getName() + "\n");
                print_info.write("Email: " + people.get(i).getEmail() + "\n");
                
                if (people.get(i) instanceof Student){
                    Student current_student = (Student) people.get(i);
                    print_info.write("ID: " + current_student.get_studentID() + "\n");
                    print_info.write("Major: " + current_student.getMajor() + "\n");
                    print_info.write("\n");
                }
                else {
                    Instructor current_instructor = (Instructor) people.get(i);
                    print_info.write("ID: " + current_instructor.get_instructorID() + "\n");
                    print_info.write("Faculty: " + current_instructor.getFaculty() + "\n");
                    print_info.write("\n");
                }
            }
            print_info.close();
           } catch (IOException exception){
                System.out.println("There was an issue with writing to file");
                exception.printStackTrace();
            }
        
    }
}