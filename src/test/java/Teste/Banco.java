package test.java.Teste;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> pegaLista = new ArrayList();

    public void adicionarConta(ContaBancaria novaConta){
        pegaLista.add(novaConta); //Pega a lista e adiciona uma nova conta
    }
}
