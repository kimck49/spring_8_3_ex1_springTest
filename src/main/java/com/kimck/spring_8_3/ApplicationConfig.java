package com.kimck.spring_8_3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ApplicationConfig {
	
	@Value("${admin.Id}")
	private String adminId;
	@Value("${admin.Pw}")
	private String adminPw;
	@Value("${sub_admin.Id}")
	private String sub_adminId;
	@Value("${sub_admin.Pw}")
	private String sub_adminPw;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
		
		Resource[] locations= new Resource[2];
		
		locations[0] = new ClassPathResource("admin.properties");
		locations[1] = new ClassPathResource("sub_admin.properties");
		configurer.setLocations(locations);
		
		return configurer;
	}
	
	@Bean
	public AdminConnection adminconfig() {
		AdminConnection adminconnection = new AdminConnection();
		adminconnection.setAdminId(adminId);
		adminconnection.setAdminPw(adminPw);
		adminconnection.setSub_adminId(sub_adminId);
		adminconnection.setSub_adminPw(sub_adminPw);
				
		return adminconnection;
		
	}
	
}
