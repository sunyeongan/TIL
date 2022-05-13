package Tree;

import java.util.LinkedList;

public class BinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//노드 생성  문제 2번 
		Node height4_Node = new Node(800,null,null);
		Node height3_Node1 = new Node(400, height4_Node,null);
		Node height3_Node2 = new Node(500, null,null);
		Node height3_Node3 = new Node(600, null, null);
		Node height3_Node4 = new Node(700,null,null);
		Node height2_Node1 = new Node(200,height3_Node1, height3_Node2);
		Node height2_Node2 = new Node(300,height3_Node3, height3_Node4);
		
		
		Node ta8=new Node(800,null,null);
		Node ta7=new Node(700,null,null);
		Node ta6=new Node(600,null,null);
		Node ta5=new Node(500,null,null);
		Node ta4=new Node(400,ta8,null);
		Node ta3=new Node(300,ta6,ta7);
		Node ta2=new Node(200,ta4,ta5);
		Node ta=new Node(100,ta2,ta3);
		
		Node tb9=new Node(700,null,null);
		Node tb8=new Node(600,null,null);
		Node tb7=new Node(70,null,null);
		Node tb6=new Node(9,null,null);
		Node tb5=new Node(7,null,null);
		Node tb4=new Node(300,tb8,tb9);
		Node tb3=new Node(3,tb6,tb7);
		Node tb2=new Node(2,tb4,tb5);
		Node tb=new Node(1,tb2,tb3);
		
		
		
		//이진트리 생성 
		Node root = new Node(100,height2_Node1,height2_Node2);
		
		
		
		
		
		BinaryTree t1  = new BinaryTree();
		BinaryTree t2  = new BinaryTree();
		BinaryTree tNew = new BinaryTree();
		BinaryTree tA  = new BinaryTree();
		BinaryTree tB  = new BinaryTree();
		
		
		
		
		LinkedList<Node> result  =new LinkedList<Node>();
		
		// 루트 노드를 이진트리 클래스에 직접 전달 
		t1.root = root; 
		t2.root = root;
		
		tA.root = ta;
		tB.root = tb;
		
		int NULL = -1;
		int arr [] = {NULL,10,20,30,40,50,60,70}; //자바 배열에 null 넣는 방법 찾기 
		
		System.out.println("트리 노드 수 "+ t1.size(root));
		System.out.println("트리 높이  "+ t1.height(root));
		System.out.print("전위순회 : ");
		t1.preorder(root);
		System.out.println();
		System.out.print("중위순회 : ");
		t1.inorder(root);
		System.out.println();
		System.out.print("후위순회 : ");
		t1.postorder(root);
		System.out.println();
		System.out.print("레벨순회 : ");
		t1.levelorder(root);
		System.out.println();
		
		System.out.print("btree2intarr() : ");
		t1.btree2intarr();
		System.out.println();
		
		System.out.print("intarr2btree() : ");
		tNew.intarr2btree(arr);
		System.out.println();
		
		
		result = tA.subTreeCompare(tB);
		int index = 1;
		
		while(!result.isEmpty()) {
			System.out.println("Found a matching subtree "+index+":");
			tA.levelorder(result.removeFirst());
			System.out.println();
			index++;
			
		}
		
		
		
		
		

	}

}
