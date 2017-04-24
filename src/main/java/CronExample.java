import java.text.ParseException;

import net.redhogs.cronparser.CronExpressionDescriptor;

public class CronExample {
    public static void main(String[] args) throws ParseException {
        System.out.println(CronExpressionDescriptor.getDescription("0 15 8 5 * ? *"));
    }
}