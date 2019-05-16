package com.alpa.apiMaterial.constructor;



import com.alpa.apiMaterial.callers.MergeItemRequestClient;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;

@Configuration
public class MergeItemConfiguration {

    @Bean
    public Jaxb2Marshaller marshallerMergeItemService() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.alpa.apiMaterial.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types");
        return marshaller;
    }

    @Bean
    public MergeItemRequestClient mergeItem(Jaxb2Marshaller marshallerMergeItemService) {
        MergeItemRequestClient client = new MergeItemRequestClient();
        client.setDefaultUri("https://ekcu-test.fa.us2.oraclecloud.com:443/fscmService/ItemServiceV2");
        client.setMarshaller(marshallerMergeItemService);
        client.setUnmarshaller(marshallerMergeItemService);
        client.setMessageSender(httpComponentsMessageSenderMerge());
        return client;
    }



    @Bean
    public HttpComponentsMessageSender httpComponentsMessageSenderMerge() {
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        httpComponentsMessageSender.setCredentials(usernamePasswordCredentialsMerge());
        return httpComponentsMessageSender;
    }

    @Bean
    public UsernamePasswordCredentials usernamePasswordCredentialsMerge() {
        return new UsernamePasswordCredentials("integration", "ora123456");
    }
}
