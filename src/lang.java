public class lang{

    public static String getLang(String s) throws Exception {
		String ans;
        
		switch(s) 
        {
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


}