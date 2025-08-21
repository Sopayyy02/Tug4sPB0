/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoh2;

/**
 *
 * @author VIVOBOOK 14
 */
public class Tumbuhan {
    private boolean berbiji;
    private boolean berbunga;
    private String buah;

    /**
     * @return the berbiji
     */
    protected boolean isBerbiji() {
        return berbiji;
    }

    /**
     * @return the berbunga
     */
    protected boolean isBerbunga() {
        return berbunga;
    }

    /**
     * @param berbunga the berbunga to set
     */
    protected void setBerbunga(boolean berbunga) {
        this.berbunga = berbunga;
    }

    /**
     * @return the buah
     */
    protected String getBuah() {
        return buah;
    }

    /**
     * @param buah the buah to set
     */
    protected void setBuah(String buah) {
        this.buah = buah;
    }

    /**
     * @param berbiji the berbiji to set
     */
    protected void setBerbiji(boolean berbiji) {
        this.berbiji = berbiji;
    }
}
