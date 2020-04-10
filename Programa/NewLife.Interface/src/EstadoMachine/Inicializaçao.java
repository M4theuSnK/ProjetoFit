/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstadoMachine;

import Business.DataConfig.Config;
import Comuns.basis.TipoRepositorio;

/**
 *
 * @author joao-
 */
public class Inicializaçao {
    
    public static EstadoMachine estadoConsole;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Config.getInstance().setDatabase(TipoRepositorio.MYSQL);
        estadoConsole = EnumEstado.Inicio.getEstadoMaquina();
        Boolean saida = false;
        while (!saida){
            saida = estadoConsole.Executa();
        }
    }   
}
