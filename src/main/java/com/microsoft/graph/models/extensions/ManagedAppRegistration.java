// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MobileAppIdentifier;
import com.microsoft.graph.models.generated.ManagedAppFlaggedReason;
import com.microsoft.graph.models.extensions.ManagedAppPolicy;
import com.microsoft.graph.models.extensions.ManagedAppOperation;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.ManagedAppOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagedAppOperationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration.
 */
public class ManagedAppRegistration extends Entity implements IJsonBackedObject {


    /**
     * The App Identifier.
     * The app package Identifier
     */
    @SerializedName("appIdentifier")
    @Expose
    public MobileAppIdentifier appIdentifier;

    /**
     * The Application Version.
     * App version
     */
    @SerializedName("applicationVersion")
    @Expose
    public String applicationVersion;

    /**
     * The Created Date Time.
     * Date and time of creation
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Device Name.
     * Host device name
     */
    @SerializedName("deviceName")
    @Expose
    public String deviceName;

    /**
     * The Device Tag.
     * App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions.
     */
    @SerializedName("deviceTag")
    @Expose
    public String deviceTag;

    /**
     * The Device Type.
     * Host device type
     */
    @SerializedName("deviceType")
    @Expose
    public String deviceType;

    /**
     * The Flagged Reasons.
     * Zero or more reasons an app registration is flagged. E.g. app running on rooted device
     */
    @SerializedName("flaggedReasons")
    @Expose
    public java.util.List<ManagedAppFlaggedReason> flaggedReasons;

    /**
     * The Last Sync Date Time.
     * Date and time of last the app synced with management service.
     */
    @SerializedName("lastSyncDateTime")
    @Expose
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Management Sdk Version.
     * App management SDK version
     */
    @SerializedName("managementSdkVersion")
    @Expose
    public String managementSdkVersion;

    /**
     * The Platform Version.
     * Operating System version
     */
    @SerializedName("platformVersion")
    @Expose
    public String platformVersion;

    /**
     * The User Id.
     * The user Id to who this app registration belongs.
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The Version.
     * Version of the entity.
     */
    @SerializedName("version")
    @Expose
    public String version;

    /**
     * The Applied Policies.
     * Zero or more policys already applied on the registered app when it last synchronized with managment service.
     */
    @SerializedName("appliedPolicies")
    @Expose
    public ManagedAppPolicyCollectionPage appliedPolicies;

    /**
     * The Intended Policies.
     * Zero or more policies admin intended for the app as of now.
     */
    @SerializedName("intendedPolicies")
    @Expose
    public ManagedAppPolicyCollectionPage intendedPolicies;

    /**
     * The Operations.
     * Zero or more long running operations triggered on the app registration.
     */
    @SerializedName("operations")
    @Expose
    public ManagedAppOperationCollectionPage operations;


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


        if (json.has("appliedPolicies")) {
            final ManagedAppPolicyCollectionResponse response = new ManagedAppPolicyCollectionResponse();
            if (json.has("appliedPolicies@odata.nextLink")) {
                response.nextLink = json.get("appliedPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("appliedPolicies").toString(), JsonObject[].class);
            final ManagedAppPolicy[] array = new ManagedAppPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedAppPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            appliedPolicies = new ManagedAppPolicyCollectionPage(response, null);
        }

        if (json.has("intendedPolicies")) {
            final ManagedAppPolicyCollectionResponse response = new ManagedAppPolicyCollectionResponse();
            if (json.has("intendedPolicies@odata.nextLink")) {
                response.nextLink = json.get("intendedPolicies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("intendedPolicies").toString(), JsonObject[].class);
            final ManagedAppPolicy[] array = new ManagedAppPolicy[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedAppPolicy.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            intendedPolicies = new ManagedAppPolicyCollectionPage(response, null);
        }

        if (json.has("operations")) {
            final ManagedAppOperationCollectionResponse response = new ManagedAppOperationCollectionResponse();
            if (json.has("operations@odata.nextLink")) {
                response.nextLink = json.get("operations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("operations").toString(), JsonObject[].class);
            final ManagedAppOperation[] array = new ManagedAppOperation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagedAppOperation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            operations = new ManagedAppOperationCollectionPage(response, null);
        }
    }
}
