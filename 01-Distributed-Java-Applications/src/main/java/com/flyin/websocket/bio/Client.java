package com.flyin.websocket.bio;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {

        try (Socket socket = new Socket(ServerHost.IP, ServerHost.PORT);
             OutputStream outputStream = socket.getOutputStream();
             PrintWriter printWriter = new PrintWriter(outputStream,true)
        ) {
            printWriter.println("客户端连接进来了");
            Thread.sleep(1000);
//            IOUtils.printByInputStream("服务端的请求信息为:", socket.getInputStream());
            //向服务器写入的输出流
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
