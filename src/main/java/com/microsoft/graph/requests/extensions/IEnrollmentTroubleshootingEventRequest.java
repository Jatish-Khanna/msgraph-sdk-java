// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EnrollmentTroubleshootingEvent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Enrollment Troubleshooting Event Request.
 */
public interface IEnrollmentTroubleshootingEventRequest extends IHttpRequest {

    /**
     * Gets the EnrollmentTroubleshootingEvent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EnrollmentTroubleshootingEvent> callback);

    /**
     * Gets the EnrollmentTroubleshootingEvent from the service
     *
     * @return the EnrollmentTroubleshootingEvent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EnrollmentTroubleshootingEvent get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EnrollmentTroubleshootingEvent> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EnrollmentTroubleshootingEvent with a source
     *
     * @param sourceEnrollmentTroubleshootingEvent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EnrollmentTroubleshootingEvent sourceEnrollmentTroubleshootingEvent, final ICallback<? super EnrollmentTroubleshootingEvent> callback);

    /**
     * Patches this EnrollmentTroubleshootingEvent with a source
     *
     * @param sourceEnrollmentTroubleshootingEvent the source object with updates
     * @return the updated EnrollmentTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EnrollmentTroubleshootingEvent patch(final EnrollmentTroubleshootingEvent sourceEnrollmentTroubleshootingEvent) throws ClientException;

    /**
     * Posts a EnrollmentTroubleshootingEvent with a new object
     *
     * @param newEnrollmentTroubleshootingEvent the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EnrollmentTroubleshootingEvent newEnrollmentTroubleshootingEvent, final ICallback<? super EnrollmentTroubleshootingEvent> callback);

    /**
     * Posts a EnrollmentTroubleshootingEvent with a new object
     *
     * @param newEnrollmentTroubleshootingEvent the new object to create
     * @return the created EnrollmentTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EnrollmentTroubleshootingEvent post(final EnrollmentTroubleshootingEvent newEnrollmentTroubleshootingEvent) throws ClientException;

    /**
     * Posts a EnrollmentTroubleshootingEvent with a new object
     *
     * @param newEnrollmentTroubleshootingEvent the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EnrollmentTroubleshootingEvent newEnrollmentTroubleshootingEvent, final ICallback<? super EnrollmentTroubleshootingEvent> callback);

    /**
     * Posts a EnrollmentTroubleshootingEvent with a new object
     *
     * @param newEnrollmentTroubleshootingEvent the object to create/update
     * @return the created EnrollmentTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EnrollmentTroubleshootingEvent put(final EnrollmentTroubleshootingEvent newEnrollmentTroubleshootingEvent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEnrollmentTroubleshootingEventRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEnrollmentTroubleshootingEventRequest expand(final String value);

}

