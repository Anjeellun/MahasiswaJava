package praktikum;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class SimplePacketReceive {
    public static void main (String[] args) throws IOException{
        DatagramSocket socket = new DatagramSocket(2000);
        DatagramPacket packet = new DatagramPacket(new byte[256], 256);
        socket.receive(packet);
    
    String message = new String(packet.getData(), 0, packet.getLength());
    System.out.println(message);
    
    }
}
