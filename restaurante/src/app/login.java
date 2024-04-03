package app;

import java.util.Scanner;

public class login {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("username: ");
	    String username = scanner.nextLine();

	    System.out.print("Password: ");
	    String password = scanner.nextLine();

	    if (verifyCredentials(username, password)) {
	      System.out.println("Login successful!");
	    } else {
	      System.out.println("Invalid username or password. Please try again.");
	    }
	  }

	  public static boolean verifyCredentials(String username, String password) {
	    // Aqui você pode verificar as credenciais do usuário
	    // contra um banco de dados, um arquivo de configuração
	    // ou qualquer outra fonte de informação
	    return username.equals(username) && password.equals(password);
	  }
	}

