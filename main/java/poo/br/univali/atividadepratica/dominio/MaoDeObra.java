/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.br.univali.atividadepratica.dominio;

/**
 *
 * @author breno
 */
public class MaoDeObra extends Despesa {
    private int quantidadeHoras;
    private char dificuldade;

    public MaoDeObra(String descricao, int quantidadeHoras, char dificuldade) {
        super(descricao); 
        this.quantidadeHoras = quantidadeHoras;
        this.dificuldade = dificuldade;
    }
    
    
    public double calcularCusto(){
        
        switch (this.dificuldade) {
            case 'F':
            case 'f':
                return(this.quantidadeHoras*10.00);
            case 'M':
            case 'm':
                return(this.quantidadeHoras*25.00);
            case 'D':
            case 'd':
                return(this.quantidadeHoras*50.00);
            default:
                break;
        }
        return 00.00;
    }
    
}
