package io.broker.api.test.constant;

public class Constants {

    // FIXME: change to a valid key and secret for test
    public final static String ACCESS_KEY = "aIt0Z90L8xP05kfNfUHcZwzaPvnCsiDRTaUfhWK4wHYpcOhN6kGLgu8rQT9DnRQu";
    public final static String SECRET_KEY = "55ZrUph4kiuGEJxBDqU8AtIj0dSbyDvU3TKQI8q9RXeDQ3BWMrVijrJjRiU9Sb6R";

    // FIXME: please change to your valid api domain for test, for example: bhop.cloud
    public static final String BASE_DOMAIN = "xmx.com";

    // REST api url format: https://api.BASE_DOMAIN
    // for example: https://api.bhop.cloud
    public static final String API_BASE_URL = "https://api." + BASE_DOMAIN;

    // Websocket base api url format: wss://wsapi.BASE_DOMAIN/openapi/quote/ws/v1
    // for example: wss://wsapi.bhop.cloud/openapi/quote/ws/v1
    public static final String WS_API_BASE_URL =  "wss://wsapi." + BASE_DOMAIN +  "/openapi/quote/ws/v1";

    // Websocket user api url format: wss://wsapi.BASE_DOMAIN/openapi/ws
    // for example: wss://wsapi.bhop.cloud/openapi/ws
    public static final String WS_API_USER_URL = "wss://wsapi." + BASE_DOMAIN + "/openapi/ws";
}
