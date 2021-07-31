package com.xms.day03;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author dpc
 * @create 2021-06-22 上午 11:48
 * 指定日期删除指定目录
 * 比如12:00删除桌面上的demo目录
 */
class DeleteFolderTask extends TimerTask {
    @Override
    public void run() {
        String pathName = "D:\\aa\\demo";
        File floder = new File(pathName);
        deleteFloer(floder);

    }

    private static void deleteFloer(File floder) {
        File[] file = floder.listFiles();
        if (file.length == 0) {
            floder.delete();
        } else {
            for (File f : file) {
                if (f.isDirectory()) {
                    deleteFloer(f);
                } else {
                    f.delete();
                }
            }
        }
    }
}

public class Test01 {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
        String time = "2021-6-22 12:09:00";
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(time);
        timer.schedule(new DeleteFolderTask(),date);
    }


}
