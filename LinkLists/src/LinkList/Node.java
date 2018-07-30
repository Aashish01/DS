package LinkList;

public class Node <T>{
T data;
Node<T> next;
//To make sure both data & next are both of same type ,
//means array can store only one type of element of any datatype
//No <T> will mean can make anytype by obj way.
Node(T data){
	this.data = data;
	next = null;
}
}
