package Construtores;

import Construtores.Aluno.MATRICULA;
import Construtores.Aluno.STATUS;

public class Construtor{
    public static void main(String[] args){
        Aluno a = new Aluno(3,2,5);

    double mediaAluno=a.calcularMediaAluno();
    
    if(mediaAluno < 6){
        a.situacaoAluno=STATUS.REPROVADO;
    }else{
        a.situacaoAluno=STATUS.APROVADO;
    }

System.out.println("Média: "+a.calcularMediaAluno()+ " do aluno esta"+ a.getSituacaoAluno());

//ENUM MATRICULA
a.situacaoAluno=STATUS.RECUSADO ;
System.out.println("O aluno esta: "+a.situacaoAluno);


    }//main
}//classe