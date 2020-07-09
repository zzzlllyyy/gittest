package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class SeasonTest {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Season [] values=Season.values();
//		for(Season season: values) {
//			System.out.println(season.getName()+"-"+season.getDesc());
//		}
//		System.out.println(Season.SPRING.getName());
		
//		Person p=new Person("tom",18);
//		Class<?> clazz = p.getClass();
		
//		System.out.println(clazz);
//		System.out.println(clazz.getFields());
//		System.out.println(clazz.getConstructors());
		
		//Class clazz = Person.class;
//		Class clazz = 
//		Object obj = clazz.newInstance();
//		Person p=(Person) obj;
//		System.out.println(p);
//	}
		
		
//		@Test
		public void test1() throws Exception  {
			//Class clazz = Person.class;
			Class<?> clazz = Class.forName("reflection.Person");
			//Object obj = clazz.getDeclaredConstructor(String.class,int.class).newInstance();
			Object obj =clazz.newInstance();
			Person p=(Person) obj;
			System.out.println(p.toString());
			System.out.println(p.getName());
		}
		
//		@Test
		public void test2() throws Exception {
			Class clazz=Person.class;
			Constructor cons =clazz.getDeclaredConstructor(String.class,int.class);
			cons.setAccessible(true);
			Person p=(Person)cons.newInstance("tom",12);
			System.out.println(p.toString());
			System.out.println(p.getName());
		}
		
		@Test
		public void test3() throws ClassNotFoundException, Exception, NoSuchMethodException, SecurityException {
////			Person p=new Person();
////			Class clazz=p.getClass();//·¨1
//			
//			Class<Person> clazz=Person.class;//·¨2
//			
////			Class clazz = Class.forName("reflection.Person");//·¨3
//			
//			Object obj=clazz.getDeclaredConstructor().newInstance();
//			Person p=(Person)obj;
//			
////			Field [] f=clazz.getDeclaredFields();
////			for(int i=0;i<f.length;i++) {
////				f[i].setAccessible(true);
////			}
//			
//			Field f1=clazz.getField("name");
//			f1.set(p, "tom");
//			
//			Field f2=clazz.getDeclaredField("age");
//			f2.setAccessible(true);
//			f2.set(p, 19);
//			
//			//---------------
//			
//			Method m1=clazz.getDeclaredMethod("setName",String.class);
//			Object o1=m1.invoke(p, "myname");
//			System.out.println(o1);
//			
//			
//			
//			System.out.println(p.getName()+" "+p.getAge());
//			System.out.println(clazz);
//			System.out.println(f2.get(p));
			
			Class clazz = Person.class;
//			Object obj=clazz.getDeclaredConstructor().newInstance();
//			Person p=(Person)obj;
			//Object obj=clazz.getDeclaredConstructor(String.class,int.class).newInstance("tom",19);
			Person p= (Person)clazz.getDeclaredConstructor(String.class,int.class).newInstance("tom",19);
			System.out.println(p);
			
			
		}
	
	
	
	

}

