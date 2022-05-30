package testes;



import elementos.Elementosweb;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pagess.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementosweb el = new Elementosweb();

	@Dado("que eu acesse {string}")
	public void que_eu_acesse(String site) {

		metodos.abrirNavegador(site, "acessando o site");

	}

	@Quando("preencher o {string}")
	public void preencher_o(String elemento) {
		metodos.click(el.getMake());
		metodos.click(el.getChoice());
		metodos.click(el.getModel());
		metodos.click(el.getModchoice());
		metodos.digitar("1000", el.getCylinder());
		metodos.digitar("2000", el.getEngine());
		metodos.digitar("05/18/2022", el.getManufacture());
		metodos.click(el.getNumber());
		metodos.click(el.getNumseats());
		metodos.click(el.getRHD());
		metodos.click(el.getChoirhd());
		metodos.click(el.getNumseats2());
		metodos.click(el.getChoiceseats());
		metodos.click(el.getFuel());
		metodos.click(el.getChoicefuel());
		metodos.digitar("200", el.getPayload());
		metodos.digitar("300", el.getTotalweight());
		metodos.digitar("4000", el.getList());
		metodos.digitar("500", el.getLicense());
		metodos.digitar("600", el.getAnnual());
		metodos.click(el.getButton01());
		metodos.digitar("Pedro", el.getFirst());
		metodos.digitar("Cabral", el.getLast());
		metodos.digitar("05/11/1990", el.getDate());
		metodos.click(el.getGender());
		metodos.click(el.getChoicegen());
		metodos.digitar("HIREME", el.getStreet());
		metodos.click(el.getCountry());
		metodos.click(el.getChoicecoun());
		metodos.digitar("4444", el.getZip());
		metodos.digitar("Fulano de tal", el.getCity());
		metodos.click(el.getOccupation());
		metodos.click(el.getChoiceocupa());
		metodos.click(el.getHobbies());
		metodos.click(el.getChoicehob());
		metodos.digitar("www.fulano.com", el.getWebsite());
		// metodos.click(el.getOpen());
		// metodos.click(el.getPicture());
		metodos.click(el.getButton02());
		metodos.digitar("10/22/2022", el.getStarte());
		metodos.click(el.getInnsurance());
		metodos.click(el.getChoiceinsu());
		metodos.click(el.getMerit());
		metodos.click(el.getChoicemerit());
		metodos.click(el.getDamage());
		metodos.click(el.getChoicedamege());
		metodos.click(el.getOptional());
		metodos.click(el.getChoiceopition());
		metodos.click(el.getCourtesy());
		metodos.click(el.getChoicecourtesy());
		metodos.click(el.getButton03());
		metodos.click(el.getPlatinum());
		metodos.espera(el.getPlatinum());
		metodos.click(el.getButton04());
		metodos.digitar("pedrocabral@123.com", el.getEmail());
		metodos.digitar("17987654", el.getPhone());
		metodos.digitar("capedro", el.getUsername());
		metodos.digitar("ABCDE6f", el.getPassword());
		metodos.digitar("ABCDE6f", el.getConfirm());
		metodos.digitar("Be Awesome", el.getCommets());
		metodos.click(el.getSendemail());
		

	}

	@Entao("clico em salvar e valido {string}")
	public void clico_em_salvar_e_valido(String textoEsperado) {

		metodos.validarTexto(textoEsperado, el.getResponsefinal());
		metodos.fecharBrowser("encerrando testes");
	}

}
