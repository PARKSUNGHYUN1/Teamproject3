import java.awt.event.*;
import javax.swing.*;
/**
 * 여기에 MyHellowPanelListener 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHellowPanelListener extends JPanel implements MouseListener, KeyListener
{
    JLabel ml = new JLabel("HELLO");
    
    public MyHellowPanelListener(){
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
