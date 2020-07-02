package sh.platform.micronaut;

import java.io.IOException;
import java.net.ServerSocket;

public class Temp {

    public static void main(String[] args) throws IOException {
        System.out.println("starting");
        ServerSocket serverSocket = new ServerSocket(9999);
        serverSocket.accept();
        System.out.println("stoping");
    }
}
