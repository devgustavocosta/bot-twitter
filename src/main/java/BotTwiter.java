import twitter4j.TwitterFactory;

import java.util.Scanner;

public class BotTwiter {
    public static void main(String[] args) throws Exception {

        var reset = EnumCor.RESET;
        var azulNegrito = EnumCor.AZUL_NEGRITO;
        var verdeNegrito = EnumCor.VERDE_NEGRITO;

        var postarTweet = new TwitterFactory();
        var twitter = postarTweet.getInstance();

        var entrada = new Scanner(System.in);

        System.out.println();
        System.out.println(azulNegrito + "Digite seu Tweet: " + reset);
        System.out.println();
        var texto = entrada.nextLine();

        System.out.println(verdeNegrito + "Tudo pronto! Iniciando imediatamente." + reset);
        Thread.sleep(5000);

        twitter.updateStatus(texto);

    }
}
