import java.util.*;
class RsaRepository{
Vector<Integer> st;
RsaRepository(Vector<Integer> st){
this.st=st;
}
public int store(Vector<Integer> st, int a) {
if(st.size()!=5) {
st.addElement(a);
System.out.println("store(" + a + ")");
System.out.println("stack: " + st);
return 0;
}
else {
return 1;
}
}
public int retrieve(Vector<Integer> st) {
if(st.isEmpty()) {
return 1;
}
else {
System.out.print("pop -> ");
int a = st.lastElement();
int i=
st.indexOf(a);
st.remove(i);
System.out.println(a);
System.out.println("stack: " + st);
return 0;
}
}
public int display(Vector<Integer> st) {
if(st.isEmpty()) {
return 1;
}
else {
System.out.println("stack elements are: " + st);
return 0;
}
}
}
