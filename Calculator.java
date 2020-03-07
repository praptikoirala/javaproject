import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
class Calculator extends JFrame implements ActionListener { 
    JFrame f;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bEqual, bClear, bPlus, bMinus, bMultiply, bDivide, bPercent;
    JTextField tf;
    JPanel p;

     Calculator() {
        setSize(400,400);
        tf = new JTextField();
        tf.setPreferredSize(new Dimension(350, 35));
        p = new JPanel();
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bPlus = new JButton("+");
        bMinus = new JButton("-");
        bMultiply = new JButton("*");
        bDivide = new JButton("/");
        bClear = new JButton("CLR");
        bPercent = new JButton("%");
        bEqual = new JButton("=");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bPlus);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bMinus);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bMultiply);
        p.add(b0);
        p.add(bClear);
        p.add(bPercent);
        p.add(bDivide);
        p.setVisible(true);
        p.setLayout(new GridLayout(4, 4));
        add(tf, BorderLayout.NORTH);
        add(p, BorderLayout.CENTER);
        add(bEqual, BorderLayout.SOUTH);
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bDivide.addActionListener(this);
        bMultiply.addActionListener(this);
        bClear.addActionListener(this);
        bPercent.addActionListener(this);
        bEqual.addActionListener(this);
    }

     public void actionPerformed(ActionEvent e) {
        String value = e.getActionCommand();
        if (e.getSource() == bClear) {
            tf.setText("");
        } else if (e.getSource() == bEqual) {
            tf.setText(calculate(tf.getText()));
        } else {
            tf.setText(tf.getText() + value);
        }
     }
    public String calculate(String expression) {
        double result = 0;
        String opFirst = "";
        String opSecond = "";
        String operator = "";
        char[] arr = expression.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                if (operator == "") {
                    opFirst += arr[i];
                } else {
                    opSecond += arr[i];
                }
            }

            if (arr[i] == '+' || arr[i] == '-' || arr[i] == '*' || arr[i] == '/' || arr[i] == '%' ) {
                operator += arr[i];
            }
        }

        if (operator.equals("+")) {
            result = (Double.parseDouble(opFirst) + Double.parseDouble(opSecond));
        }

        else if (operator.equals("-")) {
            result = (Double.parseDouble(opFirst) - Double.parseDouble(opSecond));
        }

        else if (operator.equals("*")) {
            result = (Double.parseDouble(opFirst) * Double.parseDouble(opSecond));
        }
        else if (operator.equals("/")) {
            result = (Double.parseDouble(opFirst) / Double.parseDouble(opSecond));
        }
        else {
            result = (Double.parseDouble(opFirst) % Double.parseDouble(opSecond));          
        }

        return opFirst + operator + opSecond + "=" + result;

     }

    public static void main(String[] args) {
        Menu m = new Menu();
          
    } 
} 

