/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.br.univali.atividadepratica.dominio;

/**
 *
 * @author breno
 */
public class Projeto {
    private String nome;
    private String dataInicio;
    private String dataFim;
    private double margemLucro;
    private Despesa listaDespesas[] = new Despesa[999];
    private int contadorLista = 0;

    public Projeto(String nome, String dataInicio, String dataFim, double margemLucro) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.margemLucro = margemLucro;
    }
    
    public double calcularCustoTotal(){
        double custoTotal = 00.00;
        for (Despesa custo:listaDespesas){
            if(custo != null) custoTotal += custo.calcularCusto();
        }
        return custoTotal;
    }
    public double calcularPrecoFinal(){
        double precoFinal = 00.00;
        precoFinal = (calcularCustoTotal()+(calcularCustoTotal()*this.margemLucro/100));
        return precoFinal;
    }
    
    public void adicionarDespesa(String descricao, int qtdeHoras, char dificuldade){
        this.listaDespesas[contadorLista++] = new MaoDeObra(descricao, qtdeHoras, dificuldade);
    }
    
    public void adicionarDespesa(String descricao, double valorUnitario, int qtdItens){
        this.listaDespesas[contadorLista++] = new Aquisicao(descricao, valorUnitario, qtdItens);
    }
   
   
    
    
    
    
}
