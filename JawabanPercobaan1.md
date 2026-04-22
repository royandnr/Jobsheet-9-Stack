Jawaban Percobaan 1

1. Hal ini disebabkan oleh proses penampilan data yang masih menggunakan urutan dari bawah ke atas (FIFO), sedangkan struktur data yang digunakan adalah Stack yang memiliki prinsip LIFO (Last In First Out). 
Pada Bagian ini
for (int i = 0; i <= top; i++) {
    System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
}

2. Stack hanya dapat menampung maksimal 5 data tugas mahasiswa sesuai dengan kapasitas yang telah ditentukan saat inisialisasi.
potongan kode programnya :
StackTugasMahasiswa22 stackTugas = new StackTugasMahasiswa22(5);

3. Pengecekan !isFull() pada method push diperlukan untuk memastikan bahwa Stack belum penuh saat menambahkan data. Karena Stack memiliki kapasitas terbatas, data tidak boleh ditambahkan jika sudah mencapai batas maksimum.

Jika kondisi tersebut dihapus, program tetap akan menambahkan data meskipun Stack penuh. Hal ini dapat menyebabkan error ArrayIndexOutOfBoundsException karena indeks melebihi kapasitas array, sehingga program bisa berhenti atau crash.

4. 