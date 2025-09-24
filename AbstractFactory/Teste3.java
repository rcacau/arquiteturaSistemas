public class Teste3 {
    private Channel ch;

    public Teste3(){
        this.ch = ChannelFactory.create();
    }

    public void connectar(){
        this.ch.getMessage();
    }
}
