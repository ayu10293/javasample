package exam;

import java.util.ArrayList;
import java.util.List;

public class Exam7 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        //オブジェクトを生成し、Listに追加
        Employee e1 = new Employee("田中太郎", 20);
        
        employees.add(e1);

        Engineer e2 = new Engineer("鈴木一郎", 25, "Java");
        employees.add(e2);

        Employee e3 = new Employee("佐藤花子", 30);
        employees.add(e3);

        // リストの全情報を出力
        for (Employee employee : employees) {
            employee.introduce();
        }
    }
}