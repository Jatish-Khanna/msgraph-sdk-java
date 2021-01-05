// Template Source: IBaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfiguration;
import com.microsoft.graph.models.extensions.ManagedDeviceMobileAppConfigurationDeviceStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Mobile App Configuration Device Status Collection Request Builder.
 */
public interface IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder byId(final String id);

}
