import java.net.URL;

public class Uaarl{
    public static void main(String[] args) throws Exception {
        String url = "https://www.example.com:8080/path/to/resource?query=123#section1";
        URL a= new URL(url);
        System.out.println("Protocol: " + a.getProtocol());
        System.out.println("Host: " + a.getHost());
        System.out.println("Port: " + a.getPort());
        System.out.println("Path: " + a.getPath());
        System.out.println("Query: " + a.getQuery());
        System.out.println("Fragment: " + a.getRef());
    }
}