package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class Arquivo {

    OutputStream os;
    OutputStreamWriter osw;
    BufferedWriter bw;
    InputStream is;
    InputStreamReader isr;
    BufferedReader br;

    /**
     * Grava o movimento (receita ou despesa) trazido pelo parâmetro
     *
     * @param m1 Movimento que deseja salvar no arquivo
     * @throws IOException
     */
    public void salvar(Movimento m1) throws IOException {

        try {
            os = new FileOutputStream("C:/Users/A/Desktop/T01.csv", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
        } catch (FileNotFoundException e) {
            System.out.println("Não encontrou o arquivo texto.");
        }
        String objeto = "";
        if (m1 instanceof Receita) {
            objeto += "R;" + m1.getData() + ";" + m1.getValor() + ";" + ((Receita) m1).getTipoRecebimento() + ";" + m1.getDescricao();
        } else if (m1 instanceof Despesa) {
            objeto += "D;" + m1.getData() + ";" + m1.getValor() + ";" + ((Despesa) m1).getTipoGasto() + ";" + m1.getDescricao();
        }
        bw.append(objeto);
        bw.newLine();

        bw.close();
        osw.close();
        os.close();

    }

    /**
     * Lê os movimentos (receita ou despesa) que estão contidos no arquivo e devolve
     * um ArrayList<Movimento> com os movimentos salvos.
     */
    public ArrayList<Movimento> ler() {

        ArrayList<Movimento> movimentos = new ArrayList<>();
        try {
            is = new FileInputStream("C:/Users/A/Desktop/T01.csv");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linha = br.readLine();

            while (linha != null) {

                String[] dados = linha.split(";");

                if (dados[0].equalsIgnoreCase("R")) {

                    Receita receitaNova = new Receita();
                    receitaNova.setData(LocalDate.parse(dados[1]));
                    receitaNova.setValor(Double.parseDouble(dados[2]));

                    if (dados[3].equalsIgnoreCase("SALARIO")) {
                        receitaNova.setTipoRecebimento(TipoRecebimento.SALARIO);
                    } else if (dados[3].equalsIgnoreCase("DECIMO_TERCEIRO")) {
                        receitaNova.setTipoRecebimento(TipoRecebimento.DECIMO_TERCEIRO);

                    } else if (dados[3].equalsIgnoreCase("FERIAS")) {
                        receitaNova.setTipoRecebimento(TipoRecebimento.FERIAS);

                    } else if (dados[3].equalsIgnoreCase("OUTRAS_RECEITAS")) {
                        receitaNova.setTipoRecebimento(TipoRecebimento.OUTRAS_RECEITAS);

                    }
                    receitaNova.setDescricao(dados[4]);

                    movimentos.add(receitaNova);
                } else {
                    Despesa despesaNova = new Despesa();
                    despesaNova.setData(LocalDate.parse(dados[1]));
                    despesaNova.setValor(Double.parseDouble(dados[2]));

                    if (dados[3].equalsIgnoreCase("ALIMENTACAO")) {
                        despesaNova.setTipoGasto(TipoGasto.ALIMENTACAO);

                    } else if (dados[3].equalsIgnoreCase("TRANSPORTE")) {
                        despesaNova.setTipoGasto(TipoGasto.TRANSPORTE);

                    } else if (dados[3].equalsIgnoreCase("RESIDENCIA")) {
                        despesaNova.setTipoGasto(TipoGasto.RESIDENCIA);

                    } else if (dados[3].equalsIgnoreCase("SAUDE")) {
                        despesaNova.setTipoGasto(TipoGasto.SAUDE);

                    } else if (dados[3].equalsIgnoreCase("EDUCACAO")) {
                        despesaNova.setTipoGasto(TipoGasto.EDUCACAO);

                    } else if (dados[3].equalsIgnoreCase("ENTRETENIMENTO")) {
                        despesaNova.setTipoGasto(TipoGasto.ENTRETENIMENTO);
                    } else if (dados[3].equalsIgnoreCase("OUTRAS_DESPESAS")) {
                        despesaNova.setTipoGasto(TipoGasto.OUTRAS_DESPESAS);
                    }

                    despesaNova.setDescricao(dados[4]);

                    movimentos.add(despesaNova);

                }
                linha = br.readLine();
            }

            br.close();
            isr.close();
            is.close();
        } catch (FileNotFoundException e) {
            System.out.println("Não encontrou o arquivo texto.");
        } catch (IOException ex) {
            System.out.println("Não conseguiu ler a linha.");
            return null;
        }

        return movimentos;

    }

}
