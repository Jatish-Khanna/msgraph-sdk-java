// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Days Parameter Set.
 */
public class WorkbookFunctionsDaysParameterSet {
    /**
     * The end Date.
     * 
     */
    @SerializedName(value = "endDate", alternate = {"EndDate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement endDate;

    /**
     * The start Date.
     * 
     */
    @SerializedName(value = "startDate", alternate = {"StartDate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement startDate;


    /**
     * Instiaciates a new WorkbookFunctionsDaysParameterSet
     */
    public WorkbookFunctionsDaysParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsDaysParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsDaysParameterSet(@Nonnull final WorkbookFunctionsDaysParameterSetBuilder builder) {
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsDaysParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsDaysParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsDaysParameterSet
     */
    public static final class WorkbookFunctionsDaysParameterSetBuilder {
        /**
         * The endDate parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement endDate;
        /**
         * Sets the EndDate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDaysParameterSetBuilder withEndDate(@Nullable final com.google.gson.JsonElement val) {
            this.endDate = val;
            return this;
        }
        /**
         * The startDate parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement startDate;
        /**
         * Sets the StartDate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsDaysParameterSetBuilder withStartDate(@Nullable final com.google.gson.JsonElement val) {
            this.startDate = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsDaysParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsDaysParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsDaysParameterSet build() {
            return new WorkbookFunctionsDaysParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.endDate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("endDate", endDate));
        }
        if(this.startDate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startDate", startDate));
        }
        return result;
    }
}
