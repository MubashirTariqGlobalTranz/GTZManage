package GTZTransportation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GTZTransportation.gtz.BaseClass;

public class CreateLoadPage extends BaseClass {

	// public static WebDriver driver;

	@FindBy(xpath = "//*[text()='Spot Quote system']")
	WebElement SpotQuote;

	@FindBy(xpath = "/html/body/form/div[3]/div[2]/div[1]/ul/li[1]/a/span")
	WebElement createLoadPage;

	@FindBy(xpath = "/html/body/form/div[3]/div[2]/div[2]/ul/li[1]/a/span")
	WebElement Directload;

	@FindBy(id = "ContentPlaceHolder1_smartCustomer_txtCustomer")
	WebElement CustomerName;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[3]/div/table/tbody/tr[3]/th")
	WebElement Carriernameclick;

	@FindBy(id = "ContentPlaceHolder1_decBidAmount")
	WebElement BidAmount;

	@FindBy(id = "ContentPlaceHolder1_txtContactCompany")
	WebElement Company;

	@FindBy(id = "ContentPlaceHolder1_txtContactName")
	WebElement Name;

	@FindBy(id = "ContentPlaceHolder1_txtContactPhone")
	WebElement Phoneno;

	@FindBy(id = "ContentPlaceHolder1_txtOriginName")
	WebElement originName;

	@FindBy(id = "ContentPlaceHolder1_txtOriginAddress1")
	WebElement originAddress;

	@FindBy(id = "ContentPlaceHolder1_txtOriginCity")
	WebElement originCity;

	@FindBy(id = "ContentPlaceHolder1_txtOriginState")
	WebElement OriginState;

	@FindBy(id = "ContentPlaceHolder1_txtOriginPostalCode")
	WebElement OriginPostalCode;

	@FindBy(id = "ContentPlaceHolder1_txtOriginWindow")
	WebElement OriginTimeWindow;

	@FindBy(id = "ContentPlaceHolder1_txtDestinationName")
	WebElement DestinationName;

	@FindBy(id = "ContentPlaceHolder1_txtDestinationAddress1")
	WebElement DestinationAddress;

	@FindBy(id = "ContentPlaceHolder1_txtDestinationCity")
	WebElement DestinationCity;

	@FindBy(id = "ContentPlaceHolder1_txtDestinationState")
	WebElement DestinationState;

	@FindBy(id = "ContentPlaceHolder1_txtDestinationPostalCode")
	WebElement DestinationPostalCode;

	@FindBy(id = "ContentPlaceHolder1_txtDestinationWindow")
	WebElement DestinationTimeWindow;

	@FindBy(id = "ContentPlaceHolder1_decItemWeight")
	WebElement Weight;

	@FindBy(id = "ContentPlaceHolder1_decItemLength")
	WebElement Length;

	@FindBy(id = "ContentPlaceHolder1_decItemWidth")
	WebElement Width;

	@FindBy(id = "ContentPlaceHolder1_decItemHeight")
	WebElement Height;

	@FindBy(id = "ContentPlaceHolder1_btnCreate")
	WebElement Create;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[2]/ul/li[2]/a")
	WebElement Equipmentclick;

	@FindBy(id = "ContentPlaceHolder1_containerTransportMethod_gridAvailableTransportMethods_gridAvailableTransportMethods_chk_17")
	WebElement LTL;

	@FindBy(id = "ContentPlaceHolder1_containerTransportMethod_gridAvailableTransportMethods_gridAvailableTransportMethods_chk_18")
	WebElement LTLGuaranteed;

	@FindBy(id = "ContentPlaceHolder1_containerTransportMethod_gridAvailableTransportMethods_gridAvailableTransportMethods_chk_31")
	WebElement LTLStraightTruck;

	@FindBy(id = "ContentPlaceHolder1_containerTransportMethod_gridAvailableTransportMethods_gridAvailableTransportMethods_chk_32")
	WebElement LTLVolumeQuote;

	@FindBy(id = "ContentPlaceHolder1_containerTransportMethod_gridAvailableTransportMethods_gridAvailableTransportMethods_chk_33")
	WebElement LTLGuaranteedExp;

	@FindBy(id = "ContentPlaceHolder1_containerTransportMethod_btnAddTransportMethodsToWave")
	WebElement AddEquipment;

	@FindBy(id = "ContentPlaceHolder1_containerServiceType_btnSave")
	WebElement SaveToWave;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[4]/ul/li[3]/a")
	WebElement CarrierClick;

	@FindBy(id = "ContentPlaceHolder1_containerAvailableCarriers_gridAvailableCarriers_gridAvailableCarriers_header")
	WebElement AllAvailableCarrier;

	@FindBy(id = "ContentPlaceHolder1_containerAvailableCarriers_btnAddToWave")
	WebElement AddWaveCarrier;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[4]/ul/li[4]/a")
	WebElement SendClick;

	@FindBy(id = "ContentPlaceHolder1_containerProcess_btnSend")
	WebElement SendButton;

	@FindBy(id = "ContentPlaceHolder1_containerProcess_chkExpedite")
	WebElement ExpiditeToBidRequest;

