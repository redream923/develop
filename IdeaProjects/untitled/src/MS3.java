import java.util.Timer;
import java.util.TimerTask;

/**
 * @author dpc
 * @create 2021-07-20 上午 9:42
 */
class TimerTastCus extends TimerTask{
    private static int count = 0;
    @Override
    public void run() {
        count = (count+1)%2;
        System.out.println("Bombom");
        new Timer().schedule(new TimerTastCus() , 2000+2000*count);
    }
}
public class MS3 {
    public static void main(String[] args) {
        Timer timer = new Timer();
//        timer.schedule(new TimerTastCus(),2000+2000*count);
    }


}
