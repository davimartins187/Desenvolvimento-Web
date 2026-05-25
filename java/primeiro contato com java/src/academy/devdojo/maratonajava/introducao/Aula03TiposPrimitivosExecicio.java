package academy.devdojo.maratonajava.introducao;

/*
Pratica

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExecicio {
    public static void main(String[] args) {

        String nome = "Davi Souza Martins";
        String endereço = "Rua legal numero 40028922";
        float salario = 1700.50F;
        String data = "17/05/2026";

        System.out.println("Eu " + nome + "morando no endereço " + endereço + ", confirmmo que recebi o salarío de " + salario + " reais, na data " + data);
    }
}
