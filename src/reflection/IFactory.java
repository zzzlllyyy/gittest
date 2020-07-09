package reflection;

public class IFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorkFactory i1=new StudentWorkFactory();
		//i1.getWork().doWork();
		
		IWorkFactory i2=new TeacherWorkFactory();
		//i2.getWork().doWork();
		
		IFactory i=new IFactory();
		i.creatWork(i1).doWork();
		i.creatWork(i2).doWork();
		
	}
	
	public Work creatWork(IWorkFactory i) {
		return i.getWork();
	}

}



interface IWorkFactory
{
	 Work getWork();
}

class StudentWorkFactory implements IWorkFactory
{

	@Override
	public Work getWork() {
		// TODO Auto-generated method stub
		return new StudentWork();
	}
	
}

class TeacherWorkFactory implements IWorkFactory
{

	@Override
	public Work getWork() {
		// TODO Auto-generated method stub
		return new TeacherWork();
	}
	
}

interface Work
{
	void doWork();
}

class StudentWork implements Work
{

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("students do homework");
	}
	
}


class TeacherWork implements Work
{

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("teachers read books");
	}
	
}