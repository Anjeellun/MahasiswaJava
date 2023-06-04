/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author ASUS
 */

    import java.io.Serializable;

    public class Participant implements Serializable{
        
        private final String firstName;
        private final String lastName;
        private int age;

    public Participant (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public String getFirstName(){
        return firstName;
                
    }
    
    public String getlastName(){
        return lastName;
                
    }
    
    public int getAge(){
        return age;
                
    }
    
    public void setAge(int age){
        this.age = age;
        
    }
    
    /**
     * 
     * @return 
     */
    
    @Override
    public String toString(){
        return firstName + " " + lastName + " (" + age + ")"; 
    }
}

