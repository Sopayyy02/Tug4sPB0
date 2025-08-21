/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuanpertama;

/**
 *
 * @author VIVOBOOK 14
 */
public class Burung extends Hewan{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Burung nemo = new Burung();
        nemo.jumlahmata = 2;
        nemo.warnabulu = "Hitam";
        nemo.jumlahkaki = 2;
        System.out.println("Jumlah Mata Burung " + nemo.jumlahmata + ", Jumlah Kaki Burung " + nemo.jumlahkaki + " Dan Warna Bulu Burungnya adalah " + nemo.warnabulu);
    }
    
}
