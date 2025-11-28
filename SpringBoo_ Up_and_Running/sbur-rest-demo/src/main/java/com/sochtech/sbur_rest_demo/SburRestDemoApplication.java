package com.sochtech.sbur_rest_demo;

import com.sochtech.sbur_rest_demo.model.Droid;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

// import java.util.UUID;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SburRestDemoApplication
{
	public static void main(String[] args)
    {
		SpringApplication.run(SburRestDemoApplication.class, args);
	}

    @Bean
    @ConfigurationProperties(prefix = "droid")
    Droid createDroid()
    {
        return new Droid();
    }
}


