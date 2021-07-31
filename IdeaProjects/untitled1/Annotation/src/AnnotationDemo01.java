/**
 * @author dpc
 * @create 2021-06-22 下午 4:40
 * 预定义注解
 */
@SuppressWarnings("all")
abstract class Fu{
    public abstract void show();
}
@SuppressWarnings("all")
class  Son extends Fu{
    @Override
    public void show() {}
/**
 * 该方法已过时,请使用interrupt
*/
    @Deprecated
    public void stop(){}
    public void interrupt(){}
}
public class AnnotationDemo01 {
    public static void main(String[] args) {
        Son s = new Son();
//        s.stop();
        s.interrupt();
    }
}
