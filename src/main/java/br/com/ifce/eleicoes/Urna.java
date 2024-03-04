package br.com.ifce.eleicoes;

import java.lang.invoke.SwitchPoint;
import java.util.List;
import java.util.Scanner;

public class Urna {
    private List<Candidato> lista;
    private int[] resultado;
    public void setCandidatos(List<Candidato> listaCandidatos){
            if(!listaCandidatos.isEmpty()) {
                this.lista = listaCandidatos;
                this.setIndexResultado();
            } else {
                System.out.println("lista inválida");
            }
    }
    private void mostrarDados(){
        for (Candidato c: this.lista) {
            System.out.println("#".repeat(30));
            System.out.println("Candidato número " + c.getNumero() + ":");
            System.out.println("Nome: " + c.getNome());
            System.out.println("Cargo: " + c.getCargo());
        }
        return;
    }
    public void iniciar(){
        int i = 1;
        while(i != 0){
            System.out.println("""
                ---------------------------
                Bem vindo a urna eletrônica
                1 - Mostrar candidatos
                2 - Votar
                3 - Mostrar resultado das eleições
                0 - Sair
                """);
            Scanner scan = new Scanner(System.in);
            i = scan.nextInt();
            switch (i){
                case 1:
                this.mostrarDados();
                break;
                case 2:
                    int c = 0;
                    System.out.println("Digite o numero do candidato: ");
                    c = scan.nextInt();
                    this.votar(c);
                    break;
                case 3:
                    for(Candidato b: this.lista) {
                        System.out.println("#".repeat(30));
                        System.out.println("Nome do Candidato: " + b.getNome());
                        System.out.println("Quantidade de votos: " + resultado[lista.indexOf(b)]);
                    }
                    break;
                case 0:
                    System.out.println("Saindo da urna...");
                }
        }
    }
    private void setIndexResultado(){
        this.resultado = new int[lista.size()];
        for (int i = 0; i < this.lista.size(); i++) {
            this.resultado[i] = 0;
        }
    }
    private void votar(int c){
        for(Candidato b: this.lista) {
            if(b.getNumero() == c){
                resultado[lista.indexOf(b)] += 1;
            }
        }
    }
}
