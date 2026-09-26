package EstruturaCondicionais;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args){
        double salarioEuros = 45000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioEuros < 34713){
            valorImposto = salarioEuros * primeiraFaixa;
        }
        else if(salarioEuros >= 34713 && salarioEuros <= 68507){
            valorImposto = salarioEuros * segundaFaixa;
        }
        else{
            valorImposto = salarioEuros * terceiraFaixa;
        }

        System.out.println("valor de imposto cobrado: " + valorImposto );
    }
}
