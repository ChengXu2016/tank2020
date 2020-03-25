import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author chengxu
 * @version 1.0.0
 * @Description TODO
 * @ClassName TankFrame.java
 * @createTime 2020年03月25日 20:33:00
 */
public class TankFrame extends Frame {

    private Tank myTank;
    private Tank enemy;

    public TankFrame() {
        this.setTitle("tank war");
        this.setLocation(400, 100);
        this.setSize(800, 600);

        this.addKeyListener(new TankKeyListener());

        myTank = new Tank(100, 100, Dir.R);
        enemy = new Tank(200, 200, Dir.D);
    }

    @Override
    public void paint(Graphics g) {
        myTank.paint(g);
        enemy.paint(g);
    }

    private class TankKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            myTank.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            myTank.keyReleased(e);
        }
    }
}
