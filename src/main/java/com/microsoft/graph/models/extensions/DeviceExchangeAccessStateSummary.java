// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Exchange Access State Summary.
 */
public class DeviceExchangeAccessStateSummary implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Allowed Device Count.
     * Total count of devices with Exchange Access State: Allowed.
     */
    @SerializedName(value = "allowedDeviceCount", alternate = {"AllowedDeviceCount"})
    @Expose
    public Integer allowedDeviceCount;

    /**
     * The Blocked Device Count.
     * Total count of devices with Exchange Access State: Blocked.
     */
    @SerializedName(value = "blockedDeviceCount", alternate = {"BlockedDeviceCount"})
    @Expose
    public Integer blockedDeviceCount;

    /**
     * The Quarantined Device Count.
     * Total count of devices with Exchange Access State: Quarantined.
     */
    @SerializedName(value = "quarantinedDeviceCount", alternate = {"QuarantinedDeviceCount"})
    @Expose
    public Integer quarantinedDeviceCount;

    /**
     * The Unavailable Device Count.
     * Total count of devices for which no Exchange Access State could be found.
     */
    @SerializedName(value = "unavailableDeviceCount", alternate = {"UnavailableDeviceCount"})
    @Expose
    public Integer unavailableDeviceCount;

    /**
     * The Unknown Device Count.
     * Total count of devices with Exchange Access State: Unknown.
     */
    @SerializedName(value = "unknownDeviceCount", alternate = {"UnknownDeviceCount"})
    @Expose
    public Integer unknownDeviceCount;


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
