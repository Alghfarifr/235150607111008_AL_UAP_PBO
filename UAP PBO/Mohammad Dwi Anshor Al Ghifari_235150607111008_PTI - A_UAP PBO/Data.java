// import java.util.ArrayList;
// import java.util.Scanner;

// public class Data {
//     static ArrayList<Tanaman> tanamans = new ArrayList<>();
//     static Scanner in = new Scanner(System.in);

//     public static void mulai(int bulan) {
//         for (Tanaman tanaman : tanamans) {
//             tanaman.berkembang(bulan);
//         }
//     }

//     public static void menanam(Tanaman tanaman) {
//         tanamans.add(tanaman);
//         System.out.println(tanaman.getNama() + " berhasil ditanam.");
//     }

//     public static void info() {
//         System.out.println("-----HASIL MENANAM-----");
//         int i = 1;
//         for (Tanaman tanaman : tanamans) {
//             System.out.println("Tanaman buah ke-" + i);
//             System.out.println("Masa hidup: " + tanaman.getMasaHidup() + " hari");
//             System.out.println("Umur tanaman: " + tanaman.getLamaHidup() + " hari");
//             System.out.println("Menghasilkan: " + tanaman.getBuah() + " buah " + tanaman.getNama());
//             System.out.println("Status: " + tanaman.getStatus());
//             i++;
//         }
//     }
// }


import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    static ArrayList<Tanaman> tanamans = new ArrayList<>();
    static Scanner in = new Scanner(System.in);

    public static void mulai(int bulan) {
        for (Tanaman tanaman : tanamans) {
            tanaman.berkembang(bulan * 30); 
        }
    }

    public static void menanam(Tanaman tanaman) {
        tanamans.add(tanaman);
        System.out.println(tanaman.getNama() + " berhasil ditanam.");
    }

    public static void gantiTanaman(int index, Tanaman tanaman) {
        if (index >= 0 && index < tanamans.size()) {
            tanamans.set(index, tanaman);
            System.out.println("Tanaman buah ke-" + (index + 1) + " diganti dengan " + tanaman.getNama());
        } else {
            System.out.println("Indeks tanaman tidak valid.");
        }
    }

    public static void info() {
        System.out.println("-----HASIL MENANAM-----");
        int i = 1;
        for (Tanaman tanaman : tanamans) {
            System.out.println("Tanaman buah ke-" + i);
            System.out.println("Masa hidup: " + tanaman.getMasaHidup() + " hari");
            System.out.println("Umur tanaman: " + tanaman.getLamaHidup() + " hari");
            System.out.println("Menghasilkan: " + tanaman.getBuah() + " buah " + tanaman.getNama());
            System.out.println("Status: " + tanaman.getStatus());
            i++;
        }
    }

    public static void perawatan() {
        for (Tanaman tanaman : tanamans) {
            if ("Hidup".equals(tanaman.getStatus())) {
                tanaman.treatment();
            }
        }
    }
}
