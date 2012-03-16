/*******************************************************************************
 * Copyright 2012 Apigee Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.usergrid.persistence.query.tree;

/**
 * @author tnine
 *
 */
public class Within extends Operand {

  private Property property;
  private FloatLiteral radius;
  private FloatLiteral lattitude;
  private FloatLiteral longitude;
  
  /**
   * @param property
   * @param literal
   */
  public Within(Property property, FloatLiteral radius, FloatLiteral lattitude, FloatLiteral longitude ) {
    this.property = property;
    this.radius = radius;
    this.lattitude = lattitude;
    this.longitude = longitude;
  }

}
