import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class from1 {
    public JFrame frame;
    public JPanel panel1;
    public JTextArea login;
    public JTextArea titulocorreo;
    public JTextArea tituloContraseña;
    public JTextField correo;
    public JPasswordField contraseña;
    public JButton ingresar;

    public from1() {
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 2, 10, 10));
        JLabel etiquetaCorreo = new JLabel("Correo:");
        correo = new JTextField();

        JLabel etiquetaContraseña = new JLabel("Contraseña:");
        contraseña = new JPasswordField();

        ingresar = new JButton("Ingresar");

        ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String correoIngresado = correo.getText();
                String contraseñaIngresada = new String(contraseña.getPassword());

                if (correoIngresado.equals("walteracero005@gmail.com") && contraseñaIngresada.equals("123456")) {
                    JOptionPane.showMessageDialog(panel1, "Login exitoso");


                } else {
                    JOptionPane.showMessageDialog(panel1, "Credenciales incorrectas");
                }
            }
        });

        panel1.add(etiquetaCorreo);
        panel1.add(correo);
        panel1.add(etiquetaContraseña);
        panel1.add(contraseña);
        panel1.add(new JLabel());
        panel1.add(ingresar);
    }
}
