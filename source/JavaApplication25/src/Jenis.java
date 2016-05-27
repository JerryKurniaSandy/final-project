//class Jenis abstract yang mengimplemen HotelMantap
public abstract class Jenis implements HotelMantap {
    //Deklarasi variabel
    protected String tipe;
    protected boolean status;
    protected double diskon;
    Pelanggan pelanggan=new Pelanggan();
    //implementasi dari method abstrack pada kelas HotelMantap
    @Override
    //Deklarasi method abstract tampilTpKamar
    public abstract String tampilTpKamar();
    //implementasi dari method abstrack pada kelas HotelMantap
    @Override
    //Deklarasi method abstract tampilJmlhKamar
    public abstract int tampilJmlKamar();
    //implementasi dari method abstrack pada kelas HotelMantap
    @Override
    //Deklarasi method abstract tampilHarga
    public abstract double tampilHarga();
    //implementasi dari method abstrack pada kelas HotelMantap
    @Override
    //Deklarasi pemanggilan method abstract getDiskon
    public abstract double getDiskon();
}
