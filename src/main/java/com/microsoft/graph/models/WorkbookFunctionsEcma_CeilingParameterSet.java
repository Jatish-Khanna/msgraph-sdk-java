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
 * The class for the Workbook Functions Ecma_Ceiling Parameter Set.
 */
public class WorkbookFunctionsEcma_CeilingParameterSet {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The significance.
     * 
     */
    @SerializedName(value = "significance", alternate = {"Significance"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement significance;


    /**
     * Instiaciates a new WorkbookFunctionsEcma_CeilingParameterSet
     */
    public WorkbookFunctionsEcma_CeilingParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsEcma_CeilingParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsEcma_CeilingParameterSet(@Nonnull final WorkbookFunctionsEcma_CeilingParameterSetBuilder builder) {
        this.number = builder.number;
        this.significance = builder.significance;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsEcma_CeilingParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsEcma_CeilingParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsEcma_CeilingParameterSet
     */
    public static final class WorkbookFunctionsEcma_CeilingParameterSetBuilder {
        /**
         * The number parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement number;
        /**
         * Sets the Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsEcma_CeilingParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        /**
         * The significance parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement significance;
        /**
         * Sets the Significance
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsEcma_CeilingParameterSetBuilder withSignificance(@Nullable final com.google.gson.JsonElement val) {
            this.significance = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsEcma_CeilingParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsEcma_CeilingParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsEcma_CeilingParameterSet build() {
            return new WorkbookFunctionsEcma_CeilingParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.number != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number", number));
        }
        if(this.significance != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("significance", significance));
        }
        return result;
    }
}
