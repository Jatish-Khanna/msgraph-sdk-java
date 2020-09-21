// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DirectoryObject;
import com.microsoft.graph.models.extensions.ScopedRoleMembership;
import com.microsoft.graph.models.extensions.Extension;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionResponse;
import com.microsoft.graph.requests.extensions.DirectoryObjectCollectionPage;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionResponse;
import com.microsoft.graph.requests.extensions.ScopedRoleMembershipCollectionPage;
import com.microsoft.graph.requests.extensions.ExtensionCollectionResponse;
import com.microsoft.graph.requests.extensions.ExtensionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Administrative Unit.
 */
public class AdministrativeUnit extends DirectoryObject implements IJsonBackedObject {


    /**
     * The Description.
     * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
     * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Visibility.
     * 
     */
    @SerializedName("visibility")
    @Expose
    public String visibility;

    /**
     * The Members.
     * 
     */
    public DirectoryObjectCollectionPage members;

    /**
     * The Scoped Role Members.
     * 
     */
    @SerializedName("scopedRoleMembers")
    @Expose
    public ScopedRoleMembershipCollectionPage scopedRoleMembers;

    /**
     * The Extensions.
     * 
     */
    @SerializedName("extensions")
    @Expose
    public ExtensionCollectionPage extensions;


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


        if (json.has("members")) {
            final DirectoryObjectCollectionResponse response = new DirectoryObjectCollectionResponse();
            if (json.has("members@odata.nextLink")) {
                response.nextLink = json.get("members@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("members").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            members = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("scopedRoleMembers")) {
            final ScopedRoleMembershipCollectionResponse response = new ScopedRoleMembershipCollectionResponse();
            if (json.has("scopedRoleMembers@odata.nextLink")) {
                response.nextLink = json.get("scopedRoleMembers@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("scopedRoleMembers").toString(), JsonObject[].class);
            final ScopedRoleMembership[] array = new ScopedRoleMembership[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ScopedRoleMembership.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            scopedRoleMembers = new ScopedRoleMembershipCollectionPage(response, null);
        }

        if (json.has("extensions")) {
            final ExtensionCollectionResponse response = new ExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }
    }
}
