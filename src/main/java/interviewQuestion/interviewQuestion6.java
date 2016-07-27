/*
package interviewQuestion;

import sun.applet.Main;

import java.io.*;
import java.util.*;

import static java.lang.System.out;

*/
/**
 * Created by chencen on 2016/7/16.
 *//*

public class interviewQuestion6 {
    private class People {
        private String name;
        private int count;

        public People(String name, int count) {
            this.name = name;
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    public void test() throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(new File(this.getClass().getResource(".").getPath() + "resource.properties")));
        out.println(this.getClass().getResource(".").getPath() + "resource.properties");
        // Scanner scanner=new Scanner(new File(this.getClass().getResource(".").getPath()+"resource.properties"));
        String[] strArr = null;
        Map<String, People> map = new HashMap();
        People people = null;
        while (scanner.hasNextLine()) {
            strArr = scanner.nextLine().split(",");
            if (!map.containsKey(strArr[1])) {
                map.put(strArr[1], new People(strArr[1], 1));
            } else {
                map.get(strArr[1]).setCount(map.get(strArr[1]).getCount() + 1);

            }
        }
        for (People people : map.values()) {
            out.println(people.getName() + "\t" + people.getCount());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        new interviewQuestion6().test();


    }
}
*/
