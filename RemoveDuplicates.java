package week2.day2;

public class RemoveDuplicates {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		 String[] arrSplit = text.split(" ");
		 for (int i=0; i < arrSplit.length; i++)
		    {
		     count =0;
		      
		      for( int j=0;j<arrSplit.length;j++)
		      {
		    	 if ( arrSplit[i].equalsIgnoreCase(arrSplit[j]))
		    	 {
		    		 count++ ; 
		    	 }
		    	 
		      }
		    if (count>1)
		    {
		    	arrSplit[i]="";
		    }
			 
		    System.out.println("Remove Duplicates  " + arrSplit[i]);
		  }
	}
}



