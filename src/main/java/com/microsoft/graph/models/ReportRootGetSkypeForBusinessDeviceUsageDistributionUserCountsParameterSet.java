// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.Report;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Device Usage Distribution User Counts Parameter Set.
 */
public class ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet {
    /**
     * The period.
     * 
     */
    @SerializedName(value = "period", alternate = {"Period"})
    @Expose
	@Nullable
    public String period;


    /**
     * Instiaciates a new ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet
     */
    public ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet() {}
    /**
     * Instiaciates a new ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet(@Nonnull final ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSetBuilder builder) {
        this.period = builder.period;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSetBuilder newBuilder() {
        return new ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSetBuilder();
    }
    /**
     * Fluent builder for the ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet
     */
    public static final class ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSetBuilder {
        /**
         * The period parameter value
         */
        @Nullable
        protected String period;
        /**
         * Sets the Period
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSetBuilder withPeriod(@Nullable final String val) {
            this.period = val;
            return this;
        }
        /**
         * Instanciates a new ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSetBuilder
         */
        @Nullable
        protected ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet build() {
            return new ReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.period != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("period", period));
        }
        return result;
    }
}
