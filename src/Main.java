import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Arrays;

public class Main{

    public static void main(String[]args) throws ParserConfigurationException, IOException, SAXException {
        //Questao 2 -  faturamentos (menor valor, maior valor, e quantos dias acima da média)
        int numero1 = 0, numero2 = 1, numero3 = 610, numero4 = 300;
        boolean fibNumero1 = Fibonacci.eFibonacci(numero1);
        boolean fibNumero2 = Fibonacci.eFibonacci(numero2);
        boolean fibNumero3 = Fibonacci.eFibonacci(numero3);
        boolean fibNumero4 = Fibonacci.eFibonacci(numero4);

        System.out.println("Questao 02) \nE Fibonnaci?\n" + numero1 + ": " + fibNumero1);
        System.out.println(numero2 + ": " + fibNumero2);
        System.out.println(numero3 + ": " + fibNumero3);
        System.out.println(numero4 + ": " + fibNumero4);


        //Questao 2 -  testa se numéro pertence a sequencia de Fibonnaci
        Faturamento f = new Faturamento();
        System.out.println("");

        //Questao 03 - recupera dados do arquivo xml e calcula o menor faturamento, maior faturamento
        // e quantos faturamentos estào acima da média excluindo os dias sem valor
        System.out.println("Questao 03) \nFaturamentos:\nMaior faturamento: " + f.getMaxFaturamento()
        + "\nMenor faturamento: " + f.getMinFaturamento() + "\nQuantidade de ias com faturamento acima da media: "
        + f.getDiasAcimaDaMedia());


        //Questao 04) percentual por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double total = sp + rj + mg + es + outros;
        System.out.println("\nQuestao 03)");
        System.out.println("O percentual de representacao de SP: " + Math.round(sp/total *100) + "%");
        System.out.println("O percentual de representacao de RJ: " + Math.round(rj/total *100) + "%");
        System.out.println("O percentual de representacao de MG: " + Math.round(mg/total *100) + "%");
        System.out.println("O percentual de representacao de es: " + Math.round(es/total *100) + "%");
        System.out.println("O percentual de representacao dos outros estados: " + Math.round(outros/total *100) + "%");

        //Questao 05 - reverte a string
        String palavra = "Azeitona";
        System.out.println("\nReversor de palavra \nPalavra: " + palavra + "\nPalavra reversa: "
                + Reversor.revertString(palavra));

    }
}
