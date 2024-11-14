import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookMain {

    public static void main(String args[]) {

        List<Book> lib=new ArrayList<>();
        lib.add(new Book("dftgyhu","sdrftgyh","Science Fiction",4.5));
        lib.add(new Book("fxqcsgh","erty","Science Fiction",3.5));
        lib.add(new Book("dgfc","xcfhgv","Anime",4.5));
        lib.add(new Book("hwbjbx","gtrwrv","Gaming",1.5));
        lib.add(new Book("chjdwc","uiejr","Science Fiction",5.0));

        List<Book> q1=lib.stream().filter(a->a.getGenre().equals("Science Fiction") && a.getRating()>4.0).collect(Collectors.toUnmodifiableList());
        System.out.println(q1);
        Map<String,Double> BookRecommendation=lib.stream().collect(Collectors.toMap(a->a.getTitle(),b->b.getRating()));
        System.out.println(BookRecommendation);
        List<Book> q3=lib.stream().sorted(Comparator.comparingDouble(Book::getRating).reversed()).collect(Collectors.toUnmodifiableList());
        System.out.println(q3);
    }
}
