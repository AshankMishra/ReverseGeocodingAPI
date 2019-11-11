package com.mmi.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import org.springframework.stereotype.Service;

@Service
public class CommonService {

	private final String USER_AGENT = "Chrome/77.0.3865.90";

	public String getAddress(String lat, String lng) throws Exception {
		Properties prop = new Properties();
		String propFileName = "config.properties";
		InputStream f = getClass().getClassLoader().getResourceAsStream(propFileName);
		prop.load(f);
		String key = prop.getProperty("license_key");

		String url = "https://apis.mapmyindia.com/advancedmaps/v1/" + key + "/rev_geocode?lat=" + lat + "&lng=" + lng;
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		String urlParameters = "lat=" + lat + "&lng=" + lng + "&licence_key=" + key + "&region (IND)";
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		System.out.println(response.toString());
		return (response.toString());
	}
}
