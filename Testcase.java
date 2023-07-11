import java.util.*;
class Testcase {
    public static void main(String args[]) {
    Vector<Integer> s=new Vector<Integer>(5);
    RsaRepository rr=new RsaRepository(s);
    //TestCase1-->Empty State display operation
    int result=rr.display(s);
    if(result==0){
    System.out.println("\nTestCase-1 Success,State=Empty,Service=display()");
    System.out.println("--------------------------------------------------");
    }
    if(result==1){
    System.out.println("\nTestCase-1 Fails,State=Empty,Service=display()");
    System.out.println("--------------------------------------------------");
    }
    //TestCase-2-->Empty State retrieve Operation
    result=rr.retrieve(s);
    if(result==0){
    System.out.println("\nTestCase-2 Success,State=Empty,Service=retrieve()");
    System.out.println("--------------------------------------------------");
    }
    if(result==1){
    System.out.println("\nTestCase-2 Fails,State=Empty,Service=retrieve()");
    System.out.println("--------------------------------------------------");
    }
//TestCase-3-->Empty State store Operation
result=rr.store(s,5);
if(result==0) {
System.out.println("\nTestCase-3 Success,State=Empty,Service=store()");
System.out.println("--------------------------------------------------");
}
if(result==1) {
System.out.println("\nTestCase-3 Fails,State=Empty,Service=store()");
System.out.println("--------------------------------------------------");
}
//TestCase-4-->Not empty not full state display operation
rr.store(s,10);
rr.store(s,20);
result=rr.display(s);
if(result==0){
System.out.println("\nTestCase-4 Success,State=NotEmpty NotFull,Service=display()");
System.out.println("--------------------------------------------------");
}
if(result==1) {
System.out.println("\nTestCase-4 Fails,State=NotEmpty NotFull,Service=display()");
System.out.println("--------------------------------------------------");
}
//TestCase-5-->Not empty not full state retrieve operation
result=rr.retrieve(s);
if(result==1){
System.out.println("\nTestCase-5 Fails,State=Not empty not full,Service=retrieve()");
System.out.println("--------------------------------------------------");
}
if(result==0){
System.out.println("\nTestCase-5 Success ,State=not empty not full,Service=retrieve()");
System.out.println("--------------------------------------------------");
}
//TestCase-6-->Not empty not full state store operation
result=rr.store(s,100);
if(result==0){
System.out.println("\nTestCase-6Success,State=NotEmptyNotFull,Service=store()");
System.out.println("--------------------------------------------------");
}
if(result==1){
System.out.println("\nTestCase-6 Fails,State=NotEmpty NotFull,Service=store()");
System.out.println("--------------------------------------------------");
}
for(int i=0;i<=s.size();i++) {
    rr.store(s,i);
}
System.out.println();
System.out.println("--------------------------------------------------");
//TestCase-7-->Full state display operation
result=rr.display(s);
if(result==1) {
System.out.println("\nTestCase-7 Fails,State=Full,Service=display()");
System.out.println("--------------------------------------------------");
}
if(result==0) {
System.out.println("\nTestCase-7 Success,State=Full,Service=display()");
System.out.println("--------------------------------------------------");
}
//TestCase-8-->Full state store operation
result=rr.store(s,10);
if(result==1) {
System.out.println("TestCase-8 Fails,State=Full,Service=store()");
System.out.println("--------------------------------------------------");
}
if(result==0) {
System.out.println("TestCase-8 Success ,State=Full,Service=store()");
System.out.println("--------------------------------------------------");
}
//TestCase-9-->Full state pop operation
result=rr.retrieve(s);
if(result==1) {
System.out.println("\nTestCase-9 Fails,State=Full,Service=retrieve()");
System.out.println("--------------------------------------------------");
}
if(result==0) {
System.out.println("\nTestCase-9 Success,State=Full,Service=retrieve()");
System.out.println("--------------------------------------------------");
}
}
}