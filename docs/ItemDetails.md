
# ItemDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**purchaseOrderNumber** | **String** | The Amazon purchase order number for the shipment being confirmed. If the items in this shipment belong to multiple purchase order numbers that are in particular carton or pallet within the shipment, then provide the purchaseOrderNumber at the appropriate carton or pallet level. Formatting Notes: 8-character alpha-numeric code. |  [optional]
**lotNumber** | **String** | The batch or lot number associates an item with information the manufacturer considers relevant for traceability of the trade item to which the Element String is applied. The data may refer to the trade item itself or to items contained. This field is mandatory for all perishable items. |  [optional]
**expiry** | [**Expiry**](Expiry.md) | Either expiryDate or mfgDate and expiryAfterDuration are mandatory for perishable items. |  [optional]
**maximumRetailPrice** | [**Money**](Money.md) | Maximum retail price of the item being shipped. |  [optional]
**handlingCode** | [**HandlingCodeEnum**](#HandlingCodeEnum) | Identification of the instructions on how specified item/carton/pallet should be handled. |  [optional]


<a name="HandlingCodeEnum"></a>
## Enum: HandlingCodeEnum
Name | Value
---- | -----
OVERSIZED | &quot;Oversized&quot;
FRAGILE | &quot;Fragile&quot;
FOOD | &quot;Food&quot;
HANDLEWITHCARE | &quot;HandleWithCare&quot;



