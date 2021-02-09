package m2d93;
/**
 * 链表优点：随机增删元素效率较高（不涉及到大量的元素位移）
 * 链表缺点：查询效率较低，每一次查询元素都需要从头节点开始往下遍历
 * @author yyds
 *
 */
public class Link {

		// TODO Auto-generated method stub
		Node header=null;
		Node first=null;
		int size=0;
		//获取单向链表长度
		public int size() {
			return size;
		}
		//初始化单向链表
		public boolean initList() {
			size=0;
			first=new Node(null,null);
			header=new Node(null,null);
			return true;
		}
		//判断单向链表是否为空
		public boolean isEmpty() {
			return size==0;
		}
		//在链表开头添加元素
		public void addFirst(Object obj) {
			Node node=new Node();
			node.next=header;
			node.element=obj;
			header=node;
			size++;
		}
		//在单向链表末尾添加元素
		public void addLast(Object obj) {
			if(header==null) {
				header=new Node(obj,null);
			}else {
				Node currentLastNode=findLast(header);
				currentLastNode.next=new Node(obj,null);
			}
			size++;
		}
		//专门查找末尾节点
		private Node findLast(Node node) {
			// TODO Auto-generated method stub
			if(node.next==null) {
				return node;
			}
			return findLast(node.next);
		}
		//获取节点
		public Node getNode(int i) {
			Node node=header;
			for(int j=0;j<i+2;j++) {
				node=node.next;
			}
			return node;
		}
		//删除单向链表第一个元素
		public void removeFirst() {
			if(header==null) {
				System.out.println("无元素可删");
				return;
			}
			Node delNode=header;
			header=header.next;
			delNode.next=null;
			size--;
		}
		//删除单向链表元素
		public void remove(Object obj){
			if(header == null){
				System.out.println("无元素可删除");
				return;
			}
			//要删除的元素与头结点的元素相同
			while(header != null && header.element.equals(obj)){
				header = header.next;
				this.size--;
			}
			/*
			 * 上面已经对头节点判别是否要进行删除
			 * 所以要对头结点的下一个结点进行判别
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
		//删除单向链表最后一个元素
		public void removeLast() {
			if(header==null) {
				System.out.println("无元素可删");
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

		//修改单向链表节点i处的元素
		public void modify(Object obj1,Object obj2) {
			Node node=getNode(i-1);
			node.element=obj;
		}
		*/
		//在单向链表节点i处插入元素
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
		
		//查找单向链表节点i处的元素
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
		
		//判断单向链表中是否有该元素
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
		//遍历单向链表
		public void reservePrt(Node node) {
			if(node!=null) {
				System.out.println(node.element);
				reservePrt(node.next);
			}
		}
	}

