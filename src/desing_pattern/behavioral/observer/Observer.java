package desing_pattern.behavioral.observer;

public class Observer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gazete hurriyet=new Hurriyet();
		
		Abone musteri1=new Musteri(hurriyet,"Murat","Kırmızıgül");
		Abone musteri2=new Musteri(hurriyet,"Mehmet","Korkmaz");
		
		musteri1.aboneOl(hurriyet);
		
		musteri2.aboneOl(hurriyet);
		
		hurriyet.gazeteGonder();
		
		musteri2.aboneligiIptalEt();
		
		hurriyet.gazeteGonder();

	}

}
