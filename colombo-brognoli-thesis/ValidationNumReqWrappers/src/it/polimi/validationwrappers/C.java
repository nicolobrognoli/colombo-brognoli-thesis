
package it.polimi.validationwrappers;
public class C implements ActivityInterface{
@Override
public void doActivity(){
try{
Thread.sleep(50);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}