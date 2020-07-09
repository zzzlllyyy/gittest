package reflection;

import java.util.Scanner;

public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Proxy p=new Proxy();
		p.request();
	}

}

interface Subject
{
	void request();
}

class RealSubject implements Subject
{
	
	

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("managing");
	}
	
}

class Proxy implements Subject
{
	private RealSubject rs;
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		if(rs==null) {
			rs=new RealSubject();
		}
		boolean flag=false;
		flag=preRequest(flag);
		if(flag==true) {
			rs.request();
			lastRequest();
		}
		else {
			return;
		}
	}
	
	public boolean preRequest(boolean flag) {
		System.out.println("prerequest");
		System.out.println("enter your password: ");
		Scanner in=new Scanner(System.in);
		String s =in.nextLine();
		if(s.equals("000")) {
			System.out.println("successfully enter the managing part");
			flag=true;
		}
		else {
			System.out.println("failed");
		}
		return flag;
	}
	
	public void lastRequest() {
		System.out.println("lastrequest");
	}
	
}