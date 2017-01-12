package javaexam.urlexam;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class PostMethodExam {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://localhost:8080/test/SampleServel");

        // HTTP 접속 구하기
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        // 리퀘스트 메소드를 POST로 설정
        conn.setRequestMethod("POST");

        // 이 접속으로 출력도 수행하도록 설정
        conn.setDoOutput(true);

        // 리퀘스트 파라미터를 출력하는
        // 파라미터는 쿼리 문자열의 형식으로 지정하고 한국어 등을 송신하는 경우는 URL 인코딩을 함
        try (OutputStream out = conn.getOutputStream()) {
            out.write("id=홍길동".getBytes());
            out.write("&".getBytes());
            out.write(("name-" + URLEncoder.encode("한글", "UTF-8")).getBytes());
        }


        conn.disconnect();
    }
}
