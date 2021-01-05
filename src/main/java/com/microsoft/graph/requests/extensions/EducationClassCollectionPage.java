// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.EducationClassCollectionPage;
import com.microsoft.graph.requests.extensions.EducationClassCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class Collection Page.
 */
public class EducationClassCollectionPage extends BaseCollectionPage<EducationClass, IEducationClassCollectionRequestBuilder> implements IEducationClassCollectionPage {

    /**
     * A collection page for EducationClass
     *
     * @param response the serialized EducationClassCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationClassCollectionPage(final EducationClassCollectionResponse response, final IEducationClassCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
