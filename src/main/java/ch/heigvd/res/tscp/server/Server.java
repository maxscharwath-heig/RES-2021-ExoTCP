package ch.heigvd.res.tscp.server;

public class Server {
    public static void main(String[] args) {
        SingleThreadedServer single = new SingleThreadedServer(2203);
        single.serveClients();
    }
}
