package elementos;

import org.openqa.selenium.By;

public class Elementosweb {

	// Elementos web
	private By Make = By.id("make");
	private By Choice = By.cssSelector("#make > option:nth-child(3)");
	private By Model = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/select");
	private By Modchoice = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/select/option[5]");
	private By Cylinder = By.id("cylindercapacity");
	private By Engine = By.id("engineperformance");
	private By Manufacture = By.id("dateofmanufacture");
	private By Number = By.id("numberofseats");
	private By Numseats = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/select/option[3]");
	private By RHD = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/p");
	private By Choirhd = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[7]/p/label[1]");
	private By Numseats2 = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/select");
	private By Choiceseats = By
			.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[8]/select/option[3]");
	private By Fuel = By.id("fuel");
	private By Choicefuel = By
			.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[9]/select/option[3]");
	private By Payload = By.id("payload");
	private By Totalweight = By.id("totalweight");
	private By List = By.id("listprice");
	private By License = By.id("licenseplatenumber");
	private By Annual = By.id("annualmileage");
	private By Button01 = By.id("nextenterinsurantdata");
	private By First = By.id("firstname");
	private By Last = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[2]/input");
	private By Date = By.id("birthdate");
	private By Gender = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p");
	private By Choicegen = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span");
	private By Street = By.id("streetaddress");
	private By Country = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select");
	private By Choicecoun = By
			.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select/option[7]");
	private By Zip = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[7]/input");
	private By City = By.id("city");
	private By Occupation = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select");
	private By Choiceocupa = By
			.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select/option[6]");
	private By Hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p");
	private By Choicehob = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]");
	private By Website = By.id("website");
	private By Picture = By.id("picture");
	private By Open = By.id("open");
	private By button02 = By.id("nextenterproductdata");
	private By Starte = By.id("startdate");
	private By Innsurance = By.id("insurancesum");
	private By Choiceinsu = By.xpath("//*[@id=\"insurancesum\"]/option[3]");
	private By Merit = By.xpath("//*[@id=\"meritrating\"]");
	private By Choicemerit = By.xpath("//*[@id=\"meritrating\"]/option[4]");
	private By Damage = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/select");
	private By Choicedamege = By
			.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/select/option[3]");
	private By Optional = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p");
	private By Choiceopition = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]");
			
	private By Courtesy = By.cssSelector("#courtesycar");
	private By Choicecourtesy = By.xpath("//*[@id=\"courtesycar\"]/option[3]");
	private By Button03 = By.id("nextselectpriceoption");
	private By Platinum = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(3)");
	private By Button04 = By
			.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[2]/div[2]/button[2]");
	private By Email = By.id("email");
	private By Phone = By.id("phone");
	private By Username = By.id("username");
	private By Password = By.id("password");
	private By Confirm = By.id("confirmpassword");
	private By Commets = By.id("Comments");
	private By Sendemail = By.id("sendemail");
	private By Responsefinal = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");

	public By getMake() {
		return Make;
	}

	public By getChoice() {
		return Choice;
	}

	public By getModel() {
		return Model;
	}

	public By getModchoice() {
		return Modchoice;
	}

	public By getCylinder() {
		return Cylinder;
	}

	public By getEngine() {
		return Engine;
	}

	public By getManufacture() {
		return Manufacture;
	}

	public By getNumber() {
		return Number;
	}

	public By getNumseats() {
		return Numseats;
	}

	public By getRHD() {
		return RHD;
	}

	public By getChoirhd() {
		return Choirhd;
	}

	public By getNumseats2() {
		return Numseats2;
	}

	public By getChoiceseats() {
		return Choiceseats;
	}

	public By getChoicefuel() {
		return Choicefuel;
	}

	public By getPayload() {
		return Payload;
	}

	public By getTotalweight() {
		return Totalweight;
	}

	public By getFuel() {
		return Fuel;
	}

	public By getList() {
		return List;
	}

	public By getLicense() {
		return License;
	}

	public By getAnnual() {
		return Annual;
	}

	public By getButton01() {
		return Button01;
	}

	public By getFirst() {
		return First;
	}

	public By getLast() {
		return Last;
	}

	public By getDate() {
		return Date;
	}

	public By getGender() {
		return Gender;
	}

	public By getChoicegen() {
		return Choicegen;
	}

	public By getStreet() {
		return Street;
	}

	public By getCountry() {
		return Country;
	}

	public By getChoicecoun() {
		return Choicecoun;
	}

	public By getZip() {
		return Zip;
	}

	public By getCity() {
		return City;
	}

	public By getOccupation() {
		return Occupation;
	}

	public By getChoiceocupa() {
		return Choiceocupa;
	}

	public By getHobbies() {
		return Hobbies;
	}

	public By getChoicehob() {
		return Choicehob;
	}

	public By getWebsite() {
		return Website;
	}

	public By getPicture() {
		return Picture;
	}

	public By getOpen() {
		return Open;
	}

	public By getButton02() {
		return button02;
	}

	public By getStarte() {
		return Starte;
	}

	public By getInnsurance() {
		return Innsurance;
	}

	public By getChoiceinsu() {
		return Choiceinsu;
	}

	public By getMerit() {
		return Merit;
	}

	public By getChoicemerit() {
		return Choicemerit;
	}

	public By getDamage() {
		return Damage;
	}

	public By getChoicedamege() {
		return Choicedamege;
	}

	public By getOptional() {
		return Optional;
	}

	public By getChoiceopition() {
		return Choiceopition;
	}

	public By getCourtesy() {
		return Courtesy;
	}

	public By getChoicecourtesy() {
		return Choicecourtesy;
	}

	public By getButton03() {
		return Button03;
	}

	public By getPlatinum() {
		return Platinum;
	}

	public By getButton04() {
		return Button04;
	}

	public By getEmail() {
		return Email;
	}

	public By getPhone() {
		return Phone;
	}

	public By getUsername() {
		return Username;
	}

	public By getPassword() {
		return Password;
	}

	public By getConfirm() {
		return Confirm;
	}

	public By getCommets() {
		return Commets;
	}

	public By getSendemail() {
		return Sendemail;
	}

	public By getResponsefinal() {
		return Responsefinal;
	}

	

}
