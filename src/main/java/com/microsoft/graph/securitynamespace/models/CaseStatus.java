// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Case Status.
*/
public enum CaseStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * active
    */
    ACTIVE,
    /**
    * pending Delete
    */
    PENDING_DELETE,
    /**
    * closing
    */
    CLOSING,
    /**
    * closed
    */
    CLOSED,
    /**
    * closed With Error
    */
    CLOSED_WITH_ERROR,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CaseStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
