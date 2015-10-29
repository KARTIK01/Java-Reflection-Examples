import java.lang.reflect.*;
import java.awt.*;
class SampleInterface
{
public static void printInterface(Object o)
{
	Class subClass=o.getClass();
	Class inter[]=subClass.getInterfaces();
	for(int i=0;i<inter.length;i++)
	{
		System.out.println(inter[i].getName());
	}
}
public static void main(String... s)
{
T t1=new T();
printInterface(t1);

}	
}
interface a1{}
interface a2{}
interface a3{}
class T implements a1,a2,a3
{}