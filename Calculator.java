/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField txtFirstNumber, txtSecondNumber, txtResult;
    private JButton btnAdd, btnSubtract, btnMultiply, btnDivide, btnModulo, btnClear;

    public Calculator() {
        // Create the frame
        setTitle("Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Create components
        JLabel lblFirstNumber = new JLabel("First Number:");
        txtFirstNumber = new JTextField();
        JLabel lblSecondNumber = new JLabel("Second Number:");
        txtSecondNumber = new JTextField();
        JLabel lblResult = new JLabel("Result:");
        txtResult = new JTextField();
        txtResult.setEditable(false);

        btnAdd = new JButton("+");
        btnSubtract = new JButton("-");
        btnMultiply = new JButton("*");
        btnDivide = new JButton("/");
        btnModulo = new JButton("%");
        btnClear = new JButton("Clear");

        // Add action listeners
        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnModulo.addActionListener(this);
        btnClear.addActionListener(this);

        // Add components to frame
        add(lblFirstNumber);
        add(txtFirstNumber);
        add(lblSecondNumber);
        add(txtSecondNumber);
        add(lblResult);
        add(txtResult);
        add(btnAdd);
        add(btnSubtract);
        add(btnMultiply);
        add(btnDivide);
        add(btnModulo);
        add(btnClear);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(txtFirstNumber.getText());
            double num2 = Double.parseDouble(txtSecondNumber.getText());
            double result = 0;

            if (e.getSource() == btnAdd) {
                result = num1 + num2;
            } else if (e.getSource() == btnSubtract) {
                result = num1 - num2;
            } else if (e.getSource() == btnMultiply) {
                result = num1 * num2;
            } else if (e.getSource() == btnDivide) {
                result = num1 / num2;
            } else if (e.getSource() == btnModulo) {
                result = num1 % num2;
            } else if (e.getSource() == btnClear) {
                txtFirstNumber.setText("");
                txtSecondNumber.setText("");
                txtResult.setText("");
                return;
            }

            txtResult.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            txtResult.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
