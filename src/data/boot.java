package data;

/**
 * Created by Kristian on 04/05/2015.
 */
public class boot {
    public boot() throws InterruptedException {
        logic Logic = new logic();
        gui.graphics grp = new gui.graphics();

        grp.test(200, 100);

        while (true) {
            grp.updateTime(Logic.currentTime());
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new boot();
    }
}
