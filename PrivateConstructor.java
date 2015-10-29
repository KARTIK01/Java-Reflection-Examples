import java.lang.reflect.*;
class Temp
{
	private Temp()
	{
		System.out.println("default constructor");
	}
	void show()
	{
		System.out.println("show function");
	}
	private Temp(int x)
	{
		System.out.println(x);
	}
}

class PrivateConstructor
{
 public static void main(String... s)
 {
	try{
		Class cl=Temp.class;
		Constructor c=cl.getDeclaredConstructor();
		c.setAccessible(true);
		
		Temp t1=(Temp)c.newInstance();
		t1.show();
		
		Constructor c1=cl.getDeclaredConstructor(int.class);
		c1.setAccessible(true);
		
		Temp t2=(Temp)c.newInstance(10);
		t2.show();
		}
		catch(Exception e)
		{}
		}
		}
		
		