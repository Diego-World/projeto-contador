import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1° parametro");
        int parametroUm= sc.nextInt();
        System.out.println("Digite o 2° parametro");
        int parametroDois= sc.nextInt();


        try{

        contar(parametroUm,parametroDois);

        }catch (ParametrosInvalidosException exception){
            System.out.println("O Segundo parametro deve ser maior que o primeiro!");
//            exception.printStackTrace();
        }

    }

    static void contar( int parametroUm,int parametroDois ) throws ParametrosInvalidosException{
        if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
        }
        
        int contagem = (parametroDois-parametroUm);
        for(int i=1;i<=contagem;i++){

            System.out.println("Imprimindo o número "+i);
        }
        System.out.println("Houveram "+contagem+" Iterações");
    }

}