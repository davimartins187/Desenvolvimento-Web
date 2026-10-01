package Introducao.EstruturasRepeticao;

public class Aula06EstruturasDeRepeticao05 {

    public static void main(String[] args){
        double valorToral = 30000;

        for (int parcela = (int) valorToral; parcela >= 1; parcela--){
            double valorParcela = valorToral / parcela;

            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }
    }
}
