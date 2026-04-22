Jawaban Percobaan 2

1. Pertama, dibuat stack untuk menyimpan sisa hasil pembagian. Lalu angka desimal dibagi 2 secara berulang, dan setiap sisa pembagian (0 atau 1) dimasukkan ke dalam stack. Proses ini dilakukan sampai nilai menjadi 0.

Setelah itu, isi stack dikeluarkan satu per satu. Karena stack bersifat LIFO (Last In First Out), hasil yang keluar otomatis membentuk urutan biner yang benar.

Terakhir, semua hasil digabung menjadi string dan dikembalikan sebagai hasil konversi biner.

2. Hasil konversi tetap sama seperti sebelumnya (tidak berubah), misalnya:
87 tetap menjadi 1010111
Selama proses pembagian desimal ke biner, nilai  selalu berkurang sampai menjadi 0.
Kondisi nilai > 0 dan nilai != 0 pada kasus bilangan positif akan menghasilkan proses yang sama,
