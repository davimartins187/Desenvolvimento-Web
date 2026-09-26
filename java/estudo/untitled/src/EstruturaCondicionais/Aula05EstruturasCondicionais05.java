package EstruturaCondicionais;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args){
        //Imprima o dia da semana consdierando 1 como domingo

        byte dia  = 5;
        String diaSemana = "";

        switch (dia){
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terça";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            case 5:
                diaSemana = "Quinta";
                break;
            case 6:
                diaSemana = "Sexta";
                break;
            case 7:
                diaSemana = "Sabado";
                break;
            default:
                System.out.println("Dia da semana invalido");
                break;
        }

        System.out.println("Hoje é " + diaSemana);

        char sexo = 'M';

        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }
    }
}
