import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

public class spongebob extends Applet implements KeyListener, Runnable {
	static int i = 0, j = 540, fi = 0, fj = 0, p = 0, pj = 0,exit=0,s=0,d=0,pf=0,p1=0,pj1=0,pf1=0,p2=0,pf2=0,pj2=0,p3=0,pf3=0,pj3=0;
	String ss = "", f = "", sss = "";
	Random r = new Random();
	static int speed=15;
	static int count=0,count1=0,count2=0,exit1=0,exit2=0,count3=0,ins=0;
	static int score=0;
static int jump=0;
@Override
	public void init() {
    i = 0; j = 540; fi = 0; fj = 0; p = 0; pj = 0;exit=0;s=0;d=0;pf=0;p1=0;pj1=0;pf1=0;p2=0;pf2=0;pj2=0;p3=0;pf3=0;pj3=0;
	 ss = ""; f = ""; sss = "";
	 r = new Random();
	speed=15;
	 count=0;count1=0;count2=0;exit1=0;exit2=0;count3=0;ins=0;
	 score=0;
 jump=0;
		p = 20 + r.nextInt(500);
		p1 = 20 + r.nextInt(500);
		p2= 20 + r.nextInt(500);
		p3= 20 + r.nextInt(500);
		setSize(600, 600);
	 pf=1+r.nextInt(3);
	  pf1=1+r.nextInt(3);
	   pf2=1+r.nextInt(3);
	    pf3=1+r.nextInt(3);
		// TODO Auto-generated method stub
		addKeyListener(this);
		// requestFocus();

		Thread t = new Thread(this);
		t.start();
		// TODO Auto-generated method stub
		super.init();
	}
	@Override
	public void keyPressed(KeyEvent k) {
		int key = k.getKeyCode();
		switch (key) {

		case KeyEvent.VK_LEFT:

			ss = "2";
			repaint();
			break;
		case KeyEvent.VK_RIGHT:

			ss = "1";
			repaint();
			break;
		case KeyEvent.VK_SPACE:

			sss = "5";
			repaint();
			break;

		}
		repaint();
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}



	@Override
	public void run() {
		while (true) {
			try {

				Thread.sleep(speed);
				repaint();

			} catch (Exception e) {

			}
		}
		// TODO Auto-generated method stub

	}


