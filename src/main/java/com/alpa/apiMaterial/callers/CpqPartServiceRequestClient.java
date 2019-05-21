package com.alpa.apiMaterial.callers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import schemaCpqPArt.wsdl.ModifyParts;
import schemaCpqPArt.wsdl.ModifyPartsResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.namespace.QName;


public class CpqPartServiceRequestClient extends WebServiceGatewaySupport {
    Logger logger = LoggerFactory.getLogger(CpqPartServiceRequestClient.class);

    public int countRetry;

    public ModifyPartsResponse createItem(ModifyParts modifyParts){
        countRetry = 0;
        return call(modifyParts);
    }

    public ModifyPartsResponse call(ModifyParts modifyParts) {
        ModifyPartsResponse response = null;

        try {
            response = (ModifyPartsResponse) JAXBIntrospector.getValue(getWebServiceTemplate()
                    .marshalSendAndReceive(
                            "https://alpargatastest1.bigmachines.com/v2_0/receiver/parts",
                            new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "modifyParts", "par"), ModifyParts.class, modifyParts)));

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
                call(modifyParts);
            }else {
                logger.error("Sem retentativas para : " + modifyParts.getParts().getEachRecord().get(0).getPartNumber());
            }
        }

        logger.error("Create item " + modifyParts.getParts().getEachRecord().get(0).getDescription() + " com sucesso");

        return response;
    }


}