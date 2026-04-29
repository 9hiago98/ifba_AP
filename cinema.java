void main(){
    
    String[] filmes = {"Homem-Aranha", "Avatar", "Vingadores", "Interestelar"};
    boolean[][] poltronas = new boolean[5][5]; // 5 linhas, 5 colunas
    int opcaoMenu = 0;
    
    while (opcaoMenu != 4) {
        System.out.println("\n===== CINEMA MENU =====");
        System.out.println("1 - Listar Filmes");
        System.out.println("2 - Escolher Filme e Poltrona");
        System.out.println("3 - Ver Poltronas Reservadas");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
        
        opcaoMenu = Integer.parseInt(IO.readln());
        
        if (opcaoMenu == 1) {
            System.out.println("\n--- Filmes Disponíveis ---");
            for (int i = 0; i < filmes.length; i++) {
                System.out.println((i + 1) + " - " + filmes[i]);
            }
        }
        
        else if (opcaoMenu == 2) {
            System.out.println("\n--- Escolher Filme ---");
            for (int i = 0; i < filmes.length; i++) {
                System.out.println((i + 1) + " - " + filmes[i]);
            }
            System.out.print("Escolha o número do filme: ");
            int escolhaFilme = Integer.parseInt(IO.readln());
            
            if (escolhaFilme > 0 && escolhaFilme <= filmes.length) {
                System.out.println("Filme escolhido: " + filmes[escolhaFilme - 1]);
                
                System.out.println("\n--- Escolher Poltrona ---");
                System.out.println("Informe a linha (1-5): ");
                int linha = Integer.parseInt(IO.readln()) - 1;
                System.out.println("Informe a coluna (1-5): ");
                int coluna = Integer.parseInt(IO.readln()) - 1;
                
                if (linha >= 0 && linha < 5 && coluna >= 0 && coluna < 5) {
                    if (!poltronas[linha][coluna]) {
                        poltronas[linha][coluna] = true;
                        System.out.println("Poltrona (" + (linha+1) + "," + (coluna+1) + ") reservada com sucesso!");
                    } else {
                        System.out.println("Essa poltrona já está ocupada!");
                    }
                } else {
                    System.out.println("Posição inválida!");
                }
            } else {
                System.out.println("Filme não encontrado!");
            }
        }
        
        else if (opcaoMenu == 3) {
            System.out.println("\n--- Mapa de Poltronas ---");
            System.out.println("[ ] = Livre | [X] = Ocupada");
            for (int i = 0; i < 5; i++) {
                System.out.print("Fila " + (i+1) + ": ");
                for (int j = 0; j < 5; j++) {
                    if (poltronas[i][j]) {
                        System.out.print("[X] ");
                    } else {
                        System.out.print("[ ] ");
                    }
                }
                System.out.println();
            }
        }
        
        else if (opcaoMenu == 4) {
            System.out.println("Obrigado pela visita!");
        }
        
        else {
            System.out.println("Opção inválida!");
        }
    }
}
