// public abstract class Tanaman {
//     protected int masaHidup;
//     protected int lamaHidup;
//     protected int berubah;
//     protected int buah;
//     protected double perkembangan;
//     protected double prosesBerbuah;
//     protected String status;
//     protected String nama;

//     public abstract void berkembang(int bulan);

//     public String toString() {
//         return "Status: " + status;
//     }

//     public String getStatus() {
//         return status;
//     }

//     public int getBuah() {
//         return buah;
//     }

//     public int getMasaHidup() {
//         return masaHidup;
//     }

//     public int getLamaHidup() {
//         return lamaHidup;
//     }

//     public String getNama() {
//         return nama;
//     }
// }

public abstract class Tanaman {
    protected int masaHidup;
    protected int lamaHidup;
    protected int berubah;
    protected int buah;
    protected double perkembangan;
    protected double prosesBerbuah;
    protected String status;
    protected String nama;

    public abstract void berkembang(int hari);

    public abstract void treatment();

    public String toString() {
        return "Status: " + status;
    }

    public String getStatus() {
        return status;
    }

    public int getBuah() {
        return buah;
    }

    public int getMasaHidup() {
        return masaHidup;
    }

    public int getLamaHidup() {
        return lamaHidup;
    }

    public String getNama() {
        return nama;
    }
}
