import javax.swing.*;
import java.awt.*;


public class Calculator {

    JPanel windwoContent;
    JTextField displayField;
    JButton button0;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton buttonPoint;
    JButton buttonPlus;
    JButton buttonMinus;
    JButton buttonDivison;
    JButton buttonMultiply;

    JButton buttonEqual;
    JPanel p1;
    JPanel p2;

    Calculator() {

        windwoContent = new JPanel();

        BorderLayout bl = new BorderLayout();
        windwoContent.setLayout(bl);

        displayField = new JFormattedTextField(30);
        windwoContent.add("North", displayField);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");
        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivison = new JButton("/");
        buttonMultiply = new JButton("*");

        p1 = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        p1.setLayout(gl);

        p2 = new JPanel();
        GridLayout gl2 = new GridLayout(2,2);
        p2.setLayout(gl2);



        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);
        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonMultiply);
        p2.add(buttonDivison);


        windwoContent.add("Center", p1);

        windwoContent.add("East",p2);



        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windwoContent);

        frame.pack();

        frame.setVisible(true);


    }

}