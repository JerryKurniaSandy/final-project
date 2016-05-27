//Deklarasi class dengan nama Admin
public class Admin {
    //Deklarasi variabel admin dengan parameter "mkharto", "jerryjr", "salmahnf"
    private final static String[]admin={"mkharto","jerrykr","salmahnf"};
    //Deklarasi variabel paskey dengan parameter "0906","9876", "7654"
    private final static String[]paskey={"0906","9876","7654"};
    //Deklarasi method login parameter String a, String b
    public boolean login(String a, String b){
        //Deklarasi variabel c bertipe boolean
        boolean c;
        //Seleksi kondisi if, jika admin bernilai 0 dan paskey bernilai 0, maka true
        if(a.equals(admin[0])&&b.equals(paskey[0]))c=true;
        //Seleksi kondisi else if, jika admin bernilai 1 dan paskey bernilai 1, maka true
        else if(a.equals(admin[1])&&b.equals(paskey[1]))c=true;
        //Seleksi kondisi else if, jika admin bernilai 2 dan paskey bernilai 2, maka true
        else if (a.equals(admin[2])&&b.equals(paskey[2]))c=true;
        //else sama dengan false
        else c=false;
        //Pengembalian nilai c
        return c;
    }
}
