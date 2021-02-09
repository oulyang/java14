package m2d93;
/**
 * �����ŵ㣺�����ɾԪ��Ч�ʽϸߣ����漰��������Ԫ��λ�ƣ�
 * ����ȱ�㣺��ѯЧ�ʽϵͣ�ÿһ�β�ѯԪ�ض���Ҫ��ͷ�ڵ㿪ʼ���±���
 * @author yyds
 *
 */
public class Link {

		// TODO Auto-generated method stub
		Node header=null;
		Node first=null;
		int size=0;
		//��ȡ����������
		public int size() {
			return size;
		}
		//��ʼ����������
		public boolean initList() {
			size=0;
			first=new Node(null,null);
			header=new Node(null,null);
			return true;
		}
		//�жϵ��������Ƿ�Ϊ��
		public boolean isEmpty() {
			return size==0;
		}
		//������ͷ���Ԫ��
		public void addFirst(Object obj) {
			Node node=new Node();
			node.next=header;
			node.element=obj;
			header=node;
			size++;
		}
		//�ڵ�������ĩβ���Ԫ��
		public void addLast(Object obj) {
			if(header==null) {
				header=new Node(obj,null);
			}else {
				Node currentLastNode=findLast(header);
				currentLastNode.next=new Node(obj,null);
			}
			size++;
		}
		//ר�Ų���ĩβ�ڵ�
		private Node findLast(Node node) {
			// TODO Auto-generated method stub
			if(node.next==null) {
				return node;
			}
			return findLast(node.next);
		}
		//��ȡ�ڵ�
		public Node getNode(int i) {
			Node node=header;
			for(int j=0;j<i+2;j++) {
				node=node.next;
			}
			return node;
		}
		//ɾ�����������һ��Ԫ��
		public void removeFirst() {
			if(header==null) {
				System.out.println("��Ԫ�ؿ�ɾ");
				return;
			}
			Node delNode=header;
			header=header.next;
			delNode.next=null;
			size--;
		}
		//ɾ����������Ԫ��
		public void remove(Object obj){
			if(header == null){
				System.out.println("��Ԫ�ؿ�ɾ��");
				return;
			}
			//Ҫɾ����Ԫ����ͷ����Ԫ����ͬ
			while(header != null && header.element.equals(obj)){
				header = header.next;
				this.size--;
			}
			/*
			 * �����Ѿ���ͷ�ڵ��б��Ƿ�Ҫ����ɾ��
			 * ����Ҫ��ͷ������һ���������б�
			 */
			Node node = this.header;
			while(node != null && node.next != null){
				if(node.next.element.equals(obj)){
					this.size--;
					node.next = node.next.next;
				}
				else node = node.next;
			}
			
		}
		//ɾ�������������һ��Ԫ��
		public void removeLast() {
			if(header==null) {
				System.out.println("��Ԫ�ؿ�ɾ");
				return;
			}
			if(this.size()==1) {
				this.removeFirst();
			}
			Node node=header;
			Node renode=header;
			while(node.next!=null) {
				renode=node;
				node=node.next;
			}
			renode.next=node.next;
			size--;
		}
		/*

		//�޸ĵ�������ڵ�i����Ԫ��
		public void modify(Object obj1,Object obj2) {
			Node node=getNode(i-1);
			node.element=obj;
		}
		*/
		//�ڵ�������ڵ�i������Ԫ��
		public void insert(int index,Object obj) {
			if(index<0||index>size){
				throw new IllegalArgumentException("error");
			}
			if(index==0){
				addFirst(obj);
				return;
			}
			Node node=header;
			for(int i=0;i<index-1;i++){
				node=node.next;
			}
			Node renode=new Node();
			renode.element=obj;
			renode.next=node.next;
			node.next=renode;
			size++;
		}
		
		//���ҵ�������ڵ�i����Ԫ��
		public Node find(int i) {
			if(i<1||i>this.size()) {
				return null;
			}
			Node node=header;
			for(int j=0;j<i-1;j++) {
				node=node.next;
			}
			return node;
		}
		
		//�жϵ����������Ƿ��и�Ԫ��
		public boolean contains(Object obj) {
			Node node=header;
			while(node!=null) {
				if(node.element.equals(obj)) {
					return true;
				}
				else node=node.next;
			}
			return false;
		}
		//������������
		public void reservePrt(Node node) {
			if(node!=null) {
				System.out.println(node.element);
				reservePrt(node.next);
			}
		}
	}

