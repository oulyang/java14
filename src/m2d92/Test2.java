package m2d92;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//底层先创建了一个长度为0的数组，当添加第一个元素的时候，初始化容量为10
		//默认初始化容量10 数组长度10
		List list1=new ArrayList();
		
		//指定初始化容量20 数组长度20
		List list2=new ArrayList(20);
		//ArrayList扩容大小是原来的1.5倍
		
		
		Collection c=new HashSet();
		c.add(12);
		c.add(123);
		//将HashSet集合转换成ArrayList集合
		List list3=new ArrayList(c);
	}

}
