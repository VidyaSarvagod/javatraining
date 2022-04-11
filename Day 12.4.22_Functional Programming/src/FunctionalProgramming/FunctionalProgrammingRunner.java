import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {

        List<String> lists= List.of("Apple","Orange","Mango");
        List<Integer> lists1= List.of(1,2,3);
        printbasic(lists);
        printwithFP(lists);
        printwithFiltring(lists);
        printwithFiltringFP(lists);
        printIntegerFilteringOddNumber(lists1);
    }
    
   //Object Oriented Programming....
    private static void printbasic(List<String> lists) {
        for(String list: lists)
        {

        }
    }
    //Functional Programming......
    private static void printwithFP(List<String> lists) {
        lists.stream().forEach(
                element-> System.out.println("element-" +element)


                              );
    }
    //pRINT fILTERING USING BASIC FOR LOOP
    private static void printwithFiltring(List<String> lists) {
        for(String list:lists){
            if(list.endsWith("le"))
            {
                System.out.println(list);
            }
        }
    }
    //Print Filtering using FP
    private static void printwithFiltringFP(List<String> lists) {
        lists.stream().filter(
                element->element.endsWith("le")
                             ).
                forEach(element-> System.out.println("element-"+element)
                );
    }
    //print odd number from List.....

    private static void printIntegerFilteringOddNumber(List<Integer> lists) {
        lists.stream().filter(
                        element->element%2==0
                ).
                forEach(element-> System.out.println("element-"+element)
                );
    }

}
