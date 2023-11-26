package farmacia.interfaces;

import farmacia.model.Produto;

public interface ProdutoRepository {
	
	public void criarProduto(Produto produto);
	
	public void listarProdutos();
	
	public void consultarPorId(int id);
	
	public void atualizarProduto(Produto produto);
	
	public void deletarProduto(int id);
	
}
