import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ObjectExample {


    public static void main(String[] args) {

        EG[] array = new EG[50];

        makeArray(array);

        for (EG obj : array) {
            System.out.println(obj);
        }

        List<EG> list = Arrays.asList(array);
        List newList = list
                .stream()
                .filter(x -> x.getValue() > 20)
                .collect(Collectors.toList());
        System.out.println(newList);

        //-------------------------------------------
        OptionalDouble od = list
                .stream()
                .mapToInt(x -> x.getValue())
                .average();
        System.out.println("Medelvärdet" + od);


        //----------------------------------------------
        newList = list
                .stream()
                .map(x -> {
                    if (x.isBool()) {
                        x.setName("true");
                    }
                    return x;
                })
                .collect(Collectors.toList());
        System.out.println(newList);

    }
        public static void makeArray (EG[] array){

            for (int i = 0; i < array.length; i++) {

                boolean bool;
                String name = "name" + (int) (Math.random() * 100) + 1;
                int value = (int) (Math.random() * 50) + 1;
                if (value < 25) {
                    bool = true;
                } else {
                    bool = false;
                }
                EG temp = new EG(name, value, bool);
                array[i] = temp;
            }

        }

    }