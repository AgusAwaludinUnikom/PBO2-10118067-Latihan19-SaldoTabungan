/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan19.saldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 *  Agus Awaludin
 *  IF2
 *  10118067
 *  Latihan ini besisi tentang bagaimana caranya menghitung gaji beserta bunga
 *  
 */
public class PBO210118067Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    double saldo = 2500000;
    
    for(Integer i = 1; i<=6; i++) {
            Double bunga = saldo * 0.15;
            saldo += bunga;
            System.out.println("Saldo di bulan ke-" +i
                + " Rp." + PBO210118067Latihan19SaldoTabungan.formatter(saldo));
        }
    
    }
    
    public static String formatter(Double saldo) {
        DecimalFormat kursIDR = (DecimalFormat) DecimalFormat
                .getIntegerInstance();
        DecimalFormatSymbols formatIDR = new DecimalFormatSymbols();
        
        formatIDR.setGroupingSeparator('.');
        
        kursIDR.setDecimalFormatSymbols(formatIDR);
        
        return kursIDR.format(saldo);
    }
    
}
