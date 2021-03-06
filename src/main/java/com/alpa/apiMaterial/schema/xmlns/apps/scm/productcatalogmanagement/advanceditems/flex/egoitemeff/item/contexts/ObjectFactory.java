//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.07 at 02:00:32 AM BRT 
//


package com.alpa.apiMaterial.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.item.contexts;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.oracle.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.item.contexts package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _XxalpaSku_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", "xxalpaSku");
    private final static QName _XxalpaSkuRaiseEvent_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", "RaiseEvent");
    private final static QName _XxalpaSkuIsPersistentAttributeUpdated_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", "IsPersistentAttributeUpdated");
    private final static QName _XxalpaSkuIsAddedToChildEntitiesMap_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", "IsAddedToChildEntitiesMap");
    private final static QName _XxalpaSkuIsImportCase_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", "IsImportCase");
    private final static QName _XxalpaSkuBulkloadRecCreated_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", "BulkloadRecCreated");
    private final static QName _XxalpaSkuCor_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", "cor");
    private final static QName _XxalpaSkuRedLinecor_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", "RedLinecor");
    private final static QName _XxalpaSkuTamanho_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", "tamanho");
    private final static QName _XxalpaSkuRedLinetamanho_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", "RedLinetamanho");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.item.contexts
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XxalpaSku }
     * 
     */
    public XxalpaSku createXxalpaSku() {
        return new XxalpaSku();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XxalpaSku }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", name = "xxalpaSku")
    public JAXBElement<XxalpaSku> createXxalpaSku(XxalpaSku value) {
        return new JAXBElement<XxalpaSku>(_XxalpaSku_QNAME, XxalpaSku.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", name = "RaiseEvent", scope = XxalpaSku.class)
    public JAXBElement<String> createXxalpaSkuRaiseEvent(String value) {
        return new JAXBElement<String>(_XxalpaSkuRaiseEvent_QNAME, String.class, XxalpaSku.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", name = "IsPersistentAttributeUpdated", scope = XxalpaSku.class)
    public JAXBElement<Boolean> createXxalpaSkuIsPersistentAttributeUpdated(Boolean value) {
        return new JAXBElement<Boolean>(_XxalpaSkuIsPersistentAttributeUpdated_QNAME, Boolean.class, XxalpaSku.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", name = "IsAddedToChildEntitiesMap", scope = XxalpaSku.class)
    public JAXBElement<Boolean> createXxalpaSkuIsAddedToChildEntitiesMap(Boolean value) {
        return new JAXBElement<Boolean>(_XxalpaSkuIsAddedToChildEntitiesMap_QNAME, Boolean.class, XxalpaSku.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", name = "IsImportCase", scope = XxalpaSku.class)
    public JAXBElement<Boolean> createXxalpaSkuIsImportCase(Boolean value) {
        return new JAXBElement<Boolean>(_XxalpaSkuIsImportCase_QNAME, Boolean.class, XxalpaSku.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", name = "BulkloadRecCreated", scope = XxalpaSku.class)
    public JAXBElement<String> createXxalpaSkuBulkloadRecCreated(String value) {
        return new JAXBElement<String>(_XxalpaSkuBulkloadRecCreated_QNAME, String.class, XxalpaSku.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", name = "cor", scope = XxalpaSku.class)
    public JAXBElement<String> createXxalpaSkuCor(String value) {
        return new JAXBElement<String>(_XxalpaSkuCor_QNAME, String.class, XxalpaSku.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", name = "RedLinecor", scope = XxalpaSku.class)
    public JAXBElement<String> createXxalpaSkuRedLinecor(String value) {
        return new JAXBElement<String>(_XxalpaSkuRedLinecor_QNAME, String.class, XxalpaSku.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", name = "tamanho", scope = XxalpaSku.class)
    public JAXBElement<String> createXxalpaSkuTamanho(String value) {
        return new JAXBElement<String>(_XxalpaSkuTamanho_QNAME, String.class, XxalpaSku.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/item/contexts/", name = "RedLinetamanho", scope = XxalpaSku.class)
    public JAXBElement<String> createXxalpaSkuRedLinetamanho(String value) {
        return new JAXBElement<String>(_XxalpaSkuRedLinetamanho_QNAME, String.class, XxalpaSku.class, value);
    }

}
