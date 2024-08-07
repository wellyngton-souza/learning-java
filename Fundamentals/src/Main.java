import java.util.Scanner; // biblioteca do input

public class Main {
    public static void variables(){
        int age = 12;
        double pi = 3.14;
        float e = 2.71f;
        char grade = 'a';

        String nome = "john";

        int age2 = (int) pi;

        System.out.println(age);
        System.out.println(pi);
        System.out.println(e);
        System.out.println(grade);

        System.out.println(age2);
        System.out.println(nome);

        // converte um valor int, float etc para tipo String
        String.valueOf(age);
    }

    public static void arrays(){
        int[] nums = new int[5];

        for(int i = 0; i < nums.length; i++){
            nums[i] = i * 2;
        }

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        String[] nomes = {"java", "c++", "c"};

        for(int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }

        char[] paises = {'i', 'n', 'g', 'l', 'a', 't', 'e', 'r', 'r', 'a'};

        for(int i = 0; i < paises.length; i++){
            System.out.print(paises[i]);
        }
    }

    public static void inputs(){
        System.out.println("\nDigite o seu nome");

        Scanner input = new Scanner(System.in);
        
        System.out.println("nome bonito: " + input.nextLine());

        int idade = input.nextInt();
        System.out.println("idade: " + idade);

        input.close();
    }

    public static void whileLoop(){
        Scanner input = new Scanner(System.in);
        int num = 0;
        int max = input.nextInt();

        while(num < max){
            System.out.print(num + ", ");
            num++;
        };

        input.close();
    }

    public static void callClass(){
        Cars carInstance = new Cars("fiat", 2006);
        
        carInstance.start();
        carInstance.accelerate();
        carInstance.brake();
    }

    public static void createFinal(){
        // com o final, após a criação de valor, ele se torna inalteravel
        final double pi = 3.14;
        System.out.println(pi);
        // pi++;

        // final pode ser muito útil em classes, pois com isso não consigo criar varios valores com o mesmo nome em classes herdadas
    }

    public static void exceptionUse(){
        try{
            int A = 10;
            int B = 0;

            int division = A / B;
            System.out.println(division);
        } catch (ArithmeticException e){
            System.out.println(e + " \n\n linha 1");
        } catch (NumberFormatException ep){
            System.out.println(ep + " \n\n linha 2");
        }
    }

    // String[] args
    // MyApp arg1 arg2
    // argumentos direto pelo prompt

    public static void main(String[] args) {
        exceptionUse();
    }
}
