/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoh1;

/**
 *
 * @author VIVOBOOK 14
 */
public class Harimau extends Mamalia{
    private boolean Menyusui;
    private String warnakulit;
    private boolean pemangsa;

    /**
     * @return the Menyusui
     */
    protected boolean isMenyusui() {
        return Menyusui;
    }

    /**
     * @param Menyusui the Menyusui to set
     */
    protected void setMenyusui(boolean Menyusui) {
        this.Menyusui = Menyusui;
    }

    /**
     * @return the warnakulit
     */
    protected String getWarnakulit() {
        return warnakulit;
    }

    /**
     * @param warnakulit the warnakulit to set
     */
    protected void setWarnakulit(String warnakulit) {
        this.warnakulit = warnakulit;
    }

    /**
     * @return the pemangsa
     */
    protected boolean isPemangsa() {
        return pemangsa;
    }

    /**
     * @param pemangsa the pemangsa to set
     */
    protected void setPemangsa(boolean pemangsa) {
        this.pemangsa = pemangsa;
    }
    
    public static void main(String[] args){
        Harimau Harimau = new Harimau();
        Harimau.setPemakan("Karnivora");
        Harimau.setAlger("Kaki");
        Harimau.setWarnakulit("Corak Oren, putih, hitam");
        Harimau.setBernapasparuparu(true);
        Harimau.setKmbangbiak("Melahirkan");
        Harimau.setHidupdimana("Darat");
        Harimau.setJmlhkaki(4);
        Harimau.setPemangsa(true);
        Harimau.setJeniskulit("Rambut");
        Harimau.setMenyusui(true);
        
        System.out.println("Harimau Bergerak menggunakan " + Harimau.getAlger());  
        System.out.println("Harimau adalah Hewan Berkaki "+ Harimau.getJmlhkaki());
        System.out.println("Hewan ini tinggal " + Harimau.getHidupdimana());
        System.out.println("Apakah hewan ini bernapas dengan paru paru? " + Harimau.isBernapasparuparu());
        System.out.println("Hewan ini termasuk Hewan " + Harimau.getPemakan());
        System.out.println("Apakah hewan ini termasuk predator? "+ Harimau.pemangsa);
        System.out.println("Hewan ini memiliki " + Harimau.getJeniskulit() + " Yang menutupi kulitnya ");
        System.out.println("Harimau mempunyai Warna Rambut yang unik Yaitu berupa " + Harimau.getWarnakulit());
        System.out.println("Harimau termasuk salah satu hewan mamalia yang berkembang biak dengan cara " + Harimau.getKmbangbiak());
        System.out.println("Apakah Harimau Menyusui? "+ Harimau.isMenyusui());
                 
    }
}
