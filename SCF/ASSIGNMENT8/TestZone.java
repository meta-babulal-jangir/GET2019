import static org.junit.Assert.*;
import org.junit.Test;
public class TestZone {
    Zone mammalZone=new Zone("Mammal Zone","Mammal",2,true,true);
    Zone reptileZone=new Zone("Reptile Zone","Reptile",1,true,false);
    Zone birdZone=new Zone("Mammal Zone","Bird",3,true,true);
    Animal lion1=new Lion("Lion1",12,40.5f);
    Animal crocodile1=new Crocodile("Crocodile1",23,60.36f);
    Animal peacock1=new Peacock("Peacock1",10,15.0f);
    @Test
	public void test() {
		mammalZone.addCage(2,"Lion");
		boolean actual=mammalZone.addAnimalToCage(lion1);
		assertEquals(true, actual);
	}
	@Test
	public void test1() {
		boolean actual=mammalZone.addAnimalToCage(crocodile1);
		assertEquals(false, actual);
	}
	@Test
	public void test() {
		reptileZone.addCage(1,"Crocodile");
		boolean actual=reptileZone.addAnimalToCage(crocodile1);
		assertEquals(true, actual);
	}
	@Test
	public void test1() {
		boolean actual=reptileZone.addAnimalToCage(peacock1);
		assertEquals(false, actual);
	}
	@Test
	public void test() {
		birdZone.addCage(2,"Peacock");
		boolean actual=birdZone.addAnimalToCage(peacock1);
		assertEquals(true, actual);
	}
	@Test
	public void test1() {
		boolean actual=birdZone.addAnimalToCage(crocodile1);
		assertEquals(false, actual);
	}
	
}	