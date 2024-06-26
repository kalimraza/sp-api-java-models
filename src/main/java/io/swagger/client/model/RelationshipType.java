/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items helps you programmatically retrieve item details for items in the catalog.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DecimalWithUnits;
import io.swagger.client.model.DimensionType;
import io.swagger.client.model.IdentifierType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Specific variations of the item.
 */
@ApiModel(description = "Specific variations of the item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-11-09T23:38:21.685+05:00")
public class RelationshipType {
  @SerializedName("Identifiers")
  private IdentifierType identifiers = null;

  @SerializedName("Color")
  private String color = null;

  @SerializedName("Edition")
  private String edition = null;

  @SerializedName("Flavor")
  private String flavor = null;

  @SerializedName("GemType")
  private List<String> gemType = null;

  @SerializedName("GolfClubFlex")
  private String golfClubFlex = null;

  @SerializedName("HandOrientation")
  private String handOrientation = null;

  @SerializedName("HardwarePlatform")
  private String hardwarePlatform = null;

  @SerializedName("MaterialType")
  private List<String> materialType = null;

  @SerializedName("MetalType")
  private String metalType = null;

  @SerializedName("Model")
  private String model = null;

  @SerializedName("OperatingSystem")
  private List<String> operatingSystem = null;

  @SerializedName("ProductTypeSubcategory")
  private String productTypeSubcategory = null;

  @SerializedName("RingSize")
  private String ringSize = null;

  @SerializedName("ShaftMaterial")
  private String shaftMaterial = null;

  @SerializedName("Scent")
  private String scent = null;

  @SerializedName("Size")
  private String size = null;

  @SerializedName("SizePerPearl")
  private String sizePerPearl = null;

  @SerializedName("GolfClubLoft")
  private DecimalWithUnits golfClubLoft = null;

  @SerializedName("TotalDiamondWeight")
  private DecimalWithUnits totalDiamondWeight = null;

  @SerializedName("TotalGemWeight")
  private DecimalWithUnits totalGemWeight = null;

  @SerializedName("PackageQuantity")
  private Integer packageQuantity = null;

  @SerializedName("ItemDimensions")
  private DimensionType itemDimensions = null;

  public RelationshipType identifiers(IdentifierType identifiers) {
    this.identifiers = identifiers;
    return this;
  }

   /**
   * The identifiers that uniquely identify the item that is related.
   * @return identifiers
  **/
  @ApiModelProperty(value = "The identifiers that uniquely identify the item that is related.")
  public IdentifierType getIdentifiers() {
    return identifiers;
  }

  public void setIdentifiers(IdentifierType identifiers) {
    this.identifiers = identifiers;
  }

  public RelationshipType color(String color) {
    this.color = color;
    return this;
  }

   /**
   * The color variation of the item.
   * @return color
  **/
  @ApiModelProperty(value = "The color variation of the item.")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public RelationshipType edition(String edition) {
    this.edition = edition;
    return this;
  }

