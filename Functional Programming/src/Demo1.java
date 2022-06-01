import java.util.List;

//Program to print a list using FP
//Program to filter list using FP
public class Demo1 {

	public static void main(String[] args) {
		
		List<Integer> list=List.of(1,2,3,4,5,6,7,8,9,10);
		System.out.println("List is");
		printWithFP(list);
		System.out.println("\n\nEven List is");
		printEvenWithFP(list);
		System.out.println("\n\nOdd List is");
		printOddWithFP(list);
		
	}
	
	//Method to simply print list using FP
	static void printWithFP(List list) {
		list.stream()
		.forEach(element->System.out.print(element+" "));
		
	}
	//Method to print even element from list using FP
	static void printEvenWithFP(List list) {
		list.stream()
		.filter(e->(int)e%2==0)
		.forEach(e->System.out.print(e+" "));
	}
	
	//Method to print odd element from list using FP
	static void printOddWithFP(List list) {
		list.stream()
		.filter(e->(int)e%2==1)
		.forEach(e->System.out.print(e+" "));
	}

}
