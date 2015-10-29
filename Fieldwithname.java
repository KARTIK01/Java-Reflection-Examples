import java.lang.reflect.*;
class Temp
{	
	private int x=10;
}

public class Fieldwithname
{
public static void main(String... s) throws Exception
{
	Class cls=Temp.class;
	Temp t=new Temp();
	Field field=cls.getDeclaredField("x");
	field.setAccessible(true);
	System.out.println(field);
	System.out.println(field.get(t));
	field.set(t,30);
//	System.out.println(t.x);
	System.out.println(field.get(t));

}

}

