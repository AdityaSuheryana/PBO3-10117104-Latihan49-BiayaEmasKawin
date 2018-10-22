/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan49.biayaemaskawin;
/**
 *
 * @author
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Menampilkan rincian biaya Emas yang harus di bayarkan  
 *
 */
public class PBO310117104Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Emas gold = new Emas();
     gold.setNamaPembeli("Hendi");
     gold.setBeratEmas(15.7);
     gold.setHargaEmas(570000);
     gold.tampilData(gold.getNamaPembeli(),
             gold.getBeratEmas(),gold.getHargaEmas(),
             gold.HargaTotal(gold.getBeratEmas(),gold.getHargaEmas()));
    }
    
}
