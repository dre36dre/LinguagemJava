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

public int tamanho(){
return this.tamanho;
}

public String toString(){
    StringBuilder s= StringBuilder();
    s.append("[");

    fOr(int i=0;i<this.tamanho-1;i++){
        s.append(",");
    }
    if(this.tamanho>0){
        s.append(this.elementos[this.tamanho-1];
    }

    s.append("]");

    return s.toString();

}
public String toString(){
    StringBuilder s= new StringBuilder();
    s.append("[");

    for(int i=0;i<this.tamanho-1;i++){
        s.append(this.elementos[i]);
        s.append(",");
    }
    if(this.tamanho>0){
        s.append(this.elementos[this.tamanho-1]);
    }
    s.append("]");
    return Arrays.toString(elementos);
}

}        
