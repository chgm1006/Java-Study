package exam.socketexam;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 서버를 생성한다.
 */
public class ServerSocketExam {
    public static void main(String[] args) throws IOException {
        // 8080 번 포트로 서버 소켓을 생성
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            while (true) {
                // 클라이언트의 접속을 대기
                try (Socket clientSocket = serverSocket.accept();
                     OutputStream out = clientSocket.getOutputStream();
                     InputStream in = clientSocket.getInputStream()) {

                    // 클라이언트에 데이터를 송신
                    out.write("HTTP/1.0 200 OK\n".getBytes());
                    out.write("Content-Type: text/html\n\n".getBytes());
                    out.write("<h1>Hello World!</h1>".getBytes());

                }
            }
        }
    }
}
