package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {
    public static void main(String[] args) {
        //StdentCollection sc=new StdentCollection(1,"Vidya");
       // StdentCollection sc1=new StdentCollection(2,"Vidya");
       // StdentCollection sc2=new StdentCollection(3,"Vidya");
       // System.out.println(sc1);
       // System.out.println(sc2);
      // System.out.println(sc);


        List<StdentCollection> students=List.of(new StdentCollection(3,"Vidya"),new StdentCollection(2,"Reetu"),new StdentCollection(1,"shruti"));
        System.out.println(students);
        List<StdentCollection>studentsAL=new ArrayList<>(students);
        Collections.sort(studentsAL);
        System.out.println(studentsAL);

    }

}
