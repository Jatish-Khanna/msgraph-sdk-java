// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.InvitationParticipantInfo;
import com.microsoft.graph.models.InviteParticipantsOperation;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Participant Invite Parameter Set.
 */
public class ParticipantInviteParameterSet {
    /**
     * The participants.
     * 
     */
    @SerializedName(value = "participants", alternate = {"Participants"})
    @Expose
	@Nullable
    public java.util.List<InvitationParticipantInfo> participants;

    /**
     * The client Context.
     * 
     */
    @SerializedName(value = "clientContext", alternate = {"ClientContext"})
    @Expose
	@Nullable
    public String clientContext;


    /**
     * Instiaciates a new ParticipantInviteParameterSet
     */
    public ParticipantInviteParameterSet() {}
    /**
     * Instiaciates a new ParticipantInviteParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ParticipantInviteParameterSet(@Nonnull final ParticipantInviteParameterSetBuilder builder) {
        this.participants = builder.participants;
        this.clientContext = builder.clientContext;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ParticipantInviteParameterSetBuilder newBuilder() {
        return new ParticipantInviteParameterSetBuilder();
    }
    /**
     * Fluent builder for the ParticipantInviteParameterSet
     */
    public static final class ParticipantInviteParameterSetBuilder {
        /**
         * The participants parameter value
         */
        @Nullable
        protected java.util.List<InvitationParticipantInfo> participants;
        /**
         * Sets the Participants
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ParticipantInviteParameterSetBuilder withParticipants(@Nullable final java.util.List<InvitationParticipantInfo> val) {
            this.participants = val;
            return this;
        }
        /**
         * The clientContext parameter value
         */
        @Nullable
        protected String clientContext;
        /**
         * Sets the ClientContext
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ParticipantInviteParameterSetBuilder withClientContext(@Nullable final String val) {
            this.clientContext = val;
            return this;
        }
        /**
         * Instanciates a new ParticipantInviteParameterSetBuilder
         */
        @Nullable
        protected ParticipantInviteParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ParticipantInviteParameterSet build() {
            return new ParticipantInviteParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.participants != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("participants", participants));
        }
        if(this.clientContext != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("clientContext", clientContext));
        }
        return result;
    }
}
