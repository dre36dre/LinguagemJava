package Arrays;

import javax.swing.JOptionPane;

public class DeclaracaoArray{
    public static void main(String[] args){
        int[] numeros=new int[4],numero2=new int[10];
        
            int [] iniciaValores={1,2, 89, 9, 6};

            int[] meuArray= new int[10];

        meuArray[0]=100;
        meuArray[1]=12;
        meuArray[2]=17;

        System.out.println(meuArray[2]);
        System.out.println(meuArray[0]);

            String [] paises=new String[5];


            paises[0]="Brasil";
            paises[1]="Itália";
            paises[2]="Áustria";

            /*
            for(int i=0;i<4;i++){
                paises[i]=JOptionPane.showInputDialog("Informe um país");
            }
            
            for (String listaPaises: paises){
                
                System.out.println(listaPaises);
            }
            */
            
            for(int i=0;i<numeros.length;i++) {
            	numeros[i]=
            	Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));

            }
            	int novoValor=11;
            	numeros[0]
            	
            	        =novoValor+4;
            	
            	for(Integer listarNumero : numeros) {
            		System.out.println(listarNumero);
            	}
            	
            
                
    }
}

//continuar nos 10 minutos da aula6.D Arrays
