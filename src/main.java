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
        coba.setId(6);
        coba.setUsername("user 5");
        coba.setPassword("user 5");
        coba.setNamaLengkap("User Lima");
        coba.setLevel("User");
        coba.update();

    }
}
