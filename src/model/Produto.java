
package model;

public class Produto {
    // Atributos
    private int ID;
    private String Nome, Marca;
    private double Valor;
    private int Estoque;
    
    // Métodos get e set para ID
    public int getID() {
        return this.ID;
    }
    public void setID(int id) {
        this.ID = id;
    }
    
    // Métodos get e set para Nome
    public String getNome() {
        return this.Nome;
    }
    public void setNome(String nome) {
        this.Nome = nome;
    }
    
    // Métodos get e set para Marca
    public String getMarca() {
        return this.Marca;
    }
    public void setMarca(String marca) {
        this.Marca = marca;
    }
    
    // Métodos get e set para Valor
    public double getValor() {
        return this.Valor;
    }
    public void setValor(double valor) {
        this.Valor = valor;
    }
    
    // Métodos get e set para Estoque
    public int getEstoque() {
        return this.Estoque;
    }
    public void setEstoque(int estoque) {
        this.Estoque = estoque;
    }
    
}
