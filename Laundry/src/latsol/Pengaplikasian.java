/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latsol;

/**
 *
 * @author MOKLET-2
 */
public class Pengaplikasian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("");
        System.out.println("<<<<<<<< SELAMAT DATANG DI TOKO MELAUNDRY >>>>>>>>");
        
        JenisLaundry jl = new JenisLaundry();
        Petugas pt = new Petugas();
        Laporan lp = new Laporan();
        Client ce = new Client();
        Transaksi tr = new Transaksi();

        lp.laporan(jl);
        lp.laporan(ce);
        lp.laporan(tr, jl);

        tr.prosesTransaksi(ce, tr, jl);
        lp.laporan(tr, jl);
        lp.laporan(jl);
        lp.laporan(ce);

    }

}
