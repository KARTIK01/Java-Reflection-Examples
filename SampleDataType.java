import java.lang.reflect.*;
import java.awt.*;
class SampleDataType
{

public static void main(String... s)
{
Class c1=int.class;
System.out.println(c1.getName());
c1=int.class;
System.out.println(c1.getName());
c1=char.class;
System.out.println(c1.getName());
c1=float.class;
System.out.println(c1.getName());
c1=double.class;
System.out.println(c1.getName());
c1=long.class;
System.out.println(c1.getName());
c1=boolean.class;
System.out.println(c1.getName());
c1=short.class;
System.out.println(c1.getName());
c1=void.class;
System.out.println(c1.getName());
}	
}