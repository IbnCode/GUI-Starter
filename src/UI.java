import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class UI extends Frame implements ActionListener {
    private TextField numberDisplay = new TextField("0");

    public  UI() {
        setLayout(new FlowLayout());
        setTitle("Calculator");
        setSize(200,300);
        setVisible(true);
        numberDisplay.setEditable(true);
        Label label = new Label("Calculator", Label.CENTER);
        add(label);
        add(numberDisplay);
        equation p = new equation();
        equation m = new equation();
        equation x = new equation();
        equation q = new equation();
        Button cc = new Button("C");
        Button plus = new Button("+");
        Button minus = new Button("-");
        Button hit = new Button("x");
        Button qisma = new Button("÷");
        Button Number0 = new Button("0");
        Button Number1 = new Button("1");
        Button Number2 = new Button("2");
        Button Number3 = new Button("3");
        Button Number4 = new Button("4");
        Button Number5 = new Button("5");
        Button Number6 = new Button("6");
        Button Number7 = new Button("7");
        Button Number8 = new Button("8");
        Button Number9 = new Button("9");
        Button equal = new Button("=");
        add(Number1);
        add(Number0);
        add(Number2);
        add(Number3);
        add(Number4);
        add(Number5);
        add(Number6);
        add(Number7);
        add(Number8);
        add(Number9);
        add(hit);
        add(minus);
        add(plus);
        add(qisma);
        add(equal);
        add(cc);
        cc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberDisplay.setText("0");
                p.setUsed(false);
                q.setUsed(false);
                m.setUsed(false);
                x.setUsed(false);
            }
        });

        Number0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberDisplay.setText(numberDisplay.getText() + 0);
                int count = Integer.parseInt(numberDisplay.getText());
                numberDisplay.setText(count + "");
            }
        });
        Number1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberDisplay.setText(numberDisplay.getText() + 1);
                int count = Integer.parseInt(numberDisplay.getText());
                numberDisplay.setText(count + "");
            }
        });
        Number2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberDisplay.setText(numberDisplay.getText() + 2);
                int count = Integer.parseInt(numberDisplay.getText());
                numberDisplay.setText(count + "");
            }
        });
        Number3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberDisplay.setText(numberDisplay.getText() + 3);
                int count = Integer.parseInt(numberDisplay.getText());
                numberDisplay.setText(count + "");
            }
        });
        Number4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberDisplay.setText(numberDisplay.getText() + 4);
                int count = Integer.parseInt(numberDisplay.getText());
                numberDisplay.setText(count + "");
            }
        });
        Number5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberDisplay.setText(numberDisplay.getText() + 5);
                int count = Integer.parseInt(numberDisplay.getText());
                numberDisplay.setText(count + "");
            }
        });
        Number6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberDisplay.setText(numberDisplay.getText() + 6);
                int count = Integer.parseInt(numberDisplay.getText());
                numberDisplay.setText(count + "");
            }
        });
        Number7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberDisplay.setText(numberDisplay.getText() + 7);
                int count = Integer.parseInt(numberDisplay.getText());
                numberDisplay.setText(count + "");
            }
        });
        Number8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberDisplay.setText(numberDisplay.getText() + 8);
                int count = Integer.parseInt(numberDisplay.getText());
                numberDisplay.setText(count + "");
            }
        });
        Number9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numberDisplay.setText(numberDisplay.getText() + 9);
                int count = Integer.parseInt(numberDisplay.getText());
                numberDisplay.setText(count + "");
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setUsed(true);
                p.setValue(Integer.parseInt(numberDisplay.getText()));
                numberDisplay.setText("");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                m.setUsed(true);
                m.setValue(Integer.parseInt(numberDisplay.getText()));
                numberDisplay.setText("");
            }
        });
        hit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x.setUsed(true);
                x.setValue(Integer.parseInt(numberDisplay.getText()));
                numberDisplay.setText("");
            }
        });
        qisma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                q.setUsed(true);
                q.setValue(Integer.parseInt(numberDisplay.getText()));
                numberDisplay.setText("");
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = Integer.parseInt(numberDisplay.getText());
                if (p.getUsed()) {
                    count += p.getValue();
                }
                if (m.getUsed()) {
                    count = m.getValue() - count;
                }
                if (x.getUsed()){
                    count *= x.getValue();
                }
                if (q.getUsed()){
                    count = q.getValue()/count;
                }
                numberDisplay.setText(count + "");
                p.setUsed(false);
                q.setUsed(false);
                m.setUsed(false);
                x.setUsed(false);
            }
        });





    }
    public static void main(String[] args) {
        UI app = new UI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        numberDisplay.setText(numberDisplay.getText() + 1);
        int count = Integer.parseInt(numberDisplay.getText());
        numberDisplay.setText(count + "");
    }
}
