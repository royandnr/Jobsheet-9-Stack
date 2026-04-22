import java.util.Scanner;
import java.util.Stack;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
            StackTugasMahasiswa22 stackTugas = new StackTugasMahasiswa22(5);

        int pilih;
        do { 
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Jumlah Tugas");
            System.out.print("pilih: ");
            pilih = sc.nextInt();
        sc.nextLine();
        switch (pilih) {
            case 1:
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("NIM: ");
                String nim = sc.nextLine();
                System.out.print("Kelas: ");
                String kelas = sc.nextLine();
                Mahasiswa22 mhs = new Mahasiswa22(nama, nim, kelas);
                stackTugas.push(mhs);
                System.out.printf("Tugas %s berhasil dikumpulkan.\n" , mhs.nama );
                break;
            case 2:
                Mahasiswa22 mhsDinilai = stackTugas.pop();
                if (mhsDinilai != null) {
                    System.out.print("Menilai tugas dari " + mhsDinilai.nama);
                    System.out.print(" \nMasukkan nilai (0-100): ");
                    int nilai = sc.nextInt();
                    mhsDinilai.tugasDinilai(nilai);
                    System.out.printf("Nilai Tugas %s adalah %d\n", mhsDinilai.nama, nilai);
                }
                break;
            case 3:
                Mahasiswa22 lihat = stackTugas.peek();
                if (lihat != null) {
                    System.out.println("Tugas Terakhir dikumpulkan oleh " + lihat.nama);  
                }
                break;
            case 4: 
                System.out.println("Daftar semua tugas");
                System.out.println("Nama\tNIM\tKelas    ");
                stackTugas.print();
                break;
            case 5:
                Mahasiswa22 bawah = stackTugas.peekBottom();
                if (bawah != null) {
                System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                }
                break;
            case 6:
                System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stackTugas.jumlahTugas());
                break;        
            default:
                System.out.println("Pilihan tidak valid.");
        }
    } while (pilih >= 1 && pilih <= 6);
     {
        
    }
}
}