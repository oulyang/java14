package m2d92;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ײ��ȴ�����һ������Ϊ0�����飬����ӵ�һ��Ԫ�ص�ʱ�򣬳�ʼ������Ϊ10
		//Ĭ�ϳ�ʼ������10 ���鳤��10
		List list1=new ArrayList();
		
		//ָ����ʼ������20 ���鳤��20
		List list2=new ArrayList(20);
		//ArrayList���ݴ�С��ԭ����1.5��
		
		
		Collection c=new HashSet();
		c.add(12);
		c.add(123);
		//��HashSet����ת����ArrayList����
		List list3=new ArrayList(c);
	}

}
