public class ArrayListCarros{
    public static void main(String[] args){
        ArrayList<String> carros= new ArrayList<>();


        carros.add("KOMBI");
        carros.add("FUSCA");
        carros.add("CARNIVAL");
        carros.add("SIENA");
        carros.add("KA");

        System.out.println(carros);

        //substitui FUSCA por FUSION

        carros.set(1,"Fusion");

        
    }
}