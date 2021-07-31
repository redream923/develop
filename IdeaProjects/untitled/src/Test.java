import javax.jws.soap.SOAPBinding;
import javax.swing.text.html.parser.Entity;
import java.sql.Connection;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author dpc
 * @create 2021-07-15 上午 9:10
 */
class User{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
/*        HashMap<Integer, User> users = new HashMap<>();
        users.put(1, new User("张三", 25));
        users.put(3, new User("李四", 22));
        users.put(2, new User("王五", 28));
        System.out.println(users);
        HashMap<Integer,User> sortHashMap = sortHashMap(users);
        System.out.println(sortHashMap);*/
        ArrayList a = new ArrayList(0);
        ArrayList b = new ArrayList(0);
        System.out.println(a==b);
    }

    public static HashMap<Integer,User> sortHashMap(HashMap<Integer,User> map){
        Set<Map.Entry<Integer, User>> entries = map.entrySet();
        List<Map.Entry<Integer,User>> list = new ArrayList<Map.Entry<Integer, User>>(entries);
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().age-o1.getValue().age;
            }
        });
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,User> entry:list){
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        return linkedHashMap;

    }

    public static HashMap<Integer,User> sortHashMaptest(HashMap<Integer,User> map){
        Set<Map.Entry<Integer, User>> entries = map.entrySet();
        ArrayList<Map.Entry<Integer, User>> entries1 = new ArrayList<>(entries);
        Collections.sort(entries1, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o2.getValue().getAge() - o1.getValue().getAge();
            }
        });
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,User> entry : entries1 ){
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }
        return linkedHashMap;


    }

}
