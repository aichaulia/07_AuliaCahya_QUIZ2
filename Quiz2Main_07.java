import java.util.Scanner;
public class Quiz2Main_07 {

    public  static  void menu(){
        System.out.println("\t\t\tMENU\t\t\t");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan Pesanan");
        System.out.println("5. Hitung Total Pendapatan");
        System.out.println("6. Keluar");

        System.out.println("Pilih (1-5) : ");
        System.out.println("--------------------------------");
        System.out.println("Masukkan Data Pembeli");
        System.out.println("--------------------------------");
        System.out.println("Nomor Antrian\t: ");
        System.out.println("Nama Customer\t: ");
    }
    public static void main(String[] args){
        System.out.println("====QUIZ PRAKTIKUM ASD TI - 1G====");
        System.out.println("Dibuat Oleh\t: Aulia Cahya Briliana");
        System.out.println("NIM\t\t: 2141720092");
        System.out.println("Absen\t: 07");
        System.out.println("=================================");
        System.out.println("System Antrian Resto Royal Delish");

        DoubleLinkedList_07 dll = new DoubleLinkedList_07();
        Scanner sc = new Scanner(System.in);
        Scanner inp = new Scanner(System.in);
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("-----------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("-----------------------");
                    System.out.println("Nomor Antrian : ");
                    int ant = sc.nextInt();
                    System.out.print("Nama Customer : ");
                    String nama = inp.nextLine();
                    System.out.print("Nomor HP : ");
                    String no = inp.nextLine();
                    Pembeli_07 pem = new Pembeli_07(nama, no);
                    dll.addLast(pem);
                    break;
                case 2 :
                    System.out.println("++++++++++++++++++++++");
                    System.out.println("Daftar Antrian Resto Royal Delish");
                    System.out.println("++++++++++++++++++++++");
                    dll.print();
                    System.out.println("Total Antrian : " +dll.size);
                    break;
            }
        }
        while{

        }
    }
}
