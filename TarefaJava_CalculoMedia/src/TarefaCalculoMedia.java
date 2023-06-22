import java.util.Locale;

public class TarefaCalculoMedia {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        calculoMedia();
    }

    private static void calculoMedia() {
        double nota1 = 8.2;
        double nota2 = 5.3;
        double nota3 = 9.75;
        double nota4 = 6.7;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Media: %.1f", media);
    }
}