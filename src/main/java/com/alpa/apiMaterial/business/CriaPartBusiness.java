package com.alpa.apiMaterial.business;

import com.alpa.apiMaterial.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.itemrevision.categories.Mizuno1;
import com.alpa.apiMaterial.schema.xmlns.apps.scm.productmodel.items.itemservicev2.Item;
import org.springframework.stereotype.Service;
import schemaCpqPArt.wsdl.EachRecordType;
import schemaCpqPArt.wsdl.ModifyParts;
import schemaCpqPArt.wsdl.PartType;
import schemaCpqPArt.wsdl.TranslatedType;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@Service
public class CriaPartBusiness {


    public ModifyParts transformItemOmToParts( Item item, String itemId){

        ModifyParts modifyParts = new ModifyParts();

        PartType partType = new PartType();

        EachRecordType eachRecordType = new EachRecordType();


        eachRecordType.setPartNumber(item.getItemNumber().getValue());
        eachRecordType.setDirectBuy(1l);

        TranslatedType translatedType = new TranslatedType();

        translatedType.setPtBR(item.getItemDescription());
        translatedType.setEn(item.getItemDescription());

        eachRecordType.setDescription(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "description", "bm"), TranslatedType.class, translatedType));
        eachRecordType.setLeadTime(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "lead_time", "bm"), String.class, "-1"));
        eachRecordType.setPartCustomField5(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "_part_custom_field5", "bm"), String.class, "0.0"));
        eachRecordType.setPartnerPartId(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "partner_part_id", "bm"), String.class, itemId));
        eachRecordType.setPartnerOrganizationId(new JAXBElement<>(new QName("http://xmlns.oracle.com/cpqcloud/parts", "partner_organization_id", "bm"), String.class, "300000013316153"));

        partType.getEachRecord().add(eachRecordType);

        modifyParts.setParts(partType);

        return modifyParts;

    }

}
