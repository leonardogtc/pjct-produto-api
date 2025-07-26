package br.com.leonardogtc.produtosapi.controller;

import br.com.leonardogtc.produtosapi.model.Produto;
import br.com.leonardogtc.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static java.util.UUID.randomUUID;

/**
 * Controlador REST para gerenciar produtos.
 * Este controlador é responsável por expor endpoints para operações CRUD (Create, Read, Update, Delete) de produtos.
 * A annotation @RestController indica que esta classe é um controlador Spring MVC e que os métodos retornam dados diretamente no corpo da resposta HTTP.
 * A annotation @RequestMapping define a rota base para todos os endpoints deste controlador.
 */
@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    /**
     * Construtor do controlador ProdutoController.
     * Este construtor recebe um ProdutoRepository que será usado para interagir com a camada de persistência de dados.
     * A injeção de dependência é feita pelo Spring, permitindo que o repositório seja usado para operações CRUD.
     *
     * @param produtoRepository O repositório de produtos usado para acessar os dados dos produtos.
     */
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    /**
     * Endpoint para salvar um produto.
     * Este método é mapeado para o método HTTP POST e espera receber um objeto Produto no corpo da requisição.
     * A lógica de persistência do produto deve ser implementada dentro deste método.
     *
     * @param produto O produto a ser salvo.
     *                O annotation @PostMapping indica que este método deve ser chamado quando uma requisição HTTP POST for feita para a rota /produtos.
     *                O annotation @RequestBody indica que o corpo da requisição deve ser convertido em um objeto Produto.
     */
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        // Lógica para salvar o produto
        // Aqui você pode implementar a lógica para salvar o produto no banco de dados ou em outra fonte de dados.
        // Por exemplo, você pode usar um repositório Spring Data JPA para persistir o produto.
        System.out.println("Produto salvo: " + produto);
        var id = UUID.randomUUID().toString(); // Gera um ID único para o produto
        produto.setId(id); // Define o ID gerado no produto
        produtoRepository.save(produto); // Salva o produto no repositório
        return produto; // Retorna o produto salvo, você pode retornar um objeto diferente se necessário.
    }

    /**
     * Endpoint para obter um produto por ID.
     * Este método é mapeado para o método HTTP GET e espera receber um ID de produto na URL.
     * A lógica de busca do produto deve ser implementada dentro deste método.
     *
     * @param id O ID do produto a ser obtido.
     * O annotation @GetMapping indica que este método deve ser chamado quando uma requisição HTTP GET for feita para a rota /produtos/{id}.
     */
    @GetMapping("/{id}")
    public Produto obterProdutoPorId(@PathVariable("id") String id) {
        return produtoRepository.findById(id).orElse(null); // Busca o produto pelo ID
    }
}
