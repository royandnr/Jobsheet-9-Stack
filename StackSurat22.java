public class StackSurat22 {
    Surat22[] data;
    int top;
    int size;

    public StackSurat22(int size) {
        this.size = size;
        data = new Surat22[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat22 srt) {
        if (!isFull()) {
            top++;
            data[top] = srt;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat22 pop() {
        if (!isEmpty()) {
            Surat22 s = data[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat22 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            System.out.println("Tidak ada surat.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ketemu = false;

        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                data[i].tampilkanData();
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}