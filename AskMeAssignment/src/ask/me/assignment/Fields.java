package ask.me.assignment;

import org.codehaus.jackson.annotate.JsonProperty;

public class Fields {

	private ID id;
	private TimeStamp timeStamp;
	private CorporateIdentificationNumber corporateIdentificationNumber;
	private DateOfRegistration dateOfRegistration;
	private CompanyName companyName;
	private CompanyStatus companyStatus;
	private CompanyClass companyClass;
	private CompanyCategory companyCategory;
	private AuthorizedCapital authorizedCapital;
	private PaidUpCapital paidUpCapital;
	private RegisteredState registeredState;
	private RegistrarOfCompanies registrarOfCompanies;
	private PrincipalBusinessActivity principalBusinessActivity;
	private RegisteredOfficeAddress registeredOfficeAddress;
	private SubCategory subCategory;

	@JsonProperty("id")
	public void setId(ID id) {
		this.id = id;
	}

	public ID getId() {
		return id;
	}

	@JsonProperty("timestamp")
	public void setTimeStamp(TimeStamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public TimeStamp getTimeStamp() {
		return timeStamp;
	}

	@JsonProperty("CORPORATEIDENTIFICATIONNUMBER")
	public void setCorporateIdentificationNumber(
			CorporateIdentificationNumber corporateIdentificationNumber) {
		this.corporateIdentificationNumber = corporateIdentificationNumber;
	}

	public CorporateIdentificationNumber getCorporateIdentificationNumber() {
		return corporateIdentificationNumber;
	}

	@JsonProperty("DATEOFREGISTRATION")
	public void setDateOfRegistration(DateOfRegistration dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public DateOfRegistration getDateOfRegistration() {
		return dateOfRegistration;
	}

	@JsonProperty("COMPANYNAME")
	public void setCompanyName(CompanyName companyName) {
		this.companyName = companyName;
	}

	public CompanyName getCompanyName() {
		return companyName;
	}

	@JsonProperty("COMPANYSTATUS")
	public void setCompanyStatus(CompanyStatus companyStatus) {
		this.companyStatus = companyStatus;
	}

	public CompanyStatus getCompanyStatus() {
		return companyStatus;
	}

	@JsonProperty("COMPANYCLASS")
	public void setcompanyClass(CompanyClass companyClass) {
		this.companyClass = companyClass;
	}

	public CompanyClass getCompanyClass() {
		return companyClass;
	}

	@JsonProperty("COMPANYCATEGORY")
	public void setCompanyCategory(CompanyCategory companyCategory) {
		this.companyCategory = companyCategory;
	}

	public CompanyCategory getCompanyCategory() {
		return companyCategory;
	}

	@JsonProperty("AUTHORIZEDCAPITAL")
	public void setAuthorizedCapital(AuthorizedCapital authorizedCapital) {
		this.authorizedCapital = authorizedCapital;
	}

	public AuthorizedCapital getAuthorizedCapital() {
		return authorizedCapital;
	}

	@JsonProperty("PAIDUPCAPITAL")
	public void setPaidUpCapital(PaidUpCapital paidUpCapital) {
		this.paidUpCapital = paidUpCapital;
	}

	public PaidUpCapital getPaidUpCapital() {
		return paidUpCapital;
	}

	@JsonProperty("REGISTEREDSTATE")
	public void setRegisteredState(RegisteredState registeredState) {
		this.registeredState = registeredState;
	}

	public RegisteredState getRegisteredState() {
		return registeredState;
	}

	@JsonProperty("REGISTRAROFCOMPANIES")
	public void setRegistrarOfCompanies(
			RegistrarOfCompanies registrarOfCompanies) {
		this.registrarOfCompanies = registrarOfCompanies;
	}

	public RegistrarOfCompanies getRegistrarOfCompanies() {
		return registrarOfCompanies;
	}

	@JsonProperty("PRINCIPALBUSINESSACTIVITY")
	public void setPrincipalBusinessActivity(
			PrincipalBusinessActivity principalBusinessActivity) {
		this.principalBusinessActivity = principalBusinessActivity;
	}

	public PrincipalBusinessActivity getPrincipalBusinessActivity() {
		return principalBusinessActivity;
	}

	@JsonProperty("REGISTEREDOFFICEADDRESS")
	public void setRegisteredOfficeAddress(
			RegisteredOfficeAddress registeredOfficeAddress) {
		this.registeredOfficeAddress = registeredOfficeAddress;
	}

	public RegisteredOfficeAddress getRegisteredOfficeAddress() {
		return registeredOfficeAddress;
	}

	@JsonProperty("SUBCATEGORY")
	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}

	public SubCategory getSubCategory() {
		return subCategory;
	}

}
