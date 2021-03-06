/**
 * Copyright 2018 deepsense.ai (CodiLime, Inc)
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

package ai.deepsense.sdk.example


import ai.deepsense.deeplang.DOperation.Id
import ai.deepsense.deeplang.doperations.EvaluatorAsFactory

class CreateAbsEvaluator
  extends EvaluatorAsFactory[AbsEvaluator] {

  override val id: Id = "c7e967dc-dcdd-4696-a032-ba587c98abdc"
  override val name: String = "Abs Evaluator"
  override val description: String = "Creates a simple abs evaluator"
}


