// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsUpdateForBusinessConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Update For Business Configuration Request.
 */
public class WindowsUpdateForBusinessConfigurationRequest extends BaseRequest implements IWindowsUpdateForBusinessConfigurationRequest {
	
    /**
     * The request for the WindowsUpdateForBusinessConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsUpdateForBusinessConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsUpdateForBusinessConfiguration.class);
    }

    /**
     * Gets the WindowsUpdateForBusinessConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsUpdateForBusinessConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsUpdateForBusinessConfiguration from the service
     *
     * @return the WindowsUpdateForBusinessConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsUpdateForBusinessConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsUpdateForBusinessConfiguration> callback) {
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
     * Patches this WindowsUpdateForBusinessConfiguration with a source
     *
     * @param sourceWindowsUpdateForBusinessConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsUpdateForBusinessConfiguration sourceWindowsUpdateForBusinessConfiguration, final ICallback<WindowsUpdateForBusinessConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsUpdateForBusinessConfiguration);
    }

    /**
     * Patches this WindowsUpdateForBusinessConfiguration with a source
     *
     * @param sourceWindowsUpdateForBusinessConfiguration the source object with updates
     * @return the updated WindowsUpdateForBusinessConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsUpdateForBusinessConfiguration patch(final WindowsUpdateForBusinessConfiguration sourceWindowsUpdateForBusinessConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsUpdateForBusinessConfiguration);
    }

    /**
     * Creates a WindowsUpdateForBusinessConfiguration with a new object
     *
     * @param newWindowsUpdateForBusinessConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsUpdateForBusinessConfiguration newWindowsUpdateForBusinessConfiguration, final ICallback<WindowsUpdateForBusinessConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindowsUpdateForBusinessConfiguration);
    }

    /**
     * Creates a WindowsUpdateForBusinessConfiguration with a new object
     *
     * @param newWindowsUpdateForBusinessConfiguration the new object to create
     * @return the created WindowsUpdateForBusinessConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsUpdateForBusinessConfiguration post(final WindowsUpdateForBusinessConfiguration newWindowsUpdateForBusinessConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindowsUpdateForBusinessConfiguration);
    }

    /**
     * Creates a WindowsUpdateForBusinessConfiguration with a new object
     *
     * @param newWindowsUpdateForBusinessConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsUpdateForBusinessConfiguration newWindowsUpdateForBusinessConfiguration, final ICallback<WindowsUpdateForBusinessConfiguration> callback) {
        send(HttpMethod.PUT, callback, newWindowsUpdateForBusinessConfiguration);
    }

    /**
     * Creates a WindowsUpdateForBusinessConfiguration with a new object
     *
     * @param newWindowsUpdateForBusinessConfiguration the object to create/update
     * @return the created WindowsUpdateForBusinessConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsUpdateForBusinessConfiguration put(final WindowsUpdateForBusinessConfiguration newWindowsUpdateForBusinessConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindowsUpdateForBusinessConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsUpdateForBusinessConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsUpdateForBusinessConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsUpdateForBusinessConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsUpdateForBusinessConfigurationRequest)this;
     }

}

