import java.lang.reflect.*;
import java.awt.*;
class SampleConstructor
{
public static void printConstructor(Object o)
{
	Class c=o.getClass();
	Constructor cs[]=c.getConstructors();
	for(int i=0;i<cs.length;i++)
	{
		System.out.print(cs[i].getName()+"(");
		Class type[]=cs[i].getParameterTypes();
		for(int k=0;k<type.length;k++)
		System.out.print(type[k].getName()+" ,");
		System.out.println(")");
		
	}
}
public static void main(String... s)
{
Thread t=new Thread("ss");
printConstructor(t);

}	
}
