import java.util.ArrayList;
import java.util.Scanner;

public class CadastroUsuario {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		ArrayList<Usuario> usuarios = new ArrayList<>();
		
		boolean rodando = true;
		
		while(rodando) {
			

		System.out.println("<1> Cadastrar usu�rio");
 		System.out.println("<2> Cadastrar novo grupo");
		System.out.println("<3> Procurar usu�rio por nome");
		System.out.println("<4> Procurar usu�rio por id");
		System.out.println("<5> Atualizar dados");
		System.out.println("<6> Mostrar usu�rios cadastrados");
		System.out.println("<7> Remover usu�rio");
		System.out.println("<8> Sair");
		System.out.println("Digite uma op��o");
		String opcao = scanner.nextLine();
		
		
		switch (opcao) {
		
		case "1": {
			System.out.println("Cadastre-se");
			System.out.print("Digite o Login: ");
			String login = scanner.nextLine();
			System.out.print("Digite a senha: ");
			String senha = scanner.nextLine();
			Usuario u = new Usuario();
			u.setLogin(login);
			u.setSenha(senha);
			
			usuarios.add(u);
			break;			
		}
		case "2": {
			System.out.println("Cadastrar novo grupo");
			
			break;			
		}
		case "3": {
			System.out.println("<3> Procurar usu�rio por nome");
			break;
		}
		case "4": {
			System.out.println("<4> Procurar usu�rio por id");
			break;
		}
		case "5": {
			System.out.println("<5> Atualizar dados");
			break;
		}
		case "6": {
			System.out.println("<6> Mostrar usu�rios cadastrados");
			for (int i = 0; i < usuarios.size(); i++) {
				
				@SuppressWarnings("unused")
				Usuario uTemp = usuarios.get(i);
				System.out.println("Usu�rio " + i);
				System.out.println("\tLogin: " + usuarios.get(i).getLogin());
				System.out.println("\tSenha: " + usuarios.get(i).getSenha());
			}
			break;			
		}
		case "7": {
			System.out.println("<7> Remover usu�rio");
			break;
		}
		case "8": {
			System.out.println("<8> Sair");
			rodando = false;
			break;
	}
   }
  }
		System.out.println("Volte Sempre!!!");
 }
}
