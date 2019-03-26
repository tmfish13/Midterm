package pkgShape;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;

public class RectangleTest {


	@Test
	public void constructorTest_1() {
		final int true_width = 3;
		Rectangle r = new Rectangle(3, 4);
		int possible_width = r.getWidth();
		assertEquals(true_width, possible_width);
	}	
	
	@Test
	public void constructorTest_2() {
		final int true_length = 4;
		Rectangle r = new Rectangle(3, 4);
		int possible_length = r.getLength();
		assertEquals(true_length, possible_length);
	}	
	
	@Test(expected = IllegalArgumentException.class)
    public void constructorExceptionTest_1(){
        Rectangle r = new Rectangle(-3, 4);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void constructorExceptionTest_2(){
        Rectangle r = new Rectangle(3, -4);
    }
	
	@Test
	public void getLengthTest_1() {
		Rectangle r = new Rectangle(3, 4);
		assertEquals(4, r.getLength());
	}
	
	@Test
	public void getWidthTest_1() {
		Rectangle r = new Rectangle(3, 4);
		assertEquals(3, r.getWidth());
	}
	
	@Test
	public void setLengthTest_1() {
		Rectangle r = new Rectangle(3, 4);
		r.setLength(2);
		assertEquals(2, r.getLength());
	}
	
	@Test
	public void setWidthTest_1() {
		Rectangle r = new Rectangle(3, 4);
		r.setWidth(5);
		assertEquals(5, r.getWidth());
	}
	
	@Test
	public void perimeterTest_1() {
		Rectangle r = new Rectangle(3, 4);
		assertEquals(14, r.perimeter());
	}
	
	@Test
	public void areaTest_1() {
		Rectangle r = new Rectangle(3, 4);
		assertEquals(12, r.area());
	}
	
	/*
	@Test
	public void compareToTest_1() {
		ArrayList<Rectangle> ar = new ArrayList<>(); 
        ar.add(new Rectangle(4, 5)); 
        ar.add(new Rectangle(3, 4)); 
        ar.add(new Rectangle(1, 1)); 
        ar.add(new Rectangle(5, 6));
        
        Collections.sort(ar, Sortbyarea());
        
        
	}
	*/
}
