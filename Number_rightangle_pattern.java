package excercise3_Own_Use;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
//Java Test
//Java test1 from local repo
public class Number_rightangle_pattern {
    public  void hashMap() {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);

        Set<Character> set = map.keySet();

        for (Character s : set) {
            int val;
            if ((map.containsKey(s)) && (map.get(s) > 1)) {
                val = map.get(s) + 1;
                System.out.println("the key and value is ==>   " + s + "  ,  " + val);
                map.put(s, val);

            } //if
            else {
                val = map.get(s);
                System.out.println("the key and value is ==>   " + s + "  ,  " + val);
            }//e;se
        }//for

    }//haspMap



    public static void main(String[] args) {

        Number_rightangle_pattern obj = new Number_rightangle_pattern();
        obj.hashMap();

    }//main
}//class


/************Number  in right angle pattern***************
 for(int i=1;i<= 5;i++)
 {
 for(int j=1;j<=i;j++) {
 System.out.print(j);
 }
 System.out.println();
 }
 *********************************************************/

/************remove blank from the string*****************/

 /*       String str = "Amutha Bharathi Anbarasu";
        char charArr[] = str.toCharArray();
        StringBuffer strBuf = new StringBuffer(str);
        System.out.println("String in buffer is  =>" + strBuf);

        for (int i = 0; i <= strBuf.length() - 1; i++) {

            if (strBuf.charAt(i) == ' ')

                strBuf.deleteCharAt(i);

        }//for
        System.out.println("String in buffer is  =>" + strBuf);*/
/************************ count only duplicate character***********************************************************/
    /*    HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
        String str = "AmuthA";
        char[] strArr = str.toCharArray();
        for(char c : strArr){

            if(hashmap.containsKey(c)) {
                hashmap.put(c, hashmap.get(c) + 1);
            }
                else{
                hashmap.put(c,  1);
            }
        }// for
        Set<Character> set = hashmap.keySet();
        for ( Character ch:set){
            if (hashmap.get(ch) >1 ){
                System.out.println("the Character with duplicate count  is "+ ch + hashmap.get(ch));
            }
        }//for  */

    /****************************Anagram*************************************/

  /*  String  s1 = "ymutha";
    String s2 = "muthay";
//    String s1Copy  = s1.replaceAll("\\s","");
//    s2  = s2.replaceAll("\\s","");

    char[] charArr1 = s1.toLowerCase().toCharArray();

    char[] charArr2 = s2.toLowerCase().toCharArray();



        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        System.out.print("The array one is  :=>" );
        for(char c:charArr1)
        System.out.print( c);
        System.out.println();
        System.out.print("The array two is  :=>" );

        for(char c:charArr2)
        System.out.print( c);

       boolean status = Arrays.equals(charArr1, charArr2);

        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }*/

  /*************************String reverse *******************/

//        String s = "101";
//
//
//   int i = Integer.parseInt(s);  // String to integer = 101
//        System.out.println("String to Integer  == >" + i);
//
//
//   s = Integer.toString(i);//   integer to string = "101"
//        System.out.println("Integer to String  == >" +  s);

        /*******************************************************/

