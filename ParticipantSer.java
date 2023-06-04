/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author Anjeli Gusnawan
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ParticipantSer implements Serializable {
    
    private final String firstName;
    private final String lastName;
    private final int age;
    
   public ParticipantSer (String firstName, String lastName, int age){
        String firstname;
        firstname = firstName;
        this.firstName = firstname;
        this.lastName = lastName;
        this.age = age;
    }
    public void printData(){
        System.out.println("Name\t: "+firstName+" "+lastName);
        System.out.println("Usia\t: "+age);
    }
    
    public void saveObject(ParticipantSer obj){
        try{
            try(FileOutputStream fos = new FileOutputStream("data.ser")){
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.flush();
            }
        }catch (IOException ioe){
            System.out.println("a problem accured during serialize.\n"+ ioe.getMessage());
        }
    }
    public void readObject(ParticipantSer Obj){
        try{
            try(FileInputStream fis = new FileInputStream("data.ser")){
                ObjectInputStream ois = new ObjectInputStream(fis);
                ParticipantSer obj = (ParticipantSer) ois.readObject();
                obj.printData();
            }
        }
        catch (IOException | ClassNotFoundException ex){
            System.out.println("a problem accured during desentralize.\n"+ex);
            System.exit(1);
        }
    }

    public static void main(String[] args){
        var is = new ParticipantSer("Anjeli", "Gusnawan", 21);
        is.saveObject(is);
        is.readObject(is);
    }
}
