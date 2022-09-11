import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String namaUser, namaBarang, separator;
        int jumlahBarang;
        double hargaBeli, hargaJual;

        separator = "#########################";

        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukan nama anda : ");
        namaUser = userInput.nextLine();
        System.out.println(" ");

        System.out.println("Stock Gudang Input Barang");
        System.out.println(separator);
        System.out.println(" ");

        System.out.println("Selamat datang " + namaUser);
        System.out.println(" ");

        System.out.print("Masukan nama barang yang akan ditambah : ");
        namaBarang = userInput.nextLine();
        System.out.println(" ");

        System.out.print("Masukan jumlah barang yang akan ditambah : ");
        jumlahBarang = userInput.nextInt();
        System.out.println(" ");

        System.out.print("Masukan harga beli untuk barang tersebut : ");
        hargaBeli = Math.round(userInput.nextDouble() * 100.0) / 100.0;
        System.out.println(" ");

        System.out.print("Masukan harga jual untuk barang tersebut : ");
        hargaJual = Math.round(userInput.nextDouble() * 100.0) / 100.0;
        System.out.println(" ");

        System.out.println("Stock Gudang Rincian Barang");
        System.out.println(separator);
        System.out.println(" ");

        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Jumlah Barang : " + jumlahBarang);
        System.out.println("Harga Beli : Rp. " + hargaBeli);
        System.out.println("Harga Jual : Rp. " + hargaJual);
    }
}