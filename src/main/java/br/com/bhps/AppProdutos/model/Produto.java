package br.com.bhps.AppProdutos.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {

    // Atributos
    @Id                                             // deixa o id como primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera o autoincremento da tabela
    private Long id;

    @Column(nullable = false, unique = true)       // not null e chave única
    private String codigoBarras;

    @Column(nullable = false)    // not null
    private BigDecimal preco;

    @Column(nullable = false)    // not null
    private String nome;

    // Contrutores
    public Produto(){}

    public Produto(Long id, String codigoBarras, BigDecimal preco, String nome) {
        this.id = id;
        this.codigoBarras = codigoBarras;
        this.preco = preco;
        this.nome = nome;
    }

    // Funções de alteração (GET e SET)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
