import java.util.HashMap;
import java.util.Map;

public class studentcou {
    private Map <String,Integer>courses;
    public studentcou(){
        courses=new HashMap<>();
    }
    public void addcourses(String courses,int marks){
        courses.put(courses,marks);
    }
    public void displaycourse(){
        System.out.println("courses and marks");
        for(Map.Entry<String,Integer>entry:courses.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    public static void main(String[] args) {
        studentcou s =new studentcou();
        s.addcourses("maths", 78);
        s.addcourses("physics", 88);
        s.addcourses("english", 89);
        s.displaycourse();
    }
}
