/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comuns.basis;

/**
 *
 * @author joao-
 */
public enum TipoRepositorio {
    MYSQL("MySQL");
 
    private String descricao;
 
    TipoRepositorio(String descricao) {
        this.descricao = descricao;
    }
 
    public String getDescricao() {
        return descricao;
    }
}
