package com.alpa.apiMaterial.callers;


import com.alpa.apiMaterial.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types.MergeItem;
import com.alpa.apiMaterial.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types.MergeItemResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.namespace.QName;


public class MergeItemRequestClient extends WebServiceGatewaySupport {

    Logger logger = LoggerFactory.getLogger(MergeItemRequestClient.class);

    public int countRetry;

    public MergeItemResponse mergeItem(MergeItem mergeItem){
        countRetry = 0;
        return call(mergeItem);
    }

    public MergeItemResponse call(MergeItem mergeItem) {
        MergeItemResponse response = null;

        try {
            response = (MergeItemResponse) JAXBIntrospector.getValue(getWebServiceTemplate()
                    .marshalSendAndReceive(
                            "https://ekcu-test.fa.us2.oraclecloud.com:443/fscmService/ItemServiceV2",
                            new JAXBElement<>(new QName("http://xmlns.oracle.com/apps/scm/productModel/items/itemServiceV2/types/", "mergeItem", "typ"), MergeItem.class, mergeItem)));

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
                call(mergeItem);
            }else {
                logger.error("Sem retentativas para OM Merge : " + mergeItem.getItem().getItemNumber().getValue());
            }
        }

        logger.error("Merge item " + mergeItem.getItem().getItemNumber() + " com sucesso");

        return response;
    }
}
