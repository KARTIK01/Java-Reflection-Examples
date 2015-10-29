import java.lang.reflect.*;
class GetMethods
{
	private double div(int a,int b)
	{
		return (a/b); 
	}

}

class PrivateMethods
{
 public static void main(String... s) throws Exception
 {
	try{
		
		GetMethods  object=new GetMethods();
		Class cl=object.getClass();
		
		//Method method=cl.getMethods("div",new Class[]{int.class,int.class});
		Method method=cl.getDeclaredMethod("div",int.class,int.class);
		method.setAccessible(true);
		System.out.println("method name: "+method.getName());
		double d=(double)method.invoke(object,10,5);
		System.out.println(d);
		}
		catch(Exception e)
		{}
		}
		}
		
		