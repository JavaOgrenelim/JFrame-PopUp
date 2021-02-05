import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main {
    public static void init_interface() {
        JOptionPane jpanel = new JOptionPane();
        JFrame jf = new JFrame();
        jf.setVisible(true);
        jf.setTitle("JFrame Pop-Up");
        jf.setSize(500, 700);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon icon = new ImageIcon("D:\\favicon.png");
        jf.setIconImage(icon.getImage());
        JButton jb = new JButton("Merhaba");
        jb.setBounds(290, 50, 150, 20);
        jb.setSize(120, 150);
        jf.setLayout(null);
        jb.setBackground(Color.black);
        jb.setForeground(Color.white);
        JTextField jt = new JTextField();
         jb.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                jt.setBackground(Color.pink);
                jt.setCursor(Cursor.getDefaultCursor());
                String name = JOptionPane.showInputDialog(jf, "İsminiz nedir?", null);
                JOptionPane.showMessageDialog(jf, "İsminiz: " + " " + name);

             }

         });
        jf.add(jb);
    }

    public static void main(String[] args) {
        init_interface();
    }
}
