package HashTable;

public class LinearProbing <K, V> {
	
	protected int M = 13; // 테이블 크기를 소수로 설정함 
	protected K[] a = (K[]) new Object[M]; //Key 값을 저장하는 테이블 
	protected V[] d = (V[]) new Object[M]; // Value값을 저장하는 테이블 
	public int i = 0, u = 0;
	protected int size;
	
	
	public int size() {
		return this.size;
	}
	public int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M; // 해시 결과는 인덱스로 사용한다. 
		// 인덱스는 0보다는 커야하기 때문에 부호비트를 없앤다 .
	}
	
	public void put (K key, V data) { //삽입 연산 
		
		int initialpos = hash(key);//초기 위치 
		int i = initialpos, j = 1;
		do {
			if(a[i] == null) { //삽입 위치 발견 
				a[i] = key; //key를 해시 테이블에 저장 
				d[i] = data; // key 관련 데이터를 동일한 인덱스에 저장 , 뒷주머니?ㅎㅎ
				size++;
				return;
			
			}
			
			if(a[i].equals(key)) { // 이미 key에 데이터가 들어있다면 
				d[i] = data; //데이터만 갱신 
				return ;
			}
			
			i = (initialpos + j++) % M; // i = 다음위치 
		
		}while(i != initialpos); // 현재 i 가 초기위치와 같게 되면 루프 종료 
		
	}
	
	public V get(K key) { //탐색 연산 
		int initialpos = hash(key);
		int i = initialpos, j = 1;
		
		do {
			if( a[i].equals(key)) return d[i]; // 찾음 ! 
			i = (initialpos + j++) % M;
			
		}while (a[i] != null && i!= initialpos); // a[i]가 비어있거나, 처음위치로 돌아왔다면 못찾음 
		return null;
	}
	
	public void print() {
		
		
		System.out.println("해시테이블  : ");
		for(int i = 0 ; i < M; i++) {
			
			System.out.print(i + "\t");
			
		}
		System.out.println();
		for(int i = 0; i< M; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		
		
		
	}
	

}
