package sesliHarfler;

public class Main {
	public static void main(String[] args) {
		char harf='E';
		switch(harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.print("Kalın sesli harf");
			break;
		default:
			System.out.println("Ince sesli harf");
		}
	}

}
