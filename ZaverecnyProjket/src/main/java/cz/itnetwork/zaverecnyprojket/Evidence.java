/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojket;


import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Evidence {
    
    Scanner sc = new Scanner(System.in, "Windows-1250");
    
    public LinkedList<Pojistenec> pojistenci;
    public Evidence(){
        pojistenci = new LinkedList<>();
        
    }

    public void pridatPojisteneho(String jmeno, String prijmeni, int vek, String telefonniCislo) {
        
        pojistenci.add(new Pojistenec (jmeno, prijmeni, vek, telefonniCislo));
        
    }
    
    void vypisPojistenych (){
       
        for (int i = 0; i < pojistenci.size();i++){
            System.out.println(pojistenci.get(i));
            }
       
    }
    public int getPocetPojistenych() {
        return pojistenci.size();
    } 
    
    
    public void vyhledejPojistence (String jmeno, String prijmeni){
     
        for (Pojistenec osoba : pojistenci) {
                if ((jmeno.equals(osoba.getJmeno())) && (prijmeni.equals(osoba.getPrijmeni()))){
                        System.out.println(osoba);
                    
                } 
                else {
                    System.out.println("Hledaná osoba se nenachází v evidenci pojištěných osob");
                }
                    
    }
    }
    
    public void dalsi (){
        System.out.println();
        System.out.println("Pokracujte libovolnou klávesou...");
        String lib = sc.nextLine();;
    }
}
