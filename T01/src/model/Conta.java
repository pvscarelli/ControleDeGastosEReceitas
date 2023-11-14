package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Conta {

    private ArrayList<Movimento> movimentos = new ArrayList<>();
    private double saldo;
    private double saldoAtual;
    private Arquivo file;

    /**
     * Inicia a conta importando os movimentos que tem salvos no arquivo.
     */
    public Conta() {
        file = new Arquivo();
        for (Movimento m : file.ler()) {
            getMovimentos().add(m);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }

    public void incluirReceita(Receita r) {
        movimentos.add(r);
    }

    public void incluirDespesa(Despesa d) {
        movimentos.add(d);
    }

    /**
     * Faz a conta do saldo disponível com base nos movimentos que aconteceram
     * até o momento.
     */
    public void setSaldoAtual() {

        double saldoAtual = 0;

        for (Movimento r : movimentos) {

            if (LocalDate.now().isAfter(r.getData())) {
                if (r instanceof Receita) {
                    saldoAtual += r.getValor();
                } else {
                    saldoAtual -= r.getValor();
                }
            }
            this.saldoAtual = saldoAtual;
        }
    }

    /**
     * Faz a conta do saldo disponível com base nos movimentos.
     */
    public void setSaldo() {

        double saldo = 0;

        for (Movimento r : movimentos) {
            if (r instanceof Receita) {
                saldo += r.getValor();
            } else {
                saldo -= r.getValor();
            }
        }
        this.saldo = saldo;
    }

    /**
     * Separa as receitas das despesas do ArrayList movimentos.
     *
     * @return Retorna um ArrayList<Receita>
     */
    public ArrayList<Movimento> getReceitas() {
        ArrayList<Movimento> receitas = new ArrayList<>();

        for (Movimento r : movimentos) {
            if (r instanceof Receita) {
                receitas.add(r);
            }
        }
        return receitas;
    }

    /**
     * Separa as despesas das receitas do ArrayList movimentos.
     *
     * @return Retorna um ArrayList<Despesa>
     */
    public ArrayList<Movimento> getDespesas() {
        ArrayList<Movimento> despesas = new ArrayList<>();

        for (Movimento d : movimentos) {
            if (d instanceof Despesa) {
                despesas.add(d);
            }
        }
        return despesas;
    }

    /**
     * Ordena os movimentos na ordem do mais antigo para o mais atual.
     *
     * @return Retorna um ArrayList com os movimentos em ordem crescente.
     */
    public ArrayList<Movimento> movimentosEmOrdemCrescente() {

        Collections.sort(movimentos, (mov1, mov2) -> mov1.getData().compareTo(mov2.getData()));

        return movimentos;
    }
}
