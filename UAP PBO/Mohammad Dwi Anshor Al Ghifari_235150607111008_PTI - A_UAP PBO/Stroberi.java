// public class Stroberi extends Tanaman implements Perawatan {
//     public Stroberi() {
//         this.nama = "Stroberi";
//         this.masaHidup = 120; 
//         this.lamaHidup = 0;
//         this.berubah = 0;
//         this.buah = 0;
//         this.perkembangan = 2.0;
//         this.prosesBerbuah = 7.0;
//         this.status = "Hidup";
//     }

//     @Override
//     public void berkembang(int bulan) {
//         lamaHidup += bulan * 30; 
//         if (lamaHidup >= masaHidup) {
//             status = "Mati";
//         } else {
//             buah += (int)(prosesBerbuah * bulan);
//         }
//     }

//     @Override
//     public void treatment() {
//     }
// }


public class Stroberi extends Tanaman implements Perawatan {
    public Stroberi() {
        this.nama = "Stroberi";
        this.masaHidup = 120; 
        this.lamaHidup = 0;
        this.berubah = 0;
        this.buah = 17;
        this.perkembangan = 0.35; 
        this.prosesBerbuah = 7.0;
        this.status = "Hidup";
    }

    @Override
    public void berkembang(int hari) {
        lamaHidup += hari;
        if (lamaHidup >= masaHidup) {
            status = "Mati";
        } else {
            buah += (int)(prosesBerbuah * hari * perkembangan);
        }
    }

    @Override
    public void treatment() {
        if ("Hidup".equals(status)) {
            perkembangan = 0.40; 
        }
    }
}
