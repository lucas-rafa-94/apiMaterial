package com.alpa.apiMaterial.service;

import com.alpa.apiMaterial.business.CriaPartBusiness;
import com.alpa.apiMaterial.callers.ItemServiceRequestClient;
import com.alpa.apiMaterial.callers.MergeItemRequestClient;
import com.alpa.apiMaterial.schema.xmlns.apps.scm.productmodel.items.itemservicev2.Item;
import com.alpa.apiMaterial.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types.CreateItem;
import com.alpa.apiMaterial.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types.CreateItemResponse;
import com.alpa.apiMaterial.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types.MergeItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MaterialService {

    Logger logger = LoggerFactory.getLogger(MaterialService.class);

    @Autowired
    ItemServiceRequestClient itemServiceRequestClient;

    @Autowired
    MergeItemRequestClient mergeItemRequestClient;

    @Autowired
    CriaPartBusiness criaPartBusiness;

//    @Autowired
//    CpqPartServiceRequestClient cpqPartServiceRequestClient;


    public CreateItemResponse createItem(CreateItem createItem){
        logger.error("Item para criacao " + createItem.getItem().getItemNumber().getValue());
        return  itemServiceRequestClient.createItem(createItem);
    }

    @Async
    public void createItemSku(CreateItem createItem){
        CreateItemResponse createItemResponse = new CreateItemResponse();
        logger.error("Item Sku para criacao " + createItem.getItem().getItemNumber().getValue());

        Item itemCreated =  (Item) itemServiceRequestClient.createItem(createItem).getResult().getValue().get(0);
//        cpqPartServiceRequestClient.createItem(criaPartBusiness.transformItemOmToParts(createItem.getItem(), itemCreated.getItemId().toString()));

    }

    @Async
    public void mergeItem(MergeItem mergeItem){
        logger.error("Item para merge  " + mergeItem.getItem().getItemNumber().getValue());
        mergeItemRequestClient.mergeItem(mergeItem);
//        cpqPartServiceRequestClient.createItem(criaPartBusiness.transformItemOmToParts(mergeItem.getItem(), mergeItem.getItem().getItemId().toString()));
    }

}
