
import javax.swing.*;
import java.awt.*;
/**
 * 여기에 MyHellowFrame 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyHellowFrame extends JFrame
{
    public MyHellowFrame()
    {
        this.setSize(300, 300);
        this.setTitle("실습_3(2019.11.11)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MyHellowPanelListener mp = new MyHellowPanelListener();
        this.add(mp);
        mp.setFocusable(true);
        mp.requestFocus();
        mp.addMouseListener(mp);
        mp.addKeyListener(mp);
        setVisible(true);
    }
}
