package br.com.leonardogtc.produtosapi.repository;

import br.com.leonardogtc.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
    // Método para buscar produtos pelo nome
    // O Spring Data JPA irá gerar a implementação deste método automaticamente com base no nome do método.
    // A convenção de nomenclatura do Spring Data JPA permite que você crie métodos de consulta apenas definindo o nome do método.
    // Neste caso, o método findByNome irá buscar todos os produtos cujo nome corresponda ao parâmetro fornecido.
    List<Produto> findByNome(String nome);
}
