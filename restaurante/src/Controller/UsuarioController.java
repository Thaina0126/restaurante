package Controller;

import java.util.ArrayList;


import model.Usuario;

		public class UsuarioController {
        	
		private ArrayList <Usuario> usuarios;
		
		
		public String CriarUsuario(String Nome, String CPF, String Email, String Celular, String Senha, String Endereco) {
    			Usuario usuarioNovo = new Usuario(Nome,CPF,Email,Celular,Senha,Endereco);
    			usuarios.add(usuarioNovo);
    			return "Usuario cadastrado com sucesso";
    		}
		}
		
