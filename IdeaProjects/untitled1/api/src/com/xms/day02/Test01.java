package com.xms.day02;

import java.util.Arrays;

/**
 * @author dpc
 * @create 2021-06-09 下午 2:44
 */
public class Test01 {
    public static void main(String[] args) {
        Trims("  adm in   ");

        receive("abcdefg",2,6);
    }


    private static void receive(String s,int first,int last) {
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++) {
           arr[i]=s.charAt(i);
            }
//        System.out.println(Arrays.toString(arr));
        for(int i=first;i<last--;i++){
            char temp=arr[i];
            arr[i]=arr[last];
            arr[last]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
    ;
    private static void Trims( String s) {

        for(int i=0;i<s.length();i++){
            if (s.indexOf(" ")==0){
                s=s.substring(1);
//                System.out.println(i);
            }
            if(s.lastIndexOf(" ")==s.length()-1){
                s=s.substring(0,s.length()-1);
            }
        }
        System.out.println(s);
    }

}
