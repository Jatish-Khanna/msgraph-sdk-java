// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFilterCriteria;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Parameter Set.
 */
public class WorkbookFilterApplyParameterSet {
    /**
     * The criteria.
     * 
     */
    @SerializedName(value = "criteria", alternate = {"Criteria"})
    @Expose
	@Nullable
    public WorkbookFilterCriteria criteria;


    /**
     * Instiaciates a new WorkbookFilterApplyParameterSet
     */
    public WorkbookFilterApplyParameterSet() {}
    /**
     * Instiaciates a new WorkbookFilterApplyParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFilterApplyParameterSet(@Nonnull final WorkbookFilterApplyParameterSetBuilder builder) {
        this.criteria = builder.criteria;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFilterApplyParameterSetBuilder newBuilder() {
        return new WorkbookFilterApplyParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFilterApplyParameterSet
     */
    public static final class WorkbookFilterApplyParameterSetBuilder {
        /**
         * The criteria parameter value
         */
        @Nullable
        protected WorkbookFilterCriteria criteria;
        /**
         * Sets the Criteria
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFilterApplyParameterSetBuilder withCriteria(@Nullable final WorkbookFilterCriteria val) {
            this.criteria = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFilterApplyParameterSetBuilder
         */
        @Nullable
        protected WorkbookFilterApplyParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFilterApplyParameterSet build() {
            return new WorkbookFilterApplyParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.criteria != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("criteria", criteria));
        }
        return result;
    }
}
