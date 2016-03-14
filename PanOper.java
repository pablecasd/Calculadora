import javax.swing.*;
import java.awt.*;

/**
 * Created by Pablo on 11/03/2016.
 */
public class PanOper extends JPanel {

    JLabel texto1, texto2; JTextField campo1, campo2;
    PanOper() {

        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        setBackground(Color.CYAN);
        texto1=new JLabel("Operando 1: ");
        texto2=new JLabel("Operando 2: ");

        campo1=new JTextField(20);
        campo2=new JTextField(20);

        add(texto1);
        add(campo1);
        add(texto2);
        add(campo2);






    }
    float getOper1(){
        return Float.parseFloat(campo1.getText());
    }
    float getOper2(){
        return Float.parseFloat(campo2.getText());
    }
}
