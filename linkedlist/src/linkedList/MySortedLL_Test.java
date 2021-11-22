
package linkedList;

/**
 *
 * @author DELL
 */
public class MySortedLL_Test {
    public static void main(String[] args) {
        MySortedLL list = new MySortedLL();
        list.add(9,3,5,7,2,10,6,0,8,1,4);
        MyIterator it = list.iterator();
        while(it.hasNext())
            System.out.printf(it.next() + ", ");
        System.out.println("");
        LL_Element result = list.search(10);
        if(result!=null)
            System.out.println("10 existed.");
        else
            System.out.println("10 doesn't existed");
        list.remove(10);
        System.out.println("After 10 was removed: ");
        it = list.iterator();
        while(it.hasNext())
            System.out.printf(it.next() + ", ");
        System.out.println();
    }
}
