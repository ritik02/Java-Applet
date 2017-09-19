import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.text.GapContent;
import java.awt.*;
public class gui5 extends Applet implements KeyListener, Runnable {

	int x = 20;
	int y = 30;
	Thread t;
	static int i = 0, j = 0, a1 = 180, b1 = 420, a2 = 180, b2 = 360;
	static int a3 = 120, p = 0, b3 = 270, a4 = 420, b4 = 355,ins=0;

	static int a5 = 210, b5 = 390;

	String ss = "";
	int k = 0;
	String msg = "KEY EVENT --->";

	// @Override
	// public void run() {
	// if(k==0)
	// repaint();
	// // TODO Auto-generated method stub
	//
	// }
//	public static void main(String[]p) {
//	new gui5();
//
//	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(50);
				repaint();

			} catch (Exception e) {

			}

		}
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
             x = 20;
 y = 30;

	 i = 0; j = 0; a1 = 180; b1 = 420; a2 = 180; b2 = 360;
	 a3 = 120; p = 0; b3 = 270; a4 = 420; b4 = 355;ins=0;

	 a5 = 210; b5 = 390;

	 ss = "";
	 k = 0;
		setSize(700, 700);
		// TODO Auto-generated method stub
		addKeyListener(this);
		// requestFocus();
		Thread t = new Thread(this);
		t.start();

	}

	// @Override
	// public void start() {
	// t=new Thread();
	// t.start();
	// // TODO Auto-generated method stub
	// super.start();
	// }
	@Override
	public void keyPressed(KeyEvent k) {

		int key = k.getKeyCode();
		switch (key) {
		case KeyEvent.VK_UP:

			ss = "3";

			repaint();
			break;
		case KeyEvent.VK_DOWN:

			ss = "4";
			repaint();
			break;
		case KeyEvent.VK_LEFT:

			ss = "2";
			repaint();
			break;
		case KeyEvent.VK_RIGHT:

			ss = "1";
			repaint();
			break;
		}
		repaint();
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent k) {

		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent k) {
//		msg += k.getKeyChar();
//		repaint();
		// TODO Auto-generated method stub

	}

	@Override
	public void paint(Graphics g) {
             if(ins==0)
            {
                Font ff=new Font("Arial",Font.BOLD,20);
                    g.setFont(ff);
                    g.drawString("!!Instructions:!!",300,100);
                    g.drawString("Use  Arrow Keys for Controlling the Bomb ",0,140);
                    g.drawString("Dont let the BOMB touch the Spikes",0,170);
                    g.drawString("Reach The Finish to WIN!!",0,200);
             try{   Thread.sleep(7000);
                    ins=1;
             }
             catch(Exception e)
             {

             }
            }
            else {
ImageIcon im=new ImageIcon("water.jpg");
		Image backGround1 = im.getImage();
		g.drawImage(backGround1, 0, 0, 600, 600, null);
	ImageIcon im1=new ImageIcon("yo1.gif");
Image backGround2 = im1.getImage();
		g.drawImage(backGround2, i, j, 60, 60, null);

		if (p == 3) {
                    Font f=new Font("Arial",Font.BOLD,40);
			 g.setFont(f);
			g.drawString(bean.names+".....You WIn the Game", 210, 300);
                      try{  Thread.sleep(2000);}
                      catch(Exception e)
                      {

                      }
                        stop();destroy();init();
		}
		if (p == 1) {
                    Font f=new Font("Arial",Font.BOLD,40);
			 g.setFont(f);
			setForeground(Color.blue);
			g.drawString(bean.names+"...YOU LOST,try Again", 210, 300);
                         try{  Thread.sleep(2000);}
                      catch(Exception e)
                      {

                      }
                        stop();destroy();init();
		} else if (p == 0) {
			if (ss.equals("1")) {
				i += 6;
				// ImageIcon ic = new ImageIcon(getClass().getResource(
				// "images/b.jpg"));
				// Image i1 = ic.getImage();
				ImageIcon im2=new ImageIcon("yo1.gif");
Image backGround = im2.getImage();
				g.drawImage(backGround, i, j, 60, 60, null);
				// g.drawRect(i, j, 20, 20);

			} else if (ss.equals("2")) {
				i -= 6;
				ImageIcon im3=new ImageIcon("yo1.gif");
Image backGround = im3.getImage();
				g.drawImage(backGround, i, j, 60, 60, null);
			} else if (ss.equals("3")) {
				j -= 6;
				ImageIcon im4=new ImageIcon("yo1.gif");
Image backGround = im4.getImage();

				g.drawImage(backGround, i, j, 60, 60, null);

			} else if (ss.equals("4")) {
				j += 6;
				ImageIcon im5=new ImageIcon("yo1.gif");
Image backGround = im5.getImage();
				g.drawImage(backGround, i, j, 60, 60, null);
			}

			g.drawLine(90, 0, 90, a1);
			g.drawLine(90, b1, 90, 600);
			g.drawLine(180, 0, 180, a2);
			g.drawLine(180, b2, 180, 600);
			g.drawLine(270, 0, 270, a3);
			g.drawLine(270, b3, 270, a4);

			g.drawLine(270, b4, 270, 600);

			g.drawLine(360, 0, 360, a5);
			g.drawLine(480, 300, 600, 300);
			g.drawLine(480, 360, 600, 360);
			g.drawLine(360, b5, 360, 600);
			 Font f=new Font("Arial",Font.BOLD,40);
			 g.setFont(f);
			g.drawString("FINISH", 470, 345);
			if (j <= a1 && (i <= 90 && (i + 45) >= 90)) {

				p = 1;
				repaint();
			}
			if ((j + 45) >= b1 && (i <= 90 && (i + 45) >= 90)) {

				p = 1;
				repaint();
			}
			b1+=2;
			a1+=2;
			if (a1 == 300)
				a1 = 180;
			if (b1 == 540)
				b1 = 420;
			ss = "";
			if (j <= a2 && (i <= 180 && (i + 45) >= 180)) {

				p = 1;
				repaint();
			}
			if ((j + 45) >= b2 && (i <= 180 && (i + 45) >= 180)) {

				p = 1;
				repaint();
			}
			b2+=2;
			a2+=2;
			if (a2 == 300)
				a2 = 180;
			if (b2 == 480)
				b2 = 360;
			ss = "";
			if (j <= a3 && (i <= 270 && (i + 45) >= 270)) {

				p = 1;
				repaint();
			}
			if ((j + 45) >= b3 && j <= a4 && (i <= 270 && (i + 45) >= 270)) {

				p = 1;
				repaint();
			}
			b3 += 2;
			a3 += 2;
			if (a3 == 300)
				a3 = 120;
			if (b3 == 450)
				b3 = 270;
			if (j <= a4 && j >= b3 && (i <= 270 && (i +45) >= 270)) {

				p = 1;
				repaint();
			}
			if ((j + 45) >= b4 && (i <= 270 && (i + 45) >= 270)) {

				p = 1;
				repaint();
			}
			b4 += 3;
			a4 += 3;
			if (a4 == 600)
				a4 = 420;
			if (b4 == 735)
				b4 = 555;
			ss = "";

			if (j <= 45 && (i <= 360 && (i + 45) >= 360)) {

				p = 1;
				repaint();
			}
			if ((j + 45) >= b5 && (i <= 360 && (i + 45) >= 360)) {

				p = 1;
				repaint();
			}
			b5-=2;
			a5+=2;
			if (a5 == 300)
				a5 = 210;
			if (b5 == 300)
				b5 = 390;
			ss = "";
			if ((i) >= 480 && j >= 300 && (j + 45) <= 360) {
				p = 3;
				repaint();
			}
                }
			// TODO Auto-generated method stub
			super.paint(g);
		}
	}

	private Image getImage(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}

class BackGroundPanel extends Panel {
	Image backGround;

	BackGroundPanel() {

		super();
	}

	public void paint(Graphics g) {

		// get the size of this panel (which is the size of the applet),
		// and draw the image
		g.drawImage(getBackGroundImage(), 0, 0, (int) getBounds().getWidth(),
				(int) getBounds().getHeight(), this);
	}

	public void setBackGroundImage(Image backGround) {
		this.backGround = backGround;
	}

	private Image getBackGroundImage() {
		return backGround;
	}

}