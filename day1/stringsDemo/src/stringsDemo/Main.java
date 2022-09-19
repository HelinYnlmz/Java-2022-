package stringsDemo;

public class Main {
	public static void main(String[] args) {		
		String mesaj = "Bugün Hava Çok Güzel";
		System.out.println(mesaj);
		/*
		
		System.out.println("Eleman sayısı : " + mesaj.length()); 
		System.out.println("5. Eleman : " + mesaj.charAt(2)); //istenilen elemanı getirir.
		System.out.println(mesaj.concat("   YAŞASIN !")); 
		System.out.println(mesaj.startsWith("B")); 
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);  //0'dan 5'e kadar olan indexteki karakterleri getirir.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a')); //a'nın kaçıncı indexte olduğunu söyler. ilk bulduğunu verir.
		System.out.println(mesaj.lastIndexOf('e')); //sondan başlayarak e'yi arar. 
		
		*/
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2,5)); //Bir metnin içerisinden index numarasına göre karakterleri alır.
		
		
		for (String kelime:mesaj.split(" ")) {  //her 2 boşluk arası bir kelime
			
			System.out.println(kelime);
			
		}
		
		System.out.println(mesaj.toLowerCase()); 
		
		System.out.println(mesaj.toUpperCase()); 
		System.out.println(mesaj.trim()); //başındaki ve sonundaki boşlukları atar.
		
		
		
	}

}
