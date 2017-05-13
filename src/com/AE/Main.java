package com.AE;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
	// write your code here
//    int[] numbers = {4,8,6,2};
//        Arrays.sort(numbers);
//        System.out.println(numbers);
//        for(int number : numbers) {
//            System.out.println(number);
//        }
//        System.out.println(Arrays.binarySearch(numbers, 9));

//        int[][] twoD = new int[3][5];
//
//        for(int i = 0;i <twoD.length;i++){
//            for(int j = 0;j <twoD[i].length;j++){
//                System.out.println(twoD[i][j] + "");
//                System.out.println();
//            }
//        }
//
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());

//        String s1 = "1";
//        String s2 = s1.concat("2");
//        s2.concat("3");
//        System.out.println(s2);
//
//        String a = "";
//        a += 2;
//
//        System.out.println(a);

//        int b = 10;
//
//        ArrayList<Integer> l = new ArrayList<>();
//        ArrayList<Integer> v = new ArrayList<>();
//
//        l.add(1);
//        l.add(2);
//        l.add(3);
//        l.add(4);
//        l.add(5);
//        v.add(1);
//        v.add(2);
//        v.add(3);
//        v.add(4);
//        v.add(5);
//
//        System.out.println(l);
//        System.out.println(v);
//        System.out.println(l.equals(v));
//        System.out.println(l==v);
//
//        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
//        date.plusDays(2);
//        date.plusYears(3);
//        System.out.println(date.getMonth() + " " + date.getDayOfMonth() + " " + date.getYear());

//
//        int[] t = {1,2,3,4};
//        int[] z = {1,2,3,4};
//        int y = Arrays.binarySearch(t, 2);
//        System.out.println(y);
//        System.out.println(z.equals(t));
//        for( int i=0;i<t.length;i++){
//            System.out.print(t[i]+ " ");
//        }
//        System.out.println();
//        for( int i=0;i<z.length;i++){
//            System.out.print(z[i]+ " ");
//        }
//
//        ArrayList<String> f = new ArrayList<>();
////        f.remove(0); exception
////        f.add(7);
////        System.out.println(f);
//

//       Glider2 glider2 = new Glider2();
//        System.out.println(glider2.glide("a"));
//        System.out.println(glider2.glide("a", "b"));
//        System.out.println(glider2.glide(1));
//
//        List<Animal> animals = new ArrayList<>();
//        animals.add(new Animal("fish",false, true));
//        animals.add(new Animal("kangaroo", true, false));
//        animals.add(new Animal("rabbit",true, false));
//        animals.add(new Animal("turtle", false, true));
//
//        print(animals, Animal::isCanHop);
//        print(animals, Animal::isCanSwim);
//        print(animals, a -> a.isCanHop());
//        print(animals, a -> a.isCanSwim());
//
//        List<String> bunnies = new ArrayList<>();
//        bunnies.add("long ear");
//        bunnies.add("floppy");
//        bunnies.add("hoppy");
//        System.out.println(bunnies);
//        bunnies.removeIf(s -> s.charAt(0) != 'h');
//        System.out.println(bunnies);
//
//        System.out.println(howMany(true, new boolean[2]));
//        System.out.println(square(2));
//
//        int value = 9;
//        long result = square(value);
//        System.out.println(result);
//        System.out.print(Order2.result + " ");
//        System.out.print(Order2.result + " ");
//        new Order2();
//        new Order2();
//        new Order2();
//        System.out.println(Order2.result + " ");
//
//        Order order = new Order("f");
//        order = new Order();
//        System.out.println(order.value);

        String numbers = "2468";
        int total = 0;
        total += numbers.indexOf("6");
        total += numbers.indexOf("9");
        char ch = numbers.charAt(3);
        System.out.println(total + " " + ch);
        int a = 12%5;
        System.out.println(a);



    }

    private static void print(List<Animal> animals, Predicate<Animal> checker){
        for(Animal animal : animals){
            if(checker.test(animal)){
                System.out.println(animal + " ");
            }

        }
    }

    public static int howMany(boolean b, boolean... b2){
        return b2.length;
    }

    Rope rope = new Rope();

    Rope rope2 = null;
    public static long square(int x){
        long y = x * x;

        x = -1;
        return y;

    }

    public static StringBuilder work(StringBuilder a, StringBuilder b){
        a = new StringBuilder("a");
        b.append("b");
        return a;
    }








}




