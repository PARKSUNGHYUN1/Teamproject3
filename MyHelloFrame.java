
import javax.swing.*;
import java.awt.*;
/**
 * MyHellowFrame 클래스는 JFrame이며 MyHelloPanelListener객체를 생성한다.
 * 
 * @author (2017605038 스피뎅 크릴, 2018315031 박성현) 
 * @version (2019.11.11)
 */
public class MyHelloFrame extends JFrame
{
    public MyHelloFrame()
    {
        this.setSize(300, 300);
        this.setTitle("실습_3(2019.11.11)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyHelloPanelListener mp = new MyHelloPanelListener();
        this.add(mp);
        mp.setFocusable(true);
        mp.requestFocus();
        mp.addMouseListener(mp);
        mp.addKeyListener(mp);
        setVisible(true);
    }
}
