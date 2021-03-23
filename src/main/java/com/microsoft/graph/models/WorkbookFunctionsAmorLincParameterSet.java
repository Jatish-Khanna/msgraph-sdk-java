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
 * The class for the Workbook Functions Amor Linc Parameter Set.
 */
public class WorkbookFunctionsAmorLincParameterSet {
    /**
     * The cost.
     * 
     */
    @SerializedName(value = "cost", alternate = {"Cost"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement cost;

    /**
     * The date Purchased.
     * 
     */
    @SerializedName(value = "datePurchased", alternate = {"DatePurchased"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement datePurchased;

    /**
     * The first Period.
     * 
     */
    @SerializedName(value = "firstPeriod", alternate = {"FirstPeriod"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement firstPeriod;

    /**
     * The salvage.
     * 
     */
    @SerializedName(value = "salvage", alternate = {"Salvage"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement salvage;

    /**
     * The period.
     * 
     */
    @SerializedName(value = "period", alternate = {"Period"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement period;

    /**
     * The rate.
     * 
     */
    @SerializedName(value = "rate", alternate = {"Rate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement rate;

    /**
     * The basis.
     * 
     */
    @SerializedName(value = "basis", alternate = {"Basis"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement basis;


    /**
     * Instiaciates a new WorkbookFunctionsAmorLincParameterSet
     */
    public WorkbookFunctionsAmorLincParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsAmorLincParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsAmorLincParameterSet(@Nonnull final WorkbookFunctionsAmorLincParameterSetBuilder builder) {
        this.cost = builder.cost;
        this.datePurchased = builder.datePurchased;
        this.firstPeriod = builder.firstPeriod;
        this.salvage = builder.salvage;
        this.period = builder.period;
        this.rate = builder.rate;
        this.basis = builder.basis;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsAmorLincParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsAmorLincParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsAmorLincParameterSet
     */
    public static final class WorkbookFunctionsAmorLincParameterSetBuilder {
        /**
         * The cost parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement cost;
        /**
         * Sets the Cost
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAmorLincParameterSetBuilder withCost(@Nullable final com.google.gson.JsonElement val) {
            this.cost = val;
            return this;
        }
        /**
         * The datePurchased parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement datePurchased;
        /**
         * Sets the DatePurchased
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAmorLincParameterSetBuilder withDatePurchased(@Nullable final com.google.gson.JsonElement val) {
            this.datePurchased = val;
            return this;
        }
        /**
         * The firstPeriod parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement firstPeriod;
        /**
         * Sets the FirstPeriod
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAmorLincParameterSetBuilder withFirstPeriod(@Nullable final com.google.gson.JsonElement val) {
            this.firstPeriod = val;
            return this;
        }
        /**
         * The salvage parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement salvage;
        /**
         * Sets the Salvage
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAmorLincParameterSetBuilder withSalvage(@Nullable final com.google.gson.JsonElement val) {
            this.salvage = val;
            return this;
        }
        /**
         * The period parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement period;
        /**
         * Sets the Period
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAmorLincParameterSetBuilder withPeriod(@Nullable final com.google.gson.JsonElement val) {
            this.period = val;
            return this;
        }
        /**
         * The rate parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement rate;
        /**
         * Sets the Rate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAmorLincParameterSetBuilder withRate(@Nullable final com.google.gson.JsonElement val) {
            this.rate = val;
            return this;
        }
        /**
         * The basis parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement basis;
        /**
         * Sets the Basis
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsAmorLincParameterSetBuilder withBasis(@Nullable final com.google.gson.JsonElement val) {
            this.basis = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsAmorLincParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsAmorLincParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsAmorLincParameterSet build() {
            return new WorkbookFunctionsAmorLincParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.cost != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("cost", cost));
        }
        if(this.datePurchased != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("datePurchased", datePurchased));
        }
        if(this.firstPeriod != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("firstPeriod", firstPeriod));
        }
        if(this.salvage != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("salvage", salvage));
        }
        if(this.period != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("period", period));
        }
        if(this.rate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("rate", rate));
        }
        if(this.basis != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("basis", basis));
        }
        return result;
    }
}
