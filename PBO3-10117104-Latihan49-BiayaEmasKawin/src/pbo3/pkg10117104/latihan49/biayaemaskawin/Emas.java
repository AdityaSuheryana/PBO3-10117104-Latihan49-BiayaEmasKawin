/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan49.biayaemaskawin;
import java.text.DecimalFormat;
/**
 *
 * @author user
 */
public class Emas {
    private String namaPembeli;
    private double beratEmas;
    private double hargaEmas;

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public double getBeratEmas() {
        return beratEmas;
    }

    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }

    public double getHargaEmas() {
        return hargaEmas;
    }

    public void setHargaEmas(double hargaEmas) {
        this.hargaEmas = hargaEmas;
    }
    public double HargaTotal(double beratEmas,double hargaEmas){
    double total = beratEmas*hargaEmas;
    return total;    
    }
    public void tampilData(String namaPembeli,double beratEmas,
            double hargaEmas,double total){
        System.out.println("Nama : "+namaPembeli);
        System.out.println("berat Emas : "+beratEmas+" gram");
        System.out.println("harga Emas(gram) : Rp. "+hargaEmas);
        DecimalFormat df = new DecimalFormat("#,###,###");
           
        System.out.println("Total yang harus dibayar : Rp. "
                +df.format(Math.floor(total)));
    }
}
