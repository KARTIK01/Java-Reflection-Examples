import java.lang.reflect.*;
import java.awt.*;
class SampleModifier
{
public static void printInterface(Object o) throws Exception
{
	//Class c=o.getClass();
	Class c=Class.forName("java.awt.Graphics");
	int m=c.getModifiers();
	if(Modifier.isAbstract(m))
		System.out.println("Abstract");
	if(Modifier.isVolatile(m))
		System.out.println("Volatile");
	if(Modifier.isSynchronized(m))
		System.out.println("Synchronized");
	if(Modifier.isFinal(m))
		System.out.println("Final");		
	if(Modifier.isStatic(m))
		System.out.println("Static");
	if(Modifier.isProtected(m))
		System.out.println("Protected");
	if(Modifier.isPrivate(m))
		System.out.println("Private");
	if(Modifier.isPublic(m))
		System.out.println("Public");
}
public static void main(String... s) throws Exception
{
String t1=new String();
printInterface(t1);

}	
}
