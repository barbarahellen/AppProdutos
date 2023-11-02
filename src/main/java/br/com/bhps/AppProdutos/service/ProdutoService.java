package br.com.bhps.AppProdutos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.bhps.AppProdutos.Repository.ProdutoRepository;
import br.com.bhps.AppProdutos.model.Produto;
import br.com.bhps.AppProdutos.service.interfaces.ProdutoServiceInterface;

public class ProdutoService implements ProdutoServiceInterface{

    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public Optional<Produto> getById(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public List<Produto> getAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto update(Produto produto) {
        Optional<Produto> upProduto = produtoRepository.findById(produto.getId());
        return null; 

    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
