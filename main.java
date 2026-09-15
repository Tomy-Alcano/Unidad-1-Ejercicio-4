import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame ventana = new JFrame("Ejercicio 4");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setSize(500, 300);
            ventana.setLocationRelativeTo(null);

            JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

            JLabel pais = new JLabel("Pais de residencia:");

            String[] paises = {
                    "Argentina",
                    "Brasil",
                    "Uruguay",
                    "Chile",
                    "Paraguay"
            };

            JComboBox<String> paisesComboBox = new JComboBox<>(paises);

            JLabel lblgenero = new JLabel("Genero:");

            JPanel Genero = new JPanel();

            JRadioButton Masculino = new JRadioButton("Masculino");
            JRadioButton Femenino = new JRadioButton("Femenino");

            ButtonGroup generoGrupo = new ButtonGroup();
            generoGrupo.add(Masculino);
            generoGrupo.add(Femenino);

            Genero.add(Masculino);
            Genero.add(Femenino);

            JCheckBox aceptarTerminos =  new JCheckBox("Acepto los Terminos y condiciones");

            JButton confirmar = new JButton("Confirmar");

            panel.add(pais);
            panel.add(paisesComboBox);

            panel.add(lblgenero);
            panel.add(Genero);

            panel.add(new JLabel(""));
            panel.add(aceptarTerminos);

            panel.add(new JLabel(""));
            panel.add(new JLabel(""));

            panel.add(new JLabel(""));
            panel.add(confirmar);

            ventana.add(panel);
            ventana.setVisible(true);

        });
    }
}
