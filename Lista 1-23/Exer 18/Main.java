import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String data = "10/02/2023";
        String dataPorExtenso = converterDataPorExtenso(data);
        System.out.println("Data por extenso: " + dataPorExtenso);
    }

    public static String converterDataPorExtenso(String data) {
        SimpleDateFormat formatoEntrada = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat formatoSaida = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));

        try {
            Date dataFormatada = formatoEntrada.parse(data);

            String dataPorExtenso = formatoSaida.format(dataFormatada);

            return dataPorExtenso;
        } catch (ParseException e) {
            return null;
        }
    }
}