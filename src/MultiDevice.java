public class MultiDevice implements AparelhoTelefônico,ReprodutorMusical{

    public void ligar(){

        System.out.println("Ligando");

    }


    public void atender() {
        System.out.println("Ligação atendida");

    }


    public void iniciarCorreioVoz() {
        System.out.println("Correio voz iniciado");

    }

    //----------------------------


    public void tocar() {
        System.out.println("Tocando Musica");

    }

    public void pausar() {
        System.out.println("Musica pausada");

    }


    public void selecionarMusica() {
        System.out.println("Musica selecionada");

    }


    //------------


    public void exibirPagina(){

        System.out.println("Pagina exibida");

    }
    public void adicionarNovaAba(){

        System.out.println("Aba adicionada");

    }


    public void atualizarPagina(){

        System.out.println("PaginaAtualizada");

    }



}

