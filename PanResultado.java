import javax.swing.*;
import java.awt.*;

/**
 * Created by Pablo on 12/03/2016.
 */
public class PanResultado extends JPanel{
    JLabel texto1;
    PanResultado(){
        FlowLayout layout = new FlowLayout();
        layout.setHgap(4);
        setLayout(layout);
        setBackground(Color.CYAN);
        texto1 = new JLabel("00");

        add(new JLabel("El resultado es: "));
        add(texto1);


    }
    void setLabelResultado(float numero) {
        String texto = Float.toString(numero);
        texto1.setText(texto);
    }

}
