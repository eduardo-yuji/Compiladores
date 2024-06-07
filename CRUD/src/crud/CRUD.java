package crud;

import java.sql.*;

public  class Principal {
    public  static void main(String[] args) throws Exception {
                   Connection conexao = ObterConexao();
                   Statement statement = conexao.createStatement();
                   String query = "SELECT sysdate FROM dual";
                   ResultSet resultSet = statement.executeQuery(query);
                   if (resultSet.next()) {
                            System.out.println(resultSet.getDate("sysdate"));
                   }
         }
         private static Connection ObterConexao() {
                   Connection conexao = null;
                   try {
                            Class.forName("oracle.jdbc.driver.OracleDriver");
                            conexao = DriverManager.getConnection(
                                               "jdbc:oracle:thin:@localhost:1521:xe", "yuji", "bdkyzq14");
                   } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                   } catch (SQLException e) {
                            e.printStackTrace();
                   }
                   return conexao;
         }
}
