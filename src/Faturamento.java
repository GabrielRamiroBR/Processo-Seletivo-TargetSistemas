import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

public class Faturamento {
    private final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    private final DocumentBuilder builder = factory.newDocumentBuilder();
    private final Document dados = builder.parse(("src\\dados.xml"));
            ;
    private final NodeList colunas = dados.getElementsByTagName("row");

   private final double[] vetorFaturamentos = new double[colunas.getLength()];
   private final double maxFaturamento;
   private final double minFaturamento;
   private final int diasAcimaDaMedia;

    public Faturamento() throws ParserConfigurationException, IOException, SAXException {
        for(int i = 0; i < colunas.getLength(); i++){
            Element coluna = (Element) colunas.item(i);
            this.vetorFaturamentos[i] = Double.parseDouble(coluna.getElementsByTagName("valor")
                    .item(0).getTextContent());
        }
        int diasUteis = 0, somaFaturamento = 0, diaAcimaDaMedia = 0;
        double minFaturamento = vetorFaturamentos[0], maxFaturamento = vetorFaturamentos[0], media;
                ;
        for (int i = 0; i < vetorFaturamentos.length; i++){
            if (vetorFaturamentos[i] != 0) diasUteis++;
            if (minFaturamento > vetorFaturamentos[i] && vetorFaturamentos[i] != 0) minFaturamento = vetorFaturamentos[i];
            if (maxFaturamento < vetorFaturamentos[i]) maxFaturamento = vetorFaturamentos[i];
            somaFaturamento += vetorFaturamentos[i];
        }
        media = somaFaturamento/diasUteis;
        for(double fat : vetorFaturamentos){
            if(fat > media) diaAcimaDaMedia++;
        }


        this.minFaturamento = minFaturamento;
        this.maxFaturamento = maxFaturamento;
        this.diasAcimaDaMedia = diaAcimaDaMedia;
    }

    public double[] getVetorFaturamentos() {
        return vetorFaturamentos;
    }

    public DocumentBuilderFactory getFactory() {
        return factory;
    }

    public double getMaxFaturamento() {
        return maxFaturamento;
    }

    public double getMinFaturamento() {
        return minFaturamento;
    }

    public int getDiasAcimaDaMedia() {
        return diasAcimaDaMedia;
    }
}
