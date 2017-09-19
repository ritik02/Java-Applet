
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.applet.*;
import java.awt.Font;
import java.io.IOException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class arakanoid extends Applet implements Runnable, KeyListener {

    static String ss = "", sss = "", ss1 = "";
    static int i = 210, j = 548, ins = 0,lives=0;
    static int oi = 0, oj = 0;
    static int count = 0, p = 0, ki, kj, pi = 0, pj = 0, q = 0;
    Random r = new Random();
    int a[][] = {
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
                repaint();

            } catch (Exception e) {
            }

        }
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent k) {

        int key = k.getKeyCode();
        switch (key) {

            case KeyEvent.VK_LEFT:

                ss = "l";

                break;
            case KeyEvent.VK_RIGHT:

                ss = "r";

                break;
            case KeyEvent.VK_SPACE:

                sss = "f";

                break;

        }
        repaint();
        // TODO Auto-generated method stub

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
    public void init() {
        ss = "";
        sss = "";
        ss1 = "";
        i = 210;
        j = 548;
        ins = 0;
        oi = 0;
        oj = 0;
        count = 0;
        p = 0;
        pi = 0;
        pj = 0;
        q = 0;
lives=0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 20; j++) {
                a[i][j] = 0;
            }
        }
        setSize(600, 600);
        setBounds(0, 0, 600, 600);



        oi = i + 60;
        oj = j - 30;
        p = 0;
        ki = 0;
        kj = 0;
        addKeyListener(this);
        requestFocus();
        Thread t = new Thread(this);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        t.start(); // TODO Auto-generated method stub
        super.init();
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        super.start();
    }

    @Override
    public void paint(Graphics g) {
        if (ins == 0) {
            Font ff = new Font("Arial", Font.BOLD, 20);
            g.setFont(ff);
            g.drawString("!!Instructions:!!", 300, 100);
            g.drawString("Use \"Left\" And \"Right\" Arrow Keys for Controlling the Shooter ", 0, 140);
            g.drawString("Shoot the BALL with \"Space\"", 0, 170);
            g.drawString("Prevent the Ball from Falling down ..3 LIVES and shoot all the PEGS!!", 0, 200);
            try {
                Thread.sleep(7000);
                ins = 1;
            } catch (Exception e) {
            }
        } else {
            pi = 0;
            q = 0;
            pj = 0;
            requestFocus();

            ImageIcon ic = new ImageIcon("rect.png");
            Image im = ic.getImage();

            g.drawImage(im, i, j, 150, 30, null);

            oi += ki;
            oj += kj;
            g.setColor(Color.orange);
            g.fillOval(oi, oj, 30, 30);


            if (count == 0) {
                for (int i = 0; i <= 3; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (a[i][j] == 0) {
                            q = 1;
                            break;
                        }
                    }
                }
                if (q == 0) {
                    count = 2;
                }
                for (int ii = 0; ii <= 90; ii += 30) {
                    for (int jj = 0; jj < 600; jj += 30) {
                        if (a[pi][pj] == 0) {
                            if ((oj - 15) < (ii + 30) && oi >= jj && oi <= (jj + 30))/* strike lower wall of block */ {
                                kj = -kj;
                                a[pi][pj] = 1;
                                break;

                            }
                            if ((oj + 15) == ii && oi >= jj && oi <= (jj + 30))/* strike upper wall of block */ {
                                kj = -kj;
                                a[pi][pj] = 1;
                                break;

                            }
                            if ((oi + 15) >= jj && (oi + 15) <= (jj + 30) && oj <= (ii + 30) && oj >= (ii))/* strike right lower wall of block */ {

                                ki = -ki;
                                a[pi][pj] = 1;
                                break;
                            }
                            if ((oi - 15) <= (jj + 30) && (oi - 15) >= (jj) && oj <= (ii + 30) && oj >= (ii))/* strike left wall of block */ {
                                ki = -ki;
                                a[pi][pj] = 1;
                                break;
                            }
                        }

                        pj++;

                    }
                    pi++;
                    pj = 0;
                }
                pi = 0;
                pj = 0;

                for (int ii = 0; ii <= 90; ii += 30) {
                    for (int jj = 0; jj < 600; jj += 30) {
                        if (a[pi][pj] == 0) {
                            g.setColor(Color.green);
                            g.drawRect(jj, ii, 30, 30);
                        }
                        pj++;

                    }
                    pi++;
                    pj = 0;

                }

                if (ss.equals("l")) {

                    i -= 10;

                } else if (ss.equals("r")) {

                    i += 10;
                }
                if ((ss.equals("l") || ss.equals("r")) && p == 0) {
                    oi = i + 60;
                    oj = j - 30;
                }
                if (sss.equals("f") && p == 0) {
                    p = 1;
                    ki = 1;
                    kj = -5;

                }

                if (((oi + 15) >= 585 && oj <= 590) || ((oi - 15) <= 0 && oj <= 590))// left
                // and
                // right
                // walls
                {

                    ki = -ki;
                } else if (((oi - 15) >= i && (oi - 15) <= (i + 150) && (oj + 15) >= j)
                        || ((oi + 10) >= i && (oi + 10) <= (i + 150) && (oj + 15) >= j) || ((oi) >= i && (oi) <= (i + 150) && (oj + 15) >= j)
                        && p != 0)// firse rect pe aa jaye
                {
                    if (oi <= (i + 75)) {
                        if (oi <= (i + 15)) {
                            ki -= 4;
                        } else if (oi > (i + 15) && oi <= (i + 30)) {
                            ki -= 3;
                        } else if (oi > (i + 30) && oi <= (i + 45)) {
                            ki -= 2;
                        } else if (oi > (i + 60) && oi <= (i + 75)) {
                            ki -= 1;
                        }

                    } else if (oi > (i + 75)) {
                        if (oi > (i + 75) && oi <= (i + 90)) {
                            ki += 1;
                        } else if (oi > (i + 90) && oi <= (i + 105)) {
                            ki += 2;
                        } else if (oi > (i + 105) && oi <= (i + 120)) {
                            ki += 3;
                        } else if (oi > (i + 120) && oi <= (i + 135)) {
                            ki += 4;
                        } else if (oi > (i + 135) && oi <= (i + 150)) {
                            ki += 5;
                        }
                    }

                    kj = -kj;
                } else if (oj <= 0)// upper wall
                {

                    kj = -kj;
                }
                if (oj >= 620) {
                    count = 1;

                }

                if (i <= 0) {
                    i = 0;
                } else if (i + 150 >= 599) {
                    i = 450;
                }


            } else if (count == 1) {
                lives++;
                sss="";
                ki=0;
                kj=0;
                oi=i+70;
                oj=j-30;
                p=0;
                count=0;
              
                if(lives>=3)
                { Font ff = new Font("Arial", Font.BOLD, 30);
                g.setFont(ff);
                g.drawString(bean.names + " You Lost", 210, 240);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                stop();
                destroy();
                init();}

                // TODO Auto-generated method stu
            } else {
                Font ff = new Font("Arial", Font.BOLD, 30);
                g.setFont(ff);
                g.drawString(bean.names + " you WON", 210, 240);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                stop();
                destroy();
                init();
            }
            //super.paint(g);ImageIcon icc=new ImageIcon("back.png");
            //Image imm=icc.getImage();
            //g.drawImage(imm,0, 0, 600,600,null);
            setBackground(Color.black);
              setForeground(Color.white);
g.setFont(new Font("Arial",Font.PLAIN,13));
g.drawString("Lives Remaining : "+(3-lives),240,300);
        }
    }
    // public static void main(String args[]) throws IOException
    // {
    // JFrame frame=new JFrame("Test");
    //
    // JPanel panel=new JPanel(new BorderLayout());
    // JApplet
    // applet=new gui7();
    // //Runtime.getRuntime().exec("start C:\\Users\\SURESH\\Desktop\\java\\newhtml.html");
    // panel.add(applet,BorderLayout.CENTER);
    // panel.setVisible(true);
    // panel.setSize(400,400);
    // frame.getContentPane().add(applet);
    // applet.setVisible(true);
    // //frame.pack();
    // frame.setVisible(true);
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //
    // }
    //
}
