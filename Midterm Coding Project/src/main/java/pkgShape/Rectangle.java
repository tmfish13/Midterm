package pkgShape;

import java.util.Comparator;

public class Rectangle extends Shape{
	
	private int width;
	private int length;
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length){
		this.length = length;
	}
	
	public Rectangle(int w, int l) throws IllegalArgumentException{
		if(w < 0 || l < 0) {
			throw new IllegalArgumentException();
		} else {
			this.width = w;
			this.length = l;
		}
		
	}
	
	public int area() {
		return getLength() * getWidth();
	}
	
	public int perimeter() {
		return getLength()*2 + getWidth()*2;
	}
	
	
	public class Sortbyarea implements Comparator<Rectangle> 
	{
		public int compare(Rectangle a, Rectangle b) 
	    { 
	        return a.area() - b.area(); 
	    } 
	} 
}
