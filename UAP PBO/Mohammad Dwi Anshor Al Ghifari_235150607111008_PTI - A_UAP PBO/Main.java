// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Masa tanam (bulan): ");
//         int bulan = scanner.nextInt();

//         boolean planting = true;
//         while (planting) {
//             System.out.println("Mau menanam apa ?");
//             System.out.println("1. Tomat");
//             System.out.println("2. Stroberi");
//             System.out.println("3. Persik");
//             int choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     Data.menanam(new Tomat());
//                     break;
//                 case 2:
//                     Data.menanam(new Stroberi());
//                     break;
//                 case 3:
//                     Data.menanam(new Persik());
//                     break;
//                 default:
//                     System.out.println("Pilihan tidak valid.");
//             }

//             System.out.print("Ingin menanam lagi? (y/n): ");
//             String again = scanner.next();
//             planting = again.equalsIgnoreCase("y");
//         }

//         System.out.println("\nPROSES PERKEMBANGAN\n");
//         Data.mulai(bulan);
//         Data.info();
//     }
// }


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Pak Ali menentukan masa tanam 7 bulan
        int masaTanam = 7;

        // 2) Pak Ali menanam buah Tomat
        Data.menanam(new Tomat());

        // 3) Pak Ali menanam buah Stroberi
        Data.menanam(new Stroberi());

        // 4) Pak Ali menanam buah Persik
        Data.menanam(new Persik());

        // 5) Pak Ali mengganti tanaman buah Stroberi dengan buah Persik
        Data.gantiTanaman(1, new Persik()); 

        // 6) Pak Ali mengganti tanaman buah Tomat dengan buah Tomat
        Data.gantiTanaman(0, new Tomat()); 

        // 7) Pak Ali mengganti tanaman buah Persik dengan buah Stroberi
        Data.gantiTanaman(2, new Stroberi()); 

        // 8) Pak Ali mengganti tanaman buah Tomat dengan buah Persik
        Data.gantiTanaman(0, new Persik()); 

        System.out.println("\nPROSES PERKEMBANGAN\n");
        Data.mulai(masaTanam);

        System.out.println("DILAKUKAN PERAWATAN\n");
        Data.perawatan();

        Data.info();
    }
}
