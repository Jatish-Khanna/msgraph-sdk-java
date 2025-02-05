// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.externalconnectors.models.Label;
import com.microsoft.graph.externalconnectors.models.PropertyType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Property.
 */
public class Property implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Aliases.
     * A set of aliases or a friendly names for the property. Maximum 32 characters. Only alphanumeric characters allowed. For example, each string may not contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {, }, %, $, +, !, *, =, &amp;, ?, @, #, /, ~, ', ', &amp;lt;, &amp;gt;, `, ^. Optional.
     */
    @SerializedName(value = "aliases", alternate = {"Aliases"})
    @Expose
	@Nullable
    public java.util.List<String> aliases;

    /**
     * The Is Queryable.
     * Specifies if the property is queryable. Queryable properties can be used in Keyword Query Language (KQL) queries. Optional.
     */
    @SerializedName(value = "isQueryable", alternate = {"IsQueryable"})
    @Expose
	@Nullable
    public Boolean isQueryable;

    /**
     * The Is Refinable.
     * Specifies if the property is refinable.  Refinable properties can be used to filter search results in the Search API and add a refiner control in the Microsoft Search user experience. Optional.
     */
    @SerializedName(value = "isRefinable", alternate = {"IsRefinable"})
    @Expose
	@Nullable
    public Boolean isRefinable;

    /**
     * The Is Retrievable.
     * Specifies if the property is retrievable. Retrievable properties are returned in the result set when items are returned by the search API. Retrievable properties are also available to add to the display template used to render search results. Optional.
     */
    @SerializedName(value = "isRetrievable", alternate = {"IsRetrievable"})
    @Expose
	@Nullable
    public Boolean isRetrievable;

    /**
     * The Is Searchable.
     * Specifies if the property is searchable. Only properties of type String or StringCollection can be searchable. Non-searchable properties are not added to the search index. Optional.
     */
    @SerializedName(value = "isSearchable", alternate = {"IsSearchable"})
    @Expose
	@Nullable
    public Boolean isSearchable;

    /**
     * The Labels.
     * Specifies one or more well-known tags added against a property. Labels help Microsoft Search understand the semantics of the data in the connection. Adding appropriate labels would result in an enhanced search experience (e.g. better relevance). The possible values are: title, url, createdBy, lastModifiedBy, authors, createdDateTime, lastModifiedDateTime, fileName, fileExtension, unknownFutureValue. Optional.
     */
    @SerializedName(value = "labels", alternate = {"Labels"})
    @Expose
	@Nullable
    public java.util.List<Label> labels;

    /**
     * The Name.
     * The name of the property. Maximum 32 characters. Only alphanumeric characters allowed. For example, each string may not contain control characters, whitespace, or any of the following: :, ;, ,, (, ), [, ], {, }, %, $, +, !, *, =, &amp;, ?, @, #, /, ~, ', ', &amp;lt;, &amp;gt;, `, ^.  Required.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Type.
     * The data type of the property. Possible values are: string, int64, double, dateTime, boolean, stringCollection, int64Collection, doubleCollection, dateTimeCollection, unknownFutureValue.
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public PropertyType type;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
