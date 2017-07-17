package helloworld;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        //Declaração das variáveis
        int valorA;
        int valorB;
        int resultado;
        int aux;
       
        //Imprimindo uma SMS na tela
        System.out.println("Digite 2 valores:");
        //Criação do scanner para entrada de dados
        Scanner entrada = new Scanner(System.in);
        //Pegando os valores digitados
        valorA = entrada.nextInt();
        valorB = entrada.nextInt();
        //Calculo da soma
        resultado = valorA + valorB;
        System.out.println("A soma é: "+resultado);
         //Calculo da subtração
        resultado = valorA - valorB;
        System.out.println("A subtração é: "+resultado);
         //Calculo da multiplicação
        resultado = valorA * valorB;
        System.out.println("A multiplicação é: "+resultado);
         //Tratamento do caso de divisão por zero
        if(valorB == 0){//Se valorB dor igual a Zero
            System.out.println("Não é possível dividir por Zero!");
        }else{//Se o valorB for diferente de zero
            resultado = valorA / valorB;
            System.out.println("A divisão é: "+resultado);
        }
        aux = 5;
        while(aux > 0){
            System.out.println("Ola");
            aux = aux - 1;
        }
        
        for(aux = 5; aux > 0; aux = aux -1){
             System.out.println("Hello");
        }
        
        aux = 5;
        do{
            System.out.println("MARIO");
            aux = aux -1;
        }while(aux > 0);
        
    }
}