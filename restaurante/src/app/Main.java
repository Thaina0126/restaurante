package app;

	import java.util.Scanner;

    import Controller.UsuarioController;
	import View.Mensagens;
	import model.Usuario;

	public class Main {
		
		Mensagens mensagem = new Mensagens();
		
		String Nome,CPF, Celular, Email, Senha,Endereco;
		String opcao;
		int opcaoNum;{
		
		do {
			opcao = mensagem.solicitarEntrada("MENU" 
					+"\nDigite a opção desejada" 
					+ "\n1. Login"
					+ "\n2. Cadastrar Usuário"
					+ "\n3. Sair ");
			
			
			opcaoNum = Integer.parseInt(opcao);
			switch (opcaoNum) {
			case 1:
				 Scanner scanner = new Scanner(System.in);

				    System.out.print("Email: ");
				    String Email = scanner.nextLine();

				    System.out.print("Senha: ");
				     scanner.nextLine();

				    if (verifyCredentials(Email, Senha)) {
				      System.out.println("O login foi feito com sucesso!");
				    } else {
				      System.out.println("Email ou Senha invalidos.");
				    }
				  

				  public static boolean verifyCredentials(String Email, String Senha) {
				    // Aqui você pode verificar as credenciais do usuário
				    // contra um banco de dados, um arquivo de configuração
				    // ou qualquer outra fonte de informação
				    return Email.equals(Email) && Senha.equals(Senha);
				  }
				}
			break;
			
			case 2:
				@NotNull
				Nome = mensagem.solicitarEntrada("Digite o seu nome",true);
				CPF = mensagem.solicitarEntrada("Digite o seu CPF",true);
				Celular = mensagem.solicitarEntrada("Digite o seu Celular",true);
				Email = mensagem.solicitarEntrada("Digite o seu Email",true);
				Senha = mensagem.solicitarEntrada("Digite o seu Senha",true);
	            Endereco =mensagem.solicitarEntrada("Digote o seu Endereço: ",true);
	            
	            
	            usuario = new Usuario (Nome,CPF,Celular,Email,Senha,Endereco);
	            
	            if(Usuario.salvar()) {
	            	mensagem.mostrarMensagemDeSucesso("Usuario cadastrado com sucesso!");
	            
	            }else {
	            	mensagem.mostrarMensagemDeFalha("Erro ao cadastrar usuario.Tente novamente!");
	            }
				mensagem.mostrarMensagemDeSucesso(usuario.getUsuario());
			break;
			
			case 3:
				
				if(mensagem.confirmar("Deseja realmente sair ?"));
				System.exit(0);
			break;
			}
			
			
		} while (opcaoNum == 3);
		
	}

	

