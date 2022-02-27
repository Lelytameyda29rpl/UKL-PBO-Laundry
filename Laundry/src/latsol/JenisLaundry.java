/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsol;
import java.util.ArrayList;

/**
 *
 * @author MOKLET-2
 */
public class JenisLaundry {
    private ArrayList<String> JenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public JenisLaundry() {
        this.JenisLaundry.add("Pakaian");
        this.durasi.add(15);
        this.harga.add(10000);
        
        this.JenisLaundry.add("Celana");
        this.durasi.add(30);
        this.harga.add(5000);
        
        this.JenisLaundry.add("Hijab");
        this.durasi.add(20);
        this.harga.add(15000);
    }

    public int getJmlJenisLaundry() {
        return this.JenisLaundry.size();
    }

    public void setJenisLaundry(String JenisLaundry) {
        this.JenisLaundry.add(JenisLaundry);
    }

    public String getJenisLaundry(int idJenisLaundry) {
        return this.JenisLaundry.get(idJenisLaundry);
    }

    public void setDurasi(int durasi) {
        this.durasi.add(durasi);
    }

    public int getDurasi(int idJenisLaundry) {
        return this.durasi.get(idJenisLaundry);
    }

    public void editDurasi(int idJenisLaundry, int durasi) {
        this.durasi.set(idJenisLaundry, durasi);;
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idBuku) {
        return this.harga.get(idBuku);
    }
}
    
    

