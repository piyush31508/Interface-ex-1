package hello1;

public class Document implements Printable{

	String text;
	public Document(String t){
		text = t;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Text Field :\n"+text);
		}

}
