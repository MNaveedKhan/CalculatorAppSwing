package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by Naveed on 8/28/2019.
 */
public class CalculatorGui {
    private JPanel mainPanel;
    private JTextField textBox;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnMinus;
    private JButton btnPlus;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnDivide;
    private JButton btnMultiply;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnEqual;
    private JButton btnZero;
    private JButton btnPoint;
    private JButton btnClear;

    double total1 = 0.0;
    double total2 = 0.0;
    String operator = "";
    public CalculatorGui() {

        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String Text = textBox.getText() + btnOne.getText();
                    textBox.setText(Text);

            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String Text = textBox.getText() + btnTwo.getText();
                textBox.setText(Text);}

        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Text = textBox.getText() + btnThree.getText();
                textBox.setText(Text);}
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Text = textBox.getText() + btnFour.getText();
                textBox.setText(Text);}
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Text = textBox.getText() + btnFive.getText();
                textBox.setText(Text);}
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Text = textBox.getText() + btnSix.getText();
                textBox.setText(Text);}
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Text = textBox.getText() + btnSeven.getText();
                textBox.setText(Text);}
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Text = textBox.getText() + btnEight.getText();
                textBox.setText(Text);}
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Text = textBox.getText() + btnNine.getText();
                textBox.setText(Text);}
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Text = textBox.getText() + btnZero.getText();
                textBox.setText(Text);}
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textBox.getText().equals("")) {
                    textBox.setText("0.");
                } else if (textBox.getText().contains(".")) {
                } else {
                    String Text = textBox.getText() + btnPoint.getText();
                    textBox.setText(Text);
                }
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textBox.setText("");
                total1 = 0.0;
                total2 = 0.0;
                operator = "";
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator == "+" || textBox.getText().equals("")) {
                }
                else {
                    total1 = Double.parseDouble(textBox.getText());
                    textBox.setText("");
                    operator = "+";
                }
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator == "-" || textBox.getText().equals("")) {
                } else {
                    total1 = Double.parseDouble(textBox.getText());
                    textBox.setText("");
                    operator = "-";
                }
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator == "/" || textBox.getText().equals("")) {
                } else {
                    total1 = Double.parseDouble(textBox.getText());
                    textBox.setText("");
                    operator = "/";
                }
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operator == "x" || textBox.getText().equals("")) {
                } else {
                    total1 = Double.parseDouble(textBox.getText());
                    textBox.setText("");
                    operator = "x";
                }
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(operator){
                    case "+": total2 = total1 + Double.parseDouble(textBox.getText());
                        break;
                    case "-": total2 = total1 - Double.parseDouble(textBox.getText());
                        break;
                    case "x": total2 = total1 * Double.parseDouble(textBox.getText());
                        break;
                    case "/": total2 = total1 / Double.parseDouble(textBox.getText());
                        break;
                }
                textBox.setText(Double.toString(total2));
            }
        });
    }


    public static void main(String[] args) {
        // write your code here
        JFrame frame = new JFrame("CalculatorGui");
        frame.setContentPane(new CalculatorGui().mainPanel);
        frame.setDefaultCloseOperation(3);
        frame.pack();
        frame.setVisible(true);
    }
}
