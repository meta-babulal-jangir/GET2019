import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class TestAddAnimal{
    private boolean expected;
	private Animal actual;
	
	@Parameters
	public static Collection data()
	{
		return Arrays.asList(new Object[][]{{true,new Lion("Lion1",18,60.5f)},{true,new Lion("Lion2",13,50.5f)}});
	}
	public TestAddAnimal(boolean expected,Animal actual)
	{
		this.expected=expected;
		this.actual=actual;
	}
	
	@Test
	public void test()
	{
		Cage cageObj=new Cage(2,actual.getType());
		assertEquals(expected,cageObj.addAnimal(actual));
	}
}