package capitulo6;

// A Classe Scope demostra os escopos de campo e variável local.
public class Scope
{

    private static int x = 1;  // campo acessível para todos os métodos desta classe.



    public static void main(String[] args)
    {
        int x = 5; // variável local x do método psvm sombreia o campo x.

        System.out.printf("Variável x no método main é %d%n%n", x);

        useLocalVariable(); // useLocalVariable tem uma variável local x.
        useField(); //useField utiliza o campo x da classe Scope.
        useLocalVariable(); // useLocalVariable reinicializa a variável local x.
        useField(); //campo x da classe Scope retém seu valor.

        System.out.printf("Variável x no método main é %d%n%n", x);
    }


    public static void useLocalVariable()
    {
        int x = 25; // inicializa toda vez que useLocalVariable é chamado.

        System.out.printf("Variável Local x entrando no método useLocalVariable: %d%n", x);
        ++x; //modifica a variável local x deste método.
        System.out.printf("Variável Local x antes de sair do método useLocalVariable: %d%n%n", x);
    }




    public static void useField()
    {
        System.out.printf("Variável Local x entrando no método useField: %d%n", x);
        x *= 10;
        System.out.printf("Variável Local x antes de sair do método useField: %d%n%n", x);

    }
}
