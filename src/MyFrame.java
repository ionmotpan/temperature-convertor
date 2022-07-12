import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame  extends JFrame implements ActionListener {
    JFrame frmMain;
    JLabel lblCelsius;
    JTextField textCelsius;
    JLabel lblFahrenheight;
    JTextField textFahrenheith;
    JButton btnConvertCtoF;
    JButton btnConvertFtoC;
    MyFrame(){
        frmMain = new JFrame("Temperature Converter");
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.setSize(500, 500);
        frmMain.setLayout(new FlowLayout());


        lblCelsius = new JLabel("Celsius:");
        lblCelsius.setFont(new Font("Serif", Font.BOLD, 50));
        textCelsius = new JTextField(20 );
        textCelsius.setFont(new Font("Serif", Font.BOLD, 25));

        lblFahrenheight = new JLabel("Fahrenheight:");
        lblFahrenheight.setFont(new Font("Serif", Font.BOLD, 50));
        textFahrenheith = new JTextField(20);
        textFahrenheith.setFont(new Font("Serif", Font.BOLD, 25));

        btnConvertCtoF = new JButton("Convert C to F");
        btnConvertCtoF.setFont(new Font(null, Font.BOLD, 20));
        btnConvertCtoF.addActionListener(this);

        btnConvertFtoC = new JButton("Convert F to C");
        btnConvertFtoC.setFont(new Font(null, Font.BOLD, 20));
        btnConvertFtoC.addActionListener(this);




        frmMain.add(lblCelsius);
        frmMain.add(textCelsius);
        frmMain.add(lblFahrenheight);
        frmMain.add(textFahrenheith);
        frmMain.add(btnConvertCtoF);
        frmMain.add(btnConvertFtoC);
        frmMain.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnConvertCtoF){
            String celsiusText = textCelsius.getText();
            double celsiusTextToDouble = Double.parseDouble(celsiusText);
            double fahrenheight = (celsiusTextToDouble * 9 / 5) + 32;
            textFahrenheith.setText(String.valueOf(fahrenheight));
            textCelsius.setText("");
        }
        else if(e.getSource() == btnConvertFtoC){
            String fahrenheightText = textFahrenheith.getText();
            double fahrenheightTextToDouble = Double.parseDouble(fahrenheightText);
            double celsius = (fahrenheightTextToDouble - 32) * 5 / 9;
            textCelsius.setText(String.valueOf(celsius));
            textFahrenheith.setText("");
        }
    }
}
