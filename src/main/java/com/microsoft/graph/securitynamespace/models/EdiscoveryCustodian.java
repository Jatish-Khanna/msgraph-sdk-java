// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.security.models.EdiscoveryIndexOperation;
import com.microsoft.graph.security.models.DataSourceContainer;
import com.microsoft.graph.security.requests.SiteSourceCollectionPage;
import com.microsoft.graph.security.requests.UnifiedGroupSourceCollectionPage;
import com.microsoft.graph.security.requests.UserSourceCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Custodian.
 */
public class EdiscoveryCustodian extends DataSourceContainer implements IJsonBackedObject {


    /**
     * The Acknowledged Date Time.
     * Date and time the custodian acknowledged a hold notification.
     */
    @SerializedName(value = "acknowledgedDateTime", alternate = {"AcknowledgedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime acknowledgedDateTime;

    /**
     * The Email.
     * Email address of the custodian.
     */
    @SerializedName(value = "email", alternate = {"Email"})
    @Expose
	@Nullable
    public String email;

    /**
     * The Last Index Operation.
     * Operation entity that represents the latest indexing for the custodian.
     */
    @SerializedName(value = "lastIndexOperation", alternate = {"LastIndexOperation"})
    @Expose
	@Nullable
    public EdiscoveryIndexOperation lastIndexOperation;

    /**
     * The Site Sources.
     * Data source entity for SharePoint sites associated with the custodian.
     */
    @SerializedName(value = "siteSources", alternate = {"SiteSources"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.SiteSourceCollectionPage siteSources;

    /**
     * The Unified Group Sources.
     * Data source entity for groups associated with the custodian.
     */
    @SerializedName(value = "unifiedGroupSources", alternate = {"UnifiedGroupSources"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.UnifiedGroupSourceCollectionPage unifiedGroupSources;

    /**
     * The User Sources.
     * Data source entity for a the custodian. This is the container for a custodian's mailbox and OneDrive for Business site.
     */
    @SerializedName(value = "userSources", alternate = {"UserSources"})
    @Expose
	@Nullable
    public com.microsoft.graph.security.requests.UserSourceCollectionPage userSources;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("siteSources")) {
            siteSources = serializer.deserializeObject(json.get("siteSources"), com.microsoft.graph.security.requests.SiteSourceCollectionPage.class);
        }

        if (json.has("unifiedGroupSources")) {
            unifiedGroupSources = serializer.deserializeObject(json.get("unifiedGroupSources"), com.microsoft.graph.security.requests.UnifiedGroupSourceCollectionPage.class);
        }

        if (json.has("userSources")) {
            userSources = serializer.deserializeObject(json.get("userSources"), com.microsoft.graph.security.requests.UserSourceCollectionPage.class);
        }
    }
}
