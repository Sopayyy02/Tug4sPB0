/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contoh3;

/**
 *
 * @author VIVOBOOK 14
 */
public class RuangKelas extends GedungFakultas {
    private int jmlhproyektor;
    private int dytmpng;

    /**
     * @return the jmlhproyektor
     */
    protected int getJmlhproyektor() {
        return jmlhproyektor;
    }

    /**
     * @param jmlhproyektor the jmlhproyektor to set
     */
    protected void setJmlhproyektor(int jmlhproyektor) {
        this.jmlhproyektor = jmlhproyektor;
    }

    /**
     * @return the dytmpng
     */
    protected int getDytmpng() {
        return dytmpng;
    }

    /**
     * @param dytmpng the dytmpng to set
     */
    protected void setDytmpng(int dytmpng) {
        this.dytmpng = dytmpng;
    }
    
    public static void main(String[] args){
        RuangKelas H7A3 = new RuangKelas();
        H7A3.setNama("UINSA");
        H7A3.setAlamat("Gunung Anyar");
        H7A3.setNamagdng("Gedung Terpadu Fakultas Sains dan Teknologi");
        H7A3.setProdi("Sistem Informasi");
        H7A3.setJmlhkls(15);
        H7A3.setDytmpng(40);
        H7A3.setJmlhproyektor(1);
        
        System.out.println("Kelas H7A3 adalah Nama Kelas Yang Berada di " + H7A3.getNama());        
        System.out.println("Didaerah " + H7A3.getAlamat());
        System.out.println("Yang Terletak Di "+ H7A3.getNamagdng());
        System.out.println("Dalam Gedung tersebut, memiliki kelas sebanyak  "+ H7A3.getJmlhkls());
        System.out.println("Salah Satunya adalah H7A3, Kelas dari Prodi " + H7A3.getProdi());
        System.out.println("Kelas ini dapat menampung Mahasiswa sebaanyak "+ H7A3.getDytmpng());
        System.out.println("Didalamnya juga ada Proyektor sebanyak "+ H7A3.getJmlhproyektor());

    }
}
