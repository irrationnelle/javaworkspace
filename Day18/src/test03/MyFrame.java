package test03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by student on 2016-09-21.
 */
public class MyFrame extends JFrame {
    private JPanel panel = new JPanel();

    public MyFrame() {
        panel.setBackground(Color.PINK);

        MyMouseListener listener = new MyMouseListener();
        panel.addMouseListener(listener);
        panel.addMouseMotionListener(listener);
        add(panel);

        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Click!"+e.getClickCount());
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("들어옴");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("나감");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            System.out.println("Drag!");

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            System.out.println("Moved!"+e.getPoint());

        }
    }
}
