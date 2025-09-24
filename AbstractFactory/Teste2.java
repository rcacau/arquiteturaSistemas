public class Teste2 {
    private Channel ch;

    public Teste2(){
        this.ch = ChannelFactory.create();
    }

    public void connectar(){
        this.ch.getMessage();
    }
}
