public class IPhone implements Telefone, Navegador, ReprodutorMusical {


    @Override
    public void exibirPagina() {
        System.out.println("exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("abrindo nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("tocando");
    }

    @Override
    public void pausar() {
        System.out.println("pausando");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionando música");
    }

    @Override
    public void ligar() {
        System.out.println("ligando");
    }

    @Override
    public void atender() {
        System.out.println("atendendo");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("iniciando correio de voz");
    }

}
