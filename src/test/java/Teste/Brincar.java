package test.java.Teste;

public class Brincar {
    public static void main(String[] args) {
//        DadosUsuario user = new DadosUsuario();
//        user.setNome("zuleide ");
//        System.out.println(user.getNome());
//
//        user.setIdade(22);
//        user.setIdade(23);
//
//        System.out.println(user.getIdade());
//        System.out.println(user.getIdade());

        ContaBancaria contaBancaria = new ContaBancaria("Alerrandro", 4000);//Dados do Cliente
        Banco banco = new Banco();//Trabalho do banco
        banco.adicionarConta(contaBancaria);


        //Mostrar imagem e vídeos chamadas atravéis do GoogleMeet
        //Uma breve recapitulada no Encapisulamento do java
        //Soube de uma função nova de Banco de dados do java que é o substring(0,1) mostra o 0 e não o 1
        //Vi um novo código para apronfundar o meu conhecimento
        //Modifiquei variáveis para melhor entendimento no mundo real !

        String nome = "Alerrandro";
        String nomeMausculo = nome.toUpperCase();
        System.out.println(nomeMausculo);

        String t1 = new String("Alerrandro");

        if (!nomeMausculo.equals(t1)){
            System.out.println("Deu certo =D");
        }else {
            System.out.println("Deu errado ):");
        }
    }
}
