package EstruturaCondicionais;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args){
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reais para o DevDojo";
        String mensagemNãoDoar = "Ainda não tenho condições, mas vou ter";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNãoDoar;

        System.out.println(resultado);
    }
}
