import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("geladeira");
        list.add("fogão");
        list.add("microondas");
        list.add("torradeira");

        System.out.println(list.size());
        for(String cozinha : list){
            System.out.println(cozinha);
        }

        System.out.println("-------------------");

        list.add(1, "forno");
        for(String cozinha : list){
            System.out.println(cozinha);
        }

        System.out.println("-------------------");

        list.remove(4);
        list.removeIf(x -> x.charAt(0) == 'm'); //remove a palavra qua começa com char 'm'

        for(String cozinha : list){
            System.out.println(cozinha);
        }

        System.out.println("-------------------");

        System.out.println(list.indexOf("forno"));
        System.out.println(list.lastIndexOf("forno"));

        System.out.println("-------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'f').collect(Collectors.toList());
        for(String x : result){
            System.out.println(x);
        }

        System.out.println("-------------------");

        String obj = list.stream().filter(x -> x.charAt(0) == 'g').findFirst().orElse(null);
        System.out.println(obj);
    }
}