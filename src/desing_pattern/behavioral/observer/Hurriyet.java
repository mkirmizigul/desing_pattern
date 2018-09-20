package desing_pattern.behavioral.observer;

import java.util.ArrayList;

public class Hurriyet implements Gazete {

	private ArrayList<Abone> aboneler=new ArrayList<Abone>();
		
	@Override
	public void aboneEkle(Abone abone) {
		// TODO Auto-generated method stub
		getAboneler().add(abone);
	}

	@Override
	public void aboneSil(Abone abone) {
		// TODO Auto-generated method stub
		getAboneler().remove(abone);
	}
	
	
	

	public ArrayList<Abone> getAboneler() {
		return aboneler;
	}

	public void setAboneler(ArrayList<Abone> aboneler) {
		this.aboneler = aboneler;
	}

	@Override
	public void gazeteGonder() {
		// TODO Auto-generated method stub
		for (int i = 0; i < aboneler.size(); i++) {
			getAboneler().get(i).update();
		}
	}

}
