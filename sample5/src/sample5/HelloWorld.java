package sample5;

public class HelloWorld {

	public static void main(String[] args) {
		// Create an instance of MessagePrinter
        MessagePrinter printer = new MessagePrinter();
        
        // Invoke the sayHello() method
        String message = printer.sayHello();
        System.out.println(message);
	}
}
