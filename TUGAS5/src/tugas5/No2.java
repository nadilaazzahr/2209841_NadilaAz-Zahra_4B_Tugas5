/*
Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, yang menerima
masukan tiga buah sisi, dimana jika semua sisi sama maka tampilkan “Termasuk
Kubus”, jika ada sisi yang tidak sama maka tampilkan bukan kubus.
 */
package tugas5;

import java.util.Scanner;

public class No2 {
    //method dengan nama "cekKubus"
    static void cekKubus(double sisi1, double sisi2, double sisi3){
        //Mengecek apakah semua sisi yang telah di-input user memiliki sisi yang sama
        if(sisi1 == sisi2 && sisi2 == sisi3){
            //Jika ya, maka cetak "Termasuk Kubus (karena memiliki 3 sisi yang sama)"
            System.out.println("Termasuk Kubus (karena memiliki 3 sisi yang sama)");
        } else {
            //Jika tidak memenuhi kondisi, maka cetak "Bukan Kubus"
            System.out.println("Bukan Kubus");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //user meng-input sisi ke-1
        System.out.println("Masukkan panjang sisi ke-1: ");
        double sisi1 = scanner.nextDouble();
        
        //user meng-input sisi ke-2
        System.out.println("Masukkan panjang sisi ke-2: ");
        double sisi2 = scanner.nextDouble();
        
        //user meng-input sisi ke-3
        System.out.println("Masukkan panjang sisi ke-3: ");
        double sisi3 = scanner.nextDouble();
        
        //memanggil method/prosedur "cekKubus"
        cekKubus(sisi1, sisi2, sisi3);
        
        scanner.close();
        
    }
}
