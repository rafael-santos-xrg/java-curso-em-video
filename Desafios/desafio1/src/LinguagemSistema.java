import java.util.Locale;

public class LinguagemSistema {
    public static void main(String[]args) {
        Locale loc = Locale.getDefault();
        System.out.println("Seu sistema esta em " + loc.getDisplayLanguage());
    }   
}
