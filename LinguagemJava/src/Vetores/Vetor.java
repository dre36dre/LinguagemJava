public class Vetor{

    private String[] elementos;
    private int tamanho;
    public Vetor(int capacidade){
        this.elementos=new String[capacidade];
        this.tamanho=0;
    }

    public boolean adicionar(String elemento){
       if(tamanho < elementos.length){
        elementos[tamanho]=elemento;
        tamanho++;
        return true;
       }
       return false;
        }
}        
