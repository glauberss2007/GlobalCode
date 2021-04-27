/**
 * @author Globalcode 
 * TesteGravacaoCliente.java
 */

package aj_4_api.aj4lab02_01.aj4lab02_01.src.main.java.br.com.globalcode.teste;

import br.com.globalcode.model.Cliente;
import java.io.FileOutputStream;
import java.io.IOException;

public class TesteGravacaoCliente {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Joao da Silva", "11-8558-7447", "11232404-6", 1);
        String nomeArquivo1 = "Cliente" + cliente1.getCpf() + ".ser";

        try (FileOutputStream gravador = new FileOutputStream(nomeArquivo1)){
            

            /* 
		     * preencha o codigo de escrita de objeto a partir deste ponto
		     *  
		     */


            
            
			System.out.println("Cliente gravado com sucesso!!");
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
    }
}
