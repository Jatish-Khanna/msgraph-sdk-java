// Template Source: Templates\Java\models_extensions\BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.WorkbookRangeBorder;
import com.microsoft.graph.models.extensions.WorkbookRangeFill;
import com.microsoft.graph.models.extensions.WorkbookRangeFont;
import com.microsoft.graph.models.extensions.WorkbookFormatProtection;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Format.
 */
public class WorkbookRangeFormat extends Entity implements IJsonBackedObject {


    /**
     * The Column Width.
     * Gets or sets the width of all colums within the range. If the column widths are not uniform, null will be returned.
     */
    @SerializedName(value = "columnWidth", alternate = {"ColumnWidth"})
    @Expose
	@Nullable
    public Double columnWidth;

    /**
     * The Horizontal Alignment.
     * Represents the horizontal alignment for the specified object. The possible values are: General, Left, Center, Right, Fill, Justify, CenterAcrossSelection, Distributed.
     */
    @SerializedName(value = "horizontalAlignment", alternate = {"HorizontalAlignment"})
    @Expose
	@Nullable
    public String horizontalAlignment;

    /**
     * The Row Height.
     * Gets or sets the height of all rows in the range. If the row heights are not uniform null will be returned.
     */
    @SerializedName(value = "rowHeight", alternate = {"RowHeight"})
    @Expose
	@Nullable
    public Double rowHeight;

    /**
     * The Vertical Alignment.
     * Represents the vertical alignment for the specified object. The possible values are: Top, Center, Bottom, Justify, Distributed.
     */
    @SerializedName(value = "verticalAlignment", alternate = {"VerticalAlignment"})
    @Expose
	@Nullable
    public String verticalAlignment;

    /**
     * The Wrap Text.
     * Indicates if Excel wraps the text in the object. A null value indicates that the entire range doesn't have uniform wrap setting
     */
    @SerializedName(value = "wrapText", alternate = {"WrapText"})
    @Expose
	@Nullable
    public Boolean wrapText;

    /**
     * The Borders.
     * Collection of border objects that apply to the overall range selected Read-only.
     */
    @SerializedName(value = "borders", alternate = {"Borders"})
    @Expose
	@Nullable
    public WorkbookRangeBorderCollectionPage borders;

    /**
     * The Fill.
     * Returns the fill object defined on the overall range. Read-only.
     */
    @SerializedName(value = "fill", alternate = {"Fill"})
    @Expose
	@Nullable
    public WorkbookRangeFill fill;

    /**
     * The Font.
     * Returns the font object defined on the overall range selected Read-only.
     */
    @SerializedName(value = "font", alternate = {"Font"})
    @Expose
	@Nullable
    public WorkbookRangeFont font;

    /**
     * The Protection.
     * Returns the format protection object for a range. Read-only.
     */
    @SerializedName(value = "protection", alternate = {"Protection"})
    @Expose
	@Nullable
    public WorkbookFormatProtection protection;


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


        if (json.has("borders")) {
            borders = serializer.deserializeObject(json.get("borders").toString(), WorkbookRangeBorderCollectionPage.class);
        }
    }
}
