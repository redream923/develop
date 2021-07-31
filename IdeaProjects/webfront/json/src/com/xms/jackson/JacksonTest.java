package com.xms.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xms.domain.Student;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author dpc
 * @create 2021-07-26 下午 2:38
 */
public class JacksonTest {
    @Test
//    创建解析对象

    public void test1() throws IOException {
        Student s = new Student("zs",11,'男',new Date());
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(s);
//        System.out.println(jsonStr);

//        将JavaBean转成Json字符串,然后将该字符串写出到指定File中
        mapper.writeValue(new File("json.txt"),s);

        //3)将Json字符串转成JavaBean
        Student stu = mapper.readValue(jsonStr, Student.class);
        System.out.println(stu);
//        从指定文件中读取字符串,将该Json字符串转成JavaBean.
        Student stu2 = mapper.readValue(new File("json.txt"), Student.class);
        System.out.println(stu2);

    }

    //List和json之间的转换
        @Test
    public void test2() throws IOException {
            ArrayList<Student> list = new ArrayList<>();
            list.add(new Student("zs",11,'男',new Date()));
            list.add(new Student("ls",12,'男',new Date()));
            list.add(new Student("ww",13,'男',new Date()));

            ObjectMapper mapper = new ObjectMapper();
            //1)将List转成json字符串
            String jsonStr = mapper.writeValueAsString(list);
            System.out.println(jsonStr);

            //2)将json转成
            List<Student> list2 = mapper.readValue(jsonStr, List.class);
            for (Object student : list2) {

                System.out.println(student);

            }
        }
}
