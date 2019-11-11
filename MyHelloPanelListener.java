import java.awt.event.*;
import javax.swing.*;
/**
 *  MyHellowPanelListener클래스는 JPanel이며 MouseListener와 KeyListener의 역할을 한다.
 * 
 * @author (2017605038 스피뎅 크릴, 2018315031 박성현) 
 * @version (2019.11.11)
 */
public class MyHelloPanelListener extends JPanel implements MouseListener, KeyListener
{
    JLabel ml = new JLabel("HELLO");

    public MyHelloPanelListener(){
        this.add(ml);
    }

    public void mouseClicked(MouseEvent e){
        JPanel mp = (JPanel)e.getSource();
        int x = e.getX();
        int y = e.getY();
        ml.setLocation(x,y);
    }

    public void mouseEntered(MouseEvent e){   
    }

    public void mouseExited(MouseEvent e){   
    }

    public void mousePressed(MouseEvent e){   
    }

    public void mouseReleased(MouseEvent e){   
    }

    public void keyPressed(KeyEvent e){
        int x = ml.getX();
        int y = ml.getY();
        if ((e.getKeyCode()) == (e.VK_RIGHT)){
            ml.setLocation((x+10), y);
        }
        else if ((e.getKeyCode()) == (e.VK_DOWN)){
            ml.setLocation(x, (y+10));
        }
        else if ((e.getKeyCode()) == (e.VK_LEFT)){
            ml.setLocation((x-10), y);
        }
        else if ((e.getKeyCode()) == (e.VK_UP)){
            ml.setLocation(x, (y-10));
        }
    }

    public void keyReleased(KeyEvent e){}

    public void keyTyped(KeyEvent e){}

}
