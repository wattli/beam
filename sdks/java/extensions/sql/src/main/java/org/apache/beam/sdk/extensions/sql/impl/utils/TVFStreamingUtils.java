/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.beam.sdk.extensions.sql.impl.utils;

import org.apache.beam.vendor.guava.v26_0_jre.com.google.common.collect.ImmutableSet;

/** Provides static constants or utils for TVF streaming. */
public class TVFStreamingUtils {
  public static final String WINDOW_START = "window_start";
  public static final String WINDOW_END = "window_end";

  public static final String FIXED_WINDOW_TVF = "TUMBLE";
  public static final String SLIDING_WINDOW_TVF = "HOP";
  public static final String SESSION_WINDOW_TVF = "SESSION";

  public static final ImmutableSet<String> WINDOWING_TVF =
      ImmutableSet.of(FIXED_WINDOW_TVF, SLIDING_WINDOW_TVF, SESSION_WINDOW_TVF);
}
