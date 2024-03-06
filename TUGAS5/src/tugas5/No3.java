/*
Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, yang membaca
panjang (integer) tiga buah sisi sebuah segitiga, a, b, dan c, yang dalam hal ini a <= b <=
c, lalu menentuka apakah ketiga sisi tersebut membentuk segitiga siku – siku, segitiga
lancip, atau segitiga tumpul (Petunjuk gunakan hukum Phytagoras).
 */

package tugas5;

import java.util.Scanner;

public class No3 {
    static void segiTiga(int a, int b, int c){
        
        //Proses : Menghitung pangkat 2 dari masing-masing nilai yang diinput
        int aKuadrat = a * a;
        int bKuadrat = b * b;
        int cKuadrat = c * c;
        
        //Periksa jenis segitiga berdasarkan hukum Phytagoras
        if (aKuadrat + bKuadrat == cKuadrat) {
            //Segitiga siku-siku
            System.out.println("Segitiga siku-siku");
        } else if (aKuadrat + bKuadrat < cKuadrat) {
            //Segitiga lancip
            System.out.println("Segitiga lancip");
        } else {
            //Segitiga tumpul
            System.out.println("Segitiga tumpul");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //user meng-input panjang sisi a
        System.out.println("Masukkan panjang sisi a: ");
        int a = scanner.nextInt();
        
        //user meng-input panjang sisi b
        System.out.println("Masukkan panjang sisi b: ");
        int b = scanner.nextInt();
        
        //user meng-input panjang sisi c
        System.out.println("Masukkan panjang sisi c: ");
        int c = scanner.nextInt();
        
        //memanggil dan menampilkan method yang bernama "segiTiga"
        segiTiga(a, b, c);
        
        scanner.close();
        
    }
    
}

