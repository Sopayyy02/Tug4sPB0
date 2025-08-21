/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoh2;

/**
 *
 * @author VIVOBOOK 14
 */
public class Mangga extends Dikotil {
    private String jnsakar;
    private int klpkbunga;

    /**
     * @return the jnsakar
     */
    protected String getJnsakar() {
        return jnsakar;
    }

    /**
     * @param jnsakar the jnsakar to set
     */
    protected void setJnsakar(String jnsakar) {
        this.jnsakar = jnsakar;
    }

    /**
     * @return the klpkbunga
     */
    protected int getKlpkbunga() {
        return klpkbunga;
    }

    /**
     * @param klpkbunga the klpkbunga to set
     */
    protected void setKlpkbunga(int klpkbunga) {
        this.klpkbunga = klpkbunga;
    } 
    public static void main(String[] args){
    
        Mangga Mangga = new Mangga();
        Mangga.setKlpkbunga(5);
        Mangga.setJnsakar("Tunggang");
        Mangga.setDikotl(true);
        Mangga.setBuah("Lonjong");
        Mangga.setBtng(true);
        Mangga.setBerbunga(true);
        Mangga.setBerbiji(true);
        
        System.out.println("Buah Mangga adalah buah yang berbentuk " + Mangga.getBuah());
        System.out.println("Apakah Mangga merupakan Tumbuhan Dikotil? " + Mangga.isDikotl());
        System.out.println("Apakah Batang Pohon mangga Becabang? " + Mangga.isBtng());
        System.out.println("Apakah Pohon Mangga Punya Bunga? " + Mangga.isBerbunga());
        System.out.println("Berapa Kelopak Bunga pada Pohon Mangga? " + Mangga.getKlpkbunga() );
        System.out.println("Apakah Pohon kelapa memiliki Biji? " + Mangga.isBerbiji());
        System.out.println("Pohon Mangga Memiliki akar yang " + Mangga.getJnsakar());
    }

}
