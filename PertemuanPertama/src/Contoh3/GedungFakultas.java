/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoh3;

/**
 *
 * @author VIVOBOOK 14
 */
public class GedungFakultas extends Kampus{

    /**
     * @return the jmlhkls
     */
    protected int getJmlhkls() {
        return jmlhkls;
    }

    /**
     * @param jmlhkls the jmlhkls to set
     */
    protected void setJmlhkls(int jmlhkls) {
        this.jmlhkls = jmlhkls;
    }

    /**
     * @return the prodi
     */
    protected String getProdi() {
        return prodi;
    }

    /**
     * @param prodi the prodi to set
     */
    protected void setProdi(String prodi) {
        this.prodi = prodi;
    }

    /**
     * @return the namagdng
     */
    protected String getNamagdng() {
        return namagdng;
    }

    /**
     * @param namagdng the namagdng to set
     */
    protected void setNamagdng(String namagdng) {
        this.namagdng = namagdng;
    }
    private int jmlhkls;
    private String prodi;
    private String namagdng;
}
