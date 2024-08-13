public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{

    @Override
    public void ligar(){

        System.out.println("Ligando...");
    }
    @Override
    public void atender(){
        
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz(){
        
        System.out.println("Iniciando correio de voz..");
    }

    @Override
    public void exibirPagina(){
        
        System.out.println("Exibindo página...");
    }

    @Override
    public void adicionarNovaAba(){
        
        System.out.println("Adicionando Nova Aba...");
    }

    @Override
    public void atualizarPagina(){
        
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar(){
        
        System.out.println("Música tocando...");
    }

    @Override
    public void pausar(){
        
        System.out.println("Música pausada...");
    }

    @Override
    public void selecionarMusica(){
        
        System.out.println("Música selecionada!");
    }

    public static void main(String[] args) throws Exception {
       Iphone iphone = new Iphone();

       iphone.ligar();
       iphone.atender();
       iphone.iniciarCorreioVoz();
       iphone.exibirPagina();
       iphone.adicionarNovaAba();
       iphone.atualizarPagina();
       iphone.tocar();
       iphone.pausar();
       iphone.selecionarMusica();
        

        
    }
}
