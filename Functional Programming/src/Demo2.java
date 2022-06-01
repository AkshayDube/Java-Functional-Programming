import java.util.List;

//print Sum, even sum and odd sum of an array using Functional Programming
public class Demo2 {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10);
		
		//Sum of list using FP
		System.out.println("Sum of list is");
		int sum=list.stream().reduce(0,(num1,num2)->num1+num2);
		System.out.println(sum);
		
		//Sum of Even element list using FP
		System.out.println("Sum of Even list is");
		sum=list.stream().filter(e->e%2==0).reduce(0,(num1,num2)->num1+num2);
		System.out.println(sum);
		
		//Sum of Odd element list using FP
		System.out.println("Sum of Odd list is");
		sum=list.stream().filter(e->e%2==1).reduce(0,(num1,num2)->num1+num2);
		System.out.println(sum);
	}
	
}
