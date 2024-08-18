import com.telefone.iphone.Iphone;

public class App {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.exibirPagina("google.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        iphone.ligar("11988887777");
        iphone.atender();
        iphone.iniciarCorreiroVoz();

        iphone.selecionarMusica("Hino do Brasil");
        iphone.pausar();
    };
}
