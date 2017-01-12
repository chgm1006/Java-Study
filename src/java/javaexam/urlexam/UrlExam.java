package javaexam.urlexam;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlExam {
    public static void main(String[] args) {
        // URL 객체를 생성
        URL url = null;
        try {
            url = new URL("http://www.example.com/search?q=Java");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        // 프로토콜 구하기
        String protocol = url.getProtocol();
        System.out.println("protocol :: " + protocol);

        // 호스트명 구하기
        String host = url.getHost();
        System.out.println("host :: " + host);

        // 포트 번호 구하기(URL이 포트 번호를 포함하지 않는 경우는 -1"
        int port = url.getPort();
        System.out.println("port :: " + port);

        // 파일 이름(경로+쿼리문자열) 구하기
        String file = url.getFile();
        System.out.println("file :: " + file);

        // 경로 구하기
        String path = url.getPath();
        System.out.println("path :: " + path);

        // 쿼리 문자열을 구하기(URL이 쿼리 문자열을 포함하지 않는 경우는 null)
        String query = url.getQuery();
        System.out.println("query :: " + query);
    }
}
