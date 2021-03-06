/*
 * Copyright 2019 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.sps.data;

public class Pair<K, V> {
  private K key;
  private V value;

  /**
   * Pair constructor for a simply key-value tuple.
   *
   * @param key the first item of the Pair instance
   * @param value the second item of the Pair instance
   */
  public Pair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return this.key;
  }

  public V getValue() {
    return this.value;
  }

  @Override
  public String toString() {
    return "key: " + this.key + "\nvalue: " + this.value;
  }
}
