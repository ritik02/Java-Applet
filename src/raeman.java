
import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;

public class raeman extends Applet implements Runnable, KeyListener {

    static int j = 40, ud = 360, move1 = 1700, move2 = 2000, choice, jump = 0,
            start = 0, set = 1, ins = 0;
    static Integer count = 0, hit = 0;
    Thread t;
    Graphics g;
    Dimension dim;
    static int screen = 900, screen1 = 0;
    Random r = new Random();
    static int randommove = 1900, rmove1 = 1750, rmove2 = 1900, rmove3 = 2000, slow = 0;

    @Override
    public void init() {
        // TODO Auto-generated method stub
        super.init();
        j = 40;
        ud = 360;
        move1 = 1700;
        move2 = 2000;
        jump = 0;
        start = 0;
        set = 1;
        ins = 0;
        count = 0;
        hit = 0;

        screen = 900;
        screen1 = 0;
        r = new Random();
        randommove = 1900;
        rmove1 = 1750;
        rmove2 = 1900;
        rmove3 = 2000;
        slow = 0;
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(dim);
        addKeyListener(this);
        t = new Thread(this);
        t.start();

    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        super.start();
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        super.stop();
    }

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        this.g = g;
        




            if (start == 0) {
                if (hit == 0) {
                    if (rmove1 <= 0) {
                        rmove1 = 2500 + r.nextInt(300);
                    }
                    if (rmove2 <= 0) {
                        rmove2 = 2300 + r.nextInt(300);
                    }
                    if (rmove3 <= 0) {
                        rmove3 = 3000 + r.nextInt(1300);
                    }
                    if (randommove <= 0) {
                        randommove = 1700 + r.nextInt(300);
                    }
                    if (move1 <= -40) {
                        move1 = 1700;
                    }
                    if (move2 <= 0) {
                        move2 = 540;
                    }
                    if (screen1 <= -1400) {
                        screen1 = 0;

                    }
                    double k = Math.sqrt((randommove - move1)
                            * (randommove - move1));
                    if (k >= 0 && k <= 80) {
                        randommove -= 100;
                        move1 += 100;
                    }

                    Dimension appletSize = this.getSize();
                    int appletHeight = appletSize.height;
                    int appletWidth = appletSize.width;
                    ImageIcon im = new ImageIcon("tree.png");
                    Image tree = im.getImage();
                    ImageIcon im1 = new ImageIcon("bg2.jpg");
                    Image bg2 = im1.getImage();
                    ImageIcon im2 = new ImageIcon("raybg.jpg");
                    Image bg1 = im2.getImage();

                    g.drawImage(bg1, 0, 0, 1700, 480, this);
                    ImageIcon im3 = new ImageIcon("char.png");
                    Image char1 = im3.getImage();
                    ImageIcon im4 = new ImageIcon("char jump.png");
                    Image charjump = im4.getImage();

                    g.drawImage(bg2, screen1, 480, 3000, 450, this);
                    g.drawImage(tree, randommove, 420, 40, 60, this);
                    g.drawImage(tree, move1, 420, 40, 60, this);
                    g.drawImage(tree, rmove1, 420, 40, 60, this);

                    // g.drawImage(tree,rmove1,210,20,40,this);
                    if (choice == 0) {
                        g.drawImage(char1, j, ud, 60, 120, this);
                    }
                    // g.drawRect(move2, 210, 40, 40);
                    // g.drawRect(randommove, 210, 20, 40);
                    // g.drawRect(move1, 210, 40, 40);
                    // g.drawRect(rmove1, 210, 20, 40);
                    g.drawString(count.toString(), 360, 10);
                    g.drawString(hit.toString(), 400, 40);
                    if (count > 1000) {
                        g.drawImage(tree, rmove2, 420, 40, 60, this);
                    }
                    if (count > 1500) {
                        g.drawImage(tree, rmove3, 420, 40, 60, this);
                    }
                    if (choice == 3) {
                        jump++;
                        if (jump <= 40) {
                            ud -= 4;
                        } else if (jump > 40 && jump <= 80) {
                            ud += 4;
                        } else {
                            jump = 0;
                            choice = 0;
                        }
                        if (slow == 1) {
                            try {
                                Thread.sleep(20);
                                slow = 0;
                            } catch (InterruptedException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }

                        }
                        g.drawImage(charjump, j, ud, 60, 120, this);
                        try {
                            Thread.sleep(5);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        if ((move1 >= 45 && move1 <= (100)) && (ud >= 300)) {

                            hit++;

                        }

                        if (rmove1 >= 45 && rmove1 <= (100)
                                && ud >= 300) {

                            hit++;

                        }
                        if (rmove2 >= 45 && rmove2 <= (100)
                                && ud >= 300 && count >= 1000) {

                            hit++;

                        }
                        if (rmove3 >= 45 && rmove3 <= (100)
                                && ud >= 300 && count >= 1500) {

                            hit++;

                        }
                        if (randommove >= 45 && randommove <= (100)
                                && ud >= 300) {

                            hit++;

                        }
                        // showStatus("cool");
                        repaint();
                    } else {
                        if ((move1 >= 43 && move1 <= (100))) {

                            hit++;

                        }

                        if (rmove1 >= 43 && rmove1 <= (100)) {

                            hit++;

                        }
                        if (rmove2 >= 43 && rmove2 <= (100) && count >= 1000) {

                            hit++;

                        }
                        if (rmove3 >= 43 && rmove3 <= (100) && count >= 1500) {

                            hit++;

                        }
                        if (randommove >= 43 && randommove <= (100)) {

                            hit++;

                        }
                       
                    }

                } else {
                    Font f = new Font("Arial", Font.BOLD, 30);
                    g.setFont(f);
                    setForeground(Color.black);
                    g.drawString(bean.names + "....you lost " + "/your score was:::" + count, 250,
                            450);
                    try {
                        Thread.sleep(5000);

                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    stop();
                    destroy();
                    init();

                }
               
                    g.setFont(new Font("Arial",Font.BOLD,20));
g.drawString("PRess Space to Jump",600,300);

            
        }
    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        // TODO Auto-generated method stub

        int k = arg0.getKeyCode();
        switch (k) {
            // case KeyEvent.VK_RIGHT:
            // j += 10;
            //
            // break;
            // case KeyEvent.VK_LEFT:
            // j -= 10;
            // break;
            case KeyEvent.VK_SPACE:

                choice = 3;

                break;
            case KeyEvent.VK_X:
                slow = 1;
                break;

        }
        // repaint();
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        while (true) {
            try {
                if (start == 0) {
                    move1 -= 5;
                    move2 -= 2;
                    randommove -= 5;
                    rmove1 -= 8;
                    count += 1;
                    screen1 -= 0;
                    rmove2 -= 10;
                    rmove3 -= 15;
                    if (count >= 1000) {
                        move1 -= 2;
                        randommove -= 2;
                    }
                    if (count >= 1500) {
                        move1 = -2;
                        randommove = -2;
                    }
                    Thread.sleep(25);
                    repaint();
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
