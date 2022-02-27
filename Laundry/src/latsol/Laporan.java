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
public class Laporan {
    public void laporan(JenisLaundry jenislaundry) {
        int x = jenislaundry.getJmlJenisLaundry();

        System.out.println();
        System.out.println("Tabel Jenis Laundry");
        System.out.println();
        System.out.println("Jenis Laundry \tDurasi \tharga ");
        for (int i = 0; i < x; i++) {
            System.out.println(jenislaundry.getJenisLaundry(i) + "\t" + jenislaundry.getDurasi(i) + "\t" + jenislaundry.getHarga(i));
        }
    }

    public void laporan(Client client) {
        int x = client.getJmlClient();

        System.out.println();
        System.out.println("Tabel Client");
        System.out.println();
        System.out.println("Nama \tAlamat \t\tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(client.getNama(i) + "\t"
                    + client.getAlamat(i) + "\t" + client.getTelepon(i) + "\t"
                    + client.getSaldo(i));
        }
    }

    public void laporan(Transaksi transaksi, JenisLaundry jenislaundry) {
        int x = transaksi.getJmlTransaksi();

        System.out.println();
        System.out.println("Laporan Transaksi");
        System.out.println();
        System.out.println("Jenis Laundry\tQty \tHarga \tJumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i) * jenislaundry.getHarga(transaksi.getIdJenisLaundry(i));
            total += jumlah;

            System.out.println(jenislaundry.getJenisLaundry(transaksi.getIdJenisLaundry(i)) + "\t"
                    + transaksi.getBanyaknya(i) + "\t" + jenislaundry.getHarga(transaksi.getIdJenisLaundry(i)) + "\t"
                    + jumlah);
        }
        System.out.println("Total Omset =" + total);

    }
}

    

