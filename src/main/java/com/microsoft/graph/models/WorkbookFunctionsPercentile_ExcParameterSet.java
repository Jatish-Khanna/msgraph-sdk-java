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
 * The class for the Workbook Functions Percentile_Exc Parameter Set.
 */
public class WorkbookFunctionsPercentile_ExcParameterSet {
    /**
     * The array.
     * 
     */
    @SerializedName(value = "array", alternate = {"Array"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement array;

    /**
     * The k.
     * 
     */
    @SerializedName(value = "k", alternate = {"K"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement k;


    /**
     * Instiaciates a new WorkbookFunctionsPercentile_ExcParameterSet
     */
    public WorkbookFunctionsPercentile_ExcParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsPercentile_ExcParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsPercentile_ExcParameterSet(@Nonnull final WorkbookFunctionsPercentile_ExcParameterSetBuilder builder) {
        this.array = builder.array;
        this.k = builder.k;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsPercentile_ExcParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsPercentile_ExcParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsPercentile_ExcParameterSet
     */
    public static final class WorkbookFunctionsPercentile_ExcParameterSetBuilder {
        /**
         * The array parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement array;
        /**
         * Sets the Array
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPercentile_ExcParameterSetBuilder withArray(@Nullable final com.google.gson.JsonElement val) {
            this.array = val;
            return this;
        }
        /**
         * The k parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement k;
        /**
         * Sets the K
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPercentile_ExcParameterSetBuilder withK(@Nullable final com.google.gson.JsonElement val) {
            this.k = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsPercentile_ExcParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsPercentile_ExcParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsPercentile_ExcParameterSet build() {
            return new WorkbookFunctionsPercentile_ExcParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.array != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("array", array));
        }
        if(this.k != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("k", k));
        }
        return result;
    }
}
