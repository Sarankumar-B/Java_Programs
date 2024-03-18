package oops;
public class encapsulation {
    private String name;
    private int age;

    // Constructor
    public encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //getters methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    //setters methods
    public void setName(String name) {
        this.name = name;
    }
   
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age must be a positive number.");
        }
    }

    // to print the info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        
        encapsulation person = new encapsulation("Ranjith", 22);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        //changing data using setters
        person.setName("Bharadwaj");
        person.setAge(23);

        person.displayInfo(); 
    }
    
}
