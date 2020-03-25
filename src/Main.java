/**
 * @author chengxu
 * @version 1.0.0
 * @Description TODO
 * @ClassName Main.java
 * @createTime 2020年03月25日 20:35:00
 */
public class Main {
    public static void main(String[] args) {
        TankFrame tf = new TankFrame();
        tf.setVisible(true);

        for (; ; ) {
            try {
                //TimeUnit.MICROSECONDS.sleep(500);
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            tf.repaint();
        }
    }
}
