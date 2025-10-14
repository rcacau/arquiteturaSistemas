public class ZipChannel extends ChannelDecorator {

    public ZipChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        System.out.println("[ZipChannel] Compressing message...");
        super.send("Compressed(" + message + ")");
    }

    @Override
    public String receive() {
        System.out.println("[ZipChannel] Decompressing message...");
        String msg = super.receive();
        return "Decompressed(" + msg + ")";
    }
}
