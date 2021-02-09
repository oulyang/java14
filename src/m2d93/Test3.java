package m2d93;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link link1=new Link();
		
		link1.addLast(123);
		link1.addLast("12");
		link1.addLast("1");
		link1.remove("1");
		link1.insert(1,12345);
		System.out.println(link1.size());
		System.out.println(link1.contains(123));
		link1.reservePrt(link1.header);
		//link1.find(n1);
		//link1.remove(123);
		

	}

}
