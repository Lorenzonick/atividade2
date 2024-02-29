public class 2multip_matrizes {
    import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] login = {
            {"Ana@fatec", "ana123"},
            {"Joao@fatec", "joao123"},
            {"Sheldon@fatec", "sheldon123"},
            {"Melissa@fatec", "melissa123"},
            {"Maria@fatec", "maria123"},
            {"Brooke@fatec", "brooke123"}
        };

        while (true) {
            System.out.print("Login: ");
            String email = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            boolean loginCorreto = false;
            boolean usuarioCorreto = false;
            for (String[] usuario : login) {
                if (usuario[0].equals(email)) {
                    usuarioCorreto = true;
                    if (usuario[1].equals(senha)) {
                        System.out.println("Seu login está correto.");
                        loginCorreto = true;
                        break;
                    }
                }
            }

            if (!loginCorreto) {
                if (usuarioCorreto) {
                    System.out.println("Seu login está correto, mas a senha está errada! Por favor, tente novamente.");
                } else {
                    System.out.println("Seu login está errado! Por favor, tente novamente.");
                }
            } else {
                break;
            }
        }
    }
}
