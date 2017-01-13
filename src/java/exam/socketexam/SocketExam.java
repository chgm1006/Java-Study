package exam.socketexam;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;


public class SocketExam {
    public static void main(String[] args) throws IOException {
        try (
                // 서버와 통신을 하기 위한 Socket
                Socket socket = new Socket("localhost", 8080);
                // 서버로 데이터를 송신하기 위한 OutputStream
                OutputStream out = socket.getOutputStream();
                // 서버로부터 데이터를 수신하기 위한 InputStream
                InputStream in = socket.getInputStream()
        ) {

            // 서버로 데이터를 송신
            out.write("GET / HTTP/1.0\n\n".getBytes());

            // 서버로부터 데이터를 수신
            try (ByteArrayOutputStream bytes = new ByteArrayOutputStream()) {
                byte[] buf = new byte[1024 * 8];
                int length = 0;

                while ((length = in.read(buf)) != -1) {
                    bytes.write(buf, 0, length);
                }

                // 서버에서 수신한 데이터를 콘솔에 표시
                System.out.println(new String(bytes.toByteArray(), "UTF-8"));

            }
        }
    }
}
