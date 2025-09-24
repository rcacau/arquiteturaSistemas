public class Main {
    public static void main(String[] args) {
        
        //TCPChannel ch = new TCPChannel();

        //Channel ch = ChannelFactory.create();

        Teste1 t1 = new Teste1();
        Teste2 t2 = new Teste2();
        Teste3 t3 = new Teste3();

        t1.connectar();
        t2.connectar();
        t3.connectar();

    }
}
