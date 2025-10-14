//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Channel channel = new LogChannel(
                new ZipChannel(
                        new BufferChannel(
                                new TCPChannel()
                        )
                )
        );

        channel.send("Hello World!");
        System.out.println(channel.receive());

    }
}