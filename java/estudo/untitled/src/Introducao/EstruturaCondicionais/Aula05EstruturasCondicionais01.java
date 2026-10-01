package Introducao.EstruturaCondicionais;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args){

        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida){
            System.out.println("Você é maior de idade, pode compra bebida alcolica");
        }

        if(!isAutorizadoComprarBebida){
            System.out.println("Não autorizado a comprar bebida alcolíca");
        }
        System.out.println("Fora do if");
    }
}
