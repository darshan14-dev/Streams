package org.example;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    static void main() {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));





//    Map<String,Double> genders = employeeList.stream()
//            .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));



//        employeeList.stream()
//                .filter(n->n.getYearOfJoining()>2015)
//                .map(n -> n.getName())
//                .forEach(System.out::println);

        //System.out.println(names);

//        employeeList.stream()
//                .filter(e -> "Product Development".equals(e.getDepartment()) && "Male".equals(e.getGender()))
//                .min(Comparator.comparingInt(Employee::getAge))
//                .ifPresent(System.out::println);



//        Map<String, List<String>> mp = employeeList.stream()
//                .collect(Collectors.groupingBy(e-> e.getAge() <= 25 ? "Younger" : "Elder" , Collectors.mapping(
//                        e -> e.getName(),
//                        Collectors.toList()
//                )));
//
//        System.out.println(mp);


//         List<String> details =    employeeList.stream()
//                    .min(Comparator.comparing(Employee::getYearOfJoining))
//                 .map(e -> List.of(String.valueOf( e.getId()),e.getName()))
//                    .orElse(null);
//
//        System.out.println("ID " + details.get()+ "   " + "Name " + mostExp.getName());






//-----------------------------------------------------------------------------------------------



        List<String> page1 = Arrays.asList("java", "streams", "guide", "java", "programming");
        List<String> page2 = Arrays.asList("search", "engine", "tutorial", "java");
        List<String> page3 = Arrays.asList("coding", "is", "fun", "java", "java", "java");
        List<String> page4 = Arrays.asList("python", "is", "also", "popular");
        List<List<String>> allPages = Arrays.asList(page1, page2, page3, page4);
        String searchTerm = "java";

        //O/p -> page3


//        List<Map<String, Long>> allMaps = allPages.stream()
//                .filter(p -> p.contains(searchTerm))
//                .map(page -> page.stream()
//                        .collect(Collectors.groupingBy(s -> s, Collectors.counting())))
//                .collect(Collectors.toList());
//
//        List<Map<String, Long>> sortedPages = allMaps.stream()
//                .sorted((a,b) -> Long.compare(b.get(searchTerm), a.get(searchTerm)))
//                .toList();
//        System.out.println(sortedPages);



//       List<String> webPages = IntStream.range(0,allPages.size())
//                .mapToObj(i -> Map.entry(
//                        "Page" + (i+1),
//                        allPages.get(i).stream().filter(p -> searchTerm.equals(p)).count()
//                ))
//               .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
//               .map(Map.Entry :: getKey)
//               .toList();
//
//        System.out.println(webPages);

    }
}


//------------------------------------------------------------------------------------------------