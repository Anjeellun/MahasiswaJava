/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author ASUS
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializationDemo {
    public void serialize(List<Participant> pList, String fileName){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
            out.writeObject(pList);
        }catch(IOException ex){
            System.out.println("a problem accred during serialization \n" +ex.getMessage());
        }
    }
    public List<Participant> deserialize (String fileName){
        List<Participant> pList=null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
            pList = (List<Participant>) in.readObject();
        }catch(IOException | ClassNotFoundException ex){
            System.out.printf("a problem accured deserializing %s%n", fileName);
            System.out.println(ex.getMessage());
        }
        return pList;
    }
}
