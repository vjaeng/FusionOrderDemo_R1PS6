package devguide.examples.entities;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.DBSequence;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jun 30 09:46:50 MDT 2008
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class OrdersEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        OrderId {
            public Object get(OrdersEOImpl obj) {
                return obj.getOrderId();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setOrderId((DBSequence)value);
            }
        }
        ,
        OrderDate {
            public Object get(OrdersEOImpl obj) {
                return obj.getOrderDate();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setOrderDate((Date)value);
            }
        }
        ,
        OrderShippedDate {
            public Object get(OrdersEOImpl obj) {
                return obj.getOrderShippedDate();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setOrderShippedDate((Date)value);
            }
        }
        ,
        OrderStatusCode {
            public Object get(OrdersEOImpl obj) {
                return obj.getOrderStatusCode();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setOrderStatusCode((String)value);
            }
        }
        ,
        OrderTotal {
            public Object get(OrdersEOImpl obj) {
                return obj.getOrderTotal();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setOrderTotal((Number)value);
            }
        }
        ,
        CustomerId {
            public Object get(OrdersEOImpl obj) {
                return obj.getCustomerId();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setCustomerId((Number)value);
            }
        }
        ,
        ShipToName {
            public Object get(OrdersEOImpl obj) {
                return obj.getShipToName();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setShipToName((String)value);
            }
        }
        ,
        ShipToAddressId {
            public Object get(OrdersEOImpl obj) {
                return obj.getShipToAddressId();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setShipToAddressId((Number)value);
            }
        }
        ,
        ShipToPhoneNumber {
            public Object get(OrdersEOImpl obj) {
                return obj.getShipToPhoneNumber();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setShipToPhoneNumber((String)value);
            }
        }
        ,
        ShippingOptionId {
            public Object get(OrdersEOImpl obj) {
                return obj.getShippingOptionId();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setShippingOptionId((Number)value);
            }
        }
        ,
        PaymentOptionId {
            public Object get(OrdersEOImpl obj) {
                return obj.getPaymentOptionId();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setPaymentOptionId((Number)value);
            }
        }
        ,
        DiscountId {
            public Object get(OrdersEOImpl obj) {
                return obj.getDiscountId();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setDiscountId((Number)value);
            }
        }
        ,
        CouponId {
            public Object get(OrdersEOImpl obj) {
                return obj.getCouponId();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setCouponId((Number)value);
            }
        }
        ,
        FreeShippingFlag {
            public Object get(OrdersEOImpl obj) {
                return obj.getFreeShippingFlag();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setFreeShippingFlag((String)value);
            }
        }
        ,
        CustomerCollectFlag {
            public Object get(OrdersEOImpl obj) {
                return obj.getCustomerCollectFlag();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setCustomerCollectFlag((String)value);
            }
        }
        ,
        CollectionWarehouseId {
            public Object get(OrdersEOImpl obj) {
                return obj.getCollectionWarehouseId();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setCollectionWarehouseId((Number)value);
            }
        }
        ,
        GiftwrapFlag {
            public Object get(OrdersEOImpl obj) {
                return obj.getGiftwrapFlag();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setGiftwrapFlag((String)value);
            }
        }
        ,
        GiftwrapMessage {
            public Object get(OrdersEOImpl obj) {
                return obj.getGiftwrapMessage();
            }

            public void put(OrdersEOImpl obj, Object value) {
                obj.setGiftwrapMessage((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(OrdersEOImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(OrdersEOImpl obj, Object value) {
            }
        }
        ,
        CreationDate {
            public Object get(OrdersEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(OrdersEOImpl obj, Object value) {
            }
        }
        ,
        LastUpdatedBy {
            public Object get(OrdersEOImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(OrdersEOImpl obj, Object value) {
            }
        }
        ,
        LastUpdateDate {
            public Object get(OrdersEOImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(OrdersEOImpl obj, Object value) {
            }
        }
        ,
        ObjectVersionId {
            public Object get(OrdersEOImpl obj) {
                return obj.getObjectVersionId();
            }

            public void put(OrdersEOImpl obj, Object value) {
            }
        }
        ,
        PersonsEO {
            public Object get(OrdersEOImpl obj) {
                return obj.getPersonsEO();
            }

            public void put(OrdersEOImpl obj, Object value) {
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(OrdersEOImpl object);

        public abstract void put(OrdersEOImpl object, Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static int ORDERID = AttributesEnum.OrderId.index();
    public static int ORDERDATE = AttributesEnum.OrderDate.index();
    public static int ORDERSHIPPEDDATE = AttributesEnum.OrderShippedDate.index();
    public static int ORDERSTATUSCODE = AttributesEnum.OrderStatusCode.index();
    public static int ORDERTOTAL = AttributesEnum.OrderTotal.index();
    public static int CUSTOMERID = AttributesEnum.CustomerId.index();
    public static int SHIPTONAME = AttributesEnum.ShipToName.index();
    public static int SHIPTOADDRESSID = AttributesEnum.ShipToAddressId.index();
    public static int SHIPTOPHONENUMBER = AttributesEnum.ShipToPhoneNumber.index();
    public static int SHIPPINGOPTIONID = AttributesEnum.ShippingOptionId.index();
    public static int PAYMENTOPTIONID = AttributesEnum.PaymentOptionId.index();
    public static int DISCOUNTID = AttributesEnum.DiscountId.index();
    public static int COUPONID = AttributesEnum.CouponId.index();
    public static int FREESHIPPINGFLAG = AttributesEnum.FreeShippingFlag.index();
    public static int CUSTOMERCOLLECTFLAG = AttributesEnum.CustomerCollectFlag.index();
    public static int COLLECTIONWAREHOUSEID = AttributesEnum.CollectionWarehouseId.index();
    public static int GIFTWRAPFLAG = AttributesEnum.GiftwrapFlag.index();
    public static int GIFTWRAPMESSAGE = AttributesEnum.GiftwrapMessage.index();
    public static int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static int OBJECTVERSIONID = AttributesEnum.ObjectVersionId.index();
    public static int PERSONSEO = AttributesEnum.PersonsEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public OrdersEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("devguide.examples.entities.OrdersEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for OrderId, using the alias name OrderId.
     * @return the OrderId
     */
    public DBSequence getOrderId() {
        return (DBSequence)getAttributeInternal(ORDERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderId.
     * @param value value to set the OrderId
     */
    public void setOrderId(DBSequence value) {
        setAttributeInternal(ORDERID, value);
    }

    /**
     * Gets the attribute value for OrderDate, using the alias name OrderDate.
     * @return the OrderDate
     */
    public Date getOrderDate() {
        return (Date)getAttributeInternal(ORDERDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderDate.
     * @param value value to set the OrderDate
     */
    public void setOrderDate(Date value) {
        setAttributeInternal(ORDERDATE, value);
    }

    /**
     * Gets the attribute value for OrderShippedDate, using the alias name OrderShippedDate.
     * @return the OrderShippedDate
     */
    public Date getOrderShippedDate() {
        return (Date)getAttributeInternal(ORDERSHIPPEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderShippedDate.
     * @param value value to set the OrderShippedDate
     */
    public void setOrderShippedDate(Date value) {
        setAttributeInternal(ORDERSHIPPEDDATE, value);
    }

    /**
     * Gets the attribute value for OrderStatusCode, using the alias name OrderStatusCode.
     * @return the OrderStatusCode
     */
    public String getOrderStatusCode() {
        return (String)getAttributeInternal(ORDERSTATUSCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderStatusCode.
     * @param value value to set the OrderStatusCode
     */
    public void setOrderStatusCode(String value) {
        setAttributeInternal(ORDERSTATUSCODE, value);
    }

    /**
     * Gets the attribute value for OrderTotal, using the alias name OrderTotal.
     * @return the OrderTotal
     */
    public Number getOrderTotal() {
        return (Number)getAttributeInternal(ORDERTOTAL);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderTotal.
     * @param value value to set the OrderTotal
     */
    public void setOrderTotal(Number value) {
        setAttributeInternal(ORDERTOTAL, value);
    }

    /**
     * Gets the attribute value for CustomerId, using the alias name CustomerId.
     * @return the CustomerId
     */
    public Number getCustomerId() {
        return (Number)getAttributeInternal(CUSTOMERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustomerId.
     * @param value value to set the CustomerId
     */
    public void setCustomerId(Number value) {
        setAttributeInternal(CUSTOMERID, value);
    }

    /**
     * Gets the attribute value for ShipToName, using the alias name ShipToName.
     * @return the ShipToName
     */
    public String getShipToName() {
        return (String)getAttributeInternal(SHIPTONAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipToName.
     * @param value value to set the ShipToName
     */
    public void setShipToName(String value) {
        setAttributeInternal(SHIPTONAME, value);
    }

    /**
     * Gets the attribute value for ShipToAddressId, using the alias name ShipToAddressId.
     * @return the ShipToAddressId
     */
    public Number getShipToAddressId() {
        return (Number)getAttributeInternal(SHIPTOADDRESSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipToAddressId.
     * @param value value to set the ShipToAddressId
     */
    public void setShipToAddressId(Number value) {
        setAttributeInternal(SHIPTOADDRESSID, value);
    }

    /**
     * Gets the attribute value for ShipToPhoneNumber, using the alias name ShipToPhoneNumber.
     * @return the ShipToPhoneNumber
     */
    public String getShipToPhoneNumber() {
        return (String)getAttributeInternal(SHIPTOPHONENUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipToPhoneNumber.
     * @param value value to set the ShipToPhoneNumber
     */
    public void setShipToPhoneNumber(String value) {
        setAttributeInternal(SHIPTOPHONENUMBER, value);
    }

    /**
     * Gets the attribute value for ShippingOptionId, using the alias name ShippingOptionId.
     * @return the ShippingOptionId
     */
    public Number getShippingOptionId() {
        return (Number)getAttributeInternal(SHIPPINGOPTIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShippingOptionId.
     * @param value value to set the ShippingOptionId
     */
    public void setShippingOptionId(Number value) {
        setAttributeInternal(SHIPPINGOPTIONID, value);
    }

    /**
     * Gets the attribute value for PaymentOptionId, using the alias name PaymentOptionId.
     * @return the PaymentOptionId
     */
    public Number getPaymentOptionId() {
        return (Number)getAttributeInternal(PAYMENTOPTIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for PaymentOptionId.
     * @param value value to set the PaymentOptionId
     */
    public void setPaymentOptionId(Number value) {
        setAttributeInternal(PAYMENTOPTIONID, value);
    }

    /**
     * Gets the attribute value for DiscountId, using the alias name DiscountId.
     * @return the DiscountId
     */
    public Number getDiscountId() {
        return (Number)getAttributeInternal(DISCOUNTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DiscountId.
     * @param value value to set the DiscountId
     */
    public void setDiscountId(Number value) {
        setAttributeInternal(DISCOUNTID, value);
    }

    /**
     * Gets the attribute value for CouponId, using the alias name CouponId.
     * @return the CouponId
     */
    public Number getCouponId() {
        return (Number)getAttributeInternal(COUPONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CouponId.
     * @param value value to set the CouponId
     */
    public void setCouponId(Number value) {
        setAttributeInternal(COUPONID, value);
    }

    /**
     * Gets the attribute value for FreeShippingFlag, using the alias name FreeShippingFlag.
     * @return the FreeShippingFlag
     */
    public String getFreeShippingFlag() {
        return (String)getAttributeInternal(FREESHIPPINGFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for FreeShippingFlag.
     * @param value value to set the FreeShippingFlag
     */
    public void setFreeShippingFlag(String value) {
        setAttributeInternal(FREESHIPPINGFLAG, value);
    }

    /**
     * Gets the attribute value for CustomerCollectFlag, using the alias name CustomerCollectFlag.
     * @return the CustomerCollectFlag
     */
    public String getCustomerCollectFlag() {
        return (String)getAttributeInternal(CUSTOMERCOLLECTFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustomerCollectFlag.
     * @param value value to set the CustomerCollectFlag
     */
    public void setCustomerCollectFlag(String value) {
        setAttributeInternal(CUSTOMERCOLLECTFLAG, value);
    }

    /**
     * Gets the attribute value for CollectionWarehouseId, using the alias name CollectionWarehouseId.
     * @return the CollectionWarehouseId
     */
    public Number getCollectionWarehouseId() {
        return (Number)getAttributeInternal(COLLECTIONWAREHOUSEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CollectionWarehouseId.
     * @param value value to set the CollectionWarehouseId
     */
    public void setCollectionWarehouseId(Number value) {
        setAttributeInternal(COLLECTIONWAREHOUSEID, value);
    }

    /**
     * Gets the attribute value for GiftwrapFlag, using the alias name GiftwrapFlag.
     * @return the GiftwrapFlag
     */
    public String getGiftwrapFlag() {
        return (String)getAttributeInternal(GIFTWRAPFLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for GiftwrapFlag.
     * @param value value to set the GiftwrapFlag
     */
    public void setGiftwrapFlag(String value) {
        setAttributeInternal(GIFTWRAPFLAG, value);
    }

    /**
     * Gets the attribute value for GiftwrapMessage, using the alias name GiftwrapMessage.
     * @return the GiftwrapMessage
     */
    public String getGiftwrapMessage() {
        return (String)getAttributeInternal(GIFTWRAPMESSAGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for GiftwrapMessage.
     * @param value value to set the GiftwrapMessage
     */
    public void setGiftwrapMessage(String value) {
        setAttributeInternal(GIFTWRAPMESSAGE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the CreatedBy
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }


    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }


    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the LastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }


    /**
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the LastUpdateDate
     */
    public Date getLastUpdateDate() {
        return (Date)getAttributeInternal(LASTUPDATEDATE);
    }


    /**
     * Gets the attribute value for ObjectVersionId, using the alias name ObjectVersionId.
     * @return the ObjectVersionId
     */
    public Number getObjectVersionId() {
        return (Number)getAttributeInternal(OBJECTVERSIONID);
    }


    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }


    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public PersonsEOImpl getPersonsEO() {
        return (PersonsEOImpl)getAttributeInternal(PERSONSEO);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setPersonsEO(PersonsEOImpl value) {
        setAttributeInternal(PERSONSEO, value);
    }

    /**
     * @param orderId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(DBSequence orderId) {
        return new Key(new Object[]{orderId});
    }


}