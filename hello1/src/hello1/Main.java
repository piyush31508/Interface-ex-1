package hello1;

public class Main {
	public static void main(String[] args) {
		Printable d = new Document("This is an Example of Text Field");
		Printable i = new Image(5.8,4.3);
		d.print();
		i.print();
	}

}
