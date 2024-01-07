package capitulo7;
//Demostração da coleção ArrayLista<T> genérica.
import java.util.ArrayList;

public class ArrayListCollection
{
    public static void main(String[] args)
    {
        ArrayList<String> items = new ArrayList<String>();

        items.add("Red");
        items.add(0,"Yellow");

        System.out.print("Demostração da lista com loop com contador controlado: ");

        for(int i = 0; i < items.size(); i++)
            System.out.printf(" %s",items.get(i));

        display(items, "%nDemostração da Lista encadeada: ");

        items.add("Green");
        items.add("Yellow");
        display(items, "Lista com dois novos elementos: ");

        items.remove("Yellow");
        display(items, "Removido o primeiro elemento \"Yellow\": ");

        items.remove(1);
        display(items, "Removido o segundo elemento da lista \"Green\": ");

        System.out.printf("\"Red\" %s está  na lista!%n", items.contains("Red")? "": "não");

        System.out.printf("Tamanho: %s%n", items.size());


    }

    public static void display(ArrayList<String> items, String header)
    {
        System.out.printf(header);

        for(String item : items)
            System.out.printf(" %s", item);

        System.out.println();
    }
}
