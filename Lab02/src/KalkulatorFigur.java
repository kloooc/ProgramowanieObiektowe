import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;
public class KalkulatorFigur extends JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JRadioButton trapezRadioButton;
    private JRadioButton kulaRadioButton;
    private JRadioButton trójkątRadioButton;
    private JRadioButton prostokątRadioButton;
    private JRadioButton kwadratRadioButton;
    private JRadioButton sześcianRadioButton;
    private JRadioButton prostpoadłościanRadioButton;
    private JRadioButton waleccRadioButton;
    private JPanel panel1;
    private JButton obliczButton;
    private JButton wyczyśćButton;
    private JTextField textField8;

    private double a,b,h,r,c, pole, obwod, objetosc;

    public static void main(String[] args) {
        KalkulatorFigur kalkFig = new KalkulatorFigur();
        kalkFig.setVisible(true);
    }

    public KalkulatorFigur(){
        super("Figury geometryczne - kalkulator");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object ob1 = e.getSource();
                if (kwadratRadioButton.isSelected()) {
                    textField1.setEnabled(true);
                    textField2.setEnabled(false);
                    textField3.setEnabled(false);
                    textField4.setEnabled(false);
                    textField5.setEnabled(false);
                    textField8.setEnabled(false);
                    textField6.setEnabled(true);
                }else if (prostokątRadioButton.isSelected()){
                    textField1.setEnabled(true);
                    textField2.setEnabled(true);
                    textField3.setEnabled(false);
                    textField4.setEnabled(false);
                    textField5.setEnabled(false);
                    textField8.setEnabled(false);
                    textField6.setEnabled(true);
                } else if (trójkątRadioButton.isSelected()){
                    textField1.setEnabled(true);
                    textField2.setEnabled(true);
                    textField3.setEnabled(true);
                    textField4.setEnabled(true);
                    textField5.setEnabled(false);
                    textField8.setEnabled(false);
                    textField6.setEnabled(true);
                } else if (trapezRadioButton.isSelected()){
                    textField1.setEnabled(true);
                    textField2.setEnabled(true);
                    textField3.setEnabled(true);
                    textField4.setEnabled(true);
                    textField5.setEnabled(false);
                    textField8.setEnabled(false);
                    textField6.setEnabled(true);
                } else if (sześcianRadioButton.isSelected()){
                    textField1.setEnabled(true);
                    textField2.setEnabled(false);
                    textField3.setEnabled(false);
                    textField4.setEnabled(false);
                    textField5.setEnabled(false);
                    textField7.setEnabled(false);
                    textField8.setEnabled(true);
                    textField6.setEnabled(true);
                } else if (prostpoadłościanRadioButton.isSelected()){
                    textField1.setEnabled(true);
                    textField2.setEnabled(true);
                    textField3.setEnabled(true);
                    textField4.setEnabled(false);
                    textField5.setEnabled(false);
                    textField7.setEnabled(false);
                    textField8.setEnabled(true);
                    textField6.setEnabled(true);
                } else if (waleccRadioButton.isSelected()){
                    textField1.setEnabled(true);
                    textField2.setEnabled(true);
                    textField3.setEnabled(false);
                    textField4.setEnabled(false);
                    textField5.setEnabled(true);
                    textField7.setEnabled(false);
                    textField8.setEnabled(true);
                    textField6.setEnabled(true);
                } else if (kulaRadioButton.isSelected()){
                    textField1.setEnabled(false);
                    textField2.setEnabled(false);
                    textField3.setEnabled(false);
                    textField4.setEnabled(false);
                    textField5.setEnabled(true);
                    textField7.setEnabled(false);
                    textField6.setEnabled(true);
                    textField8.setEnabled(true);
                }
                    if (ob1 == kwadratRadioButton || ob1 == obliczButton) {
                        a = Double.parseDouble(textField1.getText());
                        pole = a * a;
                        obwod = 4 * a;
                        textField6.setText(String.valueOf(pole));
                        textField7.setText(String.valueOf(obwod));
                    } else if (ob1 == prostokątRadioButton || ob1 == obliczButton) {
                        a = Double.parseDouble(textField1.getText());
                        b = Double.parseDouble(textField2.getText());
                        pole = a * b;
                        obwod = 2 * a + 2 * b;
                        textField6.setText(String.valueOf(pole));
                        textField7.setText(String.valueOf(obwod));
                    } else if (ob1 == trójkątRadioButton || ob1 == obliczButton) {
                        a = Double.parseDouble(textField1.getText());
                        b = Double.parseDouble(textField2.getText());
                        c = Double.parseDouble(textField4.getText());
                        h = Double.parseDouble(textField3.getText());
                        pole = a * h / 2;
                        obwod = a + b + c;
                        textField6.setText(String.valueOf(pole));
                        textField7.setText(String.valueOf(obwod));
                    } else if (ob1 == trapezRadioButton || ob1 == obliczButton) {
                        a = Double.parseDouble(textField1.getText());
                        b = Double.parseDouble(textField2.getText());
                        c = Double.parseDouble(textField4.getText());
                        h = Double.parseDouble(textField3.getText());
                        pole = (a + b) * h / 2;
                        obwod = a + b + 2 * c;
                        textField6.setText(String.valueOf(pole));
                        textField7.setText(String.valueOf(obwod));
                    } else if (ob1 == sześcianRadioButton || ob1 == obliczButton) {
                        a = Double.parseDouble(textField1.getText());
                        pole = 6 * (a * a);
                        objetosc = a * a * a;
                        textField6.setText(String.valueOf(pole));
                        textField8.setText(String.valueOf(objetosc));
                    } else if (ob1 == prostpoadłościanRadioButton || ob1 == obliczButton) {
                        a = Double.parseDouble(textField1.getText());
                        b = Double.parseDouble(textField2.getText());
                        h = Double.parseDouble(textField3.getText());
                        pole = 2 * a * b + 2 * a * h + 2 * h * b;
                        objetosc = a * b * h;
                        textField6.setText(String.valueOf(pole));
                        textField8.setText(String.valueOf(objetosc));
                    } else if (ob1 == waleccRadioButton || ob1 == obliczButton) {
                        h = Double.parseDouble(textField3.getText());
                        r = Double.parseDouble(textField5.getText());
                        pole = 2 * Math.PI * (r * r) + 2 * Math.PI * r * h;
                        objetosc = Math.PI * (r * r) * h;
                        textField6.setText(String.valueOf(pole));
                        textField8.setText(String.valueOf(objetosc));
                    } else if (ob1 == kulaRadioButton || ob1 == obliczButton) {
                        r = Double.parseDouble(textField5.getText());
                        pole = 4 * Math.PI * (r * r);
                        objetosc = 4 / 3 * Math.PI * (r * r * r);
                        textField6.setText(String.valueOf(pole));
                        textField8.setText(String.valueOf(objetosc));
                    } else if (ob1 == wyczyśćButton) {
                        textField1.setText("");
                        textField2.setText("");
                        textField3.setText("");
                        textField4.setText("");
                        textField5.setText("");
                        textField6.setText("");
                        textField7.setText("");
                        textField8.setText("");
                        if (kwadratRadioButton.isSelected() == true) kwadratRadioButton.setSelected(false);
                        else if (prostokątRadioButton.isSelected() == true) prostokątRadioButton.setSelected(false);
                        else if (trójkątRadioButton.isSelected() == true) trójkątRadioButton.setSelected(false);
                        else if (trapezRadioButton.isSelected() == true) trapezRadioButton.setSelected(false);
                        else if (sześcianRadioButton.isSelected() == true) sześcianRadioButton.setSelected(false);
                        else if (prostpoadłościanRadioButton.isSelected() == true)
                            prostpoadłościanRadioButton.setSelected(false);
                        else if (waleccRadioButton.isSelected() == true) waleccRadioButton.setSelected(false);
                        else if (kulaRadioButton.isSelected() == true) kulaRadioButton.setSelected(false);
                    }
                }
        };
        wyczyśćButton.addActionListener(listener);
        obliczButton.addActionListener(listener);
    }
}
