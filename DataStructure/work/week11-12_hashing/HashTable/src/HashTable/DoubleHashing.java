package HashTable;

import java.util.Random;

public class DoubleHashing <K,V> {
	
	protected int N = 0, M = 13; // 테이블 크기를 소수로 설정함 
	protected K[] a = (K[]) new Object[M]; //Key 값을 저장하는 테이블 
	protected V[] dt = (V[]) new Object[M]; // Value값을 저장하는 테이블 
	
	public int hash(K key) {
		return (key.hashCode() & 0x7fffffff) % M; // 해시 결과는 인덱스로 사용한다. 
		// 인덱스는 0보다는 커야하기 때문에 부호비트를 없앤다 .
	}
	
	public void put(K key, V data) {
		
		int initialpos = hash(key);
		int i = initialpos;
		int j = 1;
		int d = ( 7 - (int)key % 7);
		
		
		do {
			if( a[i] == null) { //삽입위치 발견 
				a[i] = key; //key를 해시테이블에 저장 
				dt[i] = data; N++;// key 관련 데이터 저장 
					return ;
			}
			if( a[i].equals(key)) {
				dt[i] = data;
			}
			i = (initialpos + j*d) % M; //  i = 다음위치
			j++;
		}while(N < M);
	}
	
	public V get(K key) { //탐색연산 
		
		int initialpos = hash(key);
		int i = initialpos;
		int j = 1;
		int d = ( 7 - (int)key % 7);
		
		
			while(a[i] != null) { //a[i]가 empty가 아니면 
				if(a[i].equals(key))
					return dt[i]; //탐색 성공 
				i = (initialpos + j*d) % M; //  i = 다음위치 
				j++;
			}
			
			return null; // 탐색 실패 
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
