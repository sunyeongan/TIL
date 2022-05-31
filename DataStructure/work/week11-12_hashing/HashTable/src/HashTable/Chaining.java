package HashTable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

//폐쇄 주소 방식의 충돌해결 방법 
// 각 데이터 저장 공간(인덱스 위치) 에 여러 개의 값을 저장할 수 있도록 하고, 
// 충돌이 발생한 경우에는 동일한 위치에 모두 저장 (연결리스트로 ) 

public class Chaining<K,V> {
	
	protected int N, M = 5; //N-> 항목 수  테이블 크기를 소수로 설정함 
	private Node[] a = new Node[M]; //해시테이블 
	private LinkedList<Node>[] arr2 = new LinkedList[M];
	
	private double load_rate = 0; //적재율 
	
	public static class Node{ // 노드 클래스를 내부클래스로 정의해서 사용가능 
		
		public Object key;
		public Object data;
		public Node next;
		
		public Node(Object newkey, Object newdata, Node ref) {
			
			key = newkey;
			data = newdata;
			next = ref;
		}
		
		public Object getKey() {return key;}
		public Object getData() {return data;}
		
		public void setData(Object newData) {
			data = newData;
		}
		
		public Node getNext() {
			return next;
		}
		
		public void setNext(Node NextKey) {
			next = NextKey;
		}

		
		
	}
	
	private int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M; // 해시 결과는 인덱스로 사용한다. 
		// 인덱스는 0보다는 커야하기 때문에 부호비트를 없앤다 .
	}
	
	public V get(K key) {
		
		int i = hash(key);
		for( Node x = a[i]; x != null; x = x.next)
			if(key.equals(x.key)) return (V) x.data;
		
		return null;
	}
	
	public void put(K key, V data) {
		
		int i = hash(key);
		
		for( Node x = a[i]; x != null; x = x.next) 
			if(key.equals(x.key)) {
				x.data = data;
				return;
			}
		
		
		a[i] = new Node(key, data, a[i]); //연결 리스트의  첫 노드로 삽입
		
		load_rate = (double) (++N)/M;
		
		if(load_rate > 0.75) 
			check_and_rehash();
		
		
	}
	
	
	
	public void delete(K key) {
		
		
		int i = hash(key);
		
		//Node t = a[i];
		
		for( Node x = a[i]; x != null; x = x.next) {
			
			if(key.equals(x.key)) { //제거해야 할 값 발견 
				
				//if(x.next!= null) {
					x = x.next;
					//x.data = x.next.data;
					//x.setNext(x.getNext());// 제거해야 할 노드와 다음 노드의 연결을 끊기   
					//x.setData(x.getData());// 데이터 다시 로드 
				//}
				
				load_rate = (double) (--N)/M; //적재율 계산 
				
				if(load_rate<0.25 &&  M >10) {
					//적재율이 0.25미만이라면 
					System.out.println("load_rate1 : "+ load_rate);
					check_and_rehash();//재해시 
					System.out.println("call rehash1");
				}
					
					
				break;	
			}
		}
			
		if(key.equals(a[i].key)) {
			a[i] = a[i].next;
			load_rate = (double) (--N)/M;
			System.out.println("load_rate2 : "+ load_rate);
			if(load_rate<0.25 &&  M >10) {
				
				check_and_rehash();
				System.out.println("call rehash2");
			}
				
				
		}
		
		
	}
	
	
	public void print() {
		
		
		System.out.println("해시테이블  : ");
		for(int i = 0 ; i < M; i++) {
			
			
			System.out.print(i);
			
			for( Node x = a[i]; x != null; x = x.next) 
			
				System.out.print("-->[" + x.getKey() + ", "+ x.getData()  + "]");
			
				
			System.out.println();
			
		}
	}
	
	private void check_and_rehash() {
		
		if( load_rate > 0.75 ) 
			M*=2; //높은 적재율로 인한 성능 감소를 방지 
		
		else if( load_rate < 0.25) 
			M/=2; //낭비 되는 공간을 줄임 
		
		else System.out.println("[check_and_rehash] 테이블의 사이즈를 변경하지 않습니다.");
		
		Node arr[] = a;
		a = new Node[M];
		
		System.out.print("[check_and_rehash] 테이블의 사이즈를 " + arr.length + "에서"+ M + "으로 변경합니다.");
		System.out.println();
		for(int i = 0; i < arr.length; i++) { //테이블 사이즈가  변경되었으므로 items 재배열  
			
			if(arr[i] != null) {
				for(Node x = arr[i]; x!=null; x = x.next) {
					put((K)x.key,(V)x.data);
				}
			}
		}
			
	}
	
	public boolean findTwoNum(int arr[], int sum) {
		
		
		boolean tf = false;
		Node arr2 = null;
		Node want2 = null;
		
		Node n = null;
		Node n2 = null;
		
		//int 배열로 만들기 
		int want [] = new int [arr.length];		
		for(int i = 0; i<arr.length; i++) {
			
			want[i] = sum - arr[i];
		}
		
		//int 배열을 Node 로 변환하기 
		for(int i = arr.length-1; i >= 0; i--) {
			
			n = new Node(arr[i],arr[i],arr2);
			n2 = new Node(want[i], want[i],want2);
			
			arr2 = n;
			want2 = n2;
			
			
		}
		
		/*for (Node x = want2; x!=null; x=x.next) {
			System.out.println("want2 : " + x.getKey());
		}
		*/
		for (Node x = n; x!=null; x=x.next) {
			if (x.getKey().equals(want2.getKey())) {
				want2 = want2.next;
				tf = true;
			}
			else {
				want2 = want2.next;
				
			}
		}
		
		return tf;
		
	}
	
	

}
