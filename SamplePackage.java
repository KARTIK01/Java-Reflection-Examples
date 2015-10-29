import java.lang.reflect.*;
import java.awt.*;
class SamplePackage
{
public static void printPackage(Object o)
{
	Class c=o.getClass();
	Package m=c.getPackage();
		System.out.print(m.getName());
}
public static void main(String... s)
{
printPackage(new String());

}	
}