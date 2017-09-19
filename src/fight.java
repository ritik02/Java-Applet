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
import java.io.IOException;
import java.util.Random;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fight extends Applet implements Runnable, KeyListener {
	 String ss = "", sss = "", ss1 = "",sss1="";
        int p1lose=0,p2lose=0;
	 int i = 210, j = 548,i1=210,j1=0,ins=0;
	 int oi = 0, oj = 0;
	int count = 0, p1 = 0,p2=0, ki, kj, pi = 0, pj = 0, q = 0;


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
			case KeyEvent.VK_A:

			ss1 = "a";

			break;
		case KeyEvent.VK_D:

			ss1 = "d";

			break;
		case KeyEvent.VK_F:

			sss1 = "fi";

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
          ss = ""; sss = ""; ss1 = "";sss1="";
	 i = 210; j = 548;i1=210;j1=0;ins=0;
	 oi = 0; oj = 0;
	 count = 0; p1 = 0;  pi = 0;pj = 0; q = 0;
         p1lose=0;
         p2lose=0;
         p2=0;
		setSize(600, 600);
		setBounds(0,0, 600, 600);



		oi = i+60;
		oj = j-30;
		p1 = 0;
                p2=0;
		ki = 0;
		kj = 0;
		addKeyListener(this);
		requestFocus();
		Thread t = new Thread(this);
		try{Thread.sleep(500);}
		catch(Exception e)
		{

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
             if(ins==0)
            {
                Font ff=new Font("Arial",Font.BOLD,20);
                    g.setFont(ff);
                    g.drawString("!!Instructions:!!",300,100);
                    g.drawString("Use \"Left\" And \"Right\" and \"Space\"   Keys For Player 1 ",0,140);
                    g.drawString("Use \"A\" and \"D\" and \"F\" Keys For Player 2",0,170);
                    g.drawString("Prevent the Ball from Going behind you ..each oh you have 10 LIVES!",0,200);
             try{   Thread.sleep(7000);
                    ins=1;
             }
             catch(Exception e)
             {

             }
            }
            else {

		pi = 0;
		q = 0;
		pj = 0;
		requestFocus();
                if(p2lose>=10)
{
Font f=new Font("Arial",Font.BOLD,30);
g.setFont(f);
g.drawString("P2 YOU LOST ",300,300);
try{Thread.sleep(2000);}
catch(Exception e)
{

}
stop();
destroy();
init();
}
if(p1lose>=10)
{Font f=new Font("Arial",Font.BOLD,30);
g.setFont(f);
g.drawString("P1 YOU LOST ",300,300);
try{Thread.sleep(2000);}
catch(Exception e)
{

}
stop();
destroy();
init();

}

	ImageIcon ic=new ImageIcon("rect.png");
	Image im=ic.getImage();
		g.drawImage(im,i, j, 150, 30,null);
		ImageIcon ic1=new ImageIcon("rect.png");
	Image im1=ic1.getImage();
		g.drawImage(im1,i1, j1, 150, 30,null);

		oi += ki;
		oj += kj;
		g.setColor(Color.orange);
		g.fillOval(oi, oj, 30, 30);
		if (ss.equals("l")) {

				i -= 8;

			} else if (ss.equals("r")) {

				i += 8;
			}
			if ((ss.equals("l") || ss.equals("r")) && p1 == 0) {
				oi = i+60;
				oj = j-30;
			}
			if (sss.equals("f") && p1 == 0) {
				p1 = 1;p2=1;
				ki = 1;
				kj = -5;
                                sss="";

			}

			if (ss1.equals("a")) {

				i1 -= 8;

			} else if (ss1.equals("d")) {

				i1 += 8;
			}
                if ((ss1.equals("a") || ss1.equals("d")) && p2 == 0) {
				oi = i1+60;
				oj = j1+30;
			}

			if (sss1.equals("fi") && p2 == 0) {
				p2 = 1;p1=1;
				ki = 1;
				kj = -5;

			}

			if (((oi+15 ) >= 585 ) || ((oi -15) <= 0 ))// left
																				// and
																				// right
																				// walls
			{

				ki = -ki;
			} else if (((oi-15) >= i && (oi-15) <= (i + 150) && (oj+15) >= j)
					|| ((oi + 10) >= i && (oi + 10) <= (i + 150) && (oj+15) >= j)||((oi) >= i && (oi) <= (i + 150) && (oj+15) >= j)
					&& p1 != 0)// firse rect pe aa jaye
			{
				if (oi <= (i + 75)) {
					if (oi <= (i + 15))
						ki-= 4;
					else if (oi > (i + 15) && oi <= (i + 30))
						ki -= 3;
					else if (oi > (i + 30) && oi <= (i + 45))
						ki -= 2;
					else if (oi > (i + 60) && oi <= (i + 75))
						ki -= 1;

				} else if (oi > (i + 75)) {
					if (oi > (i + 75) && oi <= (i + 90))
						ki += 1;
					else if (oi > (i + 90) && oi <= (i + 105))
						ki += 2;
					else if (oi > (i + 105) && oi <= (i + 120))
						ki += 3;
					else if (oi > (i + 120) && oi <= (i + 135))
						ki += 4;
						else if (oi > (i + 135) && oi <= (i + 150))
						ki += 5;
				}

				kj = -kj;
			}
			 else if (((oi-15) >= i1 && (oi-15) <= (i1 + 150) && (oj-15) <= j1)
					|| ((oi + 10) >= i1 && (oi + 10) <= (i1 + 150) && (oj-15) <= j1)||((oi) >= i1 && (oi) <= (i1 + 150) && (oj-15) <= j1)
					&&p2!=0)// firse rect pe aa jaye
			{
				if (oi <= (i1 + 75)) {
					if (oi <= (i1 + 15))
						ki-= 4;
					else if (oi > (i1 + 15) && oi <= (i1 + 30))
						ki -= 3;
					else if (oi > (i1 + 30) && oi <= (i1 + 45))
						ki -= 2;
					else if (oi > (i + 60) && oi <= (i1 + 75))
						ki -= 1;

				} else if (oi > (i1 + 75)) {
					if (oi > (i1 + 75) && oi <= (i1 + 90))
						ki += 1;
					else if (oi > (i1 + 90) && oi <= (i1 + 105))
						ki += 2;
					else if (oi > (i1 + 105) && oi <= (i1 + 120))
						ki += 3;
					else if (oi > (i1 + 120) && oi <= (i1 + 135))
						ki += 4;
						else if (oi > (i1 + 135) && oi <= (i1 + 150))
						ki += 5;
				}

				kj = -kj;
			}
			if (oj >= 620) {
				count = 1;
			}

			if (i <= 0)
				i = 0;
			else if (i + 150 >= 599)
				i = 450;
				if (i1 <= 0)
				i1 = 0;
			else if (i1 + 150 >= 599)
				i1 = 450;
setBackground(Color.black);

setForeground(Color.white);
g.setFont(new Font("Arial",Font.PLAIN,13));
g.drawString("P1: "+(10-p1lose)+" lives||P2: "+(10-p2lose)+" lives",250,300);
if((oj)>(620))
{

p2lose++;
ki=0;
kj=0;
oi = i+60;
		oj = j-30;p1=0;
sss="";
}
if((oj)<=(0))
{
p1lose++;
ki=0;
kj=0;
oi = i1+60;
		oj = j1+30;p2=0;sss1="";

}



}
        }
}