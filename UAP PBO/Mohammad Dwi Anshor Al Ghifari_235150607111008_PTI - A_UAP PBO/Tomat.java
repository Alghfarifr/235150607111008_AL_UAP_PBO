// public class Tomat extends Tanaman implements Perawatan {
//     public Tomat() {
//         this.nama = "Tomat";
//         this.masaHidup = 100; 
//         this.lamaHidup = 0;
//         this.berubah = 0;
//         this.buah = 0;
//         this.perkembangan = 1.5;
//         this.prosesBerbuah = 15.0;
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


public class Tomat extends Tanaman implements Perawatan {
    public Tomat() {
        this.nama = "Tomat";
        this.masaHidup = 100; 
        this.lamaHidup = 0;
        this.berubah = 0;
        this.buah = 16;
        this.perkembangan = 0.25; 
        this.prosesBerbuah = 15.0;
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
            perkembangan = 0.30; 
        }
    }
}
