import javax.swing.*;

public class from2 {
    public JPanel panel2;
    public JTextArea biografia;
    public JTextArea contenido;
    public JButton siguiente;

    public from2() {

        contenido.setText("Steve Jobs, cuyo nombre completo es Steven Paul Jobs, fue un empresario, diseñador industrial y magnate estadounidense1. Nació el 24 de febrero de 1955 en San Francisco, California23. Jobs fue cofundador y presidente ejecutivo de Apple, así como máximo accionista individual de The Walt Disney Company1. Su legado incluye la creación de Apple Inc. y su influencia en la industria informática.");

        siguiente.addActionListener(e -> {
            from3 form3 = new from3();
            JFrame frame = new JFrame("Hobbies");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setContentPane(form3.panel3);
            frame.pack();
            frame.setVisible(true);
        });
    }


}
