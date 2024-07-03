import java.util.Scanner;

class GerenciadorUsuario {
    private String nome;
    private String sobrenome;
    private Scanner scanner;

    public GerenciadorUsuario() {
        this.scanner = new Scanner(System.in);
    }

    public void criarSenhaAutomaticamente() {
        if (nome != null && sobrenome != null) {
            String senhaAutomatica = nome.substring(0, 4).toUpperCase() + sobrenome.substring(sobrenome.length() - 4).toUpperCase();
            System.out.println("Senha automática gerada: " + senhaAutomatica);
        } else {
            System.out.println("Nome e sobrenome precisam ser definidos antes de criar a senha automática.");
        }
    }

    public void editarNomeSobrenome() {
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine().trim().toUpperCase();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = scanner.nextLine().trim().toUpperCase();
        System.out.println("Nome e sobrenome atualizados com sucesso.");
    }
}
