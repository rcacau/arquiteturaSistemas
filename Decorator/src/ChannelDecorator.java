public abstract class ChannelDecorator implements Channel {

    protected Channel channel;

    public ChannelDecorator(Channel channel) {
        this.channel = channel;
    }

    @Override
    public void send(String message) {
        channel.send(message);
    }

    @Override
    public String receive() {
        return channel.receive();
    }
}
