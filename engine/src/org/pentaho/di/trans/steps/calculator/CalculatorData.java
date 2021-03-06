/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2002-2013 by Pentaho : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.di.trans.steps.calculator;

import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;

/**
 * @author Matt
 * @since 8-sep-2005
 *
 */
public class CalculatorData extends BaseStepData implements StepDataInterface {
  private RowMetaInterface outputRowMeta;
  private RowMetaInterface calcRowMeta;

  private Calculator.FieldIndexes[] fieldIndexes;

  private int[] tempIndexes;

  public CalculatorData() {
    super();
  }

  public RowMetaInterface getOutputRowMeta() {
    return outputRowMeta;
  }

  public void setOutputRowMeta( RowMetaInterface outputRowMeta ) {
    this.outputRowMeta = outputRowMeta;
  }

  public RowMetaInterface getCalcRowMeta() {
    return calcRowMeta;
  }

  public void setCalcRowMeta( RowMetaInterface calcRowMeta ) {
    this.calcRowMeta = calcRowMeta;
  }

  public Calculator.FieldIndexes[] getFieldIndexes() {
    return fieldIndexes;
  }

  public void setFieldIndexes( Calculator.FieldIndexes[] fieldIndexes ) {
    this.fieldIndexes = fieldIndexes;
  }

  public int[] getTempIndexes() {
    return tempIndexes;
  }

  public void setTempIndexes( int[] tempIndexes ) {
    this.tempIndexes = tempIndexes;
  }
}
