// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.AuthenticationMethodKeyStrength;
import com.microsoft.graph.models.Device;
import com.microsoft.graph.models.AuthenticationMethod;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Hello For Business Authentication Method.
 */
public class WindowsHelloForBusinessAuthenticationMethod extends AuthenticationMethod implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The date and time that this Windows Hello for Business key was registered.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Display Name.
     * The name of the device on which Windows Hello for Business is registered
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Key Strength.
     * Key strength of this Windows Hello for Business key. Possible values are: normal, weak, unknown.
     */
    @SerializedName(value = "keyStrength", alternate = {"KeyStrength"})
    @Expose
	@Nullable
    public AuthenticationMethodKeyStrength keyStrength;

    /**
     * The Device.
     * The registered device on which this Windows Hello for Business key resides. Supports $expand. When you get a user's Windows Hello for Business registration information, this property is returned only on a single GET and when you specify ?$expand. For example, GET /users/admin@contoso.com/authentication/windowsHelloForBusinessMethods/_jpuR-TGZtk6aQCLF3BQjA2?$expand=device.
     */
    @SerializedName(value = "device", alternate = {"Device"})
    @Expose
	@Nullable
    public Device device;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
