package frame;

import model.Pengguna;

import javax.swing.*;

public class PenggunaCreateForm extends JFrame{
    private JTextField tfuname;
    private JPasswordField tfpass;
    private JTextField tfNamaLengkap;
    private JTextField tflevel;
    private JButton simpanButton;
    private JButton batalButton;
    public JPanel panelMain;

    public PenggunaCreateForm() {
        simpanButton.addActionListener(e -> {
            Pengguna p = new Pengguna();
            p.setUsername(tfuname.getText());
            p.setPassword(tfpass.getPassword().toString());
            p.setNamaLengkap(tfNamaLengkap.getText());
            p.setLevel(tflevel.getText());
            p.create();

            tfuname.setText("");
            tfpass.setText("");
            tfNamaLengkap.setText("");
            tflevel.setText("");

            JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");

        });
        batalButton.addActionListener(e -> {
            System.exit(0);
        });
    }
}
