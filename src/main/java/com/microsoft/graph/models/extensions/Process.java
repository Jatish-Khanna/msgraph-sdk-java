// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.FileHash;
import com.microsoft.graph.models.generated.ProcessIntegrityLevel;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Process.
 */
public class Process implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Account Name.
     * User account identifier (user account context the process ran under) for example, AccountName, SID, and so on.
     */
    @SerializedName(value = "accountName", alternate = {"AccountName"})
    @Expose
    public String accountName;

    /**
     * The Command Line.
     * The full process invocation commandline including all parameters.
     */
    @SerializedName(value = "commandLine", alternate = {"CommandLine"})
    @Expose
    public String commandLine;

    /**
     * The Created Date Time.
     * Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The File Hash.
     * Complex type containing file hashes (cryptographic and location-sensitive).
     */
    @SerializedName(value = "fileHash", alternate = {"FileHash"})
    @Expose
    public FileHash fileHash;

    /**
     * The Integrity Level.
     * The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system.
     */
    @SerializedName(value = "integrityLevel", alternate = {"IntegrityLevel"})
    @Expose
    public ProcessIntegrityLevel integrityLevel;

    /**
     * The Is Elevated.
     * True if the process is elevated.
     */
    @SerializedName(value = "isElevated", alternate = {"IsElevated"})
    @Expose
    public Boolean isElevated;

    /**
     * The Name.
     * The name of the process' Image file.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
    public String name;

    /**
     * The Parent Process Created Date Time.
     * DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'.
     */
    @SerializedName(value = "parentProcessCreatedDateTime", alternate = {"ParentProcessCreatedDateTime"})
    @Expose
    public java.util.Calendar parentProcessCreatedDateTime;

    /**
     * The Parent Process Id.
     * The Process ID (PID) of the parent process.
     */
    @SerializedName(value = "parentProcessId", alternate = {"ParentProcessId"})
    @Expose
    public Integer parentProcessId;

    /**
     * The Parent Process Name.
     * The name of the image file of the parent process.
     */
    @SerializedName(value = "parentProcessName", alternate = {"ParentProcessName"})
    @Expose
    public String parentProcessName;

    /**
     * The Path.
     * Full path, including filename.
     */
    @SerializedName(value = "path", alternate = {"Path"})
    @Expose
    public String path;

    /**
     * The Process Id.
     * The Process ID (PID) of the process.
     */
    @SerializedName(value = "processId", alternate = {"ProcessId"})
    @Expose
    public Integer processId;


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
