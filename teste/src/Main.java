import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorUsuario gerenciador = new GerenciadorUsuario();
        Menu menu = new Menu(gerenciador);

        menu.exibirMenu();
    }
}

class Menu {
    private GerenciadorUsuario gerenciador;
    private Scanner scanner;

    public Menu(GerenciadorUsuario gerenciador) {
        this.gerenciador = gerenciador;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        boolean executando = true;

        while (executando) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar senha automaticamente");
            System.out.println("2. Editar nome ou sobrenome");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    gerenciador.criarSenhaAutomaticamente();
                    break;
                case 2:
                    gerenciador.editarNomeSobrenome();
                    break;
                case 3:
                    executando = false;
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
