import java.util.ArrayList;
import java.util.Scanner;

public class CadastroUsuario {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		ArrayList<Usuario> usuarios = new ArrayList<>();
		
		boolean ativo = true;
		
		while(ativo) {
			

		System.out.println("<1> Cadastrar usu�rio");
// 		System.out.println("<2> Cadastrar novo grupo");
		System.out.println("<3> Procurar usu�rio por nome");
//		System.out.println("<4> Procurar usu�rio por id");
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
			System.out.println("Digite seu nome: ");
			String nome = scanner.nextLine();
			Usuario u = new Usuario();
			u.setLogin(login);
			u.setSenha(senha);
			u.setNome(nome);
			
			usuarios.add(u);
			break;			
		}
		case "2": {
			System.out.println("Cadastrar novo grupo");
			
			break;			
		}
		case "3": {
			System.out.println("<3> Procurar usu�rio por nome");
			System.out.println("Digite o nome: ");
			String nome = scanner.nextLine();
			
			boolean encontrado = false;
			for (int i = 0; i < usuarios.size(); i++) {
				
				Usuario uTemp = usuarios.get(i);
				
				if(nome.equals(uTemp.getNome())) {
					System.out.println("Usu�rio encontrado");
					System.out.println("\tLogin: " + uTemp.getLogin());
					System.out.println("\tNome: " + uTemp.getNome());
					System.out.println("\tSenha: " + uTemp.getSenha());
					encontrado = true;
					break;
				} 
			}
			
			if (!encontrado) {
				System.out.println("Usu�rio n�o encontrado!");
				System.out.println("\tTente novamente!");
				
			}
			break;
		}
		case "4": {
			System.out.println("<4> Procurar usu�rio por id");
			break;
		}
		case "5": {
			System.out.println("<5> Atualizar dados");
			
			for (int i = 0; i < usuarios.size(); i++) {
				
				Usuario uTemp = usuarios.get(i);
				
				System.out.println( "[" + i +"]" + uTemp.getLogin());
			}
			
			System.out.println("Enumere quem voc� quer atualizar: ");
			int valorEnumerado = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("Digite novo login: ");
			String novoLogin = scanner.nextLine();
			System.out.println("Digite nova senha: ");
			String novaSenha = scanner.nextLine();
			System.out.println("Digite novo nome: ");
			String novoNome = scanner.nextLine();
			
			Usuario u = usuarios.get(valorEnumerado);
			u.setLogin(novoLogin);
			u.setSenha(novaSenha);
			u.setNome(novoNome);
			
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
			
for (int i = 0; i < usuarios.size(); i++) {
				
				Usuario uTemp = usuarios.get(i);
				
				System.out.println( "[" + i +"]" + uTemp.getLogin());
			}
			
			System.out.println("Enumere quem voc� quer atualizar: ");			
			int valorEnumerado = scanner.nextInt();
			scanner.nextLine();
			
			usuarios.remove(valorEnumerado);
			
			break;
		}
		case "8": {
			System.out.println("<8> Sair");
			ativo = false;
			break;
	}
   }
  }
		System.out.println("Volte Sempre!!!");
 }
}
