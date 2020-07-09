package reflection;

public class AdapteeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Target t=new Adapter();
//		t.request();
		
		Adaptee a=new Adaptee();
		Target t=new Adapter(a);
		t.request();
	}

}

interface Target
{
	void request();
}

class Adaptee
{
	public void subrequest() {
		System.out.println("yes");
	}
}

//class Adapter extends Adaptee implements Target
//{
//
//	@Override
//	public void request() {
//		// TODO Auto-generated method stub
//		subrequest();
//	}
//	
//}

class Adapter implements Target
{
	private Adaptee adaptee;
	
	
	
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}



	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.subrequest();
	}
	
	
}