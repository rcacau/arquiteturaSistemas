public class BufferChannel extends ChannelDecorator {

    public BufferChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        System.out.println("[BufferChannel] Buffering message before send...");
        super.send(message);
    }

    @Override
    public String receive() {
        System.out.println("[BufferChannel] Reading from buffer...");
        return super.receive();
    }
}
