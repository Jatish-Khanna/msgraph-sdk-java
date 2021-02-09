// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ChangeType;
import com.microsoft.graph.models.extensions.ChangeNotificationEncryptedContent;
import com.microsoft.graph.models.generated.LifecycleEventType;
import com.microsoft.graph.models.extensions.ResourceData;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Change Notification.
 */
public class ChangeNotification implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Change Type.
     * Indicates the type of change that will raise the change notification. The supported values are: created, updated, deleted. Required.
     */
    @SerializedName(value = "changeType", alternate = {"ChangeType"})
    @Expose
    public ChangeType changeType;

    /**
     * The Client State.
     * Value of the clientState property sent in the subscription request (if any). The maximum length is 255 characters. The client can check whether the change notification came from the service by comparing the values of the clientState property. The value of the clientState property sent with the subscription is compared with the value of the clientState property received with each change notification. Optional.
     */
    @SerializedName(value = "clientState", alternate = {"ClientState"})
    @Expose
    public String clientState;

    /**
     * The Encrypted Content.
     * (Preview) Encrypted content attached with the change notification. Only provided if encryptionCertificate and includeResourceData were defined during the subscription request and if the resource supports it. Optional.
     */
    @SerializedName(value = "encryptedContent", alternate = {"EncryptedContent"})
    @Expose
    public ChangeNotificationEncryptedContent encryptedContent;

    /**
     * The Id.
     * Unique ID for the notification. Optional.
     */
    @SerializedName(value = "id", alternate = {"Id"})
    @Expose
    public String id;

    /**
     * The Lifecycle Event.
     * The type of lifecycle notification if the current notification is a lifecycle notification. Optional. Supported values are missed, removed, reauthorizationRequired.
     */
    @SerializedName(value = "lifecycleEvent", alternate = {"LifecycleEvent"})
    @Expose
    public LifecycleEventType lifecycleEvent;

    /**
     * The Resource.
     * The URI of the resource that emitted the change notification relative to https://graph.microsoft.com. Required.
     */
    @SerializedName(value = "resource", alternate = {"Resource"})
    @Expose
    public String resource;

    /**
     * The Resource Data.
     * The content of this property depends on the type of resource being subscribed to. Required.
     */
    @SerializedName(value = "resourceData", alternate = {"ResourceData"})
    @Expose
    public ResourceData resourceData;

    /**
     * The Subscription Expiration Date Time.
     * The expiration time for the subscription. Required.
     */
    @SerializedName(value = "subscriptionExpirationDateTime", alternate = {"SubscriptionExpirationDateTime"})
    @Expose
    public java.util.Calendar subscriptionExpirationDateTime;

    /**
     * The Subscription Id.
     * The unique identifier of the subscription that generated the notification.
     */
    @SerializedName(value = "subscriptionId", alternate = {"SubscriptionId"})
    @Expose
    public java.util.UUID subscriptionId;

    /**
     * The Tenant Id.
     * The unique identifier of the tenant from which the change notification originated.
     */
    @SerializedName(value = "tenantId", alternate = {"TenantId"})
    @Expose
    public java.util.UUID tenantId;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
