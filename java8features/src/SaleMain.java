import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SaleMain {

    public static void main(String args[])
    {
        List<Sale> s=new ArrayList<>();

        s.add(new Sale(1,3,5000));
        s.add(new Sale(2,22,250));
        s.add(new Sale(3,4,650));
        s.add(new Sale(4,1,50000));
        s.add(new Sale(5,6,1000));
        s.add(new Sale(6,34,80));
        s.add(new Sale(7,5,5000));
        s.add(new Sale(8,17,450));

        List<Sale> q1=s.stream().filter(a->a.quantity>10).collect(Collectors.toList());
        System.out.println(q1);
        Map<Integer,Integer> ProductSales=s.stream().collect(Collectors.toMap(a->a.getProductId(),b->b.getPrice()*b.getQuantity()));
        System.out.println(ProductSales);
        List<Sale> q3=s.stream().sorted((a,b)-> (b.getPrice()* b.getQuantity())- a.getPrice()*a.getQuantity()).collect(Collectors.toUnmodifiableList());
        System.out.println(q3);
        List<Sale> q4=s.stream().sorted((a,b)-> (b.getPrice()* b.getQuantity())- a.getPrice()*a.getQuantity()).limit(5).collect(Collectors.toUnmodifiableList());
        System.out.println(q4);

    }
}
