/*
Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menampilkan
bilangan dari satu sampai dengan n, dimana n diinput dari alat masukan, n>=1.
 */
package tugas5;

import java.util.Scanner;

public class No1 {
    //method dengan nama "bilangan" memiliki 2 parameter
    static void bilangan(int i, int n){
        //Melakukan perulangan ketika kondisi i<=n, dengan n yang di-input user
        while(i<=n){
            //Ketika masih memenuhi kondisi, maka terus mencetak "i" 
            System.out.println(i+ " ");
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Inisialisasi variabel "i" dan "n" dengan tipe data Integer
        int i;
        i = 1;
        int n;
        
        //user meng-input nilai n
        System.out.println("Masukkan nilai: ");
        n = scanner.nextInt();
        
        //Memanggil method "bilangan"
        bilangan(i, n);
        
        scanner.close();
    }
    
}

