public class Hello //类声明 
{ //类的左大括号
    public static void main(String args[]) {
        System.out.println("hello world");
        System.out.println("nice to meet you");
        Student stu = new Student();
        stu.speak("welcome new students");
    }
}
class Student {
    public void speak(String s) {
        System.out.println(s);//输出s
    }
}//类体的右大括号