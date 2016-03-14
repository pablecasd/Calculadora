import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculadora extends JFrame implements ActionListener{

        PanOper panel1; PanSimbolos panel2; PanResultado panel3;
    public Calculadora(){
        setTitle("Calculadora");
        setBounds(300,400,350,350);
        setResizable(false);
        setVisible(true);

        Container contentpane = getContentPane();


        GridLayout layout = new GridLayout(3,1);
        contentpane.setLayout(layout);
        panel1 = new PanOper();
        panel2 = new PanSimbolos(this);
        panel3 = new PanResultado();

        contentpane.add(panel1);
        contentpane.add(panel2);
        contentpane.add(panel3);
        paintComponents(getGraphics());


    }


    public void actionPerformed(ActionEvent event) {
        float operando1 = panel1.getOper1();
        float operando2 = panel1.getOper2();

        float resultado;

        if(event.getSource()==panel2.botons) {resultado = operando1 + operando2;
            panel3.setLabelResultado(resultado);}
        if(event.getSource()==panel2.botonr) {resultado = operando1 - operando2;
            panel3.setLabelResultado(resultado);}
        if(event.getSource()==panel2.botonm) {resultado = operando1 * operando2;
            panel3.setLabelResultado(resultado);}
        if(event.getSource()==panel2.botond) {resultado = operando1 / operando2;
            panel3.setLabelResultado(resultado);}
    }

    public static void main(String[] args){
        Calculadora ventana = new Calculadora();
    }
}
