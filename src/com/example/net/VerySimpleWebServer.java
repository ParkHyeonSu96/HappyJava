package com.example.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class VerySimpleWebServer {
    public static void main(String[] args) throws Exception {
        // 9090 port로 대기한다.
        ServerSocket ss = new ServerSocket(9090);

        // 클라이언트를 대기한다.
        // 클라이언트가 접속하는 순간, 클라이언트와 통신할 수 있는 socket을 반환한다.
        // 브라우저에서 https://127.0.0.1:9090/ 입력한다.
        // 2번째는 https://127.0.0.1:9090/board/hello.html
        System.out.println("클라이언트 접속을 기다립니다.");
        // Socket은 브라우저(client)와 통신할 수 있는 객체다.
        Socket socket = ss.accept();

        // Client와 읽고 쓸수 있는 InputStream, OutputStream이 반환된다.
        OutputStream out = socket.getOutputStream();
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
        InputStream in = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        // HTTP프로토콜은 클라이언트가 정보를 서버에게 보내준다. (요청정보)
        String fristLine = br.readLine();
        List<String> headers = new ArrayList<>();
        String line = null;
        // 빈줄을 만나면 while문을 끝낸다.
        while(!((line = br.readLine()).equals(""))){
            headers.add(line);
        }
        // 요청정보 읽기가 끝.
        System.out.println(fristLine);
        for(int i = 0; i < headers.size(); i++){
            System.out.println(headers.get(i));
        }

        // 서버가 보내는 응답메시지
        // HTTP/1.1 200 OK <-- 상태메시지
        // 헤더 1
        // 헤더 2
        // 빈줄
        // 내용(body).
        pw.println("HTTP/1.1 200 OK");
        pw.println("name: park");
        pw.println("email : hyunsuddong@naver.com");
        pw.println();
        pw.println("<html>");
        pw.println("<h1>Hello!!</h1>");
        pw.println("</html>");
        pw.close();


        ss.close();
        System.out.println("서버가 종료됩니다.");
    }
}
