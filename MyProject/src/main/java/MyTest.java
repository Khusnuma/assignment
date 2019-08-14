import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyTest {
	
	private static Map<String,String> numberMap = null;
	private Long inputVal ;

	public Long getInputVal() {
		return inputVal;
	}
	public void setInputVal(Long inputVal) {
		this.inputVal = inputVal;
	}
	public static void main(String[] args) {
		
		long inputVal = 6000;
		
		buildMap();
		
		MyTest objTest =  new MyTest();
		objTest.setInputVal(inputVal);		
		String str = objTest.convertNumberToEnglishWords(objTest.getInputVal());
		System.out.println(str);
	}	
	
	public String convertNumberToEnglishWords(long inputVal){
		
		String filler = " ";
		String str = null;
		char[] chrArr = String.valueOf(inputVal).toCharArray();
		char[] chrArr1 = String.valueOf(inputVal).toCharArray();
		int len = chrArr.length -1;
		for(int i = 0; i<= len; i++){
			chrArr1[len-i] = chrArr[i];
		}
		
		int length1 = chrArr1.length;
		Map<String,String> objMap = new TreeMap<String,String>();
		
		while(length1 > 0 && length1 <= 9){
		
			switch(length1){  
		    //Case statements  
		    case 9:  
		    	objMap.put("9", numberMap.get(String.valueOf(chrArr1[length1-1]))+filler+ numberMap.get(String.valueOf(100))+filler+"AND ");
		    	str = objMap.get("9");
		    	System.out.println(objMap.get("9"));
		    break;  
		    case 8: 
			    if(Integer.parseInt(String.valueOf(chrArr1[length1-1])) != new Integer(0)){
			    	 objMap.put("8", MyTest.numberMap.get(String.valueOf(Integer.valueOf(String.valueOf(chrArr1[length1-1]))*10))+filler);
			    }
			    else {
			    	 objMap.put("8","");
			    }
			    if(null != str){
			    	str = str + objMap.get("8");
			    }else
			    	str = objMap.get("8");
			    System.out.println(objMap.get("8"));
		    break;  
		    case 7:  
			    if(Integer.parseInt(String.valueOf(chrArr1[length1-1])) != new Integer(0)){
			    	 objMap.put("7", numberMap.get(String.valueOf(Integer.valueOf(String.valueOf(chrArr1[length1-1]))))
			    			 +filler+numberMap.get(String.valueOf(1000000))+filler);
			    }
			    else {
			    	if(!objMap.isEmpty() && objMap.containsKey("9")){
			    		if(objMap.get("9").isEmpty()){
			    			objMap.put("7", "");
			    		}else
			    			objMap.put("7", numberMap.get(String.valueOf(1000000))+filler);
			    	}
			    	if(!objMap.isEmpty() && objMap.containsKey("8")){
			    		if(objMap.get("8").isEmpty()){
			    			objMap.put("7", "");
			    		}else
			    			objMap.put("7", numberMap.get(String.valueOf(1000000))+filler);
			    	}
			    			    	
			    }
			    if(null != str){
			    	str = str + objMap.get("7");
			    }else
			    	str = objMap.get("7");
			    System.out.println(objMap.get("7"));
		    break;
		    case 6:  
			    if(Integer.parseInt(String.valueOf(chrArr1[length1-1])) != new Integer(0)){
			    	objMap.put("6", numberMap.get(String.valueOf(chrArr1[length1-1]))+filler+numberMap.get(String.valueOf(100))+filler+"AND ");
			    }
			    else {
			    	objMap.put("6", "");
			    }
			    if(null != str){
			    	str = str + objMap.get("6");
			    }else
			    	str = objMap.get("6");
			    System.out.println(objMap.get("6"));
		    break; 
		    case 5: 
			    if(Integer.parseInt(String.valueOf(chrArr1[length1-1])) != new Integer(0)){
			    	objMap.put("5", numberMap.get(String.valueOf(Integer.valueOf(String.valueOf(chrArr1[length1-1]))*10))+filler);
			    }
			    else
			    	objMap.put("5","");
			    if(null != str){
			    	str = str + objMap.get("5");
			    }else
			    	str = objMap.get("5");
			    	
			    System.out.println(objMap.get("5"));
		    break; 
		    case 4: 
			    if(Integer.parseInt(String.valueOf(chrArr1[length1-1])) != new Integer(0)){
			    	objMap.put("4", numberMap.get(String.valueOf(Integer.valueOf(String.valueOf(chrArr1[length1-1]))))
			    			+filler+numberMap.get(String.valueOf(1000))+filler);
			    }
			    else {
			    	if(!objMap.isEmpty() && objMap.containsKey("6")){
			    		if(objMap.get("6").isEmpty()){
			    			objMap.put("4", "");
			    		}else
			    			objMap.put("4", numberMap.get(String.valueOf(1000))+filler);
			    	}
			    	if(!objMap.isEmpty() && objMap.containsKey("5")){
			    		if(objMap.get("5").isEmpty()){
			    			objMap.put("4", "");
			    		}else
			    		objMap.put("4", numberMap.get(String.valueOf(1000))+filler);
			    	}
			    	
			    }
			    if(null != str){
			    	str = str + objMap.get("4");
			    }else
			    	str = objMap.get("4");
			    System.out.println(objMap.get("4"));
		    break; 
		    case 3: 
			    if(Integer.parseInt(String.valueOf(chrArr1[length1-1])) != new Integer(0)){
			    	objMap.put("3", numberMap.get(String.valueOf(chrArr1[length1-1]))
			    			+filler+numberMap.get(String.valueOf(100))+filler+"AND ");
			    }
			    else
			    	objMap.put("3","");
			    if(null != str){
			    	str = str + objMap.get("3");
			    }else
			    	str = objMap.get("3");
			    System.out.println(objMap.get("3"));
		    break; 
		    case 2: 
			    if(Integer.parseInt(String.valueOf(chrArr1[length1-1])) != new Integer(0)){
			    	objMap.put("2", numberMap.get(String.valueOf(Integer.valueOf(String.valueOf(chrArr1[length1-1]))*10))+filler);
			    }
			    else
			    	objMap.put("2","");
			    if(null != str){
			    	str = str + objMap.get("2");
			    }else
			    	str = objMap.get("2");
			    System.out.println(objMap.get("2"));
		    break; 
		    case 1: 
			    if(Integer.parseInt(String.valueOf(chrArr1[length1-1])) != new Integer(0)){
			    	objMap.put("1", numberMap.get(String.valueOf(Integer.valueOf(String.valueOf(chrArr1[length1-1])))));
			    }
			    else if(chrArr1.length ==1 && Integer.parseInt(String.valueOf(chrArr1[length1-1])) == new Integer(0)){
			    	objMap.put("1", numberMap.get(String.valueOf(Integer.valueOf(String.valueOf(chrArr1[length1-1])))));
			    }
			    else
			    	objMap.put("1","");
			    if(null != str){
			    	str = str + objMap.get("1");
			    }else
			    	str = objMap.get("1");
			    System.out.println(objMap.get("1"));
		    break; 
		    default:System.out.println("Bye!!!");  
		    }  
			length1--;
		}
			
		System.out.println(str);
		return str;
	}
	
	
	public static void buildMap(){
		numberMap = new HashMap<String,String>();
		numberMap.put( "0","ZERO");
		numberMap.put( "1","ONE");
		numberMap.put( "2","TWO");
		numberMap.put( "3","THREE");
		numberMap.put( "4","FOUR");
		numberMap.put( "5","FIVE");
		numberMap.put( "6","SIX");
		numberMap.put( "7","SEVEN");
		numberMap.put( "8","EIGHT");
		numberMap.put( "9","NINE");
		numberMap.put( "10","TEN");
		numberMap.put( "11","ELEVEN");
		numberMap.put( "12","TWELVE");
		numberMap.put( "13","THIRTEEN");
		numberMap.put( "14","FOURTEEN");
		numberMap.put( "15","FIFTEEN");
		numberMap.put( "16","SIXTEEN");
		numberMap.put( "17","SEVENTEEN");
		numberMap.put( "18","EITHTEEN");
		numberMap.put( "19","NINETEEN");
		numberMap.put( "20","TWENTY");
		numberMap.put( "30","THIRTY");
		numberMap.put( "40","FOURTY");
		numberMap.put( "50","FIFTY");
		numberMap.put( "60","SIXTY");
		numberMap.put( "70","SEVENTY");
		numberMap.put( "80","EIGHTY");
		numberMap.put( "90","NINETY");
		numberMap.put( "100","HUNDRED");
		numberMap.put( "1000","THOUSAND");
		numberMap.put( "1000000","MILLION");
	}

}
