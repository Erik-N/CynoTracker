package main;

import java.util.Collection;

import com.beimin.eveapi.account.characters.CharactersParser;
import com.beimin.eveapi.account.characters.CharactersResponse;
import com.beimin.eveapi.account.characters.EveCharacter;
import com.beimin.eveapi.core.ApiAuthorization;

import javafx.application.Application;
import javafx.stage.Stage;



public class MainApp extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		
		 CharactersParser parser = CharactersParser.getInstance();
		 int keyId = 4188095;
		 String vCode = "7XpDVwZAfbU4JQK7IhQ6xNPC4sPuY69EB32BxkiHBNF5UKW9siOntCyH4KeASoKc";
		 ApiAuthorization auth = new ApiAuthorization(keyId, vCode);
		 CharactersResponse response = parser.getResponse(auth);
		 Collection<EveCharacter> eveCharacters = response.getAll();
		 System.out.println("testing!");
		 System.out.println(eveCharacters);
		
	}

	
	public static void main(String[] args) {
		launch(args);
	}

	
}