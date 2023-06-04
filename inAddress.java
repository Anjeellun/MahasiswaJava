/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;

import java.net.InetAddress;

/**
 *
 * @author ASUS
 */
public class inAddress {
    public static void main(String[] args){
        try{
            System.out.println ("Get hostname from current ip");
            String ip = "192.168.192.60";
            System.out.println ("Hostname from ip\"" + ip + "\":" 
                    + InetAddress.getByName(ip).getHostName());
            System.out.println("\n# Get host address from current name");
            String host = "www.google.com";
            System.out.println ("Host/IP:" 
                    + InetAddress.getByName(host));
            
            System.out.println("\n# check connection");
            InetAddress ia = InetAddress.getByName(host);
            if(ia.isReachable(3000)){
            System.out.println (ia + "is Reachable");
            }else{
            System.out.println(ia + "is Unreachable");
            }
        }catch (Exception ex){
            System.out.println("ex");
        }
    }
}
