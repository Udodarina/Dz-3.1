import java.text.DecimalFormat;

public class BmiService {
    public int calculate(int weight, double height) {

        int resoult;

        if ((weight > 0) || (height > 0)) {
           resoult = (int) (weight / (height * height));

        } else {

            resoult = 0;
        }
        return resoult;
    }
}

