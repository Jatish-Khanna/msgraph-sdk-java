// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.ImageInfo;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Visual Info.
 */
public class VisualInfo implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Attribution.
     * Optional. JSON object used to represent an icon which represents the application used to generate the activity
     */
    @SerializedName("attribution")
    @Expose
    public ImageInfo attribution;

    /**
     * The Background Color.
     * Optional. Background color used to render the activity in the UI - brand color for the application source of the activity. Must be a valid hex color
     */
    @SerializedName("backgroundColor")
    @Expose
    public String backgroundColor;

    /**
     * The Content.
     * Optional. Custom piece of data - JSON object used to provide custom content to render the activity in the Windows Shell UI
     */
    @SerializedName("content")
    @Expose
    public com.google.gson.JsonElement content;

    /**
     * The Description.
     * Optional. Longer text description of the user's unique activity (example: document name, first sentence, and/or metadata)
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Text.
     * Required. Short text description of the user's unique activity (for example, document name in cases where an activity refers to document creation)
     */
    @SerializedName("displayText")
    @Expose
    public String displayText;


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
