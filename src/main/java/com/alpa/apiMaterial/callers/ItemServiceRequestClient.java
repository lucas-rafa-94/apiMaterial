package com.alpa.apiMaterial.callers;



import com.alpa.apiMaterial.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types.CreateItem;
import com.alpa.apiMaterial.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types.CreateItemResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.namespace.QName;


public class ItemServiceRequestClient extends WebServiceGatewaySupport {

    Logger logger = LoggerFactory.getLogger(ItemServiceRequestClient.class);

    public int countRetry;

    public CreateItemResponse createItem(CreateItem item){
        countRetry = 0;
        return call(item);
    }

    public CreateItemResponse call(CreateItem createItem) {
        CreateItemResponse response = null;

        try {
            response = (CreateItemResponse) JAXBIntrospector.getValue(getWebServiceTemplate()
                    .marshalSendAndReceive(
                            "https://ekcu-test.fa.us2.oraclecloud.com:443/fscmService/ItemServiceV2",
                            new JAXBElement<>(new QName("http://xmlns.oracle.com/apps/scm/productModel/items/itemServiceV2/types/", "createItem", "typ"), CreateItem.class, createItem)));

        }catch (Exception e){
            countRetry++;
            if (countRetry < 3){
                try {
                    Thread.sleep(20000);
                    logger.error("Retentativa em " + 20000);
                }catch (Exception e1){
                    e1.printStackTrace();
                }
                logger.error(e.getMessage());
                call(createItem);
            }else {
                logger.error("Sem retentativas para OM : " + createItem.getItem().getItemNumber().getValue());
            }
        }

        logger.error("Create item " + createItem.getItem().getItemNumber().getValue() + " com sucesso");

        return response;
    }


}


