package com.nucleus.connection;
import com.nucleus.domain.CustomerMaster; 
public class Validation1
{ 
	
	public boolean isValidate(CustomerMaster customerMaster)
	{
		if( (isValidCustomerCode(customerMaster)==true)&& (isValidCustomerName(customerMaster)==true )&& (isValidCustomerAddress1(customerMaster)==true )&& (isValidCustomerPinCode(customerMaster)==true )&& (isValidEmailaddress(customerMaster)==true) && (isValidPrimaryContactPerson(customerMaster)==true )&&(isValidRecordStatus(customerMaster)==true) && (isValidActiveInactiveFlag(customerMaster)==true) && (isValidCreateDate( customerMaster)==true) && (isValidCreateBy(customerMaster)==true ))
		{	
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isValidCustomerCode(CustomerMaster customerMaster )
	{
		if(customerMaster.getCustomerCode().length()<=10 &&!customerMaster.getCustomerCode().isEmpty())
		{System.out.println("true1");
			return true; 
		}
		else
		{
			return false;
		}
	}
	public boolean isValidCustomerName(CustomerMaster customerMaster )
	{
		if((customerMaster.getCustomerName().length()<=30) && !(customerMaster.getCustomerName().isEmpty()) && (customerMaster.getCustomerName().matches("[a-zA-Z0-9]")) && !(customerMaster.getCustomerName().matches("[@#$%^&*]"))&& (customerMaster.getCustomerName().contains(" ") ))
		{System.out.println("true2");
			return true; 
		}
		else
		{
			return false;
		}
	}
	public boolean isValidCustomerAddress1(CustomerMaster  customerMaster )
	{
		if((customerMaster.getCustomerAddress1().length()<=100) && (!(customerMaster.getCustomerAddress1().equals(""))) && (customerMaster.getCustomerAddress1() !=null))
		{
			System.out.println("true3");
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isValidCustomerPinCode(CustomerMaster customerMaster )
	{
		if((customerMaster.getCustomerPinCode().length()==6) && (!(customerMaster.getCustomerPinCode().equals(""))) && (customerMaster.getCustomerPinCode()!=null))
		{
			System.out.println("true4");
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isValidEmailaddress(CustomerMaster customerMaster )
	{
	String email = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-z" +"A-Z]{2,7}$";
		if((customerMaster.getEmailaddress().matches(email)) && (!(customerMaster.getEmailaddress().equals(""))) && (customerMaster.getEmailaddress()!=null) )
		{     System.out.println("true5");
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isValidPrimaryContactPerson(CustomerMaster customerMaster )
	{
		if((customerMaster.getPrimaryContactPerson().length()<=100) && (!(customerMaster.getPrimaryContactPerson().equals(""))) && (customerMaster.getPrimaryContactPerson()!=null))
		{System.out.println("true6");
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isValidRecordStatus( CustomerMaster customerMaster )
	{
		if((customerMaster.getRecordStatus().length()<=1) && ((customerMaster.getRecordStatus().equals("N")) ||(customerMaster.getRecordStatus().equals("M"))|| (customerMaster.getRecordStatus().equals("D")) || (customerMaster.getRecordStatus().equals("A")) || (customerMaster.getRecordStatus().equals("R"))) && (customerMaster.getRecordStatus()!=null))
		{System.out.println("true7");
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isValidActiveInactiveFlag(CustomerMaster customerMaster )
	{
		if((customerMaster.getActiveInactiveFlag().length()<=1) && ((customerMaster.getActiveInactiveFlag().equals("A")) ||(customerMaster.getActiveInactiveFlag().equals("I"))) && (customerMaster.getActiveInactiveFlag()!=null))
		{System.out.println("true8");
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isValidCreateDate(CustomerMaster customerMaster)
	{
		if((!(customerMaster.getCreateDate().equals(""))) && (customerMaster.getCreateDate()!=null))
		{System.out.println("true9");
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isValidCreateBy(CustomerMaster customerMaster)
	{
		if((!(customerMaster.getCreatedBy().equals(""))) && (customerMaster.getCreatedBy()!=null))
		{System.out.println("true10");
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public boolean isValidCustomerCode(CustomerMaster customerMaster )
	{
	   if( (customerMaster.getCustomerCode().length())!=0&& (customerMaster.getCustomerCode().length()<=10))
		  {
			return true;
			
		  }
	   else
	   {
		return false;
	   }
	}
	public boolean isValidCustomerName(CustomerMaster customerMaster )
	{
		if((customerMaster.getCustomerName().length()!=0)&& (customerMaster.getCustomerName().length()<=30))
		{
			return true;
			
		}
		else
			return false;
	
	}
	public boolean isValidCustomerAddress1(CustomerMaster  customerMaster )
	{
		if((customerMaster.getCustomerAddress1().length()!=0)&&(customerMaster.getCustomerAddress1().length()<=100) )
		{
			return true;
			
		}
		else
			return false;
	
	}
	public boolean isValidCustomerAddress2(CustomerMaster customerMaster)
	{
		if((customerMaster.getCustomerAddress2().length()!=0)&&(customerMaster.getCustomerAddress2().length()<=100)) 
		{
			return true;
			
		}
		else
			return false;
	
	}
	public boolean isValidCustomerPinCode(CustomerMaster customerMaster )
	{
		if((customerMaster.getCustomerPinCode().length()!=0)&&(customerMaster.getCustomerPinCode().length()<=6) )
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	public boolean isValidEmailaddress(CustomerMaster customerMaster )
	{
		if((customerMaster.getEmailaddress().length()!=0)&&(customerMaster.getEmailaddress().length()<=100)) 
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
	public boolean isValidContactNumber(CustomerMaster customerMaster )
	{
		if((customerMaster.getContactNumber().length()!=0)&&(customerMaster.getContactNumber().length()<=20) )
		{
			return true;
			
		}
		else
		{
		return false;
		}
	}
	public boolean isValidPrimaryContactPerson(CustomerMaster customerMaster )
	{
		if(( customerMaster.getPrimaryContactPerson().length()!=0)&&(customerMaster.getPrimaryContactPerson().length()<=100)) 
		{
			return true;
			
		}
		else
		{
		return false;
		}
	}
	public boolean isValidRecordStatus( CustomerMaster customerMaster )
	{
		if( (customerMaster.getRecordStatus().length()!=0)&& (customerMaster.getRecordStatus().length()<=1) )
		{
			
			
	    if((customerMaster.getRecordStatus().equals("N"))||(customerMaster.getRecordStatus().equals("M"))||(customerMaster.getRecordStatus().equals("D"))||(customerMaster.getRecordStatus().equals("A"))||(customerMaster.getRecordStatus().equals("R")))
	    		  
	    {
		     return true;
           }
	 
	     else 
	     {
	    	 return false;
	     }
   }
	else 
	{
		return false;
	}
}		
	public boolean isValidActiveInactiveFlag(CustomerMaster customerMaster )
	{
		if((customerMaster.getActiveInactiveFlag().length()!=0)&&(customerMaster.getActiveInactiveFlag().length()<=1) )
		{
			
 		     if((customerMaster.getActiveInactiveFlag().equals("A"))||(customerMaster.getActiveInactiveFlag().equals("I")))
 			   {
 			     return true;
 	           }
 		 
 		     else 
 		     {
 		    	 return false;
 		     }
	    }
		else 
		{
			return false;
		}
	}		
			
	public boolean isValidCreatedBy(CustomerMaster customerMaster )
	{
		if((customerMaster.getCreatedBy().length()!=0)&&(customerMaster.getCreatedBy().length()<=30) )
		{
			return true;
			
		}
		else
		{
		return false;
		}
	}
	public boolean isValidmodifiedBy(CustomerMaster customerMaster )
	{
		if((customerMaster.getModifiedBy().length()!=0)&&( customerMaster.getModifiedBy().length()<=30)) 
		{
			return true;
			
		}
		else
		{
		return false;
		}
	}
	
	public boolean isValidAuthorizedBy(CustomerMaster customerMaster)
	{
		if((customerMaster.getAuthorizedBy().length()!=0)&&(customerMaster.getAuthorizedBy().length()<=30)) 
		{
			return true;
			
		}
		else
		{
		return false;
		}
	}
	
	public boolean isValidate(CustomerMaster customerMaster)
	{
		
		
		if( (isValidCustomerCode(customerMaster)==true)&& (isValidCustomerName(customerMaster)==true )&& (isValidCustomerAddress1(customerMaster)==true )&&( isValidCustomerAddress2(customerMaster)==true )&& (isValidCustomerPinCode(customerMaster)==true )&& (isValidEmailaddress(customerMaster)==true) &&  (isValidContactNumber(customerMaster)==true) &&(isValidPrimaryContactPerson(customerMaster)==true )&&(isValidRecordStatus(customerMaster)==true) && (isValidActiveInactiveFlag(customerMaster)==true) && (isValidCreatedBy(customerMaster)==true) &&(isValidmodifiedBy(customerMaster)==true) &&( isValidAuthorizedBy(customerMaster)==true) )
		           {   
						return true;
		             
		           }
		        else				
		          {
			            return false;
		          }	
		
		
	}*/
}