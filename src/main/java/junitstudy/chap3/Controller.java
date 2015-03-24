package junitstudy.chap3;

/**
 * The interface Controller.
 */
public interface Controller {
    /**
     * Process request.
     *
     * @param request the request
     * @return the response
     */
    Response processRequest(Request request);

    /**
     * Add handler.
     *
     * @param request the request
     * @param requestHandler the request handler
     */
    void addHandler(Request request, RequestHandler requestHandler);
}
