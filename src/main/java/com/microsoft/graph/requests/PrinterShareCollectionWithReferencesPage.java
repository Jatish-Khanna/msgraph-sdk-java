// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Printer;
import com.microsoft.graph.models.PrinterShare;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.PrinterShareCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.PrinterShareCollectionWithReferencesPage;
import com.microsoft.graph.requests.PrinterShareCollectionResponse;
import com.microsoft.graph.models.PrinterShare;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Share Collection With References Page.
 */
public class PrinterShareCollectionWithReferencesPage extends BaseCollectionPage<PrinterShare, PrinterShareCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for PrinterShare
     *
     * @param response the serialized PrinterShareCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrinterShareCollectionWithReferencesPage(@Nonnull final PrinterShareCollectionResponse response, @Nullable final PrinterShareCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for PrinterShare
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PrinterShareCollectionWithReferencesPage(@Nonnull final java.util.List<PrinterShare> pageContents, @Nullable final PrinterShareCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
