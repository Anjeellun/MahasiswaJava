package praktikum;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacketSendDemo {
    public static void main (String[] args){
        System.out.println("Packet Send\n=============");
        String hostname = "localhost";
        System.out.println("Binding to a local port");
        
        try(DatagramSocket socket = new DatagramSocket()){
            System.out.println("Bound to local port" + socket.getLocalPort());
            
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream pout = new PrintStream(bout);
            pout.print("Manifesting keterima Kakaovers");
            
            byte[] barray = bout.toByteArray();
            
            DatagramPacket packet = new DatagramPacket(barray, barray.length);
            System.out.println("Looking up hostname" + hostname);
            InetAddress remote_addr = InetAddress.getByName(hostname);
            System.out.println("Hostname resolved as" + remote_addr.getHostAddress());
            
            packet.setAddress(remote_addr);
            
            packet.setPort(2000);
            
            socket.send(packet);
            System.out.println("Packet sent!");
        } catch (SocketException ex){
            System.out.println("Error" + ex.getMessage());
        } catch (IOException ex){
            System.out.println("Error" + ex.getMessage());
        }
    }
    
}
