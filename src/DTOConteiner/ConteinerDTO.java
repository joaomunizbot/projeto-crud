
package DTOConteiner;

import java.sql.Date;

public class ConteinerDTO {
    private String nome_cliente, status_conteiner, categoria_conteiner, movimentacao_conteiner;
    private int numero_conteiner, tipo_conteiner, id_conteiner;
    private Date data_inicio, data_final;
    /**
     * @return the nome_cliente
     */
    public String getNome_cliente() {
        return nome_cliente;
    }

    /**
     * @param nome_cliente the nome_cliente to set
     */
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    /**
     * @return the status_conteiner
     */
    public String getStatus_conteiner() {
        return status_conteiner;
    }

    /**
     * @param status_conteiner the status_conteiner to set
     */
    public void setStatus_conteiner(String status_conteiner) {
        this.status_conteiner = status_conteiner;
    }

    /**
     * @return the categoria_conteiner
     */
    public String getCategoria_conteiner() {
        return categoria_conteiner;
    }

    /**
     * @param categoria_conteiner the categoria_conteiner to set
     */
    public void setCategoria_conteiner(String categoria_conteiner) {
        this.categoria_conteiner = categoria_conteiner;
    }

    /**
     * @return the numero_conteiner
     */
    public int getNumero_conteiner() {
        return numero_conteiner;
    }

    /**
     * @param numero_conteiner the numero_conteiner to set
     */
    public void setNumero_conteiner(int numero_conteiner) {
        this.numero_conteiner = numero_conteiner;
    }
    
    public int getTipo_conteiner() {
        return tipo_conteiner;
    }

    /**
     * @param numero_conteiner the numero_conteiner to set
     */
    public void setTipo_conteiner(int tipo_conteiner) {
        this.tipo_conteiner = tipo_conteiner;
    }

    /**
     * @return the id_conteiner
     */
    public int getId_conteiner() {
        return id_conteiner;
    }

    /**
     * @param id_conteiner the id_conteiner to set
     */
    public void setId_conteiner(int id_conteiner) {
        this.id_conteiner = id_conteiner;
    }

    /**
     * @return the movimentacao_conteiner
     */
    public String getMovimentacao_conteiner() {
        return movimentacao_conteiner;
    }

    /**
     * @param movimentacao_conteiner the movimentacao_conteiner to set
     */
    public void setMovimentacao_conteiner(String movimentacao_conteiner) {
        this.movimentacao_conteiner = movimentacao_conteiner;
    }

    /**
     * @return the data_inicio
     */
    public Date getData_inicio() {
        return data_inicio;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * @return the data_final
     */
    public Date getData_final() {
        return data_final;
    }

    /**
     * @param data_final the data_final to set
     */
    public void setData_final(Date data_final) {
        this.data_final = data_final;
    }

   
    
}
