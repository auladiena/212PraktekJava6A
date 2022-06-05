package frame;

import model.Pengguna;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PenggunaCreateForm extends JFrame{
    private JTextField tfuname;
    private JTextField tfpw;
    private JTextField tfNamaLengkap;
    private JTextField tflevel;
    private JButton simpanButton;
    private JButton batalButton;
    public JPanel panelMain;

    public PenggunaCreateForm() {
        simpanButton.addActionListener(e -> {
            Pengguna p = new Pengguna();
            p.setUsername(tfuname.getText());
            p.setPassword(tfpw.getText().toString());
            p.setNamaLengkap(tfNamaLengkap.getText());
            p.setLevel(tflevel.getText());
            p.create();

            tfuname.setText("");
            tfpw.setText("");
            tfNamaLengkap.setText("");
            tflevel.setText("");

            JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");

        });
        batalButton.addActionListener(e -> {
            System.exit(0);
        });
    }
}
