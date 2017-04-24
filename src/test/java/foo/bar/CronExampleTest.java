package foo.bar;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.text.ParseException;

import net.redhogs.cronparser.CronExpressionDescriptor;

public class CronExampleTest {
	
	@Test
    public void test() throws ParseException {
    	String actual = CronExpressionDescriptor.getDescription("0 15 8 5 * ? *");
    	String expected = "At 8:15 AM, on day 5 of the month, every year";
    	
    	assertEquals(actual, expected);
    }
}