import java.util.Scanner;

public class Percobaan2 {
    
    static int hitungPangkat(int x, int y){
        if (y == 0) {
            System.out.print("1"); //output base case
            return(1);
        }
        else {
            System.out.print(x + " x "); //output tiap pangkat
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung : ");
        int bilangan = input.nextInt();

        System.out.print("Pangkat : ");
        int pangkat = input.nextInt();

        System.out.print("Hasil perhitungan : ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);

    }

}
