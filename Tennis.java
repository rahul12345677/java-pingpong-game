package pingpong;

import java.applet.Applet;
import java.awt.event.KeyListener;

public class Tennis extends Applet implements Runnable, KeyListener{
	final int WIDTH=700 , HIGHT=500;
	Thread thread;
	HumanPaddle p1;
	AIPaddle p2;
	Ball b1;
	boolean gamestarted;
	Graphics gfx;
	Image img;
	public void init() {
		this.resize(WIDTH,HIGHT);
		gamestarted=false;
		p1=new HumamPaddle(1);
		p2=new AIPaddle(2,b1);
		img=createImage(WIDTH,HEIGHT);
		gfx=img.getGraphics();
		
		b1=new Ball(;)
		this.addKeyListener(this);
		
		thread = new Thread(this);
		thread.start();
	}
	
	public void paint(Graphics g) {
		gfx.setColor(Color.black);
		gfx.fillRect(0,0,WIDTH,HIGHT);
		if(b1.getX() < =10 || b1.getX() > 710)
		{
			gfx.getColor(Color.red);
			gfx.drawString("game over",350,210);
		}
		else 
		{
		p1.draw(gfx);
		b1.draw(gfx)
		p2.draw(gfx);
	}
		if(!gamestarted)
		{
			gfx.getColor(Color.white);
			gfx.drawString("tennis",340,100);
			gfx.drawString("press enter to begin",310,130);	
		}
		g.drawImage(img,0,0,this)
	}   
	
	public void update(Graphics g) {
		paint(g);
	}
	
	public void run() {
	 for(;;)
	 {
		 if(gamestarted) {
	 
		 p1.move();
		 b1.move();
		 p2.move();
		 b1.checkpaddlecolllection(p1, p2);}
		 repaint();
		 try {
			 Thread.sleep(10);
		 }catch(InterruptedException e) {
			 e.printStackTrace();
		 }
		 
	 }
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeycode() == KeyEvent.VK_UP) {
		p1.setUpAccel(true);	
		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			p1.setDownAccel(true);
		}elseif(e.getKeyCode()==KeyEvent.VK_ENTER)
		{
			gamestarted=true;
		}
	}
	
	public void keyReleased(KeyEvent e) {
		if(e.getKeycode() == KeyEvent.VK_UP) {
			p1.setUpAccel(false);	

		}
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {

			p1.setDownAccel(false);
			
		}
	}

	public void keyTyped(KeyEvent args0) {
	
	}
}
