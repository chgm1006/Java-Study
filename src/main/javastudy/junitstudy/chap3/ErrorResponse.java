package junitstudy.chap3;

public class ErrorResponse implements Response {
  private Request originalRequest;
  private Exception originalException;

  public ErrorResponse(Request request, Exception e) {
    this.originalException = e;
    this.originalRequest = request;
  }

  public Request getOriginalRequest() {
    return this.originalRequest;
  }

  public Exception getOriginalException() {
    return this.originalException;
  }

  @Override
  public String getName() {
    return null;
  }
}
