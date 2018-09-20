package desing_pattern.behavioral.observer;

public class Musteri implements Abone {

	private Gazete gazete;
	private String isim;
	private String soyisim;
	
	
	
	public Musteri(Gazete gazete, String isim, String soyisim) {
		super();
		this.gazete = gazete;
		this.isim = isim;
		this.soyisim = soyisim;
	}
	
	

	public Musteri() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Gazete getGazete() {
		return gazete;
	}

	public void setGazete(Gazete gazete) {
		this.gazete = gazete;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	@Override
	public void update() {
	
		System.out.println(getIsim()+" "+getSoyisim()+" gazeteyi aldı.");

	}

	@Override
	public void aboneligiIptalEt() {
		
		getGazete().aboneSil(this);
		System.out.println(getIsim()+" "+getSoyisim()+" aboneliği iptal edildi");

	}

	@Override
	public void aboneOl(Gazete gazete) {
		// TODO Auto-generated method stub
		setGazete(gazete);
		getGazete().aboneEkle(this);
		System.out.println(getIsim()+" "+getSoyisim()+" abone oldu");
	}

}
