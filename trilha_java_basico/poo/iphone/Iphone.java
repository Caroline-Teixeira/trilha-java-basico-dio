package trilha_java_basico.poo.iphone;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    // Desafio dio 3
    // atributos
    private String modelo;
    private String cor;
    private String numero;

    // construtor
    public Iphone(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }
    // getters e setters
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getNumero() {
        return numero;
    }

    // métodos
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

}
