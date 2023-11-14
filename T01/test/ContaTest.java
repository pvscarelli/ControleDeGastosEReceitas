
import java.io.IOException;
import java.time.LocalDate;
import model.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContaTest {
    
    @Test
    public void testSaldoAtual() {
        Conta c1 = new Conta();
        
        c1.setSaldoAtual();
        
        double valor1 = c1.getSaldoAtual();
        Receita r1 = new Receita();
        r1.setData(LocalDate.parse("2023-11-05"));
        r1.setDescricao("Teste1");
        r1.setValor(1000);
        r1.setTipoRecebimento(TipoRecebimento.SALARIO);
        
        Despesa d1 = new Despesa();
        d1.setData(LocalDate.parse("2023-11-05"));
        d1.setDescricao("Teste1");
        d1.setValor(400);
        d1.setTipoGasto(TipoGasto.ALIMENTACAO);
        
        Receita r2 = new Receita();
        r2.setData(LocalDate.parse("2024-01-05"));
        r2.setDescricao("Teste1");
        r2.setValor(1000);
        r2.setTipoRecebimento(TipoRecebimento.SALARIO);
        
        Despesa d2 = new Despesa();
        d2.setData(LocalDate.parse("2024-01-05"));
        d2.setDescricao("Teste1");
        d2.setValor(400);
        d2.setTipoGasto(TipoGasto.ALIMENTACAO);
        
        c1.incluirDespesa(d1);
        c1.incluirDespesa(d2);
        c1.incluirReceita(r1);
        c1.incluirReceita(r2);
        
        c1.setSaldoAtual();
        
        assertEquals(valor1 + 600, c1.getSaldoAtual(), 0.99);
    }
    
    @Test
    public void testSaldo() {
        Conta c1 = new Conta();
        
        c1.setSaldo();
        double valor1 = c1.getSaldo();
        
        Receita r1 = new Receita();
        r1.setData(LocalDate.parse("2023-11-05"));
        r1.setDescricao("Teste1");
        r1.setValor(1000);
        r1.setTipoRecebimento(TipoRecebimento.SALARIO);
        
        Despesa d1 = new Despesa();
        d1.setData(LocalDate.parse("2023-11-05"));
        d1.setDescricao("Teste1");
        d1.setValor(400);
        d1.setTipoGasto(TipoGasto.ALIMENTACAO);
        
        Receita r2 = new Receita();
        r2.setData(LocalDate.parse("2024-01-05"));
        r2.setDescricao("Teste1");
        r2.setValor(2000);
        r2.setTipoRecebimento(TipoRecebimento.SALARIO);
        
        Despesa d2 = new Despesa();
        d2.setData(LocalDate.parse("2024-01-05"));
        d2.setDescricao("Teste1");
        d2.setValor(800);
        d2.setTipoGasto(TipoGasto.ALIMENTACAO);
        
        c1.incluirDespesa(d1);
        c1.incluirDespesa(d2);
        c1.incluirReceita(r1);
        c1.incluirReceita(r2);
        c1.setSaldo();
        
        assertEquals(valor1 + 1800, c1.getSaldo(), 0.99);
    }
    
    @Test
    public void testGetReceitas() {
        Conta c1 = new Conta();
        
        int receitasImportadas = c1.getReceitas().size();
        
        Receita r1 = new Receita();
        r1.setData(LocalDate.parse("2023-11-05"));
        r1.setDescricao("Teste1");
        r1.setValor(1000);
        r1.setTipoRecebimento(TipoRecebimento.SALARIO);
        
        Despesa d1 = new Despesa();
        d1.setData(LocalDate.parse("2023-11-05"));
        d1.setDescricao("Teste1");
        d1.setValor(400);
        d1.setTipoGasto(TipoGasto.ALIMENTACAO);
        
        Receita r2 = new Receita();
        r2.setData(LocalDate.parse("2024-01-05"));
        r2.setDescricao("Teste1");
        r2.setValor(2000);
        r2.setTipoRecebimento(TipoRecebimento.SALARIO);
        
        Despesa d2 = new Despesa();
        d2.setData(LocalDate.parse("2024-01-05"));
        d2.setDescricao("Teste1");
        d2.setValor(800);
        d2.setTipoGasto(TipoGasto.ALIMENTACAO);
        
        c1.incluirDespesa(d1);
        c1.incluirDespesa(d2);
        c1.incluirReceita(r1);
        c1.incluirReceita(r2);
        
        assertEquals(receitasImportadas + 2, c1.getReceitas().size());
    }
    
    @Test
    public void testGetDespesas() {
        Conta c1 = new Conta();
        
        int despesasImportadas = c1.getDespesas().size();
        Receita r1 = new Receita();
        r1.setData(LocalDate.parse("2023-11-05"));
        r1.setDescricao("Teste1");
        r1.setValor(1000);
        r1.setTipoRecebimento(TipoRecebimento.SALARIO);
        
        Despesa d1 = new Despesa();
        d1.setData(LocalDate.parse("2023-11-05"));
        d1.setDescricao("Teste1");
        d1.setValor(400);
        d1.setTipoGasto(TipoGasto.ALIMENTACAO);
        
        Receita r2 = new Receita();
        r2.setData(LocalDate.parse("2024-01-05"));
        r2.setDescricao("Teste1");
        r2.setValor(2000);
        r2.setTipoRecebimento(TipoRecebimento.SALARIO);
        
        Despesa d2 = new Despesa();
        d2.setData(LocalDate.parse("2024-01-05"));
        d2.setDescricao("Teste1");
        d2.setValor(800);
        d2.setTipoGasto(TipoGasto.ALIMENTACAO);
        
        c1.incluirDespesa(d1);
        c1.incluirDespesa(d2);
        c1.incluirReceita(r1);
        c1.incluirReceita(r2);
        
        assertEquals(despesasImportadas + 2, c1.getDespesas().size());
    }
    
    @Test
    public void testOrdenacaoMovimentos() {
        Conta c1 = new Conta();
        
        Receita r1 = new Receita();
        r1.setData(LocalDate.parse("2024-01-05"));
        r1.setDescricao("Teste1");
        r1.setValor(2000);
        r1.setTipoRecebimento(TipoRecebimento.SALARIO);
        
        Despesa d1 = new Despesa();
        d1.setData(LocalDate.parse("2022-01-05"));
        d1.setDescricao("Teste1");
        d1.setValor(800);
        d1.setTipoGasto(TipoGasto.ALIMENTACAO);
        
        c1.incluirReceita(r1);
        c1.incluirDespesa(d1);
        
        c1.movimentosEmOrdemCrescente();
        assertEquals(d1.getData(), c1.getMovimentos().get(0).getData());
    }
    
    @Test
    public void salvarEler() throws IOException {
        Conta c1 = new Conta();
        Arquivo a1 = new Arquivo();
        Receita r1 = new Receita();
        
        int movimentosImportados = c1.getMovimentos().size();
        
        r1.setData(LocalDate.parse("2024-01-05"));
        r1.setDescricao("SalvarEler");
        r1.setValor(2000);
        r1.setTipoRecebimento(TipoRecebimento.SALARIO);
        
        a1.salvar(r1);
        
        assertEquals("SalvarEler", a1.ler().get(movimentosImportados).getDescricao());
    }
    
}
