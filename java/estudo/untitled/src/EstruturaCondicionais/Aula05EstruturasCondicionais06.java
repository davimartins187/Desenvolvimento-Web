package EstruturaCondicionais;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args){

        int dia = 5;
        boolean isDiaUltil = false;

        switch (dia){
            case 1:
            case 7:
                isDiaUltil = false;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                isDiaUltil = true;
                break;
            default:
                System.out.println("Digite u valor valido");
        }

        System.out.println(isDiaUltil == true ? "Hoje é dia util" : "Hoje não é dia util");
    }
}