   /**
   * The edition variation of the item.
   * @return edition
  **/
  @ApiModelProperty(value = "The edition variation of the item.")
  public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }

  public RelationshipType flavor(String flavor) {
    this.flavor = flavor;
    return this;
  }

   /**
   * The flavor variation of the item.
   * @return flavor
  **/
  @ApiModelProperty(value = "The flavor variation of the item.")
  public String getFlavor() {
    return flavor;
  }

  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  public RelationshipType gemType(List<String> gemType) {
    this.gemType = gemType;
    return this;
  }

  public RelationshipType addGemTypeItem(String gemTypeItem) {
    if (this.gemType == null) {
      this.gemType = new ArrayList<String>();
    }
    this.gemType.add(gemTypeItem);
    return this;
  }

   /**
   * The gem type variations of the item.
   * @return gemType
  **/
  @ApiModelProperty(value = "The gem type variations of the item.")
  public List<String> getGemType() {
    return gemType;
  }

  public void setGemType(List<String> gemType) {
    this.gemType = gemType;
  }

  public RelationshipType golfClubFlex(String golfClubFlex) {
    this.golfClubFlex = golfClubFlex;
    return this;
  }

   /**
   * The golf club flex variation of an item.
   * @return golfClubFlex
  **/
  @ApiModelProperty(value = "The golf club flex variation of an item.")
  public String getGolfClubFlex() {
    return golfClubFlex;
  }

  public void setGolfClubFlex(String golfClubFlex) {
    this.golfClubFlex = golfClubFlex;
  }

  public RelationshipType handOrientation(String handOrientation) {
    this.handOrientation = handOrientation;
    return this;
  }

   /**
   * The hand orientation variation of an item.
   * @return handOrientation
  **/
  @ApiModelProperty(value = "The hand orientation variation of an item.")
  public String getHandOrientation() {
    return handOrientation;
  }

  public void setHandOrientation(String handOrientation) {
    this.handOrientation = handOrientation;
  }

  public RelationshipType hardwarePlatform(String hardwarePlatform) {
    this.hardwarePlatform = hardwarePlatform;
    return this;
  }

   /**
   * The hardware platform variation of an item.
   * @return hardwarePlatform
  **/
  @ApiModelProperty(value = "The hardware platform variation of an item.")
  public String getHardwarePlatform() {
    return hardwarePlatform;
  }

  public void setHardwarePlatform(String hardwarePlatform) {
    this.hardwarePlatform = hardwarePlatform;
  }

  public RelationshipType materialType(List<String> materialType) {
    this.materialType = materialType;
    return this;
  }

  public RelationshipType addMaterialTypeItem(String materialTypeItem) {
    if (this.materialType == null) {
      this.materialType = new ArrayList<String>();
    }
    this.materialType.add(materialTypeItem);
    return this;
  }

   /**
   * The material type variations of an item.
   * @return materialType
  **/
  @ApiModelProperty(value = "The material type variations of an item.")
  public List<String> getMaterialType() {
    return materialType;
  }

  public void setMaterialType(List<String> materialType) {
    this.materialType = materialType;
  }

  public RelationshipType metalType(String metalType) {
    this.metalType = metalType;
    return this;
  }

   /**
   * The metal type variation of an item.
   * @return metalType
  **/
  @ApiModelProperty(value = "The metal type variation of an item.")
  public String getMetalType() {
    return metalType;
  }

  public void setMetalType(String metalType) {
    this.metalType = metalType;
  }

  public RelationshipType model(String model) {
    this.model = model;
    return this;
  }

   /**
   * The model variation of an item.
   * @return model
  **/
  @ApiModelProperty(value = "The model variation of an item.")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public RelationshipType operatingSystem(List<String> operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

  public RelationshipType addOperatingSystemItem(String operatingSystemItem) {
    if (this.operatingSystem == null) {
      this.operatingSystem = new ArrayList<String>();
    }
    this.operatingSystem.add(operatingSystemItem);
    return this;
  }

   /**
   * The operating system variations of an item.
   * @return operatingSystem
  **/
  @ApiModelProperty(value = "The operating system variations of an item.")
  public List<String> getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(List<String> operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public RelationshipType productTypeSubcategory(String productTypeSubcategory) {
    this.productTypeSubcategory = productTypeSubcategory;
    return this;
  }

   /**
   * The product type subcategory variation of an item.
   * @return productTypeSubcategory
  **/
  @ApiModelProperty(value = "The product type subcategory variation of an item.")
  public String getProductTypeSubcategory() {
    return productTypeSubcategory;
  }

  public void setProductTypeSubcategory(String productTypeSubcategory) {
    this.productTypeSubcategory = productTypeSubcategory;
  }

  public RelationshipType ringSize(String ringSize) {
    this.ringSize = ringSize;
    return this;
  }

   /**
   * The ring size variation of an item.
   * @return ringSize
  **/
  @ApiModelProperty(value = "The ring size variation of an item.")
  public String getRingSize() {
    return ringSize;
  }

  public void setRingSize(String ringSize) {
    this.ringSize = ringSize;
  }

  public RelationshipType shaftMaterial(String shaftMaterial) {
    this.shaftMaterial = shaftMaterial;
    return this;
  }

   /**
   * The shaft material variation of an item.
   * @return shaftMaterial
  **/
  @ApiModelProperty(value = "The shaft material variation of an item.")
  public String getShaftMaterial() {
    return shaftMaterial;
  }

  public void setShaftMaterial(String shaftMaterial) {
    this.shaftMaterial = shaftMaterial;
  }

  public RelationshipType scent(String scent) {
    this.scent = scent;
    return this;
  }

   /**
   * The scent variation of an item.
   * @return scent
  **/
  @ApiModelProperty(value = "The scent variation of an item.")
  public String getScent() {
    return scent;
  }

  public void setScent(String scent) {
    this.scent = scent;
  }

  public RelationshipType size(String size) {
    this.size = size;
    return this;
  }

   /**
   * The size variation of an item.
   * @return size
  **/
  @ApiModelProperty(value = "The size variation of an item.")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public RelationshipType sizePerPearl(String sizePerPearl) {
    this.sizePerPearl = sizePerPearl;
    return this;
  }

   /**
   * The size per pearl variation of an item.
   * @return sizePerPearl
  **/
  @ApiModelProperty(value = "The size per pearl variation of an item.")
  public String getSizePerPearl() {
    return sizePerPearl;
  }

  public void setSizePerPearl(String sizePerPearl) {
    this.sizePerPearl = sizePerPearl;
  }

  public RelationshipType golfClubLoft(DecimalWithUnits golfClubLoft) {
    this.golfClubLoft = golfClubLoft;
    return this;
  }

   /**
   * The golf club loft variation of an item.
   * @return golfClubLoft
  **/
  @ApiModelProperty(value = "The golf club loft variation of an item.")
  public DecimalWithUnits getGolfClubLoft() {
    return golfClubLoft;
  }

  public void setGolfClubLoft(DecimalWithUnits golfClubLoft) {
    this.golfClubLoft = golfClubLoft;
  }

  public RelationshipType totalDiamondWeight(DecimalWithUnits totalDiamondWeight) {
    this.totalDiamondWeight = totalDiamondWeight;
    return this;
  }

   /**
   * The total diamond weight variation of an item.
   * @return totalDiamondWeight
  **/
  @ApiModelProperty(value = "The total diamond weight variation of an item.")
  public DecimalWithUnits getTotalDiamondWeight() {
    return totalDiamondWeight;
  }

  public void setTotalDiamondWeight(DecimalWithUnits totalDiamondWeight) {
    this.totalDiamondWeight = totalDiamondWeight;
  }

  public RelationshipType totalGemWeight(DecimalWithUnits totalGemWeight) {
    this.totalGemWeight = totalGemWeight;
    return this;
  }

   /**
   * The total gem weight variation of an item.
   * @return totalGemWeight
  **/
  @ApiModelProperty(value = "The total gem weight variation of an item.")
  public DecimalWithUnits getTotalGemWeight() {
    return totalGemWeight;
  }

  public void setTotalGemWeight(DecimalWithUnits totalGemWeight) {
    this.totalGemWeight = totalGemWeight;
  }

  public RelationshipType packageQuantity(Integer packageQuantity) {
    this.packageQuantity = packageQuantity;
    return this;
  }

   /**
   * The package quantity variation of an item.
   * @return packageQuantity
  **/
  @ApiModelProperty(value = "The package quantity variation of an item.")
  public Integer getPackageQuantity() {
    return packageQuantity;
  }

  public void setPackageQuantity(Integer packageQuantity) {
    this.packageQuantity = packageQuantity;
  }

  public RelationshipType itemDimensions(DimensionType itemDimensions) {
    this.itemDimensions = itemDimensions;
    return this;
  }

   /**
   * The item dimensions relationship of an item.
   * @return itemDimensions
  **/
  @ApiModelProperty(value = "The item dimensions relationship of an item.")
  public DimensionType getItemDimensions() {
    return itemDimensions;
  }

  public void setItemDimensions(DimensionType itemDimensions) {
    this.itemDimensions = itemDimensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipType relationshipType = (RelationshipType) o;
    return Objects.equals(this.identifiers, relationshipType.identifiers) &&
        Objects.equals(this.color, relationshipType.color) &&
        Objects.equals(this.edition, relationshipType.edition) &&
        Objects.equals(this.flavor, relationshipType.flavor) &&
        Objects.equals(this.gemType, relationshipType.gemType) &&
        Objects.equals(this.golfClubFlex, relationshipType.golfClubFlex) &&
        Objects.equals(this.handOrientation, relationshipType.handOrientation) &&
        Objects.equals(this.hardwarePlatform, relationshipType.hardwarePlatform) &&
        Objects.equals(this.materialType, relationshipType.materialType) &&
        Objects.equals(this.metalType, relationshipType.metalType) &&
        Objects.equals(this.model, relationshipType.model) &&
        Objects.equals(this.operatingSystem, relationshipType.operatingSystem) &&
        Objects.equals(this.productTypeSubcategory, relationshipType.productTypeSubcategory) &&
        Objects.equals(this.ringSize, relationshipType.ringSize) &&
        Objects.equals(this.shaftMaterial, relationshipType.shaftMaterial) &&
        Objects.equals(this.scent, relationshipType.scent) &&
        Objects.equals(this.size, relationshipType.size) &&
        Objects.equals(this.sizePerPearl, relationshipType.sizePerPearl) &&
        Objects.equals(this.golfClubLoft, relationshipType.golfClubLoft) &&
        Objects.equals(this.totalDiamondWeight, relationshipType.totalDiamondWeight) &&
        Objects.equals(this.totalGemWeight, relationshipType.totalGemWeight) &&
        Objects.equals(this.packageQuantity, relationshipType.packageQuantity) &&
        Objects.equals(this.itemDimensions, relationshipType.itemDimensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifiers, color, edition, flavor, gemType, golfClubFlex, handOrientation, hardwarePlatform, materialType, metalType, model, operatingSystem, productTypeSubcategory, ringSize, shaftMaterial, scent, size, sizePerPearl, golfClubLoft, totalDiamondWeight, totalGemWeight, packageQuantity, itemDimensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipType {\n");
    
    sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    edition: ").append(toIndentedString(edition)).append("\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
    sb.append("    gemType: ").append(toIndentedString(gemType)).append("\n");
    sb.append("    golfClubFlex: ").append(toIndentedString(golfClubFlex)).append("\n");
    sb.append("    handOrientation: ").append(toIndentedString(handOrientation)).append("\n");
    sb.append("    hardwarePlatform: ").append(toIndentedString(hardwarePlatform)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    metalType: ").append(toIndentedString(metalType)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    productTypeSubcategory: ").append(toIndentedString(productTypeSubcategory)).append("\n");
    sb.append("    ringSize: ").append(toIndentedString(ringSize)).append("\n");
    sb.append("    shaftMaterial: ").append(toIndentedString(shaftMaterial)).append("\n");
    sb.append("    scent: ").append(toIndentedString(scent)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizePerPearl: ").append(toIndentedString(sizePerPearl)).append("\n");
    sb.append("    golfClubLoft: ").append(toIndentedString(golfClubLoft)).append("\n");
    sb.append("    totalDiamondWeight: ").append(toIndentedString(totalDiamondWeight)).append("\n");
    sb.append("    totalGemWeight: ").append(toIndentedString(totalGemWeight)).append("\n");
    sb.append("    packageQuantity: ").append(toIndentedString(packageQuantity)).append("\n");
    sb.append("    itemDimensions: ").append(toIndentedString(itemDimensions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

