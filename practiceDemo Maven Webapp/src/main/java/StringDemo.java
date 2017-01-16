
public class StringDemo {
	

	public static void main(String [] args)
	{
		System.out.println("111");
		char [] arrayList = {'a','b','c'};
//		String str =   arrayList;
		String str =new String(arrayList) ;		
		System.out.println(str);
	}
}
