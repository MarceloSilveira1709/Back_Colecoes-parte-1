import java.util.ArrayList;
import java.util.Collections;

public class Lista_ordenada {
    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Natalia Passos");
        nomes.add("Marcelo Silveira");
        nomes.add("Cecilia Passos");
        nomes.add("Angela Souza");


        Collections.sort(nomes);


        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
