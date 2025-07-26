package br.com.leonardogtc.produtosapi.controller;

import br.com.leonardogtc.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Controlador REST para gerenciar produtos.
 * Este controlador é responsável por expor endpoints para operações CRUD (Create, Read, Update, Delete) de produtos.
 * A annotation @RestController indica que esta classe é um controlador Spring MVC e que os métodos retornam dados diretamente no corpo da resposta HTTP.
 * A annotation @RequestMapping define a rota base para todos os endpoints deste controlador.
 */
@RestController
@RequestMapping("produtos")
public class ProdutoController {

    /**
     * Endpoint para salvar um produto.
     * Este método é mapeado para o método HTTP POST e espera receber um objeto Produto no corpo da requisição.
     * A lógica de persistência do produto deve ser implementada dentro deste método.
     *
     * @param produto O produto a ser salvo.
     * O annotation @PostMapping indica que este método deve ser chamado quando uma requisição HTTP POST for feita para a rota /produtos.
     * O annotation @RequestBody indica que o corpo da requisição deve ser convertido em um objeto Produto.
     */
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        // Lógica para salvar o produto
        // Aqui você pode implementar a lógica para salvar o produto no banco de dados ou em outra fonte de dados.
        // Por exemplo, você pode usar um repositório Spring Data JPA para persistir o produto.
        System.out.println("Produto salvo: " + produto);
        return produto; // Retorna o produto salvo, você pode retornar um objeto diferente se necessário.
    }
}
