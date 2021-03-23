// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.IosNotificationAlertType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Notification Settings.
 */
public class IosNotificationSettings implements IJsonBackedObject {

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
     * The Alert Type.
     * Indicates the type of alert for notifications for this app. Possible values are: deviceDefault, banner, modal, none.
     */
    @SerializedName(value = "alertType", alternate = {"AlertType"})
    @Expose
	@Nullable
    public IosNotificationAlertType alertType;

    /**
     * The App Name.
     * Application name to be associated with the bundleID.
     */
    @SerializedName(value = "appName", alternate = {"AppName"})
    @Expose
	@Nullable
    public String appName;

    /**
     * The Badges Enabled.
     * Indicates whether badges are allowed for this app.
     */
    @SerializedName(value = "badgesEnabled", alternate = {"BadgesEnabled"})
    @Expose
	@Nullable
    public Boolean badgesEnabled;

    /**
     * The Bundle ID.
     * Bundle id of app to which to apply these notification settings.
     */
    @SerializedName(value = "bundleID", alternate = {"BundleID"})
    @Expose
	@Nullable
    public String bundleID;

    /**
     * The Enabled.
     * Indicates whether notifications are allowed for this app.
     */
    @SerializedName(value = "enabled", alternate = {"Enabled"})
    @Expose
	@Nullable
    public Boolean enabled;

    /**
     * The Publisher.
     * Publisher to be associated with the bundleID.
     */
    @SerializedName(value = "publisher", alternate = {"Publisher"})
    @Expose
	@Nullable
    public String publisher;

    /**
     * The Show In Notification Center.
     * Indicates whether notifications can be shown in notification center.
     */
    @SerializedName(value = "showInNotificationCenter", alternate = {"ShowInNotificationCenter"})
    @Expose
	@Nullable
    public Boolean showInNotificationCenter;

    /**
     * The Show On Lock Screen.
     * Indicates whether notifications can be shown on the lock screen.
     */
    @SerializedName(value = "showOnLockScreen", alternate = {"ShowOnLockScreen"})
    @Expose
	@Nullable
    public Boolean showOnLockScreen;

    /**
     * The Sounds Enabled.
     * Indicates whether sounds are allowed for this app.
     */
    @SerializedName(value = "soundsEnabled", alternate = {"SoundsEnabled"})
    @Expose
	@Nullable
    public Boolean soundsEnabled;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
