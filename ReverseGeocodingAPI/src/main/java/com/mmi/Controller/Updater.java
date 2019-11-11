package com.mmi.Controller;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
@PropertySource("classpath:config.properties")
public class Updater {
@Autowired
Environment environment;

public static void main(String args[])throws org.apache.commons.configuration.ConfigurationException
{
	PropertiesConfiguration propertiesConfiguration=new PropertiesConfiguration("E:\\ReverseGeocodingAPI\\src\\main\\resources\\config.properties");
	propertiesConfiguration.setProperty("name", "Sarvagya");
	propertiesConfiguration.save();
}
		
		
		
	
}
