package DAOConteiner;

import java.sql.ResultSet;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import DTOConteiner.ConteinerDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConteinerDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ConteinerDTO> lista = new ArrayList<>();

    public void cadastrarConteiner(ConteinerDTO objconteinerdto) {
        String sql = "insert into conteiner (nome_cliente, numero_conteiner, status_conteiner, tipo_conteiner, categoria_conteiner, movimentacao_conteiner, data_inicio, data_final) values (?,?,?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objconteinerdto.getNome_cliente());
            pstm.setInt(2, objconteinerdto.getNumero_conteiner());
            pstm.setString(3, objconteinerdto.getStatus_conteiner());
            pstm.setInt(4, objconteinerdto.getTipo_conteiner());
            pstm.setString(5, objconteinerdto.getCategoria_conteiner());
            pstm.setString(6, objconteinerdto.getMovimentacao_conteiner());
            pstm.setDate(7, objconteinerdto.getData_inicio());
            pstm.setDate(8, objconteinerdto.getData_final());
            
           
            
            pstm.execute();
            pstm.close();
            
           
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ConteinerDAO Cadastrar: " + erro);
        }
    }
    
    public ArrayList<ConteinerDTO> PesquisarConteiner(){
        String sql = "SELECT*FROM conteiner";
        conn = new ConexaoDAO().conectaBD();
        
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                ConteinerDTO objconteinerdto = new ConteinerDTO();
                objconteinerdto.setId_conteiner(rs.getInt("id_conteiner"));
                objconteinerdto.setNome_cliente(rs.getString("nome_cliente"));
                objconteinerdto.setNumero_conteiner(rs.getInt("numero_conteiner"));
                objconteinerdto.setStatus_conteiner(rs.getString("status_conteiner"));
                objconteinerdto.setTipo_conteiner(rs.getInt("tipo_conteiner"));
                objconteinerdto.setCategoria_conteiner(rs.getString("categoria_conteiner"));
                objconteinerdto.setMovimentacao_conteiner(rs.getString("movimentacao_conteiner"));
                objconteinerdto.setData_inicio(rs.getDate("data_inicio"));
                objconteinerdto.setData_final(rs.getDate("data_final"));
                
                
                
                
                
                lista.add(objconteinerdto);
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ConteinerDAO Pesquisar: " + erro);
        }
        return lista;
    }
    
    public void alterarConteiner(ConteinerDTO objconteinerdto){
        String sql = "update conteiner set nome_cliente = ?, numero_conteiner = ?, status_conteiner = ?, tipo_conteiner = ?, categoria_conteiner = ?, movimentacao_conteiner = ?, data_inicio = ?, data_final = ? where id_conteiner = ?";
        
        conn = new ConexaoDAO().conectaBD();

        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objconteinerdto.getNome_cliente());
            pstm.setInt(2, objconteinerdto.getNumero_conteiner());
            pstm.setString(3, objconteinerdto.getStatus_conteiner());
            pstm.setInt(4, objconteinerdto.getTipo_conteiner());
            pstm.setString(5, objconteinerdto.getCategoria_conteiner());
            pstm.setString(6, objconteinerdto.getMovimentacao_conteiner());
            pstm.setDate(7, objconteinerdto.getData_inicio());
            pstm.setDate(8, objconteinerdto.getData_final());
            pstm.setInt(9, objconteinerdto.getId_conteiner());
          
            
            
           
            
            
            pstm.execute();
            pstm.close();
            
     
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ConteinerDAO Alterar: " + erro);
        }
        
    }
    public void excluirConteiner(ConteinerDTO objconteinerdto){
        String sql = "delete from conteiner where id_conteiner = ?";
        
         conn = new ConexaoDAO().conectaBD();

        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objconteinerdto.getId_conteiner());  
            
            
            pstm.execute();
            pstm.close();
            
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ConteinerDAO Excluir: " + erro);
        }
        
        
    }
}
