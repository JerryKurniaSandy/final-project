//Deklarasi class VIP turunan dari classs Jenis
public class VIP extends Jenis{
    //Deklarasi variabel
    protected final static double harga=100000;
    protected static int kamar=50;
    protected double invoice;
     //Method untuk mengubah nilai variabel Tipe
    public void setTipe() {
        this.tipe = "Reguler";
    }
    //Deklarasi method void booking beserta perhitungan variabel dan method
    public void booking(int days){
        kamar--;
        invoice=days*harga;
        pelanggan.setAkumulasi(days);
    }
    //implementasi dari method abstrack pada kelas jenis
    @Override
    //Deklarasi method tampilTpKamar
    public String tampilTpKamar() {
        return tipe;
    }
    //implementasi dari method abstrack pada kelas jenis
    @Override
    //Deklarasi method tampilJmlKamar
    public int tampilJmlKamar() {
        return kamar;
    }
    //implementasi dari method abstrack pada kelas jenis
    @Override
    //Deklarasi method tampilHarga
    public double tampilHarga() {
        return invoice;
    }
    //implementasi dari method abstrack pada kelas jenis
    @Override
     //Deklarasi method getDiskon dengan seleksi kondisi if-else antar variabel dan method
    public double getDiskon() {
        double d;
        if(pelanggan.getAkumulasi()>9&&pelanggan.getAkumulasi()<=30)
            d=invoice*10/100;
        else if(pelanggan.getAkumulasi()>30&&pelanggan.getAkumulasi()<=60)
            d=invoice*15/100;
        else if(pelanggan.getAkumulasi()>60)
            d=invoice*25/100;
        else
            d=0;
        return d;
    }
     //Deklarasi method total beserta perhitungan variabel dan method
    public double total(){return (invoice-getDiskon());}
}
//Uji Coba
