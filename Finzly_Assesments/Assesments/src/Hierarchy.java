public class Main {
		
	void show(String s){
		System.out.println("String method");
	}
	void show(Object o){
		System.out.println("Object method");
	}
		
	public static void main(String[] args) {
		Main main = new Main();
		main.show((Object)null);
	}
}
