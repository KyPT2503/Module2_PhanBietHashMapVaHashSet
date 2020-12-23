import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Student> studentsHashMap=new HashMap<Integer,Student>();
        HashSet<Student> studentsHashSet=new HashSet<>();
        for (int i = 0; i < 5; i++) {
            studentsHashMap.put(i,new Student("A",15,"Vietnam"));
            studentsHashSet.add(new Student("A",15,"Vietnam"));
        }
        for(Map.Entry<Integer,Student> student:studentsHashMap.entrySet()) {
            System.out.println(student.getValue());
        }
        for(Student student:studentsHashSet){
            System.out.println(student);
        }
    }
}
