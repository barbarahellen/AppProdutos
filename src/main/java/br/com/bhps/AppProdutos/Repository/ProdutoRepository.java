package br.com.bhps.AppProdutos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bhps.AppProdutos.model.Produto;

@Repository
// estende o JpaRepository, passa a classe de entidade e o tipo de dado da chave
public interface ProdutoRepository extends JpaRepository<Produto,Long>{

}
