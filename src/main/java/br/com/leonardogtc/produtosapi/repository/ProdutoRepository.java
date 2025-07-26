package br.com.leonardogtc.produtosapi.repository;

import br.com.leonardogtc.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
