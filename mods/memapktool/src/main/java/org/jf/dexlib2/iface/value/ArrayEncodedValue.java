/*
 * Copyright 2012, Google Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *     * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.jf.dexlib2.iface.value;


import java.util.List;

/**
 * This class represents an encoded array value.
 */
public interface ArrayEncodedValue extends EncodedValue {
    /**
     * Gets the list of the values contained in this ArrayEncodedValue
     *
     * @return A list of EncodedValue instances
     */
    List<? extends EncodedValue> getValue();

    /**
     * Returns a hashcode for this EncodedArrayValue.
     * <p>
     * This hashCode is defined to be the following:
     *
     * <pre>
     * {@code
     * int hashCode = getValue().hashCode();
     * }</pre>
     *
     * @return The hash code value for this EncodedArrayValue
     */
    @Override
    int hashCode();

    /**
     * Compares this ArrayEncodedValue to another ArrayEncodedValue for equality.
     * <p>
     * This ArrayEncodedValue is equal to another ArrayEncodedValue if the values returned by getValue() are equal.
     *
     * @param o The object to be compared for equality with this ArrayEncodedValue
     * @return true if the specified object is equal to this ArrayEncodedValue
     */
    @Override
    boolean equals(Object o);

    /**
     * Compare this ArrayEncodedValue to another EncodedValue.
     * <p>
     * The comparison is first done on the return values of getValueType(). If the other value is another
     * ArrayEncodedValue, the lists returned by getValue() are compared, based on the semantics of
     * org.jf.util.ComparisonUtils.compareAsList(), using the natural ordering for EncodedValue.
     *
     * @param o The EncodedValue to compare with this ArrayEncodedValue
     * @return An integer representing the result of the comparison
     */
    @Override
    int compareTo(EncodedValue o);
}
