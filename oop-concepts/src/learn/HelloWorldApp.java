package learn;

public class HelloWorldApp {
	public static void main(String[] args) {
		//Ini Anonymous Class
		HelloWorld english = new HelloWorld() {
			public void sayHello() {
				System.out.println("Hello");
			}

			public void sayHello(String name) {
				System.out.println("Hello " + name);
			}
		};

		english.sayHello();
		english.sayHello("English . . .");
	}
}
