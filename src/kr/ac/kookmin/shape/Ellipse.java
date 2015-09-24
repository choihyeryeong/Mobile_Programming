package kr.ac.kookmin.shape;

public class Ellipse extends Shape{
	private int w;
	private int h;

	public Ellipse(Point center, int W, int H)
	{
		this.center = center;
		w = W;
		h = H;
	}
	
	public int getSemiMajorAxis()
	{
		return w>=h?w*2:h*2;
	}
	public int getSemiMinorAxis()
	{
		return w<=h?w*2:h*2;
	}
	
  public Rectangle getBounds(){
		return new Rectangle(center, w*2, h*2);
	}

	@Override
	public void draw(Graphics g) {
		g.draw(this);
	}
	@Override
	public String toString() {
		return "Ellipse";
	}
}