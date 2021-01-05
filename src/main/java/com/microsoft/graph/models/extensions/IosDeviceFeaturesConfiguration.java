// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.IosHomeScreenItem;
import com.microsoft.graph.models.extensions.IosHomeScreenPage;
import com.microsoft.graph.models.extensions.IosNotificationSettings;
import com.microsoft.graph.models.extensions.AppleDeviceFeaturesConfigurationBase;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Device Features Configuration.
 */
public class IosDeviceFeaturesConfiguration extends AppleDeviceFeaturesConfigurationBase implements IJsonBackedObject {


    /**
     * The Asset Tag Template.
     * Asset tag information for the device, displayed on the login window and lock screen.
     */
    @SerializedName(value = "assetTagTemplate", alternate = {"AssetTagTemplate"})
    @Expose
    public String assetTagTemplate;

    /**
     * The Home Screen Dock Icons.
     * A list of app and folders to appear on the Home Screen Dock. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "homeScreenDockIcons", alternate = {"HomeScreenDockIcons"})
    @Expose
    public java.util.List<IosHomeScreenItem> homeScreenDockIcons;

    /**
     * The Home Screen Pages.
     * A list of pages on the Home Screen. This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "homeScreenPages", alternate = {"HomeScreenPages"})
    @Expose
    public java.util.List<IosHomeScreenPage> homeScreenPages;

    /**
     * The Lock Screen Footnote.
     * A footnote displayed on the login window and lock screen. Available in iOS 9.3.1 and later.
     */
    @SerializedName(value = "lockScreenFootnote", alternate = {"LockScreenFootnote"})
    @Expose
    public String lockScreenFootnote;

    /**
     * The Notification Settings.
     * Notification settings for each bundle id. Applicable to devices in supervised mode only (iOS 9.3 and later). This collection can contain a maximum of 500 elements.
     */
    @SerializedName(value = "notificationSettings", alternate = {"NotificationSettings"})
    @Expose
    public java.util.List<IosNotificationSettings> notificationSettings;


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
