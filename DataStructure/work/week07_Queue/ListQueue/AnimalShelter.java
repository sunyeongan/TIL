package ListQueue;
import java.util.NoSuchElementException;

public class AnimalShelter<E> extends ListQueue<E>{
	
	
	
	ListQueue<E> qDog = new ListQueue<E>();
	ListQueue<E> qCat = new ListQueue<E>();
	ListQueue<E> qAll = new ListQueue<E>();
	public AnimalShelter() { 
		super();
		 
		qDog.front = qDog.rear = null; //강아지만 저장하는 큐 
		qCat.front = qCat.rear = null;// 고양이만 저장하는 큐 
		qAll.front = qAll.rear = null; // 둘다 저장하는 큐 
		qAll.size = 0; //공용 큐의 크기 
		//DogSize = 0; // 강아지 큐의 크기 
		//CatSize = 0; // 고양이 큐의 크기 
		
		
	}
	
	public int size() { return qAll.size; }
	public int DogSize() { return qDog.size; }
	public int CatSize() { return qCat.size; }
	public boolean isEmpty() { return size() == 0; } 
	public boolean DogisEmpty() { return DogSize() == 0; } 
	public boolean CatisEmpty() { return CatSize() == 0; }
	
	//public E adopt;
	
	
	
	
	public void enter(E newAnimal, E categori,int time) { //동물이 보호소에 들어옴 
		
		this.add(newAnimal);
		
		
	}
	
	public void enter_dog(E newAnimal) { // 강아지를 추가하는 메소드 
		
		E newAnimal2 = (E)((String)newAnimal + "(Dog)"); //입력 받은 newAnimal에 (Dog) 추가 
		
		Node newNode = new Node(newAnimal2, null);
		
		if(DogisEmpty()) qDog.front = newNode; //강아지 큐에 추가
		else qDog.rear.setNext(newNode); //비어있지 않으면 
		qDog.rear = newNode;
		qDog.size++;
		qAll.add(newAnimal2);// 공용 큐에 추가 
		
		
	}
	
	public void enter_cat(E newAnimal) { // 고양이를 추가하는 메소드 
		
		E newAnimal2 = (E) ((String)newAnimal + "(Cat)"); //입력 받은 newAnimal에 (Cat) 추가 
		
		Node newNode = new Node(newAnimal2, null);
		
		if(CatisEmpty()) {
			qCat.front = newNode; //고양이  큐에 추가 
		}else {
			qCat.rear.setNext(newNode);
		}
		qCat.rear = newNode;
		qCat.size++;
		qAll.add(newAnimal2);// 공용 큐에 추가 
	}
	
	
	public E adoptAny() { // 개 또는 고양이 중 가장 먼저 들어온 동물을 입양보냄
		
		
		E adopt = qAll.remove(); //공용 큐에서 삭제 후 adopt 에 저장 
		
		if( adopt == qDog.front.getItem()) {//삭제한 adopt가 강아지라면
			qDog.front = qDog.front.getNext();
			qDog.size--;
			if(isEmpty()) qAll.rear = null; //공용 큐가 모두 비었다면 
			
		}else { // 삭제한 adopt 가 고양이라면 
			qCat.front = qCat.front.getNext();
			qCat.size--;
			if(isEmpty()) qAll.rear = null; //공용 큐가 모두 비었다면 
		}
		
		return adopt; 
			
		
			
	}
	public E adoptDog() { //가장 먼저 들어온 개를 입양 보냄 
		
		if (isEmpty()) throw new NoSuchElementException();
		
		Node <E> adopt = qAll.front; //공용 큐에서 
		while(true) {
			
			//공용 큐에서 
			if(qDog.front.getItem() == adopt.getItem()) { //강아지의 큐 맨 앞 아이템과 큐의 맨앞 아이템이 같다면 
				
				qAll.front = qAll.front.getNext();
				qAll.size--;
				break;
			}else { // 공용 큐의 맨 앞이 고양이 일 때 고양이 뒤 강아지를 입양보내는 것 
				adopt = adopt.getNext();// 다음노드로 이동 
				
				if(qDog.front.getItem() == adopt.getItem()) { // 다음 노드로 이동 후 강아지인지 확인후에 강아지라면 ?
					adopt = adopt.getNext(); // 다음노드로 이동 
					qDog.front.setNext(adopt);
					qAll.size--;
					break; // 강아지가 입양 갔으므로 break
				}
			}
		}
		
		// 강아지 큐에서 
		
		E DogFrontItem = qDog.front.getItem();
		qDog.front = qDog.front.getNext();
		qDog.size--;
		
		if(isEmpty()) qAll.rear = null;
		
		return DogFrontItem;
		
	}
	
	
public E adoptCat() { //가장 먼저 들어온 고양이 를 입양 보냄 
	
		if (isEmpty()) throw new NoSuchElementException();
		
		Node <E> adopt = qAll.front; 
		
		//공용 큐에서 
		
		while(true) {
			
			//공용 큐에서 
			if(qCat.front.getItem() == adopt.getItem()) { //고양이  큐 맨 앞 아이템과 큐의 맨앞 아이템이 같다면 
				
				qAll.front = qAll.front.getNext();
				qAll.size--;
				break;
			}else { // 공용 큐의 맨 앞이 강아지  일 때 강이지 뒤 고양이 를 입양보내는 것 
				adopt = adopt.getNext();// 다음노드로 이동 
				
				if(qCat.front.getItem() == adopt.getItem()) { // 다음 노드로 이동 후 고양이 인 지 확인후에 고양이 라면 ?
					adopt = adopt.getNext(); // 다음노드로 이동 
					qAll.front.setNext(adopt);
					qAll.size--;
					break; // 고양이 가 입양 갔으므로 break
				}
			}
		}
		
		// 고양이  큐에서 
		
		E CatFrontItem = qCat.front.getItem();
		qCat.front = qCat.front.getNext();
		qCat.size--;
		
		if(isEmpty()) qAll.rear = null;
		
		return CatFrontItem;
		
	}
	
	
	public void print() {
		
		
		Node<E> adopt = qAll.front;
		if(adopt == null) {
			System.out.println("없움 ");
		}else {
			for(int i = 0; i<qAll.size; i++) {
				
				System.out.print(adopt.getItem() + "\t");
				adopt = adopt.getNext();
			}
		}
		
		
		System.out.println();
	}
	
	

}
