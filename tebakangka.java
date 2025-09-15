import java.util.Scanner;

public  class tebakangka{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int angka = 1903;
    int tebakan = 0;

    while (tebakan != angka) {
        System.out.println("Masukkan Tebakan Anda : ");
        tebakan = input.nextInt();

        if (tebakan < angka) {
            System.out.println("Tebakan Anda Terlalu Rendah");
        } else if (tebakan > angka) {
            System.out.println("Tebakan Anda Terlalu Tinggi");
        } else {
            System.out.println("Selamat, anda benar!");
        }
        
    }
}

}

