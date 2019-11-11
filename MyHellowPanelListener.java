import java.awt.event.*;
import javax.swing.*;
/**
 * 여기에 MyHellowPanelListener 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHellowPanelListener extends JPanel implements MouseListener
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

}
