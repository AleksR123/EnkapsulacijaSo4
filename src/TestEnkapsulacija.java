
public class TestEnkapsulacija {
	
	public static void main(String[] args) {  
	    
	    Account acc=new Account();  
	    
	    acc.setAcc_no(7560504000L);  
	    acc.setName("Aleksandar Ristov");  
	    acc.setEmail("aleksandarristov28@gmail.com");  
	    acc.setAmount(500000f);  
	    
	    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
	}  

}
