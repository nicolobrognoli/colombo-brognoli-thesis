
package it.polimi.valwrappers;
public class D implements ActivityInterface{
@Override
public void doActivity(){
try{
Thread.sleep(50);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}