import java.util.ArrayList;
import java.util.Scanner;

public class CadastroUsuario {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		ArrayList<Usuario> usuarios = new ArrayList<>();
		
		boolean rodando = true;
		
		while(rodando) {
			

		System.out.println("<1> Cadastrar usuário");
 		System.out.println("<2> Cadastrar novo grupo");
		System.out.println("<3> Procurar usuário por nome");
		System.out.println("<4> Procurar usuário por id");
		System.out.println("<5> Atualizar dados");
		System.out.println("<6> Mostrar usuários cadastrados");
		System.out.println("<7> Remover usuário");
		System.out.println("<8> Sair");
		System.out.println("Digite uma opção");
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
			System.out.println("<3> Procurar usuário por nome");
			break;
		}
		case "4": {
			System.out.println("<4> Procurar usuário por id");
			break;
		}
		case "5": {
			System.out.println("<5> Atualizar dados");
			break;
		}
		case "6": {
			System.out.println("<6> Mostrar usuários cadastrados");
			for (int i = 0; i < usuarios.size(); i++) {
				
				@SuppressWarnings("unused")
				Usuario uTemp = usuarios.get(i);
				System.out.println("Usuário " + i);
				System.out.println("\tLogin: " + usuarios.get(i).getLogin());
				System.out.println("\tSenha: " + usuarios.get(i).getSenha());
			}
			break;			
		}
		case "7": {
			System.out.println("<7> Remover usuário");
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
