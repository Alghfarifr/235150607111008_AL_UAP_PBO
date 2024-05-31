// public class Persik extends Tanaman implements Perawatan {
//     public Persik() {
//         this.nama = "Persik";
//         this.masaHidup = 180; 
//         this.lamaHidup = 0;
//         this.berubah = 0;
//         this.buah = 0;
//         this.perkembangan = 1.0;
//         this.prosesBerbuah = 9.0;
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


public class Persik extends Tanaman implements Perawatan {
    public Persik() {
        this.nama = "Persik";
        this.masaHidup = 180; 
        this.lamaHidup = 0;
        this.berubah = 0;
        this.buah = 21;
        this.perkembangan = 0.15; 
        this.prosesBerbuah = 9.0;
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
            perkembangan = 0.175;
        }
    }
}
