import com.google.gson.Gson;

import java.io.Serializable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello 1st commit!");

        String json = "{\"name\": \"davor suker\"}";
        Gson firstPlayer = new Gson();

        Student s = new Student();
        s = firstPlayer.fromJson(json, Student.class);
        System.out.println(s.name);
    }
}

class Student implements Serializable {
    public String name;
}