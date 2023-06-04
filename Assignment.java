package praktikum;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 * Anjeli Gusnawan (3337210040)
 * Kelas A - Sistem Terdistribusi
 */

import java.util.Scanner;

public class Assignment {
    
	public static void main(String[] args) {
        
        int i=1;

        System.out.println("Ketik EXIT untuk keluar");
         
        System.out.println("========================");
        
        Scanner in = new Scanner (System.in);
          
          boolean run = true;
            while(run){
                String quit = "";
                System.out.println(quit);
               
                    System.out.println("Masukan text " + i + ": ");
                    
                    quit = in.nextLine();
                    System.out.println("Anda mengetik kalimat " + i + ": " + quit);
                    if(quit.equalsIgnoreCase("EXIT"))
                    {
                        run = false;
                    }
                i++;
            }
        }
    }