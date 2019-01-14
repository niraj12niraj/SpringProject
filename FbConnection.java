package com.my.spring.fb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class FbConnection {
	
	public static String FB_APP_ID  =FbConstants.APP_ID;
	public static final String FB_APP_SECRET = FbConstants.APP_SECERT;
	public static final String REDIRECT_URI = FbConstants.REDIRECT_URI;

	static String accessToken = "";

	public String getFBAuthUrl() {
		String fbLoginUrl="";
		try {
			fbLoginUrl = "http://www.facebook.com/dialog/oauth?" + "client_id="
					+FbConnection.FB_APP_ID + "&redirect_uri="
					+ URLEncoder.encode(FbConnection.REDIRECT_URI, "UTF-8")
					+ "&scope=email";
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return fbLoginUrl;
	}
	
	public String getFbGraphUrl(String code) {
		String fbGraphUrl="";
		try {
			fbGraphUrl = "https://graph.facebook.com/oauth/access_token?"
					+ "client_id=" + FbConnection.FB_APP_ID + "&redirect_uri="
					+ URLEncoder.encode(FbConnection.REDIRECT_URI, "UTF-8")
					+ "&client_secret=" + FB_APP_SECRET + "&code="+code;
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return fbGraphUrl;
	}

	public String getAccessToken(String code) {
		if ("".equals(accessToken)) {
			URL fbGraphURL;
			try {
				fbGraphURL = new URL(getFbGraphUrl(code));
			} catch (MalformedURLException e) {
				e.printStackTrace();
				throw new RuntimeException("Invalid code received " + e);
			}
			URLConnection fbConnection;
			StringBuffer b = null;
			try {
				fbConnection = fbGraphURL.openConnection();
				BufferedReader in;
				in = new BufferedReader(new InputStreamReader(
						fbConnection.getInputStream()));
				String inputLine;
				b = new StringBuffer();
				while ((inputLine = in.readLine()) != null)
					b.append(inputLine + "\n");
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("Unable to connect with Facebook "
						+ e);
			}

			accessToken = b.toString();
			if (accessToken.startsWith("{")) {
				throw new RuntimeException("ERROR: Access Token Invalid: "
						+ accessToken);
			}
		}
		return accessToken;
	}
}
