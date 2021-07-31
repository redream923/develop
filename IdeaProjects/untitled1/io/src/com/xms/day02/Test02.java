package com.xms.day02;

import java.io.*;


/**
 * @author dpc
 * @create 2021-06-17 下午 5:01
 * 将桌面上的Demo目录复制到D:\下
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        File srcFloder = new File("C:\\Users\\Administrator\\Desktop\\demo");
        File destFloder = new File("D:\\demo");
        copyFolder(srcFloder, destFloder);
    }

    private static void copyFolder(File srcFloder, File destFloder) throws IOException {
//        判断目的端是否存在
        if(!destFloder.exists()){
            destFloder.mkdirs();
        }
        File[] files = srcFloder.listFiles();
        for (File file : files) {
//                创建目的端需要复制文件或文件夹的File对象
            File destFile = new File(destFloder,file.getName());
            if (file.isFile()) {
                copyFile(file, destFile);
            }else {
                copyFolder(file,destFile);
            }
        }
    }

    private static void copyFile(File srcFloder, File destFloder) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(srcFloder));
            bos = new BufferedOutputStream(new FileOutputStream(destFloder));
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = bis.read(buf)) != -1) {
                bos.write(buf,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


}
