/**
 * @author dpc
 * @create 2021-06-22 下午 5:18
 */
@MyAnno(age = 20,name = "张三",mm=MyMath.GT,anno = @Anno("anno"),values = "abc")
public class MyAnooTest {
    String addr;

    
    @MyAnno(age = 20,name = "张三",mm=MyMath.GT,anno = @Anno("anno"),values = "abc")
    public void show(){

    }

}
