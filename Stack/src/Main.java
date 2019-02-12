
public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack= new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.print();
		System.out.println("El elemento que sacaste es: "+stack.peek());
		stack.print();
		System.out.println("El elemento que sacaste es: "+stack.pop());
		stack.print();
		System.out.println("El elemento que sacaste es: "+stack.pop());
		stack.print();
		System.out.println("El elemento que sacaste es: "+stack.pop());
		stack.print();
	}

}
