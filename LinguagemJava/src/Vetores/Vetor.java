public class Vetor{

    private String[] elementos;

    public Vetor(int capacidade){
        this.elementos=new String[capacidade];
    }
    public void adicionar(String elemento){
        for(int i=0;i < elementos.length;i++){
            if(this.elementos[i]==null){
                this.elementos=elemento;
                break;
            }
        }
        if
    }
}