
package if1.pkg10118042.latihan49.emaskawin;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program : Program ini berfungsi untuk menghitung Harga Emas
 */
public class IF110118042Latihan49EmasKawin {

    public static void main(String[] args) {
     DecimalFormat mataUangIndonesia = (DecimalFormat) 
                      DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRP = new DecimalFormatSymbols();
        
        formatRP.setCurrencySymbol("Rp.");
        formatRP.setMonetaryDecimalSeparator(',');
        formatRP.setGroupingSeparator('.');
        
        mataUangIndonesia.setDecimalFormatSymbols(formatRP);
        
        
        Emas objEmas = new Emas();
        objEmas.setHargaGram(570000);
        objEmas.setBeratEmas(15.7);
        System.out.println("====Aplikasi Hitung Harga Emas====");
        System.out.printf("Total Bayar Emas : %s %n ", 
                           mataUangIndonesia.format(
                           objEmas.perhitungan(objEmas.getHargaGram(), 
                           objEmas.getBeratEmas())));
    }
    
}
