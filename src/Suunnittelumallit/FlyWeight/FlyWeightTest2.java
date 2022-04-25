package Suunnittelumallit.FlyWeight;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class FlyWeightTest2 extends JFrame {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        FlyWeightTest2 test = new FlyWeightTest2();
        test.setBounds(50,50,1000,500);
        test.show();
        System.out.println((System.currentTimeMillis() - start));
    }
    public FlyWeightTest2() {
        super("Border flyweights");
        JPanel panel = new JPanel(), panel2 = new JPanel();
        Border border = BorderFactory.createRaisedBevelBorder();
        Border border2 = BorderFactory.createRaisedBevelBorder();
        panel.setBorder(border);
        panel.setPreferredSize(new Dimension(100, 100));
        panel2.setBorder(border2);
        panel2.setPreferredSize(new Dimension(100, 100));
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(panel);
        contentPane.add(panel2);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
        if (border == border2)
            System.out.println("bevel borders are shared");
        else
            System.out.println("bevel borders are NOT shared");
    }
}
