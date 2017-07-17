package exemploclasse;
public class Matematica {
    /** Atributos*/
    private int valorA;
    private int valorB;
    private int resultado = 0;
    
    /** Construtores*/
    public Matematica(){
        
    }
    /**Metodos*/
    public int getResultado(){
        return resultado;
    }
    /*Soma*/
    public void soma(int a, int b){
        resultado = a + b;
    }
    /*Subtracao*/
    public void subtracao(int a, int b){
        resultado = a - b;
    }
    /*Mult*/
    public void mult(int a, int b){
        resultado = a * b;
    }
    /*Divisao*/
    public void divisao(int a, int b){
        if(b == 0){
            resultado = 0;
        }else{
            resultado = a / b; 
        }
       
    }
}
