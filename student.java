package prog2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
class student{
    private String name;
    private Date dob;
    private int age;

    public student(String name,String dob)throws ParseException{
        this.name=name;
        this.dob=new SimpleDateFormat("dd-mm-yyyy").parse(dob);
        this.age=calculateage();
    }
    public int calculateage(){
        Date today=new Date();
        long ageinmillis=today.getTime()-dob.getTime();
        return(int)(ageinmillis/(1000L * 60 * 60 * 24 * 365));
    }
    public void displaydetails(){
        System.out.println("name:"+name);
        System.out.println("Date of Birth:"+new SimpleDateFormat("dd-mm-yyyy").format(dob));
        System.out.println("age:"+age);
    }
    public static void main(String[] args)throws ParseException {
        student s= new student("prem","11-09-2002");
        s.displaydetails();
    }
}
