
import java.util.ArrayList;

public class Mazzo2{
          
          ArrayList<Carta> mazzo= new ArrayList<Carta>(40);
          
          public Mazzo2() {
              int i;
              int j;
              for(j=0; j<4; j++)
                    for(i=0; i<10; i++)
                              mazzo.add(new Carta());
                    
           }
                          
            public void StampaMazzo() {
                 int k=0;
                 for (k=0; k<40; k++) {
                 System.out.println(mazzo.get(k).getValore()+"--"+mazzo.get(k).getSeme());
                 }
            }
            }
                          
