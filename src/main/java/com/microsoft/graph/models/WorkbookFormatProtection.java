// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Format Protection.
 */
public class WorkbookFormatProtection extends Entity implements IJsonBackedObject {


    /**
     * The Formula Hidden.
     * Indicates if Excel hides the formula for the cells in the range. A null value indicates that the entire range doesn't have uniform formula hidden setting.
     */
    @SerializedName(value = "formulaHidden", alternate = {"FormulaHidden"})
    @Expose
	@Nullable
    public Boolean formulaHidden;

    /**
     * The Locked.
     * Indicates if Excel locks the cells in the object. A null value indicates that the entire range doesn't have uniform lock setting.
     */
    @SerializedName(value = "locked", alternate = {"Locked"})
    @Expose
	@Nullable
    public Boolean locked;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
