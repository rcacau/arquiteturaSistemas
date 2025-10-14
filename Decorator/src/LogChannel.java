public class LogChannel extends ChannelDecorator {

    public LogChannel(Channel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        System.out.println("[LogChannel] Logging before send: " + message);
        super.send(message);
    }

    @Override
    public String receive() {
        System.out.println("[LogChannel] Logging before receive...");
        String msg = super.receive();
        System.out.println("[LogChannel] Received: " + msg);
        return msg;
    }
}
