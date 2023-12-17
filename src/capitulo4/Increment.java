package capitulo4;

public class Increment
{

        public static void main(String[] args)
        {
            int c = 5;
            System.out.printf("C antes da  pós-incrementação: %d%n",c);
            System.out.printf("            pós-incrementando: %d%n",c++);
            System.out.printf("C depois da pós-incrementação: %d%n",c);

            System.out.println("");
            c = 5;

            System.out.printf("C antes da  pré-incrementação: %d%n",c);
            System.out.printf("            pré-incrementando: %d%n",++c);
            System.out.printf("C depois da pré-incrementação: %d%n",c);

        }

}
