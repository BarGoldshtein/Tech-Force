import com.ibm.cloud.sdk.core.service.security.IamOptions;
import com.ibm.watson.language_translator.v3.LanguageTranslator;
import com.ibm.watson.language_translator.v3.model.TranslateOptions;
import com.ibm.watson.language_translator.v3.model.TranslationResult;
import com.ibm.watson.language_translator.v3.util.Language;

public class trans {
//	public static String transentorus(String text) {
//		String t = Language.ENGLISH;
//		IamOptions options = new IamOptions.Builder()
//			    .apiKey("gBdzEnai93ANKbVu59N6irjYJ4Fhvz1Qz60Ygzm2Hlrb")
//			    .build();
//
//			LanguageTranslator languageTranslator = new LanguageTranslator("2019-05-19", options);
//
//			languageTranslator.setEndPoint("https://gateway-lon.watsonplatform.net/language-translator/api");
//			
//			
//			languageTranslator.setIamCredentials(options);
//			TranslateOptions translateOptions = new TranslateOptions.Builder()
//					  .addText("hello")
//					  .source(t)
//					  .target(Language.HEBREW)
//					  .build();
//					TranslationResult translationResult = languageTranslator.translate(translateOptions).execute().getResult();
//					String [] s = translationResult.getTranslations().toString().split("\"");
//					
//				
//					return s[3];
//			
//}
//	
//	public static String transrustoen(String text) {
//		IamOptions options = new IamOptions.Builder()
//			    .apiKey("gBdzEnai93ANKbVu59N6irjYJ4Fhvz1Qz60Ygzm2Hlrb")
//			    .build();
//
//			LanguageTranslator languageTranslator = new LanguageTranslator("2019-05-19", options);
//
//			languageTranslator.setEndPoint("https://gateway-lon.watsonplatform.net/language-translator/api");
//
//			
//			languageTranslator.setIamCredentials(options);
//			TranslateOptions translateOptions = new TranslateOptions.Builder()
//					  .addText("hello")
//					  .source(Language.RUSSIAN)
//					  .target(Language.ENGLISH)
//					  .build();
//					TranslationResult translationResult = languageTranslator.translate(translateOptions).execute().getResult();
//					String [] s = translationResult.getTranslations().toString().split("\"");
//					return s[3];
//			
//}
	
	public static String translate(String text,String source,String target) {
		try {
	String s = getname(source);
	String t = getname(target);
	IamOptions options = new IamOptions.Builder()
		    .apiKey("gBdzEnai93ANKbVu59N6irjYJ4Fhvz1Qz60Ygzm2Hlrb")
		    .build();

		LanguageTranslator languageTranslator = new LanguageTranslator("2019-05-19", options);

		languageTranslator.setEndPoint("https://gateway-lon.watsonplatform.net/language-translator/api");
		
		
		languageTranslator.setIamCredentials(options);
		TranslateOptions translateOptions = new TranslateOptions.Builder()
				  .addText(text)
				  .source(s)
				  .target(t)
				  .build();
				TranslationResult translationResult = languageTranslator.translate(translateOptions).execute().getResult();
				String [] sarr = translationResult.getTranslations().toString().split("\"");
				
			
				return sarr[3];
				
		}catch(Exception e) {
			System.out.println("not a valid Language");
			return "sorry";
		}
		
}
	
	public static String getname(String s) throws Exception {
		String ans;
		switch(s) {
		  case "en":
			  ans = Language.ENGLISH;
		    break;
		  case "ar":
			  ans = Language.ARABIC;
		    break;
		  case "zh":
			  ans = Language.CHINESE;
		    break;
		  case "cs":
			  ans = Language.CZECH;
		    break;
		  case "da":
			  ans = Language.DANISH;
		    break;
		  case "nl":
			  ans = Language.DUTCH;
		    break;
		  case "fi":
			  ans = Language.FINNISH;
		    break;
		  case "de":
			  ans = Language.GERMAN;
		    break;
		  case "hi":
			  ans = Language.HINDI;
		    break;
		  case "it":
			  ans = Language.ITALIAN;
		    break;
		  case "ja":
			  ans = Language.JAPANESE;
		    break;
		  case "ko":
			  ans = Language.KOREAN;
		    break;
		  case "nb":
			  ans = Language.NORWEGIAN_BOKMAL;
		    break;
		  case "pl":
			  ans = Language.POLISH;
		    break;
		  case "pt":
			  ans = Language.PORTUGUESE;
		    break;
		  case "ru":
			  ans = Language.RUSSIAN;
		    break;
		  case "es":
			  ans = Language.SPANISH;
		    break;
		  case "sv":
			  ans = Language.SWEDISH;
		    break;
		  case "tr":
			  ans = Language.TURKISH;
		    break;
		    
		  default:
		    Exception e=new Exception("not a valid language");
		    throw e;
		    
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(translate("hello", "en", "ru")); 
		System.out.println(translate("привет","ru","en"));
	}
}
