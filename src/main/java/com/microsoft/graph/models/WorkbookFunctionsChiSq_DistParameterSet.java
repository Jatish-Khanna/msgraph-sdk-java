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
 * The class for the Workbook Functions Chi Sq_Dist Parameter Set.
 */
public class WorkbookFunctionsChiSq_DistParameterSet {
    /**
     * The x.
     * 
     */
    @SerializedName(value = "x", alternate = {"X"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement x;

    /**
     * The deg Freedom.
     * 
     */
    @SerializedName(value = "degFreedom", alternate = {"DegFreedom"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement degFreedom;

    /**
     * The cumulative.
     * 
     */
    @SerializedName(value = "cumulative", alternate = {"Cumulative"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement cumulative;


    /**
     * Instiaciates a new WorkbookFunctionsChiSq_DistParameterSet
     */
    public WorkbookFunctionsChiSq_DistParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsChiSq_DistParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsChiSq_DistParameterSet(@Nonnull final WorkbookFunctionsChiSq_DistParameterSetBuilder builder) {
        this.x = builder.x;
        this.degFreedom = builder.degFreedom;
        this.cumulative = builder.cumulative;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsChiSq_DistParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsChiSq_DistParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsChiSq_DistParameterSet
     */
    public static final class WorkbookFunctionsChiSq_DistParameterSetBuilder {
        /**
         * The x parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement x;
        /**
         * Sets the X
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsChiSq_DistParameterSetBuilder withX(@Nullable final com.google.gson.JsonElement val) {
            this.x = val;
            return this;
        }
        /**
         * The degFreedom parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement degFreedom;
        /**
         * Sets the DegFreedom
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsChiSq_DistParameterSetBuilder withDegFreedom(@Nullable final com.google.gson.JsonElement val) {
            this.degFreedom = val;
            return this;
        }
        /**
         * The cumulative parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement cumulative;
        /**
         * Sets the Cumulative
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsChiSq_DistParameterSetBuilder withCumulative(@Nullable final com.google.gson.JsonElement val) {
            this.cumulative = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsChiSq_DistParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsChiSq_DistParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsChiSq_DistParameterSet build() {
            return new WorkbookFunctionsChiSq_DistParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.x != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("x", x));
        }
        if(this.degFreedom != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("degFreedom", degFreedom));
        }
        if(this.cumulative != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("cumulative", cumulative));
        }
        return result;
    }
}
