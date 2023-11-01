package br.com.bhps.AppProdutos.model;

import java.math.BigDecimal;

public class Produto {

    // Atributos
    private Long id;
    private String codigoBarras;
    private BigDecimal preco;



    // Contrutores
    public Produto(){}

    public Produto(Long id, String codigoBarras, BigDecimal preco) {
        this.id = id;
        this.codigoBarras = codigoBarras;
        this.preco = preco;
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
