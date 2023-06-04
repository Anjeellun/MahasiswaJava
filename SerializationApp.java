/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

/**
 *
 * @author ASUS
 */

import java.util.ArrayList;
import java.util.List;

public class SerializationApp {
    public static void main(String[] args){
        List<Participant> participants;
        participants = new ArrayList<>();
        participants.add(new Participant ("Anjeli", "Gusnawan", 21));
        participants.add(new Participant ("Claude", "De Alger Obelia", 39));
        participants.add(new Participant ("Athanasia", "De Alger Obelia", 18));
        
        System.out.println("Participants : " +participants);
        
        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "participantData.ser");
        System.out.println("serialization is done");
        
        System.out.println("Deserialize object");
        List<Participant> newList = demo.deserialize("participantdata.ser");
        System.out.println("New List : "+newList);
    }
}
