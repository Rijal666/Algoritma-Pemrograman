import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        String nama,alamat;
        int usia, gaji;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Pendataan Karyawan PT.ABC");
        System.out.println("Nama Karyawan : ");
        nama = keyboard.nextLine();

        System.out.println("Alamat : ");
        alamat = keyboard.nextLine();

        System.out.println("Usia : ");
        usia = keyboard.nextInt();

        System.out.println("Gaji : ");
        gaji = keyboard.nextInt();

        // cetak layar
        System.out.println("=========================");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : "+usia);
        System.out.println("Gaji : "+gaji);


    }
}