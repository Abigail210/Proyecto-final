package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import utils.Utils;

public class PanelEmpleadoLeerTodos extends JPanel {

    private JLabel labeTitulo;
    private JTextArea textArea;

    public PanelEmpleadoLeerTodos() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setBounds(10, 100, screenSize.width - 20, screenSize.height - 200);

        labeTitulo = new JLabel(Utils.LEER_TODOS_LOS_EMPLEADOS);
        labeTitulo.setBounds(10, 10, screenSize.width - 100, 50);
        labeTitulo.setFont(Utils.obtenerFontTitulo());

        textArea = new JTextArea();
        textArea.setBounds(10, 100, screenSize.width - 40, screenSize.height - 400);

        add(labeTitulo);
        add(textArea);
    }

    public JLabel getLabeTitulo() {
        return labeTitulo;
    }

    public void setLabeTitulo(JLabel labeTitulo) {
        this.labeTitulo = labeTitulo;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
    }
}
