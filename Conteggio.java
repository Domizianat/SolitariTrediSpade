
public class Conteggio {
		
		int conteggio[]=new int[40];
		
		public void Conta() {
			int i=0;
			int j=0;
			
			for (i=0; i<40; i=i+3) {
			int k=0;
			for (j=i; j<40; j++) {
				conteggio[j]=k+1;
				k=k+1;}}
			}

		public int getConteggio(int i) {
			return this.conteggio[i];
		}

}
