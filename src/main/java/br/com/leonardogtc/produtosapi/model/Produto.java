package br.com.leonardogtc.produtosapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Nota: POJO (Plain Old Java Object) é uma classe simples que não depende de nenhum framework específico.

/**
 * Classe que representa um produto.
 * Esta classe é um POJO (Plain Old Java Object) que será mapeado para uma tabela no banco de dados usando JPA (Java Persistence API).
 * A annotation @Entity indica que esta classe é uma entidade JPA e será persistida no banco de dados.
 * Os atributos desta classe representam as colunas da tabela correspondente.
 */
@Entity
@Table(name = "produto")
// A annotation @Table é usada para mapear a classe para uma tabela específica no banco de dados.
public class Produto {

    @Column(name = "id") // A annotation @Column é usada para mapear o atributo id para uma coluna no banco de dados.
    @Id // A annotation @Id indica que este atributo é a chave primária da entidade.
    private String id;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private Double preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
