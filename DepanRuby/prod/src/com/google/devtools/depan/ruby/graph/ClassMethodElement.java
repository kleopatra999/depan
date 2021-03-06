/*
 * Copyright 2016 The Depan Project Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.devtools.depan.ruby.graph;

/**
 * {@link RubyElement} that represents a Ruby class method.
 * 
 * @author <a href="leeca@pnambic.com">Lee Carver</a>
 */
public class ClassMethodElement extends MethodElement {

  public ClassMethodElement(String type, String method) {
    super(type, method);
  }

  @Override
  protected String getCoordinate() {
    return formatCoordinate("::");
  }

  @Override
  public void accept(RubyElementVisitor visitor) {
    visitor.visitClassMethodElement(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (! (obj instanceof ClassMethodElement)) {
      return false;
    }
    return checkParts(obj);
  }
}
