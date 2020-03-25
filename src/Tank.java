import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * @author chengxu
 * @version 1.0.0
 * @Description TODO
 * @ClassName Tank.java
 * @createTime 2020年03月25日 22:46:00
 */
public class Tank {
    private int x, y;
    private Dir dir;
    private boolean bL, bR, bU, bD;
    private static final int SPEED = 5;

    public Tank(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, 50, 50);

        move();
    }


    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_LEFT:
                bL = true;
                break;
            case KeyEvent.VK_RIGHT:
                bR = true;
                break;
            case KeyEvent.VK_UP:
                bU = true;
                break;
            case KeyEvent.VK_DOWN:
                bD = true;
                break;
        }

        setMainDir();
    }

    private void setMainDir() {
        if (!bL && !bR && !bU && !bD) {
            dir = Dir.STOP;
        }
        if (bL && !bR && !bU && !bD) {
            dir = Dir.L;
        }
        if (!bL && bR && !bU && !bD) {
            dir = Dir.R;
        }
        if (!bL && !bR && bU && !bD) {
            dir = Dir.U;
        }
        if (!bL && !bR && !bU && bD) {
            dir = Dir.D;
        }

    }

    private void move() {
        switch (dir) {
            case L:
                x -= SPEED;
                break;
            case R:
                x += SPEED;
                break;
            case U:
                y -= SPEED;
                break;
            case D:
                y += SPEED;
                break;
        }
    }


    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_LEFT:
                bL = false;
                break;
            case KeyEvent.VK_RIGHT:
                bR = false;
                break;
            case KeyEvent.VK_UP:
                bU = false;
                break;
            case KeyEvent.VK_DOWN:
                bD = false;
                break;
        }

        setMainDir();
    }
}
