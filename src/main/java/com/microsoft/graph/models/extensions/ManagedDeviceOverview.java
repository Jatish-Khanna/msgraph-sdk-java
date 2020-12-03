// Template Source: Templates\Java\models_extensions\BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DeviceExchangeAccessStateSummary;
import com.microsoft.graph.models.extensions.DeviceOperatingSystemSummary;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Overview.
 */
public class ManagedDeviceOverview extends Entity implements IJsonBackedObject {


    /**
     * The Device Exchange Access State Summary.
     * Distribution of Exchange Access State in Intune
     */
    @SerializedName(value = "deviceExchangeAccessStateSummary", alternate = {"DeviceExchangeAccessStateSummary"})
    @Expose
	@Nullable
    public DeviceExchangeAccessStateSummary deviceExchangeAccessStateSummary;

    /**
     * The Device Operating System Summary.
     * Device operating system summary.
     */
    @SerializedName(value = "deviceOperatingSystemSummary", alternate = {"DeviceOperatingSystemSummary"})
    @Expose
	@Nullable
    public DeviceOperatingSystemSummary deviceOperatingSystemSummary;

    /**
     * The Dual Enrolled Device Count.
     * The number of devices enrolled in both MDM and EAS
     */
    @SerializedName(value = "dualEnrolledDeviceCount", alternate = {"DualEnrolledDeviceCount"})
    @Expose
	@Nullable
    public Integer dualEnrolledDeviceCount;

    /**
     * The Enrolled Device Count.
     * Total enrolled device count. Does not include PC devices managed via Intune PC Agent
     */
    @SerializedName(value = "enrolledDeviceCount", alternate = {"EnrolledDeviceCount"})
    @Expose
	@Nullable
    public Integer enrolledDeviceCount;

    /**
     * The Mdm Enrolled Count.
     * The number of devices enrolled in MDM
     */
    @SerializedName(value = "mdmEnrolledCount", alternate = {"MdmEnrolledCount"})
    @Expose
	@Nullable
    public Integer mdmEnrolledCount;


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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
