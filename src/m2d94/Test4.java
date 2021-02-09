package m2d94;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Animal> myList=new ArrayList<>();//JDK8֮��ArrayList<>�����ڿɲ�д�������Զ������ƶ�/��ʯ���ʽ
		Cat c=new Cat();
		Bird b=new Bird();
		Animal a=new Animal();
		myList.add(a);
		myList.add(c);
		myList.add(b);
		
		Iterator<Animal> it= myList.iterator();
		while(it.hasNext()) {
			Animal an=it.next();
			an.eat();
		}
	}

}

class Animal{
	public void eat() {
		System.out.println("Animal");
	}
}

class Cat extends Animal{
	public void move() {
		System.out.println("Cat");
	}
}

class Bird extends Animal{
	public void fly() {
		System.out.println("Bird");
	}
}