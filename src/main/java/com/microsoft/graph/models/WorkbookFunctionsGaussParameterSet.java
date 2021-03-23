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
 * The class for the Workbook Functions Gauss Parameter Set.
 */
public class WorkbookFunctionsGaussParameterSet {
    /**
     * The x.
     * 
     */
    @SerializedName(value = "x", alternate = {"X"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement x;


    /**
     * Instiaciates a new WorkbookFunctionsGaussParameterSet
     */
    public WorkbookFunctionsGaussParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsGaussParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsGaussParameterSet(@Nonnull final WorkbookFunctionsGaussParameterSetBuilder builder) {
        this.x = builder.x;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsGaussParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsGaussParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsGaussParameterSet
     */
    public static final class WorkbookFunctionsGaussParameterSetBuilder {
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
        public WorkbookFunctionsGaussParameterSetBuilder withX(@Nullable final com.google.gson.JsonElement val) {
            this.x = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsGaussParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsGaussParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsGaussParameterSet build() {
            return new WorkbookFunctionsGaussParameterSet(this);
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
        return result;
    }
}
