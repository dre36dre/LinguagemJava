// Lambdas sempre esta atrelada a uma interface funcional
interface Pessoa{
    void cadastrar(String nome, String sobreNome);// Apenas um método abstrato
}

public class Cadastro {

    public static void main(String[] args){

        //() parametros - -> e o corpo da implementação
        Pessoa pessoa= (nome, sobreNome) -> {
            System.out.println("Nome: "+nome+ "Sobrenome: " +sobreNome);
            return 46;
        };

        int idade= pessoa.cadastrar("Anderson","Freires");

        System.out.println("Idade: " +idade);
    }
}