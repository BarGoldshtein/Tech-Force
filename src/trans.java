import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.language_translator.v3.LanguageTranslator;
import com.ibm.watson.language_translator.v3.model.TranslateOptions;
import com.ibm.watson.language_translator.v3.model.TranslationResult;
import com.ibm.watson.language_translator.v3.util.Language;
import org.json.*;


public class trans {

	public static String translate(String text,String source,String target) {
		try {

				String s = lang.getLang(source);
				String t = lang.getLang(target);
				IamOptions options = new IamOptions.Builder()
		    		.apiKey(config.getApi)
		    		.build();


				LanguageTranslator languageTranslator = new LanguageTranslator(java.time.LocalDate.now(), options);

				languageTranslator.setEndPoint(config.getEndPoint);
		
		
				languageTranslator.setIamCredentials(options);
				TranslateOptions translateOptions = new TranslateOptions.Builder()
						.addText(text)
				  		.source(s)
				  		.target(t)
				  		.build();
					TranslationResult translationResult = languageTranslator.translate(translateOptions).execute().getResult();
					String [] sarr = translationResult.getTranslations().toString().split("\"");
				
			
					return sarr[3];
				
		}
		catch(Exception e) {
			System.out.println("not a valid Language");
			return "Error not valid";
		}
		
}
	


	public static void main(String[] args) {
		System.out.println(translate("hello", "en", "ru")); 
		System.out.println(translate("привет","ru","en"));
	}
}
