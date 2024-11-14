import java.util.*;
import java.util.stream.Collectors;

public class Empmain{
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1, "gdvjdh", "Engineering", 98000));
        emp.add(new Employee(2, "varrcx", "Engineering", 647000));
        emp.add(new Employee(3, "zxvvver", "Arts", 44000));
        emp.add(new Employee(4, "vbssafr", "History", 956000));
        emp.add(new Employee(5, "abvabgf", "Arts", 56000));

        List<Employee> q1 = new ArrayList<>();
        List<Employee> q2 = new ArrayList<>();
        Map<String,List<Employee>> q3=new HashMap<>();
        Map<String, Double> q4=new HashMap<>();

        q1 = emp.stream().filter(e -> Objects.equals(e.getDept(), "Engineering") && e.getSalary() > 80000).collect(Collectors.toList());
        System.out.println(q1);
        q2 = emp.stream().sorted((a, b) -> b.getSalary() - a.getSalary())
                .collect(Collectors.toList());
        System.out.println(q2);
        q3=emp.stream().collect(Collectors.groupingBy(a->a.getDept()));
        System.out.println(q3);
        q4=emp.stream().collect(Collectors.groupingBy(a->a.getDept(),Collectors.averagingInt(b->b.getSalary())));
        System.out.println(q4);
    }
}