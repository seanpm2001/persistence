/*
 * Copyright (c) 2008, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Linda DeMichiel - 2.1
//     Linda DeMichiel - 2.0

package jakarta.persistence;

/**
 * Defines supported types of the discriminator column.
 *
 * @see DiscriminatorColumn#discriminatorType
 *
 * @since 1.0
 */
public enum DiscriminatorType { 

    /** 
     * String as the discriminator type.
     */
    STRING,

    /** 
     * Single character as the discriminator type.
     */
    CHAR,

    /** 
     * Integer as the discriminator type.
     */
    INTEGER
}
