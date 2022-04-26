package com.flyin.websocket.bio;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(ServerHost.PORT);
        ) {

            //循环监听等待客户端的连接
            while (true) {
                // 监听客户端
                Socket socket = serverSocket.accept();
                IOUtils.printByInputStream("客户端的请求信息为:", socket.getInputStream());
                System.out.println("hhhhhhhhh");
                System.out.println("hhhhhhhhh");
                System.out.println("hhhhhhhhh");
                InetAddress address = socket.getInetAddress();
                System.out.println("当前客户端的IP：" + address.getHostAddress());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
