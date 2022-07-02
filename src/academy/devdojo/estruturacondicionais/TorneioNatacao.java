package academy.devdojo.estruturacondicionais;

public class TorneioNatacao {
    public static void main(String[] args) {
        String nome = "Luffy";
        int idade = 19;

        if(idade <=10){
            System.out.println(nome +" Participara da categoria infantil");
        } else if (idade >=11 && idade <= 15) {
            System.out.println(nome +" Participara da categoria Juvenil");
        } else if (idade >=16 && idade <= 19) {
            System.out.println(nome +" Participara da categoria Pré Adulto");
        }else{
            System.out.println(nome +" Participara da categoria Adulto");

        }
    }
}
