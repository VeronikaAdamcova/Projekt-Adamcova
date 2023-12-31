/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.zaverecnyprojket;

/**
 *
 * @author PC03
 */
public class Pojistenec {
    private String jmeno;
    private String prijmeni;
    private String telefonniCislo;
    private int vek;
    
    public Pojistenec (String jmeno, String prijmeni, int vek, String telefonniCislo){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
        
    }


    public String getJmeno(){
        return jmeno;
    }
    
    public void setJmeno(String jmeno){
        this.jmeno = jmeno;
    }
    
     public String getPrijmeni(){
        return prijmeni;
    }
    
    public void setPrijmeni(String prijmeni){
        this.prijmeni = prijmeni;
    }
    
    public String getTelefonniCislo(){
        return telefonniCislo;
    }
    
    public void setTelefonniCislo(String telefonniCislo){
        this.telefonniCislo = telefonniCislo;
    }
    
    public int getVek(){
        return vek;
    }
    
    public void setVek(int vek){
        this.vek = vek;
    }
    
    @Override
    public String toString() {
        return jmeno + " " + prijmeni + "    " + vek + "    " + telefonniCislo;
    }
}
