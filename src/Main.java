import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServicoEstoque servicoEstoque = new ServicoEstoque();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Adicionar Batom");
            System.out.println("2. Adicionar Base");
            System.out.println("3. Listar Batons");
            System.out.println("4. Listar Bases");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir newline

            switch (opcao) {
                case 1:
                    System.out.println("Cor do batom:");
                    String corBatom = scanner.nextLine();
                    System.out.println("Marca do batom:");
                    String marcaBatom = scanner.nextLine();
                    System.out.println("Preço do batom:");
                    double precoBatom = scanner.nextDouble();
                    Batom batom = new Batom(corBatom, marcaBatom, precoBatom);
                    servicoEstoque.adicionarBatom(batom);
                    break;
                case 2:
                    System.out.println("Tom da base:");
                    String tomBase = scanner.nextLine();
                    System.out.println("Marca da base:");
                    String marcaBase = scanner.nextLine();
                    System.out.println("Preço da base:");
                    double precoBase = scanner.nextDouble();
                    Base base = new Base(tomBase, marcaBase, precoBase);
                    servicoEstoque.adicionarBase(base);
                    break;
                case 3:
                    System.out.println("Lista de Batons:");
                    for (Batom b : servicoEstoque.listarBatons()) {
                        System.out.println(b);
                    }
                    break;
                case 4:
                    System.out.println("Lista de Bases:");
                    for (Base b : servicoEstoque.listarBases()) {
                        System.out.println(b);
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}