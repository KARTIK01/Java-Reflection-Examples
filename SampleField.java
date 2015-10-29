import java.lang.reflect.*;
import java.awt.*;
class SampleField
{
public static void printField(Object o)
{
	Class subClass=o.getClass();
	Field f[]=subClass.getFields();
	for(int i=0;i<f.length;i++)
	{
		System.out.println();
		Class type=f[i].getType();
		System.out.print(type.getName());
		System.out.print(" "+f[i].getName());
	}
}
public static void main(String... s)
{
Color c=new Color(1,1,1);
printField(c);

}	
}
