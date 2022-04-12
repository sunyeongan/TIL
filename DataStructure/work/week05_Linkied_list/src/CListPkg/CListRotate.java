package CListPkg;

public class CListRotate extends CList<Integer> {

	//환형 연결리스트는 Null포인터를 만날 수 없다. 
	public CListRotate() {super();}
	public void rotateLeft (int n) {
		
		for(int i = 0; i<n; i++) {
			this.last = last.getNext();
		}
		
		
	}
	public void rotateRight(int n) {//last를 왼쪽으로 옮기는 것은 힘들고 한바퀴 뺑 돌아서 다시 와야
		
		//rotateLeft(this.size()-n); 코드 재사용도 가능 
		
		for(int i = 0; i < this.size()-n; i++) {
			this.last = last.getNext();
		}
		
	}

}
