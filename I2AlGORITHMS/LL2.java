package I2AlGORITHMS;

public class LL2<T> {
T data;
LL2<T> next;
LL2<T> prev;
LL2<T> firstNode;
LL2(T data2){
this(null,data2);
}
LL2(LL2<T> node,T object){
data= object;
next = node;
}
public static void main(String [] args) {
LL2<Integer> list = new LL2<Integer>(3);
list.print();
list.listInsert(list, 2);
list.print();
list.listInsert(list, 3);
list.print();
list.listInsert(list, 2);
list.print();
list.listInsert(list, 3);


}
public void listInsert(LL2<T> L,T x) {
if(firstNode != null)
	next = firstNode;
if(firstNode != null) {
  firstNode.prev = new LL2<T>(x);
firstNode = firstNode.next;

}
else 
	firstNode = new LL2<T>(x);
}

public boolean isEmpty() {
if(next ==null&& prev == null) 
return true;
else
return false;

}

 // output list contents
 public void print(){




 LL2<T> current = firstNode;

 // while not at end of list, output current node's data
 while (current != null)
 {
 System.out.printf("%s ", current.data);
 current = current.next;
 }

 System.out.println();
 }
 
}