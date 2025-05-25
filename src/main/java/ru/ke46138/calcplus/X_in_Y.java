package ru.ke46138.calcplus;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

// Класс родитель с переменными
// Курс валют указан в рублях
public abstract class X_in_Y {
    protected double x; // То что вводится
    protected static double rateUSD = 87.74; // Доллары сша
    protected static double rateEURO = 95.76; // Евро
    protected static double rateGBP = 113.4; // Фунты стерлингов
    protected static double rateBTC = 8660098; // Биткоины
    protected static double rateEURinUSD = 1.06; // Евро в долларах

    public abstract double convert();

    public static void updateRate() {

        // Получения курса валют
        URL currenciesUrl;
        try {
            currenciesUrl = new URL("https://www.cbr.ru/scripts/XML_daily.asp");
        } catch (MalformedURLException e) {
            System.out.println("--------------------Не удалось обновить курс валют------------------------");
            return;
        }
        ReadableByteChannel rbc;
        try {
            rbc = Channels.newChannel(currenciesUrl.openStream());
        } catch (IOException e) {
            System.out.println("--------------------Не удалось обновить курс валют------------------------");
            return;
        }
        try (FileOutputStream fos = new FileOutputStream("temp.xml")) {
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            System.out.println("--------------------Не удалось обновить курс валют------------------------");
            return;
        }

        File file = new File("temp.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            System.out.println("--------------------Не удалось обновить курс валют------------------------");
            return;
        }
        Document doc;
        try {
            doc = builder.parse(file);
        } catch (SAXException | IOException e) {
            System.out.println("--------------------Не удалось обновить курс валют------------------------");
            return;
        }

        NodeList items = doc.getElementsByTagName("Valute");

        for (int i = 0; i < items.getLength(); i++) {
            Node node = items.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;

                String charCode = element.getElementsByTagName("CharCode").item(0).getTextContent();
                String value = element.getElementsByTagName("Value").item(0).getTextContent();

                switch (charCode) {
                    case ("USD"):
                        value = value.replace(',', '.');
                        rateUSD = Double.parseDouble(value);
                        break;
                    case ("EUR"):
                        value = value.replace(',', '.');
                        rateEURO = Double.parseDouble(value);
                        break;
                    case ("GBP"):
                        value = value.replace(',', '.');
                        rateGBP = Double.parseDouble(value);
                        break;
                    default:
                        break;
                }
            }
            rateEURinUSD = rateEURO / rateUSD;
        }

        // Получение курса биткоина
        URL cryptocurrenciesUrl;
        try {
            cryptocurrenciesUrl = new URL("https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=rub");
        } catch (MalformedURLException e) {
            System.out.println("--------------------Не удалось обновить курс валют------------------------");
            return;
        }
        ReadableByteChannel rbc1;
        try {
            rbc1 = Channels.newChannel(cryptocurrenciesUrl.openStream());
        } catch (IOException e) {
            System.out.println("--------------------Не удалось обновить курс валют------------------------");
            return;
        }
        try (FileOutputStream fos = new FileOutputStream("temp.json")) {
            fos.getChannel().transferFrom(rbc1, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            System.out.println("--------------------Не удалось обновить курс валют------------------------");
            return;
        }
        File json = new File("temp.json");

        ObjectMapper objectMapper = new ObjectMapper();

        CryptoAllJSON cryptocurrency;
        try {
            cryptocurrency = objectMapper.readValue(json, CryptoAllJSON.class);
        } catch (IOException e) {
            System.out.println("-----------------Не удалось обновить курс криптовалют---------------------");
            return;
        }
        rateBTC = cryptocurrency.getBitcoin().getRub();
    }
}
