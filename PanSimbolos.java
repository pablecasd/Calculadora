import javax.swing.*;
import java.awt.*;

/**
 * Created by Pablo on 12/03/2016.
 */
public class PanSimbolos extends JPanel {
    JButton botons, botonr, botonm, botond;
    PanSimbolos(Calculadora oyente){
        FlowLayout layout = new FlowLayout();
        layout.setHgap(20);
        setLayout(layout);
        setBackground(Color.CYAN);
        botons = new JButton(" + ");
        botons.addActionListener(oyente);
        botonr = new JButton(" - ");
        botonr.addActionListener(oyente);
        botonm = new JButton(" * ");
        botonm.addActionListener(oyente);
        botond = new JButton(" / ");
        botond.addActionListener(oyente);

        add(botons);
        add(botonr);
        add(botonm);
        add(botond);
    }


}
