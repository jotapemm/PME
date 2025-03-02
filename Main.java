package Panificadora.PME;

public class Main {

    int opcao;

    public void mainMenu() {

        System.out.println("Seja bem vindo a nossa panificadora!");
        while(true) {
            System.out.println("O que voce deseja?");
            System.out.println("1 - Padaria\n2 - Confeitaria\n3 - Carrinho\n" +
                    "4 - Abrir Caixa\n5 - Fechar Caixa\n6 - Pagamento\n7 - Sair");
            switch (opcao) {
                case 1: {
                    //Padaria();
                    break;
                }
                case 2: {
                    //Confeitaria();
                    break;
                }
                case 3: {
                    //Carrinho();
                    break;
                }
                case 4: {
                    //abrirCaixa();
                    break;
                }
                case 5: {
                    //fecharCaixa();
                    break;
                }
                case 6: {
                    //Pagamento();
                    break;
                }
                case 7: {
                    System.exit(0);
                } default: {
                    System.out.println("opcao invalida!");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        Main app = new Main();
        app.mainMenu();
    }
}
