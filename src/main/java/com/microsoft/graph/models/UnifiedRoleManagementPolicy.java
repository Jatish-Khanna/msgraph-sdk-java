// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.Identity;
import com.microsoft.graph.models.UnifiedRoleManagementPolicyRule;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.UnifiedRoleManagementPolicyRuleCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Management Policy.
 */
public class UnifiedRoleManagementPolicy extends Entity implements IJsonBackedObject {


    /**
     * The Description.
     * Description for the policy.
     */
    @SerializedName(value = "description", alternate = {"Description"})
    @Expose
	@Nullable
    public String description;

    /**
     * The Display Name.
     * Display name for the policy.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Is Organization Default.
     * This can only be set to true for a single tenant wide policy which will apply to all scopes and roles. Set the scopeId to '/' and scopeType to Directory.
     */
    @SerializedName(value = "isOrganizationDefault", alternate = {"IsOrganizationDefault"})
    @Expose
	@Nullable
    public Boolean isOrganizationDefault;

    /**
     * The Last Modified By.
     * The identity who last modified the role setting.
     */
    @SerializedName(value = "lastModifiedBy", alternate = {"LastModifiedBy"})
    @Expose
	@Nullable
    public Identity lastModifiedBy;

    /**
     * The Last Modified Date Time.
     * The time when the role setting was last modified.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Scope Id.
     * The id of the scope where the policy is created. Can be / for the tenant or a group ID. Required.
     */
    @SerializedName(value = "scopeId", alternate = {"ScopeId"})
    @Expose
	@Nullable
    public String scopeId;

    /**
     * The Scope Type.
     * The type of the scope where the policy is created. One of Directory, DirectoryRole. Required.
     */
    @SerializedName(value = "scopeType", alternate = {"ScopeType"})
    @Expose
	@Nullable
    public String scopeType;

    /**
     * The Effective Rules.
     * Not implemented. The list of effective rules like approval rules and expiration rules evaluated based on inherited referenced rules. For example, if there is a tenant-wide policy to enforce enabling an approval rule, the effective rule will be to enable approval even if the policy has a rule to disable approval.
     */
    @SerializedName(value = "effectiveRules", alternate = {"EffectiveRules"})
    @Expose
	@Nullable
    public UnifiedRoleManagementPolicyRuleCollectionPage effectiveRules;

    /**
     * The Rules.
     * The collection of rules like approval rules and expiration rules.
     */
    @SerializedName(value = "rules", alternate = {"Rules"})
    @Expose
	@Nullable
    public UnifiedRoleManagementPolicyRuleCollectionPage rules;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("effectiveRules")) {
            effectiveRules = serializer.deserializeObject(json.get("effectiveRules"), UnifiedRoleManagementPolicyRuleCollectionPage.class);
        }

        if (json.has("rules")) {
            rules = serializer.deserializeObject(json.get("rules"), UnifiedRoleManagementPolicyRuleCollectionPage.class);
        }
    }
}