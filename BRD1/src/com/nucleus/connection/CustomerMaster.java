package com.nucleus.connection;

public class CustomerMaster 
{
	int customerID;
	String customerCode;
	String customer_Name;
	String customerAddress1;
	String customerAddress2;
	int customerPinCode;
	String emailaddress;
	int contactNumber;
	String primaryContactPerson;
	String recordStatus;
	String activeInactiveFlag;
	int createDate;
	String createdBy;
	int modifiedDate;
	String modifiedBy;
	int authorizedDate;
	String authorizedBy;
	public CustomerMaster(int customerID, String customerCode,
			String customer_Name, String customerAddress1,
			String customerAddress2, int customerPinCode, String emailaddress,
			int contactNumber, String primaryContactPerson,
			String recordStatus, String activeInactiveFlag, int createDate,
			String createdBy, int modifiedDate, String modifiedBy,
			int authorizedDate, String authorizedBy) 
	{
		super();
		this.customerID = customerID;
		this.customerCode = customerCode;
		this.customer_Name = customer_Name;
		this.customerAddress1 = customerAddress1;
		this.customerAddress2 = customerAddress2;
		this.customerPinCode = customerPinCode;
		this.emailaddress = emailaddress;
		this.contactNumber = contactNumber;
		this.primaryContactPerson = primaryContactPerson;
		this.recordStatus = recordStatus;
		this.activeInactiveFlag = activeInactiveFlag;
		this.createDate = createDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
		this.authorizedDate = authorizedDate;
		this.authorizedBy = authorizedBy;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public String getCustomerAddress1() {
		return customerAddress1;
	}
	public void setCustomerAddress1(String customerAddress1) {
		this.customerAddress1 = customerAddress1;
	}
	public String getCustomerAddress2() {
		return customerAddress2;
	}
	public void setCustomerAddress2(String customerAddress2) {
		this.customerAddress2 = customerAddress2;
	}
	public int getCustomerPinCode() {
		return customerPinCode;
	}
	public void setCustomerPinCode(int customerPinCode) {
		this.customerPinCode = customerPinCode;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getPrimaryContactPerson() {
		return primaryContactPerson;
	}
	public void setPrimaryContactPerson(String primaryContactPerson) {
		this.primaryContactPerson = primaryContactPerson;
	}
	public String getRecordStatus() {
		return recordStatus;
	}
	public void setRecordStatus(String recordStatus) {
		this.recordStatus = recordStatus;
	}
	public String getActiveInactiveFlag() {
		return activeInactiveFlag;
	}
	public void setActiveInactiveFlag(String activeInactiveFlag) {
		this.activeInactiveFlag = activeInactiveFlag;
	}
	public int getCreateDate() {
		return createDate;
	}
	public void setCreateDate(int createDate) {
		this.createDate = createDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public int getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(int modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public int getAuthorizedDate() {
		return authorizedDate;
	}
	public void setAuthorizedDate(int authorizedDate) {
		this.authorizedDate = authorizedDate;
	}
	public String getAuthorizedBy() {
		return authorizedBy;
	}
	public void setAuthorizedBy(String authorizedBy) {
		this.authorizedBy = authorizedBy;
	}
	

}
