public class Pelanggan {
    //Deklarasi variabel
    protected String nama,nik,alamat;
    protected int akumulasi;
    //Method untuk Memanggil nama 
    public String getNama() {
        return nama;
    }
    //Method untuk Memanngil Nik
    public String getNik() {
        return nik;
    }
    //Method untuk Memanggil Alamat
    public String getAlamat() {
        return alamat;
    }
    //Method untuk Memanggil Akumuluasi
    public int getAkumulasi() {
        return akumulasi;
    }
    //Method untuk mengubah nilai variabel nama
    public void setNama(String nama) {this.nama = nama;}
    //Method untuk mengubah nilai variabel nik
    public void setNik(String nik) {this.nik = nik;}
    //Method untuk mengubah nilai variabel alamat
    public void setAlamat(String alamat) {this.alamat = alamat;}
    //Method untuk mengubah nilai variabel akumulasi
    public void setAkumulasi(int a){this.akumulasi=this.akumulasi+a;}
}
//Uji Coba
