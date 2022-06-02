import model.Pengguna;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
//        MyConnection m = new MyConnection();
//        m.getConnection();

        Pengguna pengguna = new Pengguna();
        ArrayList<Pengguna> listPengguna = pengguna.read();

        for (Pengguna value : listPengguna){
            System.out.println(value.getNamaLengkap());
        }

        Pengguna coba = new Pengguna();
        coba.setUsername("User 4");
        coba.setPassword("User 4");
        coba.setNamaLengkap("User Empat");
        coba.setLevel("User");
        coba.create();

    }
}
