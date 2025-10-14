public class TCPChannel implements Channel {

    @Override
    public void send(String message) {
        System.out.println("[TCPChannel] Sending message: " + message);
    }

    @Override
    public String receive() {
        String msg = "[TCPChannel] Receiving message...";
        System.out.println(msg);
        return msg;
    }
}
