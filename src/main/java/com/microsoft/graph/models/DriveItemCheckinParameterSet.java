// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Checkin Parameter Set.
 */
public class DriveItemCheckinParameterSet {
    /**
     * The check In As.
     * 
     */
    @SerializedName(value = "checkInAs", alternate = {"CheckInAs"})
    @Expose
	@Nullable
    public String checkInAs;

    /**
     * The comment.
     * 
     */
    @SerializedName(value = "comment", alternate = {"Comment"})
    @Expose
	@Nullable
    public String comment;


    /**
     * Instiaciates a new DriveItemCheckinParameterSet
     */
    public DriveItemCheckinParameterSet() {}
    /**
     * Instiaciates a new DriveItemCheckinParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DriveItemCheckinParameterSet(@Nonnull final DriveItemCheckinParameterSetBuilder builder) {
        this.checkInAs = builder.checkInAs;
        this.comment = builder.comment;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DriveItemCheckinParameterSetBuilder newBuilder() {
        return new DriveItemCheckinParameterSetBuilder();
    }
    /**
     * Fluent builder for the DriveItemCheckinParameterSet
     */
    public static final class DriveItemCheckinParameterSetBuilder {
        /**
         * The checkInAs parameter value
         */
        @Nullable
        protected String checkInAs;
        /**
         * Sets the CheckInAs
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemCheckinParameterSetBuilder withCheckInAs(@Nullable final String val) {
            this.checkInAs = val;
            return this;
        }
        /**
         * The comment parameter value
         */
        @Nullable
        protected String comment;
        /**
         * Sets the Comment
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemCheckinParameterSetBuilder withComment(@Nullable final String val) {
            this.comment = val;
            return this;
        }
        /**
         * Instanciates a new DriveItemCheckinParameterSetBuilder
         */
        @Nullable
        protected DriveItemCheckinParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DriveItemCheckinParameterSet build() {
            return new DriveItemCheckinParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.checkInAs != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("checkInAs", checkInAs));
        }
        if(this.comment != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("comment", comment));
        }
        return result;
    }
}