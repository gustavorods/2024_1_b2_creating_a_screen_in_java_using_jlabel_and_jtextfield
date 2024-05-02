import javax.swing.*;
import java.awt.*;

public class JlabelAndTextField extends JFrame {
    JLabel name;
    JTextField field;
    public JlabelAndTextField() {
        super("tela com campo de texto");
        Container tela = getContentPane();
        setLayout(null);
        name = new JLabel("Nome");
        name.setBounds(50, 100, 100, 100);
        field = new JTextField(50); // !!
        field.setBounds(90, 145, 100, 20); // !!
        tela.add(name);
        tela.add(field); // !!
        setSize(400,500);
        setVisible(true);
    }

    // Main
    public static void main(String args[]) {
        JlabelAndTextField app = new JlabelAndTextField();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
