package com.alpa.apiMaterial.constructor;


import com.alpa.apiMaterial.callers.CpqPartServiceRequestClient;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class CpqPartServiceConfiguration {

    @Bean
    public Jaxb2Marshaller marshallerItegrationCpqService() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("schemaCpqPArt.wsdl");
        return marshaller;
    }

    @Bean
    public CpqPartServiceRequestClient createItem(Jaxb2Marshaller marshallerItegrationCpqService) {
        CpqPartServiceRequestClient client = new CpqPartServiceRequestClient();
        client.setDefaultUri("https://alpargatastest1.bigmachines.com/v2_0/receiver/parts");
        client.setMarshaller(marshallerItegrationCpqService);
        client.setUnmarshaller(marshallerItegrationCpqService);
        client.setMessageSender(httpComponentsCpqPartMessageSender());
        return client;
    }



    @Bean
    public HttpComponentsMessageSender httpComponentsCpqPartMessageSender() {
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        httpComponentsMessageSender.setCredentials(usernamePasswordCpqPartCredentials());
        return httpComponentsMessageSender;
    }

    @Bean
    public UsernamePasswordCredentials usernamePasswordCpqPartCredentials() {
        return new UsernamePasswordCredentials("integration", "Ora12345!");
    }
}
