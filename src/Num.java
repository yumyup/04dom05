/**
 * Created by Helmut on 2017-03-15.
 */
public class Num {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 100) {
            if (i % 2 != 0) {
                i++;

                continue;
            }
            System.out.println(i);

            i++;

        }
        i = 0;
        while (i <= 100) {
            if (i % 2 != 0) {
                i++;

                continue;
            }
            System.out.println(i + i);
            i++;
        }
    }
}

