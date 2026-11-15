import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // teste basico do set dos peoes
        Scanner input = new Scanner(System.in);
        Tabuleiro tab = new Tabuleiro(input.nextLine());
        Tabuleiro.mostrarTab(tab);
        tab.getJogo()[1][2].teste();
    }
}