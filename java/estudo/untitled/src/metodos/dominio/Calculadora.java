package metodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicarDoisNumeros(int n1, int n2){
        System.out.println(n1 * n2);
    }

    public double divideDoisNumeros(double n1, double n2){
        if(n1 == 0 || n2 == 0 ){
            System.out.println("Digite um valor valido");
            return 0;
        }
        return n1/n2;
    }

    public void imprimeDoisNumeros(double n1, double n2){
        if(n1 ==  0 || n2 == 0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(n1 / n2);
    }

    public void alterarNumeros(int n1, int n2){
        n1 = 99;
        n2 = 100;
        System.out.println("Dentro do alterarNumeros: ");
        System.out.println("Num1 " + n1);
        System.out.println("Num2 " + n2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
