/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.br.univali.atividadepratica.dominio;

/**
 *
 * @author breno
 */
public class Aquisicao extends Despesa {
    private double valorUnitario;
    private int quantidadeItens;

    public Aquisicao(String descricao, double valorUnitario, int quantidadeItens) {
        super(descricao);
        this.valorUnitario = valorUnitario;
        this.quantidadeItens = quantidadeItens;
    }
    
    public double calcularCusto(){
        return (this.quantidadeItens*this.valorUnitario);
    }
    
}