	@FindBy(id = "ContentPlaceHolder1_containerProcess_btnSend")
	WebElement submitButton;

	@FindBy(id = "ContentPlaceHolder1_chkOnlyShowBidsWithAmounts")
	WebElement OnlyBidWithResponse;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/div[6]/div/div/div/table/tbody/tr[2]/td[18]/a")
	WebElement Respond;

	@FindBy(id = "ContentPlaceHolder1_loadBidResponse_grid_txtBidAmount_0")
	WebElement BidWithAmount;

	@FindBy(id = "ContentPlaceHolder1_loadBidResponse_grid_secureUntilDate_0_dateSelection_0_txtDate_0")
	WebElement SecureDate;

	@FindBy(id = "ContentPlaceHolder1_txtContactName")
	WebElement LoadContactName;

	@FindBy(id = "ContentPlaceHolder1_txtContactPhone")
	WebElement LoadContactPhoneNo;

	@FindBy(id = "ContentPlaceHolder1_btnSubmit")
	WebElement SubmitLoadInformation;

	@FindBy(xpath = "/html/body/form/div[3]/div[2]/div[1]/ul/li[2]/a")
	WebElement LoadBoard;

	@FindBy(xpath = "/html/body/form/div[3]/div[3]/div/span/div[2]/div/h3/a")
	WebElement FilterClick;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_txtSearchNumber")
	WebElement LoadId;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_rblExceptions_0")
	WebElement AllLoad;

	@FindBy(id = "ContentPlaceHolder1_containerFilter_btnRefresh")
	WebElement FilterLoad;

	public CreateLoadPage() {
		PageFactory.initElements(driver, this);
	}

	public void openSpotQuote()

	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		SpotQuote.click();
	}

	public void Create_Load() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		createLoadPage.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Directload.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CustomerName.sendKeys("10610");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Carriernameclick.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// BidAmount.sendKeys("1000");

		Company.sendKeys("Alcon");
		Name.sendKeys("Devon Daggenstoss");

		Phoneno.sendKeys("(919) 304-3846");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		originName.sendKeys("ACCU-MOLD CORPORATION");
		originAddress.sendKeys("123 Main St");
		originCity.sendKeys("ANKENY");
		OriginState.sendKeys("IA");
		OriginPostalCode.sendKeys("50021");
		OriginTimeWindow.sendKeys("11/10/2022 8:00 AM CST - 11/10/2022 3:00 PM CST");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DestinationName.sendKeys("BALDA C BREWER");
		DestinationAddress.sendKeys("123 Main St");
		DestinationCity.sendKeys("ONTARIO");
		DestinationState.sendKeys("WA");
		DestinationPostalCode.sendKeys("98424");
		DestinationTimeWindow.sendKeys("11/10/2022 8:00 AM CST - 11/10/2022 3:00 PM CST");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Weight.sendKeys("10");
		Height.sendKeys("20");
		Length.sendKeys("20");
		Width.sendKeys("20");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Create.click();

		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Equipmentclick.click();
		LTL.click();
		LTLGuaranteed.click();
		LTLStraightTruck.click();
		LTLVolumeQuote.click();
		LTLGuaranteedExp.click();
		AddEquipment.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SaveToWave.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CarrierClick.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AllAvailableCarrier.click();
		AddWaveCarrier.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.switchTo().alert().accept();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SendClick.click();
		ExpiditeToBidRequest.click();
		submitButton.click();
		driver.switchTo().alert().accept();

		OnlyBidWithResponse.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Respond.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BidWithAmount.sendKeys("1000");
		SecureDate.sendKeys("11/1/2001");

		LoadContactName.sendKeys("MubashirTariq");
		LoadContactPhoneNo.sendKeys("(651) 789-5782");
		SubmitLoadInformation.click();

		WebElement L = driver.findElement(By.id("ContentPlaceHolder1_loadDetails_containerDetails_btnCollapse"));
		String st = L.getText();
		System.out.println("Text is : " + st);

		LoadBoard.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FilterClick.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoadId.sendKeys(st);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AllLoad.click();
		FilterLoad.click();

	}

	public void Load_Award() {
		/*
		 * WebElement L =
		 * driver.findElement(By.xpath("/html/body/form/div[3]/div[3]/div/div[1]/p"));
		 * 
		 * @SuppressWarnings("unused") String LoadNo = L.getText();
		 * System.out.println(L.getText());
		 */
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Equipmentclick.click();
		LTL.click();

	}

	/*
	 * public void enterCustomerName(String Customer) {
	 * CustomerName.sendKeys(Customer); }
	 * 
	 * public void enterContactName(String Contact) { ContactName.sendKeys(Contact);
	 * }
	 * 
	 * public void enterPhone(String Phone) { Phoneno.sendKeys(Phone); }
	 * 
	 * public void enterReferenceNo(String RefNo) { RefernceNo.sendKeys(RefNo); }
	 * 
	 * 
	 * public void submitLoad() { submitButton.click(); }
	 * 
	 * /*public boolean isLoadCreated() { return successMessage.isDisplayed(); }
	 */

}
