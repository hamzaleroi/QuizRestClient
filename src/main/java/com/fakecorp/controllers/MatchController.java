package com.fakecorp.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/")
public class MatchController {







	 public  boolean estceBonneRep(int repElue){
		 RestTemplate restTemplate = new RestTemplate();
		 String fooResourceUrl
				 = "http://localhost:8080/score";
		 ResponseEntity<Boolean> response
				 = restTemplate.getForEntity(fooResourceUrl , Boolean.class);
		 return response.getBody();
	 }





	public int getScore() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "http://localhost:8080/score";
		ResponseEntity<Integer> response
				= restTemplate.getForEntity(fooResourceUrl , Integer.class);
		return response.getBody();
	}


	public String getIdJoueur() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "http://localhost:8080/getIdJoueur";
		ResponseEntity<String> response
				= restTemplate.getForEntity(fooResourceUrl , String.class);

		return response.getBody();
	}


	public String[] tirerQuestion() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "http://localhost:8080/tirerQuestion";
		ResponseEntity<String[]> response
				= restTemplate.getForEntity(fooResourceUrl , String[].class);

		return response.getBody();
	}


	public int getNumQuestCour() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "http://localhost:8080/getNumQuestCour";
		ResponseEntity<Integer> response
				= restTemplate.getForEntity(fooResourceUrl , Integer.class);

		return response.getBody();
	}



	public int getCptQstJouee() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "http://localhost:8080/getNumQuestCour";
		ResponseEntity<Integer> response
				= restTemplate.getForEntity(fooResourceUrl , Integer.class);

		return response.getBody();
	}





	public void incCptQstJouee() {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "http://localhost:8080/getNumQuestCour";
		ResponseEntity<Integer> response
				= restTemplate.getForEntity(fooResourceUrl , Integer.class);



		
	}




	public void stopMatch(String stockPartie) {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "http://localhost:8080/getNumQuestCour";
		ResponseEntity<Integer> response
				= restTemplate.getForEntity(fooResourceUrl , Integer.class);

	}


	public void setTracRepJoueur(int rep) {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "http://localhost:8080/setTracRepJoueur";
		restTemplate.postForEntity(fooResourceUrl , rep,String.class);
	}



	public void setInfoJoueur( String[] infoJoueur) {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "http://localhost:8080/setInfoJoueur";
		restTemplate.postForEntity(fooResourceUrl , infoJoueur,String.class);

	}



	public boolean setBanqueFichier(String ficheBanque) {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl
				= "http://localhost:8080/setbanquefichier";
		return restTemplate.postForEntity(fooResourceUrl , ficheBanque,Boolean.class).getBody();

		
	}
	 

}
