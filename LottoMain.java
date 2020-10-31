import java.lang.Math;
import java.util.ArrayList;

public class LottoMain {
    public static void main(String[] args) {
        ArrayList<Integer> init = new ArrayList<>(); // Type: Integer, Integer 타입은 <>로 쓸 수 있다.
        ArrayList<Integer> lotto_number_init = new ArrayList<>(); // Type: Integer

        for(int i=0; i<10; i++) {
            init.add(((int)(Math.random() * 45) + 1));
        }

        for(Integer item : init) {
            if (!lotto_number_init.contains(item)) {
                lotto_number_init.add(item);
            }
        }

        for(int i=0; i<6; i++) {
            System.out.print(lotto_number_init.get(i) + " ");
        }
    }
}
