import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public JButton AC = new JButton("AC");
    public JButton PI = new JButton("PI");
    public JButton SQRT = new JButton("SQRT");
    private JButton jbtnexit = new JButton("EXIT");
    private JButton jbtns[][] = new JButton[4][5];
    private JButton jbtn[] = new JButton[1];
    private JLabel jlb = new JLabel("0",JLabel.RIGHT);
    private Container cp;
    private JPanel A = new JPanel(new GridLayout(1, 1, 0, 0));
    private JPanel B = new JPanel(new GridLayout(4, 5, 3, 3));
    //-------buton-----//
    private JButton jbtnnine = new JButton("9");
    private JButton jbtneight = new JButton("8");
    private JButton jbtnseven = new JButton("7");
    private JButton jbtnsix = new JButton("6");
    private JButton jbtnfive = new JButton("5");
    private JButton jbtnfour = new JButton("4");
    private JButton jbtnthree = new JButton("3");
    private JButton jbtntwo = new JButton("2");
    private JButton jbtnone = new JButton("1");
    private JButton jbtnzero = new JButton("0");

    private JButton jbtnplus = new JButton("+");
    private JButton jbtnsub = new JButton("-");
    private JButton jbtnmul = new JButton("*");
    private JButton jbtndiv = new JButton("/");
    private JButton jbtnequ = new JButton("=");
    private JButton jbtnpoint = new JButton(".");

    private double v1=0;
    private double v2=0;
    private double v3=0;
    private int op=-1;
    //-------buton-----//
    public MainFrame() {
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(3);//設定關閉視窗的按鈕
        this.setLayout(null);//設置布局為空
        this.setBounds(100, 100, 450, 570);//設置介面大小
        MainFrame.this.setTitle("計算機");

        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3, 3));

        cp.add(A, BorderLayout.NORTH);
        cp.add(B, BorderLayout.CENTER);

        jlb.setFont(new Font(null,Font.BOLD,50));
        A.add(jlb);

        B.add(jbtnnine);
        B.add(jbtneight);
        B.add(jbtnseven);
        B.add(jbtndiv);
        B.add(AC);
        B.add(jbtnsix);
        B.add(jbtnfive);
        B.add(jbtnfour);
        B.add(jbtnmul);
        B.add(SQRT);
        B.add(jbtnthree);
        B.add(jbtntwo);
        B.add(jbtnone);
        B.add(jbtnsub);
        B.add(PI);
        B.add(jbtnzero);
        B.add(jbtnpoint);
        B.add(jbtnequ);
        B.add(jbtnplus);
        B.add(jbtnexit);
        //-----------------------------程式設計------------------//

        //---------------BUTTON
        jbtnnine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton JB=(JButton)e.getSource();
                if (jlb.getText().equals("0")){
                    jlb.setText(JB.getText());
                }
                else {
                    jlb.setText(jlb.getText()+JB.getText());}
            }
        });

        jbtneight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton JB=(JButton)e.getSource();
                if (jlb.getText().equals("0")){
                    jlb.setText(JB.getText());
                }
                else {
                    jlb.setText(jlb.getText()+JB.getText());}
            }
        });

        jbtnseven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton JB=(JButton)e.getSource();
                if (jlb.getText().equals("0")){
                    jlb.setText(JB.getText());
                }
                else {
                    jlb.setText(jlb.getText()+JB.getText());}
            }
        });
        jbtnsix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton JB=(JButton)e.getSource();
                if (jlb.getText().equals("0")){
                    jlb.setText(JB.getText());
                }
                else {
                    jlb.setText(jlb.getText()+JB.getText());}            }
        });
        jbtnfive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton JB=(JButton)e.getSource();
                if (jlb.getText().equals("0")){
                    jlb.setText(JB.getText());
                }
                else {
                    jlb.setText(jlb.getText()+JB.getText());}            }
        });
        jbtnfour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton JB=(JButton)e.getSource();
                if (jlb.getText().equals("0")){
                    jlb.setText(JB.getText());
                }
                else {
                    jlb.setText(jlb.getText()+jbtnsix.getText());}            }
        });
        jbtnthree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton JB=(JButton)e.getSource();
                if (jlb.getText().equals("0")){
                    jlb.setText(JB.getText());
                }
                else {
                    jlb.setText(jlb.getText()+JB.getText());}            }
        });
        jbtntwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton JB=(JButton)e.getSource();
                if (jlb.getText().equals("0")){
                    jlb.setText(JB.getText());
                }
                else {
                    jlb.setText(jlb.getText()+JB.getText());}            }
        });
        jbtnone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton JB=(JButton)e.getSource();
                if (jlb.getText().equals("0")){
                    jlb.setText(JB.getText());
                }
                else {
                    jlb.setText(jlb.getText()+JB.getText());}            }
        });
        jbtnzero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton JB=(JButton)e.getSource();
                if (jlb.getText().equals("0")){
                    jlb.setText(JB.getText());
                }
                else {
                jlb.setText(jlb.getText()+JB.getText());}
            }
        });
        jbtnplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1=Double.parseDouble(jlb.getText());
                op=0;
                jlb.setText(" ");
            }
        });
        jbtnsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1=Double.parseDouble(jlb.getText());
                op=1;
                jlb.setText(" ");            }
        });
        jbtnmul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1=Double.parseDouble(jlb.getText());
                op=2;
                jlb.setText(" ");            }
        });
        jbtndiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1=Double.parseDouble(jlb.getText());
                op=3;
                jlb.setText(" ");            }
        });
        jbtnpoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlb.setText(jlb.getText()+jbtnpoint.getText());            }
        });

        //---------------BUTTON

        //---------------equ
        jbtnequ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton JB=(JButton)e.getSource();
                v2=Double.parseDouble(jlb.getText());
                switch (op){
                    case 0:
                        v3=v1+v2;
                        String x=String.valueOf(v3);
                        jlb.setText(v1+"+"+v2+"="+x);
                        break;
                    case 1:
                        v3=v1-v2;
                        String y=String.valueOf(v3);
                        jlb.setText(v1+"-"+v2+"="+y);
                        break;
                    case 2:
                        v3=v1*v2;
                        String z=String.valueOf(v3);
                        jlb.setText(v1+"*"+v2+"="+z);
                        break;
                    case 3:
                        v3=v1/v2;
                        String s=String.valueOf(v3);
                        jlb.setText(v1+"/"+v2+"="+s);
                        break;
                        
                        default:
                            if (jlb.getText().equals("0")||op>-1){
                                jlb.setText(JB.getText());
                            }else {
                                jlb.setText(jlb.getText()+JB.getText());
                            }
                }
            }
        });
        //---------------equ

        //---------------AC
        AC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op=-1;
                jlb.setText("0");
            }
        });
        //---------------AC

        //---------------SQRTA
        SQRT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a=String.valueOf(Math.sqrt(Double.parseDouble(jlb.getText())));
                jlb.setText(a);
            }
        });
        //---------------SQRT

        //---------------PI
        PI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1=Double.parseDouble(jlb.getText());
                String a=String.valueOf(Math.PI*v1);
                jlb.setText(a);
            }
        });
        //---------------PI

        //---------------EXIT
        jbtnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //---------------EXIT
    }
}