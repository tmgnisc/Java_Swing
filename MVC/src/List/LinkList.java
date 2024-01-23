package List;
import java.util.LinkedList;
import java.util.List;

public class LinkList {

	public static void main(String[] args) {
		List<Integer> intList = new LinkedList<>();
		intList.add(1);
		intList.add(2);
		for(int i: intList) {
			System.out.println(i);
		}
	}
}
