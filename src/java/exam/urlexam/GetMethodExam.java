package exam.urlexam;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

/**
 * Get 메소드의 경우
 */
public class GetMethodExam {
    public static void main(String[] args) throws IOException {
        URL url;
        HttpURLConnection connection;

        url = new URL("http://google.com");

        // HTTP 접속 구하기
        connection = (HttpURLConnection) url.openConnection();

        // 응답 코드 구하기
        System.out.println("connection.getResponseCode :: " + connection.getResponseCode());

        // 응답 메세지 구하기
        System.out.println("connection.getResponseMessage() :: " + connection.getResponseMessage());

        // 응답의 콘텐츠 유형을 취득
        System.out.println("connection.getContentType() :: " + connection.getContentType());

        // 응답 헤더를 모두 출력
        for (Map.Entry<String, List<String>> header : connection.getHeaderFields().entrySet()) {
            for (String value : header.getValue()) {
                System.out.println(header.getKey() + " :: " + header.getValue());

            }
        }

        // 응답 내용(BODY) 구하기
        try (InputStream in = connection.getInputStream();
             ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            byte[] buf = new byte[1024 * 8];
            int length = 0;

            while ((length = in.read(buf)) != -1) {
                out.write(buf, 0, length);
            }
            System.out.println(new String(out.toByteArray(), "UTF-8"));

        }

    }
}
