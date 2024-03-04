package br.com.ifce.eleicoes;

import java.util.List;

public class Urna {
    public void mostrarDados(List<Candidato> a){
        for (Candidato c: a) {
            System.out.println("#".repeat(30));
            System.out.println("Candidato número " + c.getNumero() + ":");
            System.out.println("Nome: " + c.getNome());
            System.out.println("Cargo: " + c.getCargo());
        }
        return;
    }
}
