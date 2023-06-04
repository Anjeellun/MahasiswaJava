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
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketException;
import java.net.UnknownHostException;

public class SimplePacketSend {
    public static void main (String[] args) throws SocketException, UnknownHostException, IOException {
        
        try (DatagramSocket socket = new DatagramSocket()){
            String message = "Assalamualaikum";
            DatagramPacket packet = new DatagramPacket (message.getBytes(),
                    message.length(), InetAddress.getLocalHost(),  2000);
            socket.send(packet);
        }
   }
}