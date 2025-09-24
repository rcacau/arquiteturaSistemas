public class Teste1 {
    private Channel ch;

    public Teste1(){
        this.ch = ChannelFactory.create();
    }

    public void connectar(){
        this.ch.getMessage();
    }
}
