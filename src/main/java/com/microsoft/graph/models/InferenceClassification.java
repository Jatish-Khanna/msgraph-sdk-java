// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.InferenceClassificationOverrideCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Inference Classification.
 */
public class InferenceClassification extends Entity implements IJsonBackedObject {


    /**
     * The Overrides.
     * A set of overrides for a user to always classify messages from specific senders in certain ways: focused, or other. Read-only. Nullable.
     */
    @SerializedName(value = "overrides", alternate = {"Overrides"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.InferenceClassificationOverrideCollectionPage overrides;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("overrides")) {
            overrides = serializer.deserializeObject(json.get("overrides"), com.microsoft.graph.requests.InferenceClassificationOverrideCollectionPage.class);
        }
    }
}
