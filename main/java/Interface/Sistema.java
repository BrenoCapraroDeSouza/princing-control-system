
        
package Interface;
import java.util.Scanner;
import poo.br.univali.atividadepratica.dominio.Projeto;
/**
 *
 * @author breno
 */
public class Sistema {
    
   
    public void menu ()
    {
        Scanner leitura = new Scanner(System.in);
        int entrada=0;
        while(entrada != 2){
            System.out.println("BEM VINDO AO PROGRAMA DE PROJETOS");
            System.out.println("\n1- INICIAR PROJETO");
            System.out.println("2- SAIR");
            entrada = leitura.nextInt();
            switch(entrada){
                case 1:
                    leitura.nextLine();
                    System.out.println("Entre com os dados do projeto");
                    System.out.println("\n Qual o nome do projeto?");
                    String nome = leitura.nextLine();
                    System.out.println("Qual a data de inicio?");
                    String dataInicio = leitura.nextLine();
                    System.out.println("Qual a data do fim?");
                    String dataFim = leitura.nextLine();
                    System.out.println("Qual a margem de lucro (%)?");
                    double margemLucro = leitura.nextDouble();
                    leitura.nextLine();
                    
                    Projeto a = new Projeto(nome,dataInicio,dataFim,margemLucro);
                    char entradaChar = '\0';
                    char charAux = '\0';
                    while(entradaChar!='N' && entradaChar !='n'){
                        System.out.println("Adicionar despesa (S/N) ?");
                        entradaChar = leitura.next().charAt(0);
                        if(entradaChar == 'N' || entradaChar == 'n') break;
                        System.out.println("Despesa MaoDeObra (M), despesa Aquisicao (A)");
                        charAux = leitura.next().charAt(0);
                        if(charAux == 'M' || charAux == 'm'){
                            System.out.println("Descreve a despesa");
                            leitura.nextLine();
                            String descricao = leitura.nextLine();
                            System.out.println("Quantidade de horas");
                            int qtdeHoras = leitura.nextInt();
                            leitura.nextLine();
                            System.out.println("Dificuldade Facil(F) Medio(M) Dificil (D)");
                            char dificuldade = leitura.next().charAt(0);
                            
                            a.adicionarDespesa(descricao, qtdeHoras, dificuldade);
                        }
                        else if(charAux == 'A' || charAux == 'a'){
                            System.out.println("Descreve a despesa");
                            leitura.nextLine();
                            String descricao = leitura.nextLine();
                            System.out.println("Valor unitario");
                            double valorUnitario = leitura.nextDouble();
                            leitura.nextLine();
                            System.out.println("Quantidade adquirida");
                            int quantidadeItens = leitura.nextInt();
                            leitura.nextLine();
                            
                            a.adicionarDespesa(descricao, valorUnitario, quantidadeItens);
                        }
                    }
                    
                    System.out.println("Custo do projeto eh: " + a.calcularCustoTotal());
                    System.out.println("Preco a cobrar eh: " + a.calcularPrecoFinal());
                    break;
                case 2: 
                    break;
                default:
                    System.out.println("Escolha uma opcao valida");
            }
        }
        
        
        
    }
}
