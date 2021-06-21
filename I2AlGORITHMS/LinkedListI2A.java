package I2AlGORITHMS;

public class  LinkedListI2A<T> {
T data;
LinkedListI2A<T> next;
LinkedListI2A<T> prev;

LinkedListI2A(T object){
this(object,null);	
}
LinkedListI2A(T object,LinkedListI2A<T> node){
data = object;
next = node;

}	
T getData() {

return data;	
}
LinkedListI2A getNext() {
return next;	
}// end getNext
}
 class List<T>{
private LinkedListI2A<T> firstNode;
private LinkedListI2A<T> lastNode;
private String name;

public List() {
this("list");
}

public List(String listName) {
name = listName;
firstNode = lastNode = null;
}
public void insertAtFront(T insertItem) {
if(isEmpty()) {
firstNode = lastNode = new LinkedListI2A<T>(insertItem);	
}	
else 
	firstNode = new LinkedListI2A<T>(insertItem,firstNode);
}

private boolean isEmpty() {
	// TODO Auto-generated method stub
	return false;
}
}
