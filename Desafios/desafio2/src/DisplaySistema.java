import java.awt.Dimension;
import java.awt.Toolkit;

public class DisplaySistema {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução da sua tela é " + d.width + " X " + d.height);
    }
}
