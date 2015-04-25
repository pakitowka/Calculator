import javax.swing.*;
import java.awt.*;

public class View {

    JPanel general;
    private JTextField show;

    JPanel numeric;
    JButton jButton0, jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7, jButton8, jButton9, jButtonPoint, jButtonEqual;

    JPanel operations;
    JButton jButtonPlus, jButtonMinus, jButtonMultiply, jButtonDivide;

    public void setShowValue(String val){
        show.setText(val);
    }

    public String getShowValue(){
        return show.getText();
    }

    View(){
        general = new JPanel();

        BorderLayout borderLayout = new BorderLayout();
        general.setLayout(borderLayout);

        show = new JTextField(30);
        general.add("North", show);

        jButton0 = new JButton("0");
        jButton1 = new JButton("1");
        jButton2 = new JButton("2");
        jButton3 = new JButton("3");
        jButton4 = new JButton("4");
        jButton5 = new JButton("5");
        jButton6 = new JButton("6");
        jButton7 = new JButton("7");
        jButton8 = new JButton("8");
        jButton9 = new JButton("9");
        jButtonPoint = new JButton(".");
        jButtonEqual = new JButton("=");

        numeric = new JPanel();

        GridLayout gridLayout = new GridLayout(4,3);
        numeric.setLayout(gridLayout);

        numeric.add(jButton1);
        numeric.add(jButton2);
        numeric.add(jButton3);
        numeric.add(jButton4);
        numeric.add(jButton5);
        numeric.add(jButton6);
        numeric.add(jButton7);
        numeric.add(jButton8);
        numeric.add(jButton9);
        numeric.add(jButton0);
        numeric.add(jButtonPoint);
        numeric.add(jButtonEqual);

        general.add("Center",numeric);

        operations = new JPanel();

        GridLayout gridLayout1 = new GridLayout(4,1);
        operations.setLayout(gridLayout1);

        jButtonPlus = new JButton("+");
        jButtonMinus = new JButton("-");
        jButtonMultiply = new JButton("*");
        jButtonDivide = new JButton("/");

        operations.add(jButtonPlus);
        operations.add(jButtonMinus);
        operations.add(jButtonMultiply);
        operations.add(jButtonDivide);

        general.add("East", operations);

        CalcEngine calcEngine = new CalcEngine(this);
        jButton0.addActionListener(calcEngine);
        jButton1.addActionListener(calcEngine);
        jButton2.addActionListener(calcEngine);
        jButton3.addActionListener(calcEngine);
        jButton4.addActionListener(calcEngine);
        jButton5.addActionListener(calcEngine);
        jButton6.addActionListener(calcEngine);
        jButton7.addActionListener(calcEngine);
        jButton8.addActionListener(calcEngine);
        jButton9.addActionListener(calcEngine);
        jButtonPoint.addActionListener(calcEngine);
        jButtonPlus.addActionListener(calcEngine);
        jButtonMinus.addActionListener(calcEngine);
        jButtonDivide.addActionListener(calcEngine);
        jButtonMultiply.addActionListener(calcEngine);
        jButtonEqual.addActionListener(calcEngine);

        JFrame jFrame = new JFrame("View");
        jFrame.setContentPane(general);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setResizable(false);

    }

    public static void main(String[] args){
        new View();
    }

}
