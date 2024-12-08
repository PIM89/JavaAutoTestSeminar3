import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public static void main(String[] args) throws IOException {
    String ip = null;
    try (Socket socket = new Socket()) {
        socket.connect(new InetSocketAddress("yandex.ru", 80));
        ip = socket.getLocalAddress().getHostAddress();
    } catch (Exception e){
        e.printStackTrace();
    }
    System.out.printf("IP address = %s", ip);
}

