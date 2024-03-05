/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.seata.compressor.lz4;

import org.apache.seata.common.loader.LoadLevel;
import org.apache.seata.core.compressor.Compressor;

/**
 * the Lz4 Compressor
 *
 */
@LoadLevel(name = "LZ4")
public class Lz4Compressor implements Compressor {
    @Override
    public byte[] compress(byte[] bytes) {
        return Lz4Util.compress(bytes);
    }

    @Override
    public byte[] decompress(byte[] bytes) {
        return Lz4Util.decompress(bytes);
    }
}