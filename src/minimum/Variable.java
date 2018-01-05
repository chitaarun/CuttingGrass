package minimum;

/*Assign value to array elements*/
public class Variable {

	public static void main(String args[]){
	
	int Mark[];
	Mark = new int [5];
	
	Mark [0] =25 ;
	Mark [1] =40 ;
	Mark [2] =52 ;		
	Mark [3] =45 ;
	Mark [4] =65 ;

	int L = Mark.length;
	for (int i=0;i<L; ++i){
		System.out.println("Mark" +i+"] = " +Mark[i]);
		
	}
	
	}
}
