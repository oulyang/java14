package m2d91;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * List�ӿ����еĳ��÷���
 * void add(int index,Object element)
 * Object get(int index)
 * int indexOf(Object o)
 * Object remove(int index)
 * Object set(int index,Object element)
 * @author yyds
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		ls.add(123);
		ls.add(111);
		ls.add(1);
		
		ls.add(1,"jack");
		
		Iterator it=ls.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj);
		}
		
		for(int i=0;i<ls.size();i++) {
			Object ob=ls.get(i);
			System.out.println(ob);
		}
		//��ȡָ�������һ�γ��ִ�������
		System.out.println(ls.indexOf("jack"));
		
		//��ȡָ���������һ�γ��ִ�������
		System.out.println(ls.lastIndexOf("jack"));
		
		//ɾ��ָ���±��Ԫ��
		ls.remove(1);
		System.out.println(ls.size());
		
		//�޸�ָ���±��Ԫ��
		ls.set(2,"red");
		
	}

}
