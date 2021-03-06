package com.alpa.apiMaterial.controller;

import com.alpa.apiMaterial.schema.CreationItemCall;
import com.alpa.apiMaterial.schema.ResponseCall;
import com.alpa.apiMaterial.schema.xmlns.apps.scm.productmodel.items.itemservicev2.Item;
import com.alpa.apiMaterial.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types.CreateItem;
import com.alpa.apiMaterial.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types.MergeItem;
import com.alpa.apiMaterial.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.*;

@EnableAsync
@RestController
@RequestMapping("/material")
public class MaterialController {

    @Autowired
    MaterialService materialService;

    @PostMapping
    public CreationItemCall createItem(@RequestBody CreateItem request){

        CreationItemCall creationItemCall = new CreationItemCall();
        Item itemCreated = (Item) materialService.createItem(request).getResult().getValue().get(0);

        creationItemCall.setItemId(String.valueOf(itemCreated.getItemId()));
        creationItemCall.setStatus("Sucesso");

        return creationItemCall;
    }

    @PostMapping("/sku")
    public String createItemSku(@RequestBody CreateItem request){
        materialService.createItemSku(request);
        return "Ok";
    }

    @PutMapping
    public String mergeItem(@RequestBody MergeItem request){
        materialService.mergeItem(request);
        return "Ok";

    }

}
