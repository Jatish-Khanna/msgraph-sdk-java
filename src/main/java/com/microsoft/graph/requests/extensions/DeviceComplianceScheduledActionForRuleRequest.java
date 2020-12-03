// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceActionItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Scheduled Action For Rule Request.
 */
public class DeviceComplianceScheduledActionForRuleRequest extends BaseRequest<DeviceComplianceScheduledActionForRule> {
	
    /**
     * The request for the DeviceComplianceScheduledActionForRule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceScheduledActionForRuleRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceScheduledActionForRule.class);
    }

    /**
     * Gets the DeviceComplianceScheduledActionForRule from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super DeviceComplianceScheduledActionForRule> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceComplianceScheduledActionForRule from the service
     *
     * @return the DeviceComplianceScheduledActionForRule from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceScheduledActionForRule get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super DeviceComplianceScheduledActionForRule> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceComplianceScheduledActionForRule with a source
     *
     * @param sourceDeviceComplianceScheduledActionForRule the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final DeviceComplianceScheduledActionForRule sourceDeviceComplianceScheduledActionForRule, @Nonnull final ICallback<? super DeviceComplianceScheduledActionForRule> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceComplianceScheduledActionForRule);
    }

    /**
     * Patches this DeviceComplianceScheduledActionForRule with a source
     *
     * @param sourceDeviceComplianceScheduledActionForRule the source object with updates
     * @return the updated DeviceComplianceScheduledActionForRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceScheduledActionForRule patch(@Nonnull final DeviceComplianceScheduledActionForRule sourceDeviceComplianceScheduledActionForRule) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceComplianceScheduledActionForRule);
    }

    /**
     * Creates a DeviceComplianceScheduledActionForRule with a new object
     *
     * @param newDeviceComplianceScheduledActionForRule the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule, @Nonnull final ICallback<? super DeviceComplianceScheduledActionForRule> callback) {
        send(HttpMethod.POST, callback, newDeviceComplianceScheduledActionForRule);
    }

    /**
     * Creates a DeviceComplianceScheduledActionForRule with a new object
     *
     * @param newDeviceComplianceScheduledActionForRule the new object to create
     * @return the created DeviceComplianceScheduledActionForRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceScheduledActionForRule post(@Nonnull final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule) throws ClientException {
        return send(HttpMethod.POST, newDeviceComplianceScheduledActionForRule);
    }

    /**
     * Creates a DeviceComplianceScheduledActionForRule with a new object
     *
     * @param newDeviceComplianceScheduledActionForRule the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule, @Nonnull final ICallback<? super DeviceComplianceScheduledActionForRule> callback) {
        send(HttpMethod.PUT, callback, newDeviceComplianceScheduledActionForRule);
    }

    /**
     * Creates a DeviceComplianceScheduledActionForRule with a new object
     *
     * @param newDeviceComplianceScheduledActionForRule the object to create/update
     * @return the created DeviceComplianceScheduledActionForRule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceComplianceScheduledActionForRule put(@Nonnull final DeviceComplianceScheduledActionForRule newDeviceComplianceScheduledActionForRule) throws ClientException {
        return send(HttpMethod.PUT, newDeviceComplianceScheduledActionForRule);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceComplianceScheduledActionForRuleRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public DeviceComplianceScheduledActionForRuleRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

