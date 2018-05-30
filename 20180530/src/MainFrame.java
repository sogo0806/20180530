import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private JLabel jlb = new JLabel("輸入");
    private JTextField text = new JTextField();
    private JTextArea jta = new JTextArea();
    private JTextArea jta2 = new JTextArea();
    private JButton jbut = new JButton("加密");
    private JButton jbut2 = new JButton("解密");
    private JButton jbut3 = new JButton("EXIT");
    private Container cp ;
    private JPanel jpnc = new JPanel(new GridLayout(5,1,3,3));
    private JPanel jpnl = new JPanel(new GridLayout(1,1,3,3));
    private JPanel jpnr = new JPanel(new GridLayout(1,1,3,3));
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(0,0,500,700);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        jpnc.add(jlb);
        jpnc.add(text);
        jpnc.add(jbut);
        jpnc.add(jbut2);
        jpnc.add(jbut3);
        jpnl.add(jta);
        jpnr.add(jta2);
        cp.add(jpnc,BorderLayout.CENTER);
        cp.add(jpnl,BorderLayout.EAST);
        cp.add(jpnr,BorderLayout.WEST);

        jpnl.setPreferredSize(new Dimension(150,200));
        jpnr.setPreferredSize(new Dimension(150,200));


        jbut.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0 ; i < jta.getText().length() ; i++){
                    char c = jta.getText().charAt(i);

                }
            }
        });

        jbut3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
