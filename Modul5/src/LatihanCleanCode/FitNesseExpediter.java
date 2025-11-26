package LatihanCleanCode;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

class Request {}
class Response {}
class FitNesseContext {}


public class FitNesseExpediter implements ResponseSender {
    private Socket socket;
    private InputStream input;
    private OutputStream output;
    private Request request;
    private Response response;
    private FitNesseContext context;
    protected long requestParsingTimeLimit;
    private long requestProgress;
    private long requestParsingDeadline;
    private boolean hasError;

    public FitNesseExpediter(Socket socket, InputStream input, OutputStream output, Request request, Response response, FitNesseContext context) {
        this.socket = socket;
        this.input = input;
        this.output = output;
        this.request = request;
        this.response = response;
        this.context = context;
        System.out.println("FitNesseExpediter siap digunakan.");
    }

    @Override
    public void sendResponse() {

    }
}