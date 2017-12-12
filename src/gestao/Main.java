package gestao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		
	LigacaoMySQL BD =new LigacaoMySQL();
	
	Connection cn = BD.getConnnection();
   
    
    boolean menu =true;
	String escolha  ="";
	do {
		escolha = menu( escolha);
		switch(escolha) {
		case "a":
			inserirFunc(cn);
			break;
		case "b":
			actualizarFunc(cn);
			break;
		case "c":
			apagarFunc(cn);
			break;
		case "d":
			menu =false;
			break;
	    default: 
	    	System.out.println("Indique uma opção!\n");
		}
	}while(menu);
    
   
   
    
    System.out.println("Resultado: check");
    
	}

	public static  String menu(String escolha) {
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("Escolha uma opção:");
		System.out.println("a. Inserir Funcionario");
		System.out.println("b. Actualizar Funcionario");
		System.out.println("c. Apagar Funcionario");
		System.out.println("d. Sair");
		
		escolha = sc.nextLine();
		return escolha;
	}
	public static void inserirFunc(Connection cn) throws SQLException {
		String sql ="insert into t_funcionarios(id, BI, nome, data_nascimento, morada, categoria, funcao) values (NULL, '345678', 'Jose Simoes', '2068-12-29', 'Rua da Republica', 'assistente', 'consultor')";
		Statement stmt= cn.createStatement();
	    int rs0 = stmt.executeUpdate(sql);
	}
	
	public static void actualizarFunc(Connection cn) throws SQLException {
		  String sql ="update t_funcionarios set nome = 'Angela Matias' where id = '3'; ";
		    Statement stm2 = cn.createStatement();
		    int rs=stm2.executeUpdate(sql);
	}
	public static void apagarFunc(Connection cn) throws SQLException {
	 String sql ="delete from t_funcionarios where id='4'";
	    Statement stm3 = cn.createStatement();
	    int rs2 = stm3.executeUpdate(sql);
	}
}


