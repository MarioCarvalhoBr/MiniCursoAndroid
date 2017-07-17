package exemploclasse;
public class ExemploClasse {
    public static void main(String[] args) {
        Matematica operacao = new Matematica();
        int valor;
        
        operacao.soma(5,2);
        valor = operacao.getResultado();
        System.out.println(valor);
        
        operacao.subtracao(5,2);
        valor = operacao.getResultado();
        System.out.println(valor);

        operacao.mult(5,2);
        valor = operacao.getResultado();
        System.out.println(valor);

        operacao.divisao(5,2);
        valor = operacao.getResultado();
        System.out.println(valor);
    }
    
}
