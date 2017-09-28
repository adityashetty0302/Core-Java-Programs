package AbsUsingInterface;

public class Normal extends Abstract implements Interface {

	@Override
	public void abs() {
		
		System.out.println("from abstract");
	}
	
@Override
	public void interf() {
		
		System.out.println("from interface ");	
	
	}
	
//	public void nor ()
//	{
//		System.out.println("of normal");
//	}
}
