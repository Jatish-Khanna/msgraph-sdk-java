// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RemoteAssistancePartner;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionPage;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Remote Assistance Partner Collection Page.
 */
public class RemoteAssistancePartnerCollectionPage extends BaseCollectionPage<RemoteAssistancePartner, IRemoteAssistancePartnerCollectionRequestBuilder> implements IRemoteAssistancePartnerCollectionPage {

    /**
     * A collection page for RemoteAssistancePartner
     *
     * @param response the serialized RemoteAssistancePartnerCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RemoteAssistancePartnerCollectionPage(final RemoteAssistancePartnerCollectionResponse response, final IRemoteAssistancePartnerCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
