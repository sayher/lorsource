/*
 * Copyright 1998-2012 Linux.org.ru
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package ru.org.linux.poll;

import java.io.Serializable;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class PollVariant implements Serializable {
  private final int id;
  private final String label;
  private static final long serialVersionUID = -293722815777946212L;

  public PollVariant(int id, String label) {
    this.id = id;
    this.label = label;
  }

  public Integer getId() {
    return id;
  }

  public String getLabel() {
    return label;
  }

  public static SortedMap<Integer, String> toMap(List<PollVariant> list) {
    SortedMap<Integer, String> map = new TreeMap<Integer, String>();

    for (PollVariant v : list) {
      if (v.getId()!=0) {
        map.put(v.getId(), v.getLabel());
      }
    }

    return map;
  }
}
