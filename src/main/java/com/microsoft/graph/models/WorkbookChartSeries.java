// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.WorkbookChartSeriesFormat;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.WorkbookChartPointCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Series.
 */
public class WorkbookChartSeries extends Entity implements IJsonBackedObject {


    /**
     * The Name.
     * Represents the name of a series in a chart.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Format.
     * Represents the formatting of a chart series, which includes fill and line formatting. Read-only.
     */
    @SerializedName(value = "format", alternate = {"Format"})
    @Expose
	@Nullable
    public WorkbookChartSeriesFormat format;

    /**
     * The Points.
     * Represents a collection of all points in the series. Read-only.
     */
    @SerializedName(value = "points", alternate = {"Points"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.WorkbookChartPointCollectionPage points;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("points")) {
            points = serializer.deserializeObject(json.get("points"), com.microsoft.graph.requests.WorkbookChartPointCollectionPage.class);
        }
    }
}
