package br.com.ifce.eleicoes;
import java.util.ArrayList;
import java.util.List;
public class Eleicoes {
    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();
        var candidato1 = new Candidato("Cleiton", 1, "Presidente");
        var candidato2 = new Candidato("Rasta", 2, "Presidente");
        candidatos.add(candidato1);
        candidatos.add(candidato2);
        Urna urna = new Urna();
        urna.setCandidatos(candidatos);
        urna.iniciar();
    }
}
