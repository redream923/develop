package com.xms;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author dpc
 * @create 2021-06-25 下午 2:24
 */
public class URLDemo {
    public static void main(String[] args) {

        HttpURLConnection urlConnection = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            URL url = new URL("http://localhost:8080/examples/beauty.jpg?username=Tom");

            urlConnection = (HttpURLConnection) url.openConnection();

//          如果通过openConnection没有获取连接,可以通过connect再次获取连接
//            urlConnection.connect();
//            获取资源路径
            System.out.println(url.getPath());// /examples/beauty.jpg
//            获取getpath()+getQuery()
            System.out.println(url.getFile()); // /examples/beauty.jpg?username=Tom
//            获取查询条件
            System.out.println(url.getQuery()); // username=Tom

            is = urlConnection.getInputStream();
            fos = new FileOutputStream("D:\\beauty.jpg");

            byte[] buffer = new byte[1024];
            int len;
            while((len = is.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }

            System.out.println("下载完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(urlConnection != null){
                urlConnection.disconnect();
            }
        }
    }
}
