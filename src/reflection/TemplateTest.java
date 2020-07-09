package reflection;

public class TemplateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass a=new ConcreteClass();
		a.templatemethod();
	}

}

interface AbstractInterface
{
	void method1();
	void method2();
}

abstract class AbstractClass
{
	public void templatemethod() {
		submethod();
		abstractmethod1();
		abstractmethod2();
	}

	protected abstract void abstractmethod2();

	protected abstract void abstractmethod1();

	protected void submethod() {
		System.out.println("hhhh");
	}
}

class ConcreteClass extends AbstractClass
{

	@Override
	protected void abstractmethod2() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

	@Override
	protected void abstractmethod1() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}
	
}

class ConcreteInter implements AbstractInterface
{
	
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2");
	}
	
}