	@Override
	public void paint(Graphics g) {
   if(ins==0)
            {
                Font ff=new Font("Arial",Font.BOLD,20);
                    g.setFont(ff);
                    g.drawString("!!Instructions:!!",300,100);
                    g.drawString("Use  Arrow Keys for Controlling SQUIDWARD ",0,140);
                    g.drawString("Shoot The SPONGEBOB With \"Space\" Key",0,170);
                    g.drawString("Dont Shoot PAttrick.. and Stay Away from SPONGEBOB!",0,200);
             try{   Thread.sleep(7000);
                    ins=1;
             }
             catch(Exception e)
             {

             }
            }
            else {





		if(((i)>=p&&(i)<=(p+60)&&((pj+60)>=549))||((i+60)>=p&&(i+60)<=(p+60)&&((pj+60)>=549)))
		{
		exit=1;
		g.setColor(Color.black);
		Font ff=new Font("Arial",Font.BOLD,30);
		    g.setFont(ff);
		g.drawString(bean.names+" ..Your Score is "+score,230,100);
		try{Thread.sleep(1000);}
		catch(Exception e)
		{

		}
                stop();
                destroy();

		init();
		}
		if(((i)>=p1&&(i)<=(p1+60)&&((pj1+60)>=549))||((i+60)>=p1&&(i+60)<=(p1+60)&&((pj1+60)>=549)))
		{
		exit1=1;
		g.setColor(Color.black);
		Font ff=new Font("Arial",Font.BOLD,30);
		    g.setFont(ff);
		g.drawString(bean.names+" Your Score is "+score,230,100);
		try{Thread.sleep(1000);}
		catch(Exception e)
		{

		}
		stop();
                destroy();
                init();
		}
		if(((i)>=p2&&(i)<=(p2+60)&&((pj2+60)>=549))||((i+60)>=p2&&(i+60)<=(p2+60)&&((pj2+60)>=549)))
		{
		exit2=1;
		g.setColor(Color.black);
		Font f=new Font("Arial",Font.BOLD,30);
		    g.setFont(f);
		g.drawString(bean.names+" Your Score is "+score,230,100);
		try{Thread.sleep(1000);}
		catch(Exception e)
		{

		}
		stop();
                destroy();
                init();
		}
		if(((fi)>=p3&&(fi)<=(p3+60)&&(fj-15)<=(pj3+30))||((fi+15)>=p3&&(fi+15)<=(p3+60)&&(fj-15)<=(pj3+60)))
			{

		g.setColor(Color.black);
		Font ff=new Font("Arial",Font.BOLD,30);
		    g.setFont(ff);
		g.drawString(bean.names+" Your Score is "+score,230,100);
		setBackground(Color.white);
               try{ Thread.sleep(2000);}
               catch(InterruptedException e)
               {

               }
stop();
                destroy();
                init();
		//System.exit(0);
			}

		ImageIcon im=new ImageIcon("sea.jpg");
		Image backGround1=im.getImage();
		 g.drawImage(backGround1, 0, 0, 600, 600, null);
		 setForeground(Color.white);
		 Font ff=new Font("Arial",Font.BOLD,20);
		    g.setFont(ff);
		 g.drawString("Score: "+score,500,17);
		 ImageIcon im1=new ImageIcon("squid.png");
		 ImageIcon im5=new ImageIcon("pattrick.png");
			Image r1=im5.getImage();
				g.drawImage(r1,p3, pj3, 60,  60,null);
			pj3+=pf3;
		if (sss.equals("5")) {

			{
				f = "fire";
				fi = i;
				fj = j;
				sss = "";
			}
		}

		if (f.equals("fire")) {
			ImageIcon im3=new ImageIcon("bullet.png");
			fj-=2;
			Image r=im3.getImage();
			g.drawImage(r,fi, fj,  30, 30,null);


		}
		if(fj<=0)
		{
		fj=0;fi=0;f="";
		}

		if(((fi)>=p&&(fi)<=(p+60)&&(fj-15)<=(pj+30))||((fi+15)>=p&&(fi+15)<=(p+60)&&(fj-15)<=(pj+60)))
			{
			f="";
			fi=0;fj=0;	pf=1+r.nextInt(2);
			count=1;
			score++;
			if(score>=10)
			{
				speed-=1;
			}
			}
		if(count==0)
		{ImageIcon im2=new ImageIcon("sponge.png");
		Image r=im2.getImage();
			g.drawImage(r,p, pj, 60,  60,null);

			pj+=pf;
		}
		else
		{

			p = 20 + r.nextInt(530);
			pj = 0;	pf=1+r.nextInt(2);
			ImageIcon im2=new ImageIcon("sponge.png");
			Image r=im2.getImage();
				g.drawImage(r,p, pj, 60,  60,null);
			pj+=pf;count=0;

		}
		if(((fi)>=p1&&(fi)<=(p1+60)&&(fj-15)<=(pj1+30))||((fi+15)>=p1&&(fi+15)<=(p1+60)&&(fj-15)<=(pj1+60)))
			{
			f="";
			fi=0;fj=0;	pf1=1+r.nextInt(2);
			count1=1;
			score++;
			if(score>=10)
			{
				speed-=1;
			}
			}
		if(count1==0)
		{ImageIcon im2=new ImageIcon("sponge.png");
		Image r=im2.getImage();
			g.drawImage(r,p1, pj1, 60,  60,null);

			pj1+=pf1;
		}
		else
		{

			p1 = 20 + r.nextInt(530);
			pj1 = 0;	pf1=1+r.nextInt(2);
			ImageIcon im2=new ImageIcon("sponge.png");
			Image r=im2.getImage();
				g.drawImage(r,p1, pj1, 60,  60,null);
			pj1+=pf1;count1=0;

		}
		if(((fi)>=p2&&(fi)<=(p2+60)&&(fj-15)<=(pj2+30))||((fi+15)>=p2&&(fi+15)<=(p2+60)&&(fj-15)<=(pj2+60)))
			{
			f="";
			fi=0;fj=0;	pf2=1+r.nextInt(2);
			count2=1;
			score++;
			if(score>=10)
			{
				speed-=1;
			}
			}
		if(count2==0)
		{ImageIcon im2=new ImageIcon("sponge.png");
		Image r=im2.getImage();
			g.drawImage(r,p2, pj2, 60,  60,null);

			pj2+=pf2;
		}
		else
		{

			p2= 20 + r.nextInt(530);
			pj2 = 0;	pf2=1+r.nextInt(2);
			ImageIcon im2=new ImageIcon("sponge.png");
			Image r=im2.getImage();
				g.drawImage(r,p2, pj2, 60,  60,null);
			pj2+=pf2;count2=0;

		}

		if (pj >= 600) {
			p = 20 + r.nextInt(530);
			pj = 0;
			pf=1+r.nextInt(2);
		}
		if (pj1 >= 600) {
			p1 = 20 + r.nextInt(530);
			pj1 = 0;
			pf1=1+r.nextInt(2);
		}
		if (pj2 >= 600) {
			p2 = 20 + r.nextInt(530);
			pj2 = 0;
			pf2=1+r.nextInt(2);
		}
		if (pj3 >= 600) {
			p3 = 20 + r.nextInt(530);
			pj3 = 0;
			pf3=1+r.nextInt(2);
		}


		if (i >= 540)
			i = 540;
		if (j >= 600)
			j = 0;
		if (i <=0)
			i = 0;
		if (j < 0)
			j = 600;
		Image backGround2=im1.getImage();
		g.drawImage(backGround2, i, j, 60, 60, null);
		if (ss.equals("1")) {
			i += 2;
			// ImageIcon ic = new ImageIcon(getClass().getResource(
			// "images/b.jpg"));
			// Image i1 = ic.getImage();
			ImageIcon im2=new ImageIcon("squid.png");
			Image backGround=im2.getImage();
			g.drawImage(backGround, i, j, 60, 60, null);
			// g.drawRect(i, j, 20, 20);


		} else if (ss.equals("2")) {
			i -= 2;
			ImageIcon im2=new ImageIcon("squid.png");
			Image backGround=im2.getImage();
						g.drawImage(backGround, i, j, 60, 60, null);

		}



            }
		// TODO Auto-generated method stub
		//super.paint(g);
	}

}
