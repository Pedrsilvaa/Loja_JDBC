
package model;

public class Produto {
    private short ID;
    private String Nome, Marca;
    private float Valor;
    private short Estoque;
    
    public short getID() {
        return this.ID;
    }
    
    public void setID(short id) {
        this.ID = id;
    }
    
    public String getNome() {
        return this.Nome;
    }
    
    public void setNome(String nome) {
        this.Nome = nome;
    }
    
    public String getMarca() {
        return this.Marca;
    }
    
    public void setMarca(String marca) {
        this.Marca = marca;
    }
    
    public float getValor() {
        return this.Valor;
    }
    
    public void setValor(float valor) {
        this.Valor = valor;
    }
    
    public short getEstoque() {
        return this.Estoque;
    }
    
    public void setEstoque(short estoque) {
        this.Estoque = estoque;
    }
}
