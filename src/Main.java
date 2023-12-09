import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Nurlan",45);
        Student student2 = new Student("Nurlan",45);
        Student student3 = new Student("Nurlan",45);
        Student student4 = new Student("Nurlan",45);
        Student student5 = new Student("Nurlan",45);
        Set<Student> hashset  = new HashSet<>(Set.of(student,student2,student3,student4,student5));
        Iterator<Student> iterator = hashset.iterator();
        while (iterator.hasNext()){
            Student dd = iterator.next();
            System.out.println(dd);
        }


    }
}