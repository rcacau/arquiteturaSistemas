public class UDPChannel implements Channel {

    @Override
    public void send(String message) {
        System.out.println("[UDPChannel] Sending message: " + message);
    }

    @Override
    public String receive() {
        String msg = "[UDPChannel] Receiving message...";
        System.out.println(msg);
        return msg;
    }
}
