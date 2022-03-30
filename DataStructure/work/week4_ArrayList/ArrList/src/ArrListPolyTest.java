
public class ArrListPolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrrListPoly p1 = new ArrrListPoly();
		
		int[] poly1 = {9,0,-3,0,5};
		int p1highestDegree = poly1.length-1;
		p1.setPoly(p1highestDegree, poly1);
		//System.out.print(
		printPolyEq(p1,1);
		
		ArrrListPoly p2 = new ArrrListPoly();
		int[] poly2 = {2,0,4};
		int p2highestDegree = poly2.length-1;
		p2.setPoly(p2highestDegree, poly2);
		//System.out.print(
		printPolyEq(p2,3);
		
		ArrrListPoly p3 = p1.sumPoly(p2);
		printPolyEq(p3,1);
		
	}
	
	public static void printPolyEq(ArrrListPoly p, int nTabs) {
		for( int i = 0; i < nTabs; i++) System.out.printf("\t");
		for(int i = p.getHighestDegree(); i >= 0; i--)
			System.out.printf("%+d x%d\t", p.peek(i), i);
		System.out.println();
	}

}
