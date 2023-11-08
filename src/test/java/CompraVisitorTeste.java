import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompraVisitorTeste {
    @Test
    void deveExibirProduto() {
        Produto produto = new Produto("notebook", 2000);

        CompraVisitor visitor = new CompraVisitor();
        assertEquals("Produto{nomeProduto=notebook, preco=2000}", visitor.exibir(produto)); //corrigir
    }

    @Test
    void deveExibirEntrega() {
        Entrega entrega = new Entrega("Joao",15.0,"aparelho eletronico");

        CompraVisitor visitor = new CompraVisitor();
        assertEquals("Entrega{numeroPedido=110}", visitor.exibir(entrega)); //corrir

    }

    @Test
    void deveExibirTipoPagamento() {
        TipoPagamento tipoPagamento = new TipoPagamento("cartao", 9, 2);

        CompraVisitor visitor = new CompraVisitor();
        assertEquals("TipoPagamento{formaPagamento=cartao, numeroParcelasMaximas='9', numeroParcelasMinimas=2}", visitor.exibir(tipoPagamento));
    }
}
