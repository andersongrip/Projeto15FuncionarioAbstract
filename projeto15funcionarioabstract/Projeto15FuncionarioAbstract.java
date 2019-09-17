/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto15funcionarioabstract;

/**
 *
 * @author aluno
 */
public class Projeto15FuncionarioAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Vendedor vendedor1 = new Vendedor(1000, "vend1", 1500);
       Assistente assistente = new Assistente("Assist", 1500);
       Gerente gerente = new Gerente("ger", 2500);
       
       System.out.println("Vendedor: \nNome: " + vendedor1.getNome() + "\nComissão: " + vendedor1.getComissao() + 
                            "\nSalário base: " + vendedor1.getSal_base() + "\nSalário: " + vendedor1.CalcularSalario());
       
       System.out.println("\nAssistente: \nNome: " + assistente.getNome() + "\nSalário base: " + assistente.getSal_base() + 
                                   "\nSalário: " + assistente.CalcularSalario());
       
       System.out.println("\nGerente: \nNome: " + gerente.getNome() + "\nSalário base: " +gerente.getSal_base() + 
                                     "\nSalário: " + gerente.CalcularSalario());
    }
    
}
