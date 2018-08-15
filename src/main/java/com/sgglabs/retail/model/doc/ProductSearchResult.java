package com.sgglabs.retail.model.doc;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/*
 * CREATE TABLE ProductSearchResult(
 *   Id BIGINT(20) NOT NULL AUTO_INCREMENT,
 *   SiteName VARCHAR(30) NOT NULL,
 *   SearchText VARCHAR(100) NOT NULL,
 *   ShortDesc VARCHAR(150),
 *   LongDesc VARCHAR(300),
 *   Price VARCHAR(30),
 *   Unit VARCHAR(30),
 *   Reviews VARCHAR(250),
 *   Ratings VARCHAR(50),
 *   OtherOptions VARCHAR(100),
 *   ProdCategories VARCHAR(200),
 *   StatusId INT(2) NOT NULL DEFAULT 2,
 *   CreatedDate DATE,
 *   ModifiedDate DATE
 * );
 */
@Document(collection = "productsearchresult")
public class ProductSearchResult {
    private static final String TO_STRING_FORMAT =
            "ProductSearchResult[id=%s, siteName='%s', searchText='%s', shortDesc='%s', longDesc='%s', price='%s'" +
                    "unit='%s', reviews='%s', ratings='%s', otherOptions='%s', prodCategories='%s'" +
                    "statusId=%s, createdDate=%s, modifiedDate=%s, sellerDataId=%s]";

    @Id
    private long id;

    private String siteName;

    private String searchText;

    private String shortDescription;

    private String longDescription;

    private String price;

    private String unit;

    private String numberOfReviews;

    private String totalRatings;

    private String otherOptions;

    private String categories;

    private String status;

    private Date createdDate;

    private Date modifiedDate;

    private List<Long> sellerDataIdList;

    public ProductSearchResult() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(String numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public String getTotalRatings() {
        return totalRatings;
    }

    public void setTotalRatings(String ratings) {
        this.totalRatings = ratings;
    }

    public String getOtherOptions() {
        return otherOptions;
    }

    public void setOtherOptions(String otherOptions) {
        this.otherOptions = otherOptions;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public List<Long> getSellerDataIdList() {
        return sellerDataIdList;
    }

    public void setSellerDataIdList(List<Long> sellerDataIdList) {
        this.sellerDataIdList = sellerDataIdList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSearchResult that = (ProductSearchResult) o;
        return id == that.id &&
                Objects.equals(sellerDataIdList, that.sellerDataIdList) &&
                Objects.equals(siteName, that.siteName) &&
                Objects.equals(searchText, that.searchText) &&
                Objects.equals(shortDescription, that.shortDescription) &&
                Objects.equals(longDescription, that.longDescription) &&
                Objects.equals(price, that.price) &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(numberOfReviews, that.numberOfReviews) &&
                Objects.equals(totalRatings, that.totalRatings) &&
                Objects.equals(otherOptions, that.otherOptions) &&
                Objects.equals(categories, that.categories) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createdDate, that.createdDate) &&
                Objects.equals(modifiedDate, that.modifiedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, siteName, searchText, shortDescription, longDescription, price, unit, numberOfReviews,
                totalRatings, otherOptions, categories, status, createdDate, modifiedDate, sellerDataIdList);
    }

    @Override
    public String toString() {
        return String.format(TO_STRING_FORMAT, id, siteName, searchText, shortDescription, longDescription, price, unit,
                numberOfReviews, totalRatings, otherOptions, categories, status, createdDate, modifiedDate,
                sellerDataIdList);
    }
}