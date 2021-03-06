import java.util.Arrays;
import java.util.List;

public class Divisible1 {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(12,20,35,46,55,68,75);
		System.out.println(list.stream().filter(i->i%5==0).reduce(0,(c,e)->(c+e)));
		System.out.println(list.stream().filter(i->i%5==0).reduce(0,(c,e)->Integer.sum(c, e)));
		System.out.println(list.stream().filter(i->i%5==0).reduce(0,Integer::sum));
		System.out.println(list.stream().filter(i->i%5==0).map(i->i*2).reduce(0,(c,e)->(c+e)));
	}

}
