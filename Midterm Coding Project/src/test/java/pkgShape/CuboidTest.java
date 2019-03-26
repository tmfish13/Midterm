package pkgShape;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CuboidTest {
	
	@Test
	public void constructorTest_1() {
		final int true_depth = 5;
		Cuboid c = new Cuboid(3, 4, 5);
		int possible_depth = c.getDepth();
		assertEquals(true_depth, possible_depth);
	}	
	
	@Test
	public void constructorTest_2() {
		final int true_width = 3;
		Cuboid c = new Cuboid(3, 4, 5);
		int possible_width = c.getWidth();
		assertEquals(true_width, possible_width);
	}
	
	@Test
	public void constructorTest_3() {
		final int true_length = 4;
		Cuboid c = new Cuboid(3, 4, 5);
		int possible_length = c.getLength();
		assertEquals(true_length, possible_length);
	}
	
	@Test
	public void getDepthTest_1() {
		Cuboid c = new Cuboid(3, 4, 5);
		assertEquals(5, c.getDepth());
	}
	
	@Test
	public void getLengthTest_1() {
		Cuboid c = new Cuboid(3, 4, 5);
		assertEquals(4, c.getLength());
	}
	
	@Test
	public void getWidthTest_1() {
		Cuboid c = new Cuboid(3, 4, 5);
		assertEquals(3, c.getWidth());
	}
	
	@Test
	public void setDepthTest_1() {
		Cuboid c = new Cuboid(3, 4, 5);
		c.setDepth(6);
		assertEquals(6, c.getDepth());
	}
	
	@Test
	public void setWidthTest_1() {
		Cuboid c = new Cuboid(3, 4, 5);
		c.setWidth(16);
		assertEquals(16, c.getWidth());
	}
	
	@Test
	public void setLengthTest_1() {
		Cuboid c = new Cuboid(3, 4, 5);
		c.setLength(51);
		assertEquals(51, c.getLength());
	}
	
	@Test(expected = IllegalArgumentException.class)
    public void constructorExceptionTest_1(){
        Cuboid c = new Cuboid(-3, 4, 5);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void constructorExceptionTest_2(){
        Cuboid c = new Cuboid(3, -4, 5);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void constructorExceptionTest_3(){
        Cuboid c = new Cuboid(3, 4, -5);
    }
	
	@Test
	public void areaTest_1() {
		Cuboid c = new Cuboid(3, 4, 5);
		assertEquals(c.area(), 94);
	}
	
	@Test
	public void volumeTest_1() {
		Cuboid c = new Cuboid(3, 4, 5);
		assertEquals(c.volume(), 60);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void perimeterTest_1() {
		Cuboid c = new Cuboid(3, 4, 5);
		c.perimeter();
	}
	
	
}
