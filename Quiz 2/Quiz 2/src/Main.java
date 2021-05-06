
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        int pilih;
        
        do {
        System.out.println("--------------------------------");
        System.out.println("PROGRAM DATA MAHASISWA");
        System.out.println("--------------------------------");
        System.out.println("1.Tambah Data Awal");
        System.out.println("2.Tambah Data Akhir");
        System.out.println("3.Tambah Data Index Tertentu");
        System.out.println("4.Hapus Data Pertama");
        System.out.println("5.Hapus Data Terakhir");
        System.out.println("6.Hapus Data Tertentu");
        System.out.println("7.Cetak");
        System.out.println("8.Cari NIM");
        System.out.println("9.Urut Data IPK");
        System.out.println("10.Keluar");
        System.out.print("Pilih(1-10): ");
        pilih = sc.nextInt();
        
        switch (pilih) {
        case 1:
        System.out.println("Masukkan Data Mahasiswa Awal");
        System.out.println("Masukkan NIM : ");
        String Nim = sc.next();
        System.out.println("Masukkan Nama: ");
        String Nama = sc.next();
        System.out.println("Masukkan Jurusan : ");
        String Jurusan = sc.next();
        System.out.println("Masukkan Prodi: ");
        String Prodi = sc.next();
        System.out.println("Masukkan IPK : ");
        double Ipk = sc.nextDouble();
        dll.addFirst(Nim, Nama, Jurusan, Prodi, Ipk);
        break;
        case 2:
        System.out.println("Masukkan Data Mahasiswa Akhir");
        System.out.println("Masukkan NIM : ");
        String NimA = sc.next();
        System.out.println("Masukkan Nama: ");
        String NamaA = sc.next();
        System.out.println("Masukkan Jurusan : ");
        String JurusanA = sc.next();
        System.out.println("Masukkan Prodi: ");
        String ProdiA = sc.next();
        System.out.println("Masukkan IPK : ");
        double IpkA = sc.nextDouble();
        dll.addLast(NimA, NamaA, JurusanA, ProdiA, IpkA);
        break;
        case 3:
        System.out.println("Masukkan Index: ");
        int idx = sc.nextInt();
        System.out.println("Masukkan Data Mahasiswa");
        System.out.println("Masukkan NIM : ");
        String NimI = sc.next();
        System.out.println("Masukkan Nama: ");
        String NamaI = sc.next();
        System.out.println("Masukkan Jurusan : ");
        String JurusanI = sc.next();
        System.out.println("Masukkan Prodi: ");
        String ProdiI = sc.next();
        System.out.println("Masukkan IPK : ");
        double IpkI = sc.nextDouble();
        dll.add(NimI, NamaI, JurusanI, ProdiI, IpkI, idx);
        break;
        case 4:
        dll.removeFirst();
        break;
        case 5:
        dll.removeLast();
        case 6:
        System.out.println("Masukkan Data yang dihapus: ");
        int hapus = sc.nextInt();
        dll.remove(hapus);
        break;
        case 7:
        dll.print();
        break;
        case 8:
        System.out.println("Masukkan NIM yang dicari: ");
        String cari = sc.next();
        dll.FindBinarySearch(cari, idx, idx)
        dll.seqSearch(cari);
        break;
        case 9:
            dll.selectionShort();
        dll.print();
        break;
        default:
        }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5
        || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9);
        }
}

