package jsh;

import java.util.Optional;

/**
 * Write a description of class ComandosInternos here.
 *
 * @author Ricardo Inacio Alvares e Silva
 * @version 180823
 */
public final class ComandosInternos {
    
    public static int exibirRelogio() {

        throw new RuntimeException("Método ainda não implementado");
    }
    
    public static int escreverListaArquivos(Optional<String> nomeDir) {
        throw new RuntimeException("Método ainda não implementado");
    }
    
    public static int criarNovoDiretorio(String nomeDir) {
        throw new RuntimeException("Método ainda não implementado");
    }
    
    public static int apagarDiretorio(String nomeDir) {
         Scanner scanner = new Scanner(""); 
            if (Scanner.delete()) { 
                System.out.println("Arquivo deletado: " + Scanner.getName());
    }
    
    public static int mudarDiretorioTrabalho(String nomeDir){
        throw new RuntimeException("Método ainda não implementado");
    }
    
    /**
     * Essa classe não deve ser instanciada.
     */
    private ComandosInternos() {}
}
}
