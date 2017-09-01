package WebServer.http;

public interface HttpRequest {
    String getURL();
    String getPath();
    HttpRequestMethod getRequstType();
    String getHeader(String name);
}
