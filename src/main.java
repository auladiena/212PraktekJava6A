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
//        coba.setUsername("user5");
//        coba.setPassword("user5");
//        coba.setNamaLengkap("User Lima");
//        coba.setLevel("User");
        coba.delete();

        Pengguna mauLogin = new Pengguna();
        mauLogin.setUsername("user1");
        mauLogin.setPassword("user1");
        if(mauLogin.login()){
            System.out.println("Login Berhasil");
        }else {
            System.err.println("Gagal Login");
        }

        Pengguna gantiPassword = new Pengguna();
        gantiPassword.setUsername("user2");
        gantiPassword.setPassword("inipasswordbaru");

        if (gantiPassword.updatePassword("user2")) {
           System.out.println("Update Password Berhasil");
       }else{
           System.err.println("Update Password Gagal");
         }
       }
    }

