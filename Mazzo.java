import java.util.Random;

public class Mazzo {
	
	int mazzo[] = new int [40];
	
    public void PrendiMazzo() {
    	int i;
    	int j=0;
    	
	for (i=0; i<40; i=i+10) {
		
		int k=0;
		for(j=i; j<40; j++) {
			this.mazzo [j]= k+1;
			k=k+1;
		}
	}
}

	public int getCarta(int i) {
		return this.mazzo[i];
		
	}

	public int[] MischiaMazzo() {
			Random rgen = new Random();		
	 
			for (int i=0; i<mazzo.length; i++) {
			    int randomPosition = rgen.nextInt(mazzo.length);
			    int temp = mazzo[i];
			    mazzo[i] = mazzo[randomPosition];
			    mazzo[randomPosition] = temp;
			}
	 
			return mazzo;
		}


	//public boolean Gioca() {
		 //boolean esito=false;
		//int i=0;
		//while (i<40){
		   //if (mazzo[i]==1 || mazzo[i+1]==2 || mazzo[i+2]==3) {
				//System.out.println("HAI PERSO :(");
				//break;}
			//else i=i+3;
		//}
		//if (i==39) {
			//esito=true;
			//System.out.println("HAI VINTO! :)");
		//}
		//return esito;
	//}
	public boolean GiocaSolitario1(Mazzo mazzo) {
	int i;
	boolean esito=true;
    Conteggio conteggio=new Conteggio();
    conteggio.Conta();
	for (i=0; i<40; i++) {
		if(mazzo.getCarta(i)==conteggio.getConteggio(i)) {
			esito=false;
			break;}
	}
	return esito;}
	
	//public double probabilitaSolitario1(int tentativi, Mazzo mazzo){
	//int vittorie=0;
	//int i;
	//double prob=0;
	//prob=0;
	//for (i=0; i<tentativi; i++) {
		//if (this==true)
			//vittorie++;

		//}



	
    public double probabilitaSolitario1(int tentativi, Mazzo mazzo){
	int vittorie=0;
	int i;
	double prob=0;
	for (i=0; i<tentativi; i++) {
		mazzo.MischiaMazzo();
	    mazzo.GiocaSolitario1(mazzo);
	    if (mazzo.GiocaSolitario1(mazzo)==true)
	    	vittorie=vittorie+1;
	    }
	prob=(vittorie*100./tentativi);
	System.out.println("Hai vinto "+vittorie+" volte"+" su "+tentativi+"! La probabilità di vittoria di questo solitario è del "+prob+"%");
	return prob;
	}
	


}

