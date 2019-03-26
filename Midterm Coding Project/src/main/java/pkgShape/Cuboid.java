package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	
	private int depth;

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public Cuboid(int w, int l, int d) throws IllegalArgumentException{
		super(w, l);
		if(d < 0) {
			throw new IllegalArgumentException();
		}else {
			this.depth = d;
		}
	}
	
	public int volume() {
		return super.getLength() * super.getWidth() * getDepth();
	}
	
	@Override
	public int perimeter() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int area() {
		return 2*super.getLength()*super.getWidth()+2*super.getLength()*getDepth()+2*super.getWidth()*getDepth();
	}
	
	class Sortbyarea implements Comparator<Cuboid> 
	{
		public int compare(Cuboid a, Cuboid b) 
	    { 
	        return a.area() - b.area(); 
	    } 
	} 
	
	class Sortbyvolume implements Comparator<Cuboid> 
	{
		public int compare(Cuboid a, Cuboid b) 
	    { 
	        return a.volume() - b.volume(); 
	    } 
	}
}
