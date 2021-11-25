import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConTempCtoF extends  JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton konwertujButton;
    private JButton wyczyscButton;
    private JButton wyjscieButton;
    private JRadioButton czcionkaMałaRadioButton;
    private JRadioButton czcionkaŚredniaRadioButton;
    private JRadioButton czcionkaDużaRadioButton;
    private JCheckBox wielkieLiteryCheckBox;
    private JButton resetujButton;
    private JPanel panel1;

    private double tempC, tempF;

    public static void main(String[] args) {
        ConTempCtoF conTemp = new ConTempCtoF();
        conTemp.setVisible(true);
    }

    public ConTempCtoF(){
        super("Konwetowanie stopni C -> F");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object ob1 = e.getSource();
                if (ob1 == konwertujButton || ob1 == textField1){
                    tempC = Double.parseDouble(textField1.getText());
                    tempF = 32.00 + (9.0/5.0) * tempC;
                    textField2.setText(String.valueOf(tempF));
                } else if (ob1 == wyczyscButton){
                    textField1.setText("");
                    textField2.setText("");
                    if (wielkieLiteryCheckBox.isSelected()==true) wielkieLiteryCheckBox.setSelected(false);
                    else if (czcionkaMałaRadioButton.isSelected()==true) czcionkaMałaRadioButton.setSelected(false);
                    else if (czcionkaDużaRadioButton.isSelected()==true) czcionkaDużaRadioButton.setSelected(false);
                    else if (czcionkaŚredniaRadioButton.isSelected()==true) czcionkaŚredniaRadioButton.setSelected(false);
                } else if (ob1==wyjscieButton) {
                    dispose();
                } else if (ob1 == wielkieLiteryCheckBox) {
                    if (wielkieLiteryCheckBox.isSelected()==true) {
                        textField2.setFont(new Font("SansSerif", Font.BOLD, 18));
                    } else {
                        textField2.setFont(new Font("SansSerif", Font.PLAIN, 12));
                    }
                } else if (ob1==czcionkaMałaRadioButton) {
                    textField2.setFont(new Font("SansSerif", Font.PLAIN, 8));
                } else if (ob1==czcionkaŚredniaRadioButton) {
                    textField2.setFont(new Font("SansSerif", Font.PLAIN, 12));
                } else if (ob1==czcionkaDużaRadioButton) {
                    textField2.setFont(new Font("SansSerif", Font.PLAIN, 20));
                }

            }
        };

        konwertujButton.addActionListener(listener);
        wyczyscButton.addActionListener(listener);
        wyjscieButton.addActionListener(listener);
        wielkieLiteryCheckBox.addActionListener(listener);
        czcionkaMałaRadioButton.addActionListener(listener);
        czcionkaŚredniaRadioButton.addActionListener(listener);
        czcionkaDużaRadioButton.addActionListener(listener);
    }
}
