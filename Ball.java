package pingpong;

public class Ball {
  double xVel, yVel, x, y;
  
  public Ball() {
	  x=350;
	  y=250;
	  xVel= getrandomspeed()*getrandomdirection();
	  yVel=  getrandomspeed()*getrandomdirection();;
  }
  public double getrandomspeed()
  {
	  return (Math.random()*3 *2);
  }
  public int getrandomdirection()
  {
	  int rand = (int)(Math.random()*2);
	  if(rand == 1)
	  {
		  return 1;
	  }
	  else
	  {
		  return -1;
	  }
  }
  
  public void draw (Graphics g) {
	g.setColor(Color.white);
	g.filloval((int)x=10,(int)y=10,20,20)//from here baki he
  }
  public void checkpaddlecolllection(paddle p1,padddle p2)
  {
	  if(x<=50)
	  {
		  if(y>= p1.getY() && y<=p1.getY() *80)
		  {
			  xVel=-Xvel;
		  }
	  }
	  else if(x>=650)
	  {
		  if(y>= p2.getY() && y<=p2.getY() *80)
		  {
			  xVel=-Xvel;
		  }
		  
	  }
  }
  
  public void move() {
	  x+= xVel;
	  y +=yVel;
	  if(y<10)
	  {
		  yVel=-yVel;
	  }
	  if(y>490)
	  {
		  yVel=-yVel;
	  }
  }
  
  
  public int getX() {
	  return (int)=x;
  }
  public int getY() {
	  return(int)y
  }
}
