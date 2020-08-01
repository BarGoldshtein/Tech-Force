import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.language_translator.v3.LanguageTranslator;
import com.ibm.watson.language_translator.v3.model.IdentifiableLanguages;
import com.ibm.watson.language_translator.v3.model.IdentifiedLanguages;
import com.ibm.watson.language_translator.v3.model.IdentifyOptions;
import com.ibm.watson.language_translator.v3.model.TranslateOptions;
import com.ibm.watson.language_translator.v3.model.TranslationResult;
import com.ibm.watson.language_translator.v3.util.Language;

public class autest {

	public static void main(String[] args) {
		IamOptions options = new IamOptions.Builder()
			    .apiKey("gBdzEnai93ANKbVu59N6irjYJ4Fhvz1Qz60Ygzm2Hlrb")
			    .build();

			LanguageTranslator languageTranslator = new LanguageTranslator("2019-05-19", options);

			languageTranslator.setEndPoint("https://gateway-lon.watsonplatform.net/language-translator/api");

			
//			languageTranslator.setIamCredentials(options);
//			TranslateOptions translateOptions = new TranslateOptions.Builder()
//					  .addText("hello")
//					  .source(Language.ENGLISH)
//					  .target(Language.RUSSIAN)
//					  .build();
//					TranslationResult translationResult = languageTranslator.translate(translateOptions).execute().getResult();
//					
//					System.out.println(translationResult);
//			
			
				
		
					
		

					IdentifyOptions identifyOptions = new IdentifyOptions.Builder()
					  .text("привет")
					  .build();

					IdentifiedLanguages languages = languageTranslator.identify(identifyOptions)
					  .execute().getResult();

					System.out.println(languages);
			
			
			//works!!
					
//			JSONParser parser = new JSONParser ();
//			try {
//				Object obj = parser.parse(new FileReader("C:\\Users\\bargg\\eclipse-workspace\\Tech-Force\\leng.txt"));
//				JSONObject jsonobject = (JSONObject) obj;
//				
//				JSONArray lengs=(JSONArray) jsonobject.get("languages");
//		        for (int i = 0; i < lengs.size(); i++) {
//		        	
//		        	JSONObject temp = (JSONObject) lengs.get(i);
//		        	System.out.println(temp.get("name"));
//					if(blabla.contian temp) {} if the language (temp) does not exist we throw exception or exit, bla bla is the name of the file
//				}
//			
//			}catch (Exception e) {
//			// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
					
	}
}
