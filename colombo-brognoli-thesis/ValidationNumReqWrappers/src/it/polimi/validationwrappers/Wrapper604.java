
package it.polimi.validationwrappers;import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Wrapper604{
private Map<String,Float> mapReward = new HashMap<String,Float>();
private List<String> rewardNameList = new ArrayList<String>();
private List<String> alternatives = new ArrayList<String>();public Wrapper604(){
rewardNameList.add("time");		mapReward.put("totaltime", 100.0f);mapReward.put("weighttime", 0.7f);mapReward.put("policytime", 0.0f);
alternatives.add("A");
mapReward.put("Atime",0f);
mapReward.put("AtimeMin",0.003089467275842794f);
mapReward.put("AtimeMax",0.013426144004806729f);
alternatives.add("B");
mapReward.put("Btime",0f);
mapReward.put("BtimeMin",0.025182054894975724f);
mapReward.put("BtimeMax",0.07465445446748689f);
alternatives.add("C");
mapReward.put("Ctime",0f);
mapReward.put("CtimeMin",0.04975900892283389f);
mapReward.put("CtimeMax",0.08337840614357708f);rewardNameList.add("h");		mapReward.put("totalh", 2000f);mapReward.put("weighth", 0.3f);mapReward.put("policyh", 0.0f);
mapReward.put("Ah",1f);
mapReward.put("AhMin",1405.07662720922f);
mapReward.put("AhMax",1399.9524327076517f);
mapReward.put("Bh",1f);
mapReward.put("BhMin",1400.2592588246862f);
mapReward.put("BhMax",1403.107297644603f);
mapReward.put("Ch",1f);
mapReward.put("ChMin",1400.6954935573174f);
mapReward.put("ChMax",1402.713413169257f);
}
public void doActivity(){
		String choice = AlternativeUtility.getAlternative(alternatives,rewardNameList,mapReward);ActivityInterface obj = null;if(choice.equals("A")){obj = new A();}if(choice.equals("B")){obj = new B();}if(choice.equals("C")){obj = new C();}		obj.doActivity();AlternativeUtility.updateContext(rewardNameList, choice, mapReward);}}