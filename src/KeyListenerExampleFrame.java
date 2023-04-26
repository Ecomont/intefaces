import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
public class KeyListenerExampleFrame extends JFrame implements KeyListener, MouseListener {
    JLabel label1;
    KeyListenerExampleFrame(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Working with Key and Mouse Listeners");
        this.setSize(500,500);
        this.setLayout(null);
        setVisible(true);
        label1= new JLabel();
        label1.setSize(100,100);
        label1.setBackground(Color.BLUE);
        label1.setOpaque(true);
        add(label1);
        ImageIcon icon= new ImageIcon();

//add key and mouse listeners to the elements
        this.addKeyListener(this);
        label1.addMouseListener(this);


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int x=label1.getX();
        int y= label1.getY();
        switch (e.getKeyCode()){
            case KeyEvent.VK_UP:
                y-=10;
                break;
            case KeyEvent.VK_DOWN:
                y+=10;
                break;

            case KeyEvent.VK_LEFT:
                x-=10;
                break;
            case KeyEvent.VK_RIGHT:
                x+=10;
                break;
            case KeyEvent.VK_W:
                y-=10;
                break;
            case KeyEvent.VK_S:
                y+=10;
                break;

            case KeyEvent.VK_A:
                x-=10;
                break;
            case KeyEvent.VK_D:
                x+=10;
                break;

        }
        label1.setLocation(x,y);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource()==label1){
            label1.setBackground(Color.black);

        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource()==label1){
            label1.setBackground(Color.CYAN);

        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource()==label1){
            label1.setBackground(Color.GRAY);

        }
    }
    //Override necessary methods for the interfaces here
//make the label move as you move the arrow keys on the keyboard. Use e.getKeyCode()method of the event.
    //make the label change the color when a mouse enters and go to the original color when the mouse exits an element.
//make a label move after a mouse, you may use e.getX(), e.getY(),e.getXOnScreen()and e.getYOnScreen() methods.
    // set an icon to the label using the class ImageIcon which let create a icon with an operator icon = new ImageIcon(filename), place a file in a src folder.
    public static void main(String[] args) {
        new KeyListenerExampleFrame();
    }
}