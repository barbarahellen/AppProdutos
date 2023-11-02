package br.com.bhps.AppProdutos.service.interfaces;

import java.util.Optional;
import java.util.List;

import br.com.bhps.AppProdutos.model.Produto;

public interface ProdutoServiceInterface {
    Produto save(Produto produto);
    Optional<Produto> getById(Long id);  // optional: estrutura de dados
    List<Produto> getAll();
    Produto update(Produto produto);    // atualiza a lista e mostra a lista atualizada
    void delete(Long id);
    
}
