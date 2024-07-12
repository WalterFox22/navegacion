import javax.swing.*;

public class from3 {
    public JPanel panel3;
    public JTextArea tituloHobbis;
    public JTextArea BASQUET;
    public JTextArea CICLISMO;
    public JButton VOLVER;

    public from3() {
        panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));

        tituloHobbis = new JTextArea("Hobbies");
        tituloHobbis.setEditable(false);

        BASQUET = new JTextArea("Te apasiona el básquet por su emoción, estrategia y camaradería. Disfrutas tanto verlo como jugarlo, y te encanta la adrenalina de los momentos decisivos. El básquet te desafía a mejorar y te enseña el valor del trabajo en equipo y la perseverancia.");
        BASQUET.setWrapStyleWord(true);
        BASQUET.setLineWrap(true);
        BASQUET.setEditable(false);

        CICLISMO = new JTextArea("Me apasiona el ciclismo por la libertad que siento al pedalear y la conexión con la naturaleza. Disfruto tanto las rutas desafiantes como los paseos tranquilos, y aprecio la resistencia y disciplina que requiere el deporte. El ciclismo me enseña la importancia de la perseverancia y la superación personal.");
        CICLISMO.setWrapStyleWord(true);
        CICLISMO.setLineWrap(true);
        CICLISMO.setEditable(false);

        VOLVER = new JButton("Volver a from2");

        panel3.add(tituloHobbis);
        panel3.add(new JScrollPane(BASQUET));
        panel3.add(new JScrollPane(CICLISMO));
        panel3.add(VOLVER);
    }
}
