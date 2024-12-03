import java.util.Scanner;

public class Tugas {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yg akan dihitung : ");
        int jumlah = input.nextInt();

        int[] angka = new int[jumlah];

        for (int i = jumlah; i >= 1 ; i--) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            angka[i - 1] = input.nextInt();
        }

        //tampilkan hasil rekursif
        System.out.println("Total rekursif : " + hitungRekursif(angka, jumlah));

        //tampilkan haisl iteratif
        System.out.println("Total iteratif : " + hitungIteratif(angka));

    }

    //fungsi rekursif
    static int hitungRekursif(int angka[], int n) {
        if (n == 0) {
            return 0; //base case   
        }
        else {
            return angka[n - 1] + hitungRekursif(angka, n - 1);
        }
    }

    //fungsi iteratif
    static int hitungIteratif(int angka[]) {
        int hasil = 0;
        for (int i = 0; i < angka.length; i++) {
            hasil += angka[i];
        }
        return hasil;
    }

}
