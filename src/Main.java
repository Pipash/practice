import AmazonCodingPractice.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    String str;

    private Main() {
        this.str = "This is the string";
    }

    public static void main(String[] arg) {
        //Hello string = new Hello();
        //OddOccurrencesInArray oddNumber = new OddOccurrencesInArray();
        //System.out.println(oddNumber.OddOccurrenc());
        //System.out.println(A[0]);
        //CyclicRotation rotation = new CyclicRotation();
        //int[] A = {0,0,0};
        //int k = 1;
        //rotation.watch(A, k);
        //int[] finalArray = ;
        //System.out.println(Arrays.toString(rotation.rotation(A, k)));
        //FrogJmp jmp = new FrogJmp();
        //PermMissingElem missing = new PermMissingElem();
        //TapeEquilibrium equilibrium = new TapeEquilibrium();
        //PermCheck check = new PermCheck();
        //int[] A = new int[]{};
        //FrogRiverOne jmp = new FrogRiverOne();
        //MissingInteger missingInteger = new MissingInteger();
        //int[] A = new int[]{1, 3, 6, 4, 1, 2};
        /*GenomicRangeQuery range = new GenomicRangeQuery();
        String str = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};*/
        //MinAvgTwoSlice avg = new MinAvgTwoSlice();
        //LinkedList ls = new LinkedList();
        //CountDiv countDiv = new CountDiv();
        //MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
        //Distinct distinct = new Distinct();
        //Fish fish = new Fish();
        //Dominator dominator = new Dominator();
        //MaxProfit maxProfit = new MaxProfit();
        //[8, 9, 3, 6, 1, 2]
        //{5,4,3,2,1}
        //int[] A = {23171, 21011, 21123, 21366, 21367};
        //int[] A = {5,4,3,2,1};
        //int[] A = {4,3,2,1,5};
        //int[] B = {0,1,0,0,0};
        //int n = 2;
        //Brackets brackets = new Brackets();
        //String s = "([)()]";
        //float mod = 2/4;
        /*StrMatch strMatch = new StrMatch();
        String[] strArr = {"anancell", "betecellular", "cetracular", "deltacellular", "eurocell"};
        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(Arrays.asList(strArr));
        String[] strArr2 = {"Best service anancell", "betecellular has great", "anancell provide much better"};
        ArrayList<String> strlist2 = new ArrayList<>();
        strlist2.addAll(Arrays.asList(strArr2));*/

        //DayCountArray dayCountArray = new DayCountArray();
        //int[][] arr = {{1,0,0,1,1}, {0,0,1,1,0}, {0,0,0,0,1},{0,0,1,0,0}};

        //CountFactors countFactors = new CountFactors();
        //countFactors.factor(36)
        //FlagsOnPick flags = new FlagsOnPick();
        //int[] A = {0, 0, 0, 0, 0, 1, 0, 1, 0, 1};
        //MinPerimeterRectangle rectangle = new MinPerimeterRectangle();
        //PatternMatch pattern = new PatternMatch();
        //FirstReverse reverse = new FirstReverse();
        //int[][] arr = {{1,1,1,0,0,0}, {0,1,0,0,0,0}, {1,1,1,0,0,0}, {0,0,2,4,4,0}, {0,0,0,2,0,0}, {0,0,1,2,4,0}};
        //TwoDArray twoDArray = new TwoDArray();

        //System.out.println(twoDArray.maxTotal(arr));

        /*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> contacts = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            contacts.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (contacts.containsKey(s)) {
                System.out.println(s+"="+contacts.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();*/

        //Pangram pangram = new Pangram();
        //System.out.println(pangram.isItPangram("We promptly judged antique ivory buckles for the next prize."));
        //FlowerPattern flowerPattern = new FlowerPattern(3);
        //TwoSum twoSum = new TwoSum();
        //MergeSort mergeSort = new MergeSort();
        //ClosestSum closestSum = new ClosestSum();
        //MaxUnitOnTruck maxUnitOnTruck = new MaxUnitOnTruck();
        //LowestCommonAncestor lca = new LowestCommonAncestor();
        //DFSAlgo dfsAlgo = new DFSAlgo();
        //NumberOfIsland numberOfIsland = new NumberOfIsland();
        //BFSAlgo bfsAlgo  = new BFSAlgo();
        /*Tests child1 = new TestsChild();
        TestsChild child2 = new TestsChild();
        Tests parent = new Tests();
        System.out.println("child1 "+child1.str()+" child2 "+child2.str() + " parent "
                +parent.str() + " ch1 "+ child1.str2() + " ch2 "+ child2.str2());*/
        //new TestsChild();
        String st1 = "hello";
        String st2 = "hello";
        String st3 = new String("hello");
        /*System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));
        System.out.println(st1== st3);
        System.out.println(st1.equals(st3));*/

        List<String> a = new LinkedList<>();
        a.add("a");
        a.add("b");
        a.add("c");
        /*System.out.println(a.get(1));
        a.remove("b");
        System.out.println(a.get(1));*/

        //System.out.println("1"+2+3);
        String name = "annuha";
        String[] nStr = name.split("");
        Map<String, Long> conting = Arrays.stream(nStr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(conting);

        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
