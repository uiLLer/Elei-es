package br.com.ifce.eleicoes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();
        var candidato1 = new Candidato();
        var candidato2 = new Candidato();
        candidato1.setNome("Cleiton");
        candidato1.setNumero(1);
        candidato1.setCargo("Presidente");
        candidato2.setNome("Rasta");
        candidato2.setNumero(2);
        candidato2.setCargo("Presidente");
        candidatos.add(candidato1);
        candidatos.add(candidato2);

        var urna = new Urna();
        urna.mostrarDados(candidatos);
    }
}
