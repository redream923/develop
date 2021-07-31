package com.xms.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.xms.domain.Student;
import org.junit.Test;

import java.util.*;

/**
 * @author dpc
 * @create 2021-07-26 上午 11:40
 */
public class JsonTest {

    @Test
    public void test1() {
        //创建JavaBean
        Student s = new Student("zs",11,'男',new Date());
        //创建Gson解释器
        Gson gson = new Gson();
        String jsonS = gson.toJson(s);
        System.out.println(jsonS);

        //2)
        Student student = gson.fromJson(jsonS, Student.class);
        System.out.println(student);
    }

    @Test
    //list和json的相互转换
    public void test2(){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("zs",11,'男',new Date()));
        list.add(new Student("ls",12,'男',new Date()));
        list.add(new Student("ww",13,'男',new Date()));
        Gson gson = new Gson();
        //1)将List集合转成json字符串
        String jsonS = gson.toJson(list);
        System.out.println(jsonS);
        //2) 将json字符串转成集合
//        ArrayList list2 = gson.fromJson(jsonS, ArrayList.class);
        //typeToken:类型转换器,可以转成任意类型
        List<Student> list2 = gson.fromJson(jsonS, new TypeToken<List<Student>>() {}.getType());
        for(Student s:list2){
            System.out.println(s);
        }

    }


    @Test
    //map和json的相互转换
    public void test3(){
        Map<Integer,Student> map = new HashMap<>();
        map.put(1,new Student("zs",11,'男',new Date()));
        map.put(1,new Student("ls",12,'男',new Date()));

        Gson gson = new Gson();
        //1)将map转成json的字符串
        String jsonS = gson.toJson(map);
        System.out.println(jsonS);

        //2)json字符串转成map
        HashMap<Integer,Student> hm = gson.fromJson(jsonS, new TypeToken<HashMap<Integer, Student>>() {
        }.getType());

        Set<Map.Entry<Integer, Student>> entries = hm.entrySet();
        for (Map.Entry<Integer,Student> entrie:entries){
            System.out.println(entrie.getKey()+"--"+entrie.getValue());
        }
    }
}
