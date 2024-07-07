package hello1;

public class Image implements Printable{

	double h,w;
	Image(double a, double b){
		h=a;
		w=b;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Image dimension : \nHeight = "+h+"\nWidth = "+w);
	}

}
