// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CertificateBasedAuthConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Certificate Based Auth Configuration Request.
 */
public interface ICertificateBasedAuthConfigurationRequest extends IHttpRequest {

    /**
     * Gets the CertificateBasedAuthConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super CertificateBasedAuthConfiguration> callback);

    /**
     * Gets the CertificateBasedAuthConfiguration from the service
     *
     * @return the CertificateBasedAuthConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CertificateBasedAuthConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super CertificateBasedAuthConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this CertificateBasedAuthConfiguration with a source
     *
     * @param sourceCertificateBasedAuthConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final CertificateBasedAuthConfiguration sourceCertificateBasedAuthConfiguration, final ICallback<? super CertificateBasedAuthConfiguration> callback);

    /**
     * Patches this CertificateBasedAuthConfiguration with a source
     *
     * @param sourceCertificateBasedAuthConfiguration the source object with updates
     * @return the updated CertificateBasedAuthConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CertificateBasedAuthConfiguration patch(final CertificateBasedAuthConfiguration sourceCertificateBasedAuthConfiguration) throws ClientException;

    /**
     * Posts a CertificateBasedAuthConfiguration with a new object
     *
     * @param newCertificateBasedAuthConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final CertificateBasedAuthConfiguration newCertificateBasedAuthConfiguration, final ICallback<? super CertificateBasedAuthConfiguration> callback);

    /**
     * Posts a CertificateBasedAuthConfiguration with a new object
     *
     * @param newCertificateBasedAuthConfiguration the new object to create
     * @return the created CertificateBasedAuthConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CertificateBasedAuthConfiguration post(final CertificateBasedAuthConfiguration newCertificateBasedAuthConfiguration) throws ClientException;

    /**
     * Posts a CertificateBasedAuthConfiguration with a new object
     *
     * @param newCertificateBasedAuthConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final CertificateBasedAuthConfiguration newCertificateBasedAuthConfiguration, final ICallback<? super CertificateBasedAuthConfiguration> callback);

    /**
     * Posts a CertificateBasedAuthConfiguration with a new object
     *
     * @param newCertificateBasedAuthConfiguration the object to create/update
     * @return the created CertificateBasedAuthConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CertificateBasedAuthConfiguration put(final CertificateBasedAuthConfiguration newCertificateBasedAuthConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICertificateBasedAuthConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICertificateBasedAuthConfigurationRequest expand(final String value);

}

