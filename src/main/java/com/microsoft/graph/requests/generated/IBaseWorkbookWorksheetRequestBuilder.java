// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Worksheet Request Builder.
 */
public interface IBaseWorkbookWorksheetRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IWorkbookWorksheetRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IWorkbookWorksheetRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IWorkbookChartCollectionRequestBuilder charts();

    IWorkbookChartRequestBuilder charts(final String id);

    IWorkbookNamedItemCollectionRequestBuilder names();

    IWorkbookNamedItemRequestBuilder names(final String id);

    IWorkbookPivotTableCollectionRequestBuilder pivotTables();

    IWorkbookPivotTableRequestBuilder pivotTables(final String id);

    /**
     * Gets the request builder for WorkbookWorksheetProtection.
     */
    IWorkbookWorksheetProtectionRequestBuilder protection();

    IWorkbookTableCollectionRequestBuilder tables();

    IWorkbookTableRequestBuilder tables(final String id);
    IWorkbookWorksheetCellRequestBuilder cell(final Integer row, final Integer column);
    IWorkbookWorksheetRangeRequestBuilder range();
    IWorkbookWorksheetRangeRequestBuilder range(final String address);
    IWorkbookWorksheetUsedRangeRequestBuilder usedRange();
    IWorkbookWorksheetUsedRangeRequestBuilder usedRange(final Boolean valuesOnly);

}