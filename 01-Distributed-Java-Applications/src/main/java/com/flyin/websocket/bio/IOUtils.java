package com.flyin.websocket.bio;

import java.io.*;

public class IOUtils {
    /**
     * 打印输入流
     *
     * @param info        信息
     * @param inputStream 输入流
     * @throws IOException IOException
     */
    public static void printByInputStream(String info, InputStream inputStream) throws IOException {
        Reader stringReader=new InputStreamReader(inputStream);
        BufferedReader bufferedReader=new BufferedReader(stringReader);
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) break;
            System.out.println(info +readLine);
        }
    }
}
