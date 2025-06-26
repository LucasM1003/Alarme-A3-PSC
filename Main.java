// Classe Main com interações completas
import java.util.*;
import java.time.LocalDateTime;

public class Main {
    private static ArrayList<Cadastro> cadastros = new ArrayList<>();
    private static ArrayList<PlanoSeguranca> planos = new ArrayList<>();
    private static ArrayList<Notificacao> notificacoes = new ArrayList<>();
    private static ArrayList<LogEvento> eventos = new ArrayList<>();
    private static ArrayList<Historico> historicos = new ArrayList<>();
    private static ArrayList<Manutencao> manutencoes = new ArrayList<>();
    private static ArrayList<Monitoramento> monitoramentos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Criar cadastro de login");
            System.out.println("3. Adicionar dispositivo a um cadastro");
            System.out.println("4. Criar plano de segurança");
            System.out.println("5. Ver eventos e notificações");
            System.out.println("6. Registrar manutenção");
            System.out.println("7. Registrar monitoramento");
            System.out.println("8. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome do usuário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Nível de acesso: ");
                    int nivel = scanner.nextInt();
                    scanner.nextLine();
                    Usuario user = new Usuario(nome, nivel);
                    historicos.add(new Historico(user));
                    System.out.println("Usuário criado e histórico iniciado.");
                }
                case 2 -> {
                    System.out.print("Login: ");
                    String login = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();
                    cadastros.add(new Cadastro(login, senha));
                    System.out.println("Cadastro criado.");
                }
                case 3 -> {
                    System.out.print("Índice do cadastro: ");
                    int i = scanner.nextInt();
                    scanner.nextLine();
                    if (i >= 0 && i < cadastros.size()) {
                        System.out.print("ID do dispositivo: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Local: ");
                        String local = scanner.nextLine();
                        System.out.print("Equipamentos: ");
                        String eq = scanner.nextLine();
                        System.out.print("Status: ");
                        String st = scanner.nextLine();

                        Tipo tipo = new Tipo(id, local, eq, st);
                        cadastros.get(i).adicionarDispositivo(tipo);
                        eventos.add(new LogEvento(LocalDateTime.now().toString(), "Dispositivo adicionado ao cadastro."));
                        notificacoes.add(new Notificacao("Dispositivo ID " + id + " adicionado com sucesso", "Info"));
                        System.out.println("Dispositivo registrado e notificação enviada.");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                }
                case 4 -> {
                    System.out.print("Nome do plano: ");
                    String nome = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String desc = scanner.nextLine();
                    PlanoSeguranca plano = new PlanoSeguranca(nome, desc);

                    System.out.print("Quantos dispositivos adicionar? ");
                    int qtd = scanner.nextInt();
                    scanner.nextLine();
                    for (int j = 0; j < qtd; j++) {
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Local: ");
                        String loc = scanner.nextLine();
                        System.out.print("Equipamento: ");
                        String eq = scanner.nextLine();
                        System.out.print("Status: ");
                        String st = scanner.nextLine();
                        plano.adicionarDispositivo(new Tipo(id, loc, eq, st));
                    }
                    planos.add(plano);
                    System.out.println("Plano criado com sucesso.");
                }
                case 5 -> {
                    System.out.println("--- EVENTOS ---");
                    for (LogEvento e : eventos)
                        System.out.println(e.getDataHora() + ": " + e.getEvento());
                    System.out.println("--- NOTIFICAÇÕES ---");
                    for (Notificacao n : notificacoes)
                        System.out.println(n.getTipo() + ": " + n.getMensagem());
                }
                case 6 -> {
                    System.out.print("Descrição da manutenção: ");
                    String desc = scanner.nextLine();
                    System.out.print("Data: ");
                    String data = scanner.nextLine();
                    manutencoes.add(new Manutencao(desc, data));
                    eventos.add(new LogEvento(
                            LocalDateTime.now().toString(),
                            "Manutenção registrada em " + data + ": " + desc
                    ));
                    System.out.println("Manutenção registrada.");
                }
                case 7 -> {
                    System.out.print("Data do monitoramento: ");
                    String data = scanner.nextLine();
                    System.out.print("Status: ");
                    String status = scanner.nextLine();
                    monitoramentos.add(new Monitoramento(data, status));
                    notificacoes.add(new Notificacao("Monitoramento atualizado para: " + status, "Alerta"));
                    System.out.println("Monitoramento registrado.");
                }
                case 8 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 8);
    }
}
