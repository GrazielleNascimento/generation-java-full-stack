
package farmacia.controller;

import java.util.ArrayList;
import java.util.Optional;

import farmacia.interfaces.ProdutoRepository;
import farmacia.model.Produto;

public class ProdutoController implements ProdutoRepository {

	// criar a Collection
	private ArrayList<Produto> listaProdutos = new ArrayList<>();

	@Override
	public void criarProduto(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("Produto: " + produto.getId() + " foi criado com sucesso");
	}

	@Override
	public void listarProdutos() {
		for (Produto produto : listaProdutos) {
			produto.visualizar();
		}
	}

	@Override
	public void consultarPorId(int id) {
		Optional<Produto> opProduto = buscarNaCollection(id);
		if (opProduto.isPresent()) {
			System.out.println("PRODUTO: " + opProduto.get());// opProduto.get() retorna um objeto do optional
		} else {
			System.out.println("O Produto do id:  " + id + " não foi cadastrado");
		}

	}

	@Override
	public void atualizarProduto(Produto produto) {
		Optional<Produto> opProduto = buscarNaCollection(produto.getId());
		if (opProduto.isPresent()) {
			listaProdutos.set(listaProdutos.indexOf(opProduto.get()), produto);
			System.out.println("Produto do id: " + produto.getId() + " foi atualizado com sucesso!");
		} else {
			System.out.println("Produto do id " + produto.getId() + " não encontrado!");
		}
	}

	@Override
	public void deletarProduto(int id) {
		Optional<Produto> opProduto = buscarNaCollection(id);
		if(opProduto.isPresent()) {
			if(listaProdutos.remove(opProduto.get()) == true) {
				System.out.println("Produto deletado");
			}
			else {
				System.out.println("Produto não encontrado");
			}
		}

	}
	

}
