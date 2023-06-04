/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Tugas {
    
	public static void main(String[] args) {
            
        Scanner scanner = new Scanner (System.in);
        
            boolean quit = true;
            String keluar;
        
            System.out.println("Masukan Kalimat 1: ");
            String text1 = scanner.nextLine();
            
            System.out.println("Masukan Kalimat 2: ");
            String text2 = scanner.nextLine();
            
            System.out.println("Masukan Kalimat 3: ");
            String text3 = scanner.nextLine();
            
            while(quit){
                System.out.println("Exit?");
                
                keluar = scanner.nextLine();
                if(keluar.equalsIgnoreCase("EXIT")){
                       quit=false;
            }
                
            System.out.println("================");
            System.out.println("Kalimat 1: " + text1);
            System.out.println("Kalimat 2: " + text2);
            System.out.println("Kalimat 3: " + text3);
            
            scanner.close();
       
            }
        }  
    }

