package Utilitis;

public class config{

private static String apikey = "gBdzEnai93ANKbVu59N6irjYJ4Fhvz1Qz60Ygzm2Hlrb";
private static String endpoint = "https://gateway-lon.watsonplatform.net/language-translator/api";


public static String getApi (){
    return config.apikey;
}

public static String getEndPoint(){
    return config.endpoint;
}






}