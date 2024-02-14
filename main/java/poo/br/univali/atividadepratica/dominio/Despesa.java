/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.br.univali.atividadepratica.dominio;

/**
 *
 * @author breno
 */
  public abstract class Despesa {
    protected String descricao;

    public Despesa(String Descricao) {
        this.descricao = Descricao;
    }
    
     abstract public double calcularCusto();
    
    
    
}
