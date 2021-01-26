import java.util.List;
import java.util.OptionalDouble;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//totalt 5387 ord del 1

public class UG1 {
	
	public static void main(String[] args) {
		
////-------------------- DEL 1 --------------------------
//		
//	String[] strings = Words.austin;
//	List<String> myList =  Arrays.asList(strings);
//	List newList = myList
//
////		int y = myList
////
//
////			.map( x-> x.length())
////			.mapToInt(Integer::intValue)
////			.sum();
//
//		System.out.println("Svaret: " + newList.size() );


//--------------------------------------------------------------------------------------------------------- Del 1 SVAR under!
//				String[] strings = Words.austin;

//				//.filter(x -> x>8)   [Del 1 / ?1] Svar: 363 ord.

//				//[Del 1 / ?2] Svar: 1152 ord.
//				List<String> myList =  Arrays.asList(strings);
//				List newList = myList.stream()
//				.distinct()
//				.collect(Collectors.toList());
// 				System.out.println("Svaret: " + newList.size());

//				//.filter(x -> x<4)   [Del 1 / ?3] Svar: 2560 ord.

				/*[Del 1 / ?4] Svar: 233 ord.
				List<String> myList =  Arrays.asList(strings);
				List newList = myList
				.stream()
				.filter(x-> x.length()>8)
				.distinct()
				.collect(Collectors.toList());
				System.out.println("Svaret: " + newList.size() );
				*/

//               /* OptionalDouble s = myList
//                * .mapToDouble(Integer::doubleValue)
//                .average();         [Del 1 / ?5 Svar:] den genomsnittliga ordlängden är OptionalDouble[4.239094115463152] */

				// [Del 1 / ?6] svar: 22836 ord | String[] strings = Words.austin; | List<String> myList =  Arrays.asList(strings); | int y = myList | .stream() |
				//.map( x-> x.length()) | .mapToInt(Integer::intValue) | .sum(); | System.out.println("Svaret: " + y );

				/*Predicate<String> p1 = s -> s.length() > 12;  [Del 1 / ?7] svar: alla ord är inte kortare än 12 bokstäver eller längre än 2.
				Predicate<String> p2 = s -> s.length() < 2;

				if (myList
						.stream()
						.filter(p1)
						.map(String::length).toArray().length > 0) {
					System.out.println("Längre än 12 bokstäver: false");
				} else System.out.println("Längre än 12 bokstäver: true");

				if (myList
						.stream()
						.filter(p2)
						.map(String::length).toArray().length > 0) {
					System.out.println("Kortare än 2 bokstäver: false");
				} else System.out.println("Kortare än 2 bokstäver: true");*/

//************************************************ KLADD under!
//				.collect(Collectors.toList());
//				if(strings.length != ' ')
////			count++;
//				.map(x -> x*2)




//-------------------- DEL 2 --------------------------	//5377 element i numbers


//		DoubleStream ds = Arrays.stream(Numbers.doubleArray);
//		double[] newList = ds
//				.filter(x -> x < 1000)
//
//				.map(x-> Math.round(x))
//				.filter( x-> x%3 == 0)
//				.toArray();
//
//		System.out.println(newList.length);

 			
//***************************************************************************************** KLADD under!
//		if(diev % 3 == 0) {
//		2 793 < 500     2584>500
// 		maxMin.getMax() + maxMin.getMin() 	
//		}
//		+ "The lowest value :" + mini()
//	public void maxi() {
//
//		OptionalDouble max = myStream
//				.stream()
//				.max();
//	}

//--------------------------------------------------------------------------------------------------------- Del 2 SVAR under!
// 	    [Del 2 / ?1] Svar: 1993 ord. .filter(x -> x > 1000) .toArray();

//		[Del 2 / ?2] Svar: 1095 ord.| DoubleStream ds = Arrays.stream(Numbers.doubleArray);| double[] newList = ds |.filter(x -> x < 1000)
//		|.filter( x-> x%3 == 0) | .toArray(); | System.out.println(newList.length);

//		[Del 2 / ?3] Svar: 219014.08842474723 | double newArray = myStream | .filter(v->v<500) | .sum() | System.out.println(newArray); |.distinct() |.map(x-> Math.round(x))

// 		[Del 2 / ?4] Svar: 2493.493686062643 | OptionalDouble aver = myStream | .filter(v->v>2000) | .filter(v->v<3000) | .average(); | System.out.println(aver);

//      [Del 2 / ?5] Svar: lägsta värdet: 0.026165146666303762 | DoubleStream myStream = Arrays.stream(Numbers.doubleArray); | OptionalDouble min = myStream | .min(); | System.out.println(min);

//  	[Del 2 / ?5] Svar: högsta värdet: 99883.15440272227 | DoubleStream myStream = Arrays.stream(Numbers.doubleArray); | OptionalDouble max = myStream | .max(); | System.out.println(max);



//-------------------- DEL 3 -----------------------------------------------------------------






//***************************************************************************************** KLADD under!




//--------------------------------------------------------------------------------------------------------- Del 3 SVAR under!


	}
			
}

