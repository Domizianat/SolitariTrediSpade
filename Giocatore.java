import java.util.ArrayList;


public class Giocatore {
	public boolean GiocaSolitario1(Mazzo mazzo) {
		boolean esito=true;
	int i;
    Conteggio conteggio=new Conteggio();
    conteggio.Conta();
	for (i=0; i<40; i++) {
		if(mazzo.getCarta(i)==conteggio.getConteggio(i)) {
			esito=false;
			break;}
	}
	return esito;}
	
	public void GiocaSolitario2() {
		ArrayList<Carta> mazzo= new ArrayList<Carta>(40);
		int i;
        int j;
        for(j=0; j<4; j++)
              for(i=0; i<10; i++)
                        mazzo.add(new Carta());
              
	Carta[][] tavolo=new Carta[4][9];
	tavolo=riempiTavolo(mazzo);
	ArrayList<Carta> mazzopiccolo= new ArrayList<Carta>();
	mazzopiccolo=mazzoPiccolo(mazzo);
	int z;
	for(z=0; z<4; z++) {
	operazione(confronta(mazzopiccolo.get(z)), mazzopiccolo, tavolo, z);
	}
	if(verifica(tavolo)==true)
		System.out.println("Hai vinto");
	else System.out.println("Hai perso");
	return;
	}


	private boolean verifica(Carta[][] tavolo) {
		boolean ver=true;
		int i;
		int j;
		for(i=0; i<4; i++) {
			for(j=0; j<9; j++) {
				if (tavolo[i][j].getValore()!= tavolo[i][j+1].getValore()-1) {
					ver=false;
					break;
					}}}
		return ver;}
	
	private void operazione(boolean confronta, ArrayList<Carta> mazzopiccolo,Carta[][] tavolo, int i) {
		
		if(confronta==true) {
			mazzopiccolo.get(i+1);
		}
		else {
			tavolo[mazzopiccolo.get(i).getIntSeme()][mazzopiccolo.get(i).getValore()]=mazzopiccolo.get(i);
		}
		
	}

	private boolean confronta(Carta carta) {
		boolean conferma=false;
		if(carta.getValore()==10) {
			conferma=true;
		}
		else;
		return conferma;
		
		
	}

	private ArrayList<Carta> mazzoPiccolo(ArrayList<Carta> mazzo) {
		int i;
		ArrayList<Carta> mazzopiccolo=new ArrayList<Carta>(4);
		for(i=40; i>36; i--)
			mazzopiccolo.add(mazzo.get(i));
		
		return mazzopiccolo;
		
	}

	private Carta[][] riempiTavolo(ArrayList<Carta> mazzo) {
		int i;
		int j;
		Carta[][] tavolo= new Carta[4][9];
		for(i=0; i<4; i++) {
			for(j=0; j<9; j++)
				tavolo[i][j]=mazzo.get(j);
			
				}
		return tavolo;
		
		
	}

}
