
public class Counting {
	
	static int count=0;
	
	{
		count++;
	}
	
	public static void main(String[] args) {
		Counting c1=new Counting();
		Counting c2=new Counting();
		Counting c3=new Counting();
		Counting c4=new Counting();
		Counting c5=new Counting();
		Counting c6=new Counting();
		System.out.println("count of objects:"+count);
		
		}

}
