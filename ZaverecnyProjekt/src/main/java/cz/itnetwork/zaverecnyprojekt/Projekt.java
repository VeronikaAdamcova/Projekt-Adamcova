/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojket;

import java.util.Scanner;

/**
 *
 * @author PC03
 */
public class Projekt {
    public static void main(String[] args) {
        
       Evidence evidence = new Evidence();
       
        Scanner sc = new Scanner(System.in, "Windows-1250");
        String volba = "";
        // hlavní cyklus
        while (!volba.equals("4")) {
            System.out.println("--------------------------------");
            System.out.println("Evidence pojištěných");
            System.out.println("--------------------------------");
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = sc.nextLine();
            System.out.println();
        
            switch (volba) {
            case "1" :
                try {
                System.out.println("Zadejte jméno pojištěného:");
                String jmeno = sc.nextLine();
                System.out.println("Zadejte příjmení:");
                String prijmeni = sc.nextLine();
                System.out.println("Zadejte telefonní číslo bez mezer:");
                String cislo = sc.nextLine();
                
                while (cislo.trim().length()>9){
                    System.out.println("Telefonní číslo bylo zapsáno chybně.");
                    System.out.println("Zapište nové telefoní číslo ve tvaru [777555333]:");
                    cislo = sc.nextLine();
                }
                
                System.out.println("Zadejte věk:");
                int vek = Integer.parseInt(sc.nextLine());
                
                while ((vek <0)||(vek > 120)) {
                    System.out.println("Špatně zadán věk.");
                    System.out.println("Zadejte nový věk pojištěnce:");
                    vek = Integer.parseInt(sc.nextLine());     
                }
                
                
                evidence.pridatPojisteneho(jmeno, prijmeni, vek, cislo);
                
                System.out.println();
                System.out.println("Data byla ulozena. Pokracujte libovolnou klávesou...");
                String lib = sc.nextLine();
                }
                catch (Exception e) {
                    System.out.println("Něco bylo zadáno špatně. Prosím zkontrolujte si zadané údaje nového pojištěnce.");
                }
                break;
            case "2":
                evidence.vypisPojistenych();
                evidence.dalsi();
                break;
            case "3":
                if (evidence.getPocetPojistenych() != 0) {
                    System.out.println("Zadejte jméno pojištěného:");
                    String jmeno1 = sc.nextLine();
                    System.out.println("Zadejte příjmení:");
                    String prijmeni1 = sc.nextLine();
                    System.out.println();
                    
                    evidence.vyhledejPojistence(jmeno1, prijmeni1);
                    
                    evidence.dalsi();
                }else {
                      System.out.println("\n Evidence je prázdná prosím vytvořte nový záznam \n");
                  }
                  break;
               
            case "4":
                System.out.println("Evidence ukončena");
                    break;
            default:
                System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
                break;
        }
            
        }
}
    }